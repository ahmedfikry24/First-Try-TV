package com.example.firsttrytv.ui.navigation

sealed class AppDestination(val route: String) {
    data object Home : AppDestination("HomeScreen")
}