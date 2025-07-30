package com.example.cmp_mvi_template.feature.pokemon.data.repository

import androidx.sqlite.SQLiteException
import com.example.cmp_mvi_template.core.data.network.safeCall
import com.example.cmp_mvi_template.core.domain.DataError
import com.example.cmp_mvi_template.core.domain.EmptyResult
import com.example.cmp_mvi_template.core.domain.map
import com.example.cmp_mvi_template.core.data.local.dao.PokemonDao
import com.example.cmp_mvi_template.feature.pokemon.data.mapper.toDomain
import com.example.cmp_mvi_template.feature.pokemon.data.remote.api.PokemonApiService
import com.example.cmp_mvi_template.feature.pokemon.data.remote.dto.PokemonDto
import com.example.cmp_mvi_template.feature.pokemon.data.remote.dto.PokemonListResponseDto
import com.example.cmp_mvi_template.feature.pokemon.domain.entity.Pokemon
import com.example.cmp_mvi_template.feature.pokemon.domain.entity.PokemonListResponse
import com.example.cmp_mvi_template.feature.pokemon.domain.repository.PokemonRepository
import kotlinx.coroutines.flow.Flow
import com.example.cmp_mvi_template.core.domain.ResultWrapper
import com.example.cmp_mvi_template.feature.pokemon.data.mapper.toEntity
import kotlinx.coroutines.flow.map

class PokemonRepositoryImpl(
    private val apiService: PokemonApiService,
    private val pokemonDao: PokemonDao
) : PokemonRepository {

    override suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): ResultWrapper<PokemonListResponse, DataError.Remote> {
        return safeCall<PokemonListResponseDto> {
            apiService.getPokemonList(limit, offset)
        }.map { it.toDomain() }
    }

    override suspend fun getPokemonById(id: Int): ResultWrapper<Pokemon, DataError.Remote> {
        return safeCall<PokemonDto> {
            apiService.getPokemonById(id)
        }.map { it.toDomain() }
    }

    override fun getFavoritesPokemon(): Flow<List<Pokemon>> {
        return pokemonDao.getAllFavoritesPokemon()
            .map { entities -> entities.map { it.toDomain() } }
    }

    override suspend fun addToFavorites(pokemon: Pokemon): EmptyResult<DataError.Local> {
        return try {
            pokemonDao.insertPokemon(pokemon.toEntity())
            ResultWrapper.Success(Unit)
        } catch (e: SQLiteException) {
            ResultWrapper.Error(DataError.Local.DISK_FULL)
        } catch (e: Exception) {
            ResultWrapper.Error(DataError.Local.UNKNOWN)
        }
    }

    override suspend fun removeFromFavorites(pokemonId: Int): EmptyResult<DataError.Local> {
        return try {
            pokemonDao.deletePokemonById(pokemonId)
            ResultWrapper.Success(Unit)
        } catch (e: SQLiteException) {
            ResultWrapper.Error(DataError.Local.DISK_FULL)
        } catch (e: Exception) {
            ResultWrapper.Error(DataError.Local.UNKNOWN)
        }
    }

    override suspend fun isPokemonFavorite(pokemonId: Int): ResultWrapper<Boolean, DataError.Local> {
        return try {
            val result = pokemonDao.isPokemonFavorite(pokemonId)
            ResultWrapper.Success(result)
        } catch (e: SQLiteException) {
            ResultWrapper.Error(DataError.Local.DISK_FULL)
        } catch (e: Exception) {
            ResultWrapper.Error(DataError.Local.UNKNOWN)
        }
    }
}