package com.example.zeuslegendarydefense.ui.presentation.menu

import androidx.compose.runtime.Composable

sealed class MenuScreenEvent {
    data object StartGame : MenuScreenEvent()
    data object Option : MenuScreenEvent()
    data object About : MenuScreenEvent()
}

@Composable
fun MenuScreen(onScreenOpen: (MenuScreenEvent) -> Unit) {

}