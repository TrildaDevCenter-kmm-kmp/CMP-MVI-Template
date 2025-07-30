package com.example.cmp_mvi_template.ui.navigation.bottom_navigation_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.*
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import com.example.cmp_mvi_template.ui.navigation.AppDestination
import com.example.cmp_mvi_template.core.utility.IconResource
import com.example.cmp_mvi_template.core.utility.UiText

enum class NavigationItem(
    val selectedIcon: IconResource,
    val unSelectedIcon: IconResource,
    val title: UiText,
    val route: AppDestination
) {
    POKEMON(
        selectedIcon = IconResource.ImageVector(Icons.AutoMirrored.Filled.List),
        unSelectedIcon = IconResource.ImageVector(Icons.AutoMirrored.Outlined.List),
        title = UiText.DynamicString("Pokemon"),
        route = AppDestination.PokemonList
    ),
    FAVORITES(
        selectedIcon = IconResource.ImageVector(Icons.Filled.Favorite),
        unSelectedIcon = IconResource.ImageVector(Icons.Outlined.Favorite),
        title = UiText.DynamicString("Favorites"),
        route = AppDestination.Favorites
    ),
    SETTINGS(
        selectedIcon = IconResource.ImageVector(Icons.Filled.Settings),
        unSelectedIcon = IconResource.ImageVector(Icons.Outlined.Settings),
        title = UiText.DynamicString("Settings"),
        route = AppDestination.Settings
    ),
    SAMPLE_EXAMPLE(
        selectedIcon = IconResource.ImageVector(Icons.Filled.EmojiEvents),
        unSelectedIcon = IconResource.ImageVector(Icons.Outlined.EmojiEvents),
        title = UiText.DynamicString("Example"),
        route = AppDestination.SampleExampleNavigationEvent
    )
}