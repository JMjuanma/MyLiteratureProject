package com.example.myliteratureproject.ui.navigaton

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object MenuScreen: AppScreens("menu_screen")
    object AboutUsScreen: AppScreens("about_us_screen")
    object MainScreen: AppScreens("main_screen")
    object ChemMenuScreen: AppScreens("chem_menu_screen")
    object PhysicMenuScreen: AppScreens("physic_menuScreen")
    object MathMenuScreen: AppScreens("math_menu_screen")
    object MathFormulasScreen: AppScreens("math_formulas_screen")
    object ChemFormulasScreen: AppScreens("chem_formulas_screen")
    object PhysicFormulasScreen: AppScreens("physic_formulas_screen")
}
