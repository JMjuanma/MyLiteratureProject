package com.example.myliteratureproject.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Science
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myliteratureproject.R
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController){

    LaunchedEffect(key1 = true){
        delay(1500)
        navController.popBackStack()
        navController.navigate(AppScreens.MainScreen.route)
    }

    Splash()
}

@Composable
fun Splash(){
    Surface (
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ){
        //Text("SplashScreen")

        //Icon(imageVector = Icons.Default.Science, contentDescription = null)

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
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo"
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "MATAGUSTINOS", fontSize = 40.sp)
        }
    }
}

/*@Preview
@Composable
fun firstPreview(){
    Column {
        Icon(
            imageVector = Icons.Default.Science,
            contentDescription = null,
            modifier = Modifier.size(350.dp),
            tint = Color.Yellow
        )

    }

}*/