package com.example.cmp_mvi_template

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.cmp_mvi_template.app.presentation.App
import com.example.cmp_mvi_template.core.platform.toast.setComposeWindowProvider
import com.example.cmp_mvi_template.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "CMP-MVI-Template",
    ) {
        setComposeWindowProvider {
            window
        }
        App()
    }
}