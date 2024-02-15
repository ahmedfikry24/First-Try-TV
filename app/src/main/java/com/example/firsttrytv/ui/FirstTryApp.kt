package com.example.firsttrytv.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import com.example.firsttrytv.ui.navigation.AppDestination
import com.example.firsttrytv.ui.screens.HomeScreen

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun FirstTryApp() {
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        NavHost(
            navController = navController,
            startDestination = AppDestination.Home.route
        ) {
            composable(AppDestination.Home.route) { HomeScreen() }
        }
    }
}