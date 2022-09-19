package com.example.myliteratureproject.ui.navigaton

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myliteratureproject.ui.screens.*

@Composable
fun Appnavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.MenuScreen.route){
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.PayScreen.route){
            PayScreen(navController = navController)
        }
        composable(AppScreens.MainScreen.route){
            MainScreen(navController = navController)
        }
        composable(AppScreens.MenuScreen.route){
            MenuScreen(navController = navController)
        }
    }
}