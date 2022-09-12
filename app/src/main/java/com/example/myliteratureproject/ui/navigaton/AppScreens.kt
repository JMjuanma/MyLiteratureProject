package com.example.myliteratureproject.ui.navigaton

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object MenuScreen: AppScreens("menu_screen")
    object AboutUsScreen: AppScreens("about_us_screen")
    object MainScreen: AppScreens("main_screen")
}
