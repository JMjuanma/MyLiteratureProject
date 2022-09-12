package com.example.myliteratureproject.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myliteratureproject.R
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController){

    LaunchedEffect(key1 = true){
        delay(5000)
        navController.popBackStack()
        navController.navigate(AppScreens.MainScreen.route)
    }

    Splash()
}

@Composable
fun Splash(){
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
        Text("SplashScreen")
        /*Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Background"
        )*/
        /*Icon(
            imageVector = Icons.Outlined.PlayArrow,
            contentDescription = null,
            modifier = Modifier.size(92.dp)
            tint = Color.White //El color que quieras
            //librería con mejores iconos: implementation "androidx.compose.material:material-icons-extended:$compose_version"
        )*/
    }
}