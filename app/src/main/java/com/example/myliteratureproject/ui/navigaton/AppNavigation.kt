package com.example.myliteratureproject.ui.navigaton

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myliteratureproject.ui.screens.AboutUsScreen
import com.example.myliteratureproject.ui.screens.MainScreen
import com.example.myliteratureproject.ui.screens.MenuScreen
import com.example.myliteratureproject.ui.screens.SplashScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route){
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.AboutUsScreen.route){
            AboutUsScreen(navController = navController)
        }
        composable(AppScreens.MainScreen.route){
            MainScreen(navController = navController)
        }
        composable(AppScreens.MathMenuScreen.route){
            MathMenuScreen(navController = navController)
        }
        composable(AppScreens.ChemMenuScreen.route){
            ChemMenuScreen(navController = navController)
        }
        composable(AppScreens.PhysicMenuScreen.route){
            PhysicMenuScreen(navController = navController)
        }
        composable(AppScreens.MathFormulasScreen.route){
            MathFormulasScreen(navController = navController)
        }
        composable(AppScreens.ChemFormulasScreen.route){
            ChemFormulasScreen(navController = navController)
        }
        composable(AppScreens.PhysicFormulasScreen.route){
            PhysicFormulasScreen(navController = navController)
        }
    }
}