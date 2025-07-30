package com.example.cmp_mvi_template.core.data.datastore

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.Smartphone
import com.example.cmp_mvi_template.core.utility.IconResource
import com.example.cmp_mvi_template.core.utility.UiText

enum class ThemeMode(
    val icon: IconResource,
    val screenTitle: UiText,
    val title: UiText,
    val description: UiText
) {
    LIGHT(
        icon = IconResource.ImageVector(Icons.Outlined.LightMode),
        screenTitle = UiText.DynamicString("Light Theme"),
        title = UiText.DynamicString("Light"),
        description = UiText.DynamicString("Always use light theme")
    ),
    DARK(
        icon = IconResource.ImageVector(Icons.Outlined.DarkMode),
        screenTitle = UiText.DynamicString("Dark Theme"),
        title = UiText.DynamicString("Dark"),
        description = UiText.DynamicString("Always use dark theme")
    ),
    SYSTEM(
        icon = IconResource.ImageVector(Icons.Outlined.Smartphone),
        screenTitle = UiText.DynamicString("System Default"),
        title = UiText.DynamicString("System Default"),
        description = UiText.DynamicString("Follow system settings")
    )
}