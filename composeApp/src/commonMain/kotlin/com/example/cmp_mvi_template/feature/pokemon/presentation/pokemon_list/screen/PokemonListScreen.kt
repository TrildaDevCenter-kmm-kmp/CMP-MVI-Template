package com.example.cmp_mvi_template.feature.pokemon.presentation.pokemon_list.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import cmp_mvi_template.composeapp.generated.resources.Res
import cmp_mvi_template.composeapp.generated.resources.title_pokemon
import com.example.cmp_mvi_template.core.utility.ObserveAsEvents
import com.example.cmp_mvi_template.feature.pokemon.presentation.component.PokemonCard
import com.example.cmp_mvi_template.feature.pokemon.presentation.component.PokemonListShimmer
import com.example.cmp_mvi_template.ui.layout.ErrorMessageLayout
import kotlinx.coroutines.flow.distinctUntilChanged
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonListScreen(
    onNavigateToDetails: (Int) -> Unit,
) {
    val viewModel = koinViewModel<PokemonListViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()
    val listState = rememberLazyListState()
    val snackBarHostState = remember { SnackbarHostState() }

    // Handle effects
    viewModel.effect.ObserveAsEvents { effect ->
        when (effect) {
            is PokemonListEffect.NavigateToDetails -> {
                onNavigateToDetails(effect.pokemonId)
            }

            is PokemonListEffect.ShowError -> {
                snackBarHostState.showSnackbar(effect.message.asStringForSuspend())
            }
        }
    }

    LaunchedEffect(state.pokemonList) {
        snapshotFlow {
            listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index
        }.distinctUntilChanged()
            .collect { lastVisibleIndex ->
                if (lastVisibleIndex == state.pokemonList.lastIndex) {
                    viewModel.handleEvent(PokemonListEvent.LoadMorePokemon)
                }
            }
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(Res.string.title_pokemon)) },
            )
        },
        snackbarHost = { SnackbarHost(snackBarHostState) },
    ) {
        // Content
        Box(modifier = Modifier.fillMaxSize().padding(it)) {
            when {
                state.isLoading && state.pokemonList.isEmpty() -> {
                    PokemonListShimmer()
                }

                state.pokemonList.isNotEmpty() -> {
                    LazyColumn(
                        state = listState,
                        contentPadding = PaddingValues(bottom = 16.dp)
                    ) {
                        items(
                            items = state.pokemonList,
                            key = { pokemon ->
                                "#${pokemon.id.toString().padStart(3, '0')}"
                            }
                        ) { pokemon ->
                            PokemonCard(
                                pokemon = pokemon,
                                onPokemonClick = {
                                    viewModel.handleEvent(
                                        PokemonListEvent.NavigateToPokemonDetails(pokemon.id)
                                    )
                                }
                            )
                        }

                        if (state.isLoadingMore) {
                            item {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    CircularProgressIndicator()
                                }
                            }
                        }
                    }
                }

                state.error != null -> {
                    ErrorMessageLayout(
                        error = state.error!!,
                        onRetry = {
                            viewModel.handleEvent(PokemonListEvent.LoadPokemon)
                        }
                    )
                }
            }
        }
    }
}