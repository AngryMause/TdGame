package com.example.zeuslegendarydefense.ui.presentation.splash

import androidx.compose.runtime.Composable

sealed class SplashScreenEvent {
    data object OpenMenu : SplashScreenEvent()
}

@Composable
fun SplashScreen(onScreenOpen: (SplashScreenEvent) -> Unit) {

}