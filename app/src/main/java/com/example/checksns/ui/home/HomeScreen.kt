package com.example.checksns.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(homeViewModel: HomeViewModel) {
    Scaffold { paddingValue ->
        Column(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    homeViewModel.startServer()
                },
            ) {
                Text(text = "サーバを起動")
            }
        }
    }
}