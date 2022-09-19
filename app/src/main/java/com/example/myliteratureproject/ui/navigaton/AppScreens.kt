package com.example.myliteratureproject.ui.navigaton

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object MenuScreen: AppScreens("menu_screen")
    object PayScreen: AppScreens("pay_screen")
    object MainScreen: AppScreens("main_screen")
}
