package com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.cmp_mvi_template.core.utility.ObserveAsEvents
import com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.component.EmptyFavoritesState
import com.example.cmp_mvi_template.feature.pokemon.presentation.favorites.component.FavoritesListContent
import com.example.cmp_mvi_template.ui.layout.ErrorMessageLayout
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen(
    onNavigateToDetails: (Int) -> Unit,
) {
    val favoritesViewModel = koinViewModel<FavoritesViewModel>()
    val state by favoritesViewModel.state.collectAsStateWithLifecycle()
    val snackBarHostState = remember { SnackbarHostState() }

    // Handle effects
    favoritesViewModel.effect.ObserveAsEvents { effect ->
        when (effect) {
            is FavoritesEffect.NavigateToDetails -> {
                onNavigateToDetails(effect.pokemonId)
            }

            is FavoritesEffect.ShowError -> {
                snackBarHostState.showSnackbar(effect.message.asStringForSuspend())
            }

            is FavoritesEffect.ShowSuccess -> {
                snackBarHostState.showSnackbar(effect.message.asStringForSuspend())
            }
        }
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Favorites") },
            )
        },
        snackbarHost = { SnackbarHost(snackBarHostState) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                state.isLoading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }

                state.favoritesPokemon.isEmpty() -> {
                    EmptyFavoritesState()
                }

                else -> {
                    FavoritesListContent(state, favoritesViewModel)
                }
            }

            if (state.error != null) {
                ErrorMessageLayout(
                    error = state.error!!,
                    onRetry = {
                        favoritesViewModel.handleEvent(FavoritesEvent.LoadFavorites)
                    }
                )
            }
        }
    }
}

