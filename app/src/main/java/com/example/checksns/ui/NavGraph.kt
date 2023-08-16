package com.example.checksns.ui

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.checksns.ui.home.HomeScreen
import com.example.checksns.ui.home.HomeViewModel

@Composable
fun NavGraph(
    // container: Container,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Destinations.HOME_ROUTE,
) {
    val application = LocalContext.current.applicationContext as Application
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(Destinations.HOME_ROUTE) {
            val homeViewModel: HomeViewModel = viewModel(
                factory = HomeViewModel.provideFactory(application)
            )
            HomeScreen(homeViewModel = homeViewModel)
        }
    }
}