package com.example.template_app_comp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.template_app_comp.screens.HomeScreen

@Composable
fun NavHostController() {
    val navHostCtrl= rememberNavController()

    NavHost(
        navController = navHostCtrl,
        startDestination = "home"
    ){
        composable(route="home"){HomeScreen(navHostCtrl)}
    }
}