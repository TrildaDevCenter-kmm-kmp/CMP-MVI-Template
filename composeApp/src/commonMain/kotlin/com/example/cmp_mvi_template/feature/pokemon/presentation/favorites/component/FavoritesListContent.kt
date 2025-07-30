package com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.screen.FavoritesEvent
import com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.screen.FavoritesState
import com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.screen.FavoritesViewModel

@Composable
fun FavoritesListContent(
    state: FavoritesState,
    favoritesViewModel: FavoritesViewModel
) {
    LazyColumn(
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        items(
            items = state.favoritesPokemon,
            key = { it.id }
        ) { pokemon ->
            SwipeToDeletePokemonCard(
                pokemon = pokemon,
                onPokemonClick = {
                    favoritesViewModel.handleEvent(
                        FavoritesEvent.NavigateToPokemonDetails(pokemon.id)
                    )
                },
                onDeleteClick = {
                    favoritesViewModel.handleEvent(
                        FavoritesEvent.RemoveFromFavorites(pokemon)
                    )
                }
            )
        }
    }
}