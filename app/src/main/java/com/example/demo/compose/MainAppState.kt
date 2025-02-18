package com.example.demo.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun rememberMainAppState(
    navController: NavHostController = rememberNavController()
): MainAppState {
    return remember(navController) {
        MainAppState(
            navController = navController
        )
    }
}

@Stable
class MainAppState(
    val navController: NavHostController,
) {
    val tabs = listOf("Tab1", "Tab2", "Tab3")
}
