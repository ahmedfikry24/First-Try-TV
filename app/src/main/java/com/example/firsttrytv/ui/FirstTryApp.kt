package com.example.firsttrytv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.MaterialTheme
import com.example.firsttrytv.ui.navigation.AppDestination
import com.example.firsttrytv.ui.theme.dimens

@Composable
fun FirstTryApp() {
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = MaterialTheme.dimens.size48)
            .padding(vertical = MaterialTheme.dimens.size27)
    ) {
        NavHost(
            navController = navController,
            startDestination = AppDestination.Home.route
        ) {
            composable(AppDestination.Home.route) { }
        }
    }
}