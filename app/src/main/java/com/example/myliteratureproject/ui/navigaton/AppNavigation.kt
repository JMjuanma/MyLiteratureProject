package com.example.myliteratureproject.ui.navigaton

@composable
fun Appnavigation(){
    val navControler = rememberNavControler()
    NavHost(navControler = navControler, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){FirstScreen()}
        composable(route = AppScreens.SecondScreen.route){SecondScreen()}
        composable(route = AppScreens.ThirdScreen.route){ThirdScreen()}
    }
}