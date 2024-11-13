package com.example.zeuslegendarydefense

import androidx.compose.ui.window.ComposeUIViewController
import com.example.zeuslegendarydefense.koindi.initKoin
import com.example.zeuslegendarydefense.ui.navigation.App

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {

    App()

}