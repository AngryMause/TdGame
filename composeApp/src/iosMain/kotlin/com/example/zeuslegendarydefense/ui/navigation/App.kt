package com.example.zeuslegendarydefense.ui.navigation

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zeuslegendarydefense.ui.presentation.about.AboutScreen
import com.example.zeuslegendarydefense.ui.presentation.games.GameScreen

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SplashScreen) {
        composable<OptionScreen> {

        }
        composable<GameScreen> {
            GameScreen { }
        }
        composable<AboutScreen> {
            AboutScreen { }
        }
        composable<OptionScreen> {

        }
        composable<MenuScreen> {

        }
    }
}
//    MaterialTheme {
//        var showContent by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//            AnimatedVisibility(showContent) {
//                val greeting = remember { ""}
//                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Compose: $greeting")
//                }
//            }
//        }
//    }
//}