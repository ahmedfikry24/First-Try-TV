package com.example.firsttrytv.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firsttrytv.ui.navigation.AppDestination

@Composable
fun FirstTryApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppDestination.Home.route
    ) {
        composable(AppDestination.Home.route) {  }
    }
}