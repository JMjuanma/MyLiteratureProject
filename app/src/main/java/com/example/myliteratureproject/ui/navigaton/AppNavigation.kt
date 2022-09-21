package com.example.myliteratureproject.ui.navigaton

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myliteratureproject.ui.screens.*
import com.example.myliteratureproject.ui.screens.subjects.ChemScreens.MainChemScreen
import com.example.myliteratureproject.ui.screens.subjects.MathScreens.MainMathScreen
import com.example.myliteratureproject.ui.screens.subjects.PhysicsScreens.MainPhysicsScreen

@Composable
fun Appnavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route){
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
        composable(AppScreens.MainChemscreen.route){
            MainChemScreen(navController = navController)
        }
        composable(AppScreens.MainMathScreen.route){
            MainMathScreen(navController = navController)
        }
        composable(AppScreens.MainPhysicsScreen.route){
            MainPhysicsScreen(navController = navController)
        }
    }
}