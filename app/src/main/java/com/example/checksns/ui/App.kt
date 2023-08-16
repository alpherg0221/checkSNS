package com.example.checksns.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.checksns.data.Container
import com.example.checksns.ui.theme.BlueJadeTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun App(
    container: Container
) {
    BlueJadeTheme(darkTheme = true) {
        val systemUiController = rememberSystemUiController()
        SideEffect {
            systemUiController.setStatusBarColor(Color.Transparent, darkIcons = false)
        }

        val navController = rememberNavController()

        NavGraph(
            // container = container,
            navController = navController,
            startDestination = Destinations.HOME_ROUTE,
        )
    }
}