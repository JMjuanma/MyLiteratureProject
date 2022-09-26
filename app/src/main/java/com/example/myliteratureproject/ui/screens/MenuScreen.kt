package com.example.myliteratureproject.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.launch

@Composable
fun MenuScreen(navController: NavHostController) {
    //Surface (
    //modifier = Modifier.fillMaxSize()
    //)
    //val darkTheme: Boolean = isSystemInDarkTheme()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    //Surface() {
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                scaffoldState.drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
                        }
                    },
                    title = { Text(text = "hola") })
            },
            drawerContent = {
                Text(
                    text = "Lateral panel",
                    modifier = Modifier.padding(16.dp)
                )
                Divider()
            },
            drawerGesturesEnabled = true

        ) {
            //Text("MenuScreen")
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedButton(onClick = { navController.navigate(AppScreens.MainMathScreen.route) }) {
                    Text(text = "Mate")
                }
                OutlinedButton(onClick = { navController.navigate(AppScreens.MainPhysicsScreen.route) }) {
                    Text(text = "Física")
                }
                OutlinedButton(onClick = { navController.navigate(AppScreens.MainChemScreen.route) }) {
                    Text(text = "Quimica")
                }
                OutlinedButton(onClick = { navController.navigate(AppScreens.PayScreen.route) }) {
                    Text(text = "Rabbit")
                }
            }
            /*if (darkTheme) {
                Text(text = "MUERTEEEEE")
            } else {
                Text(text = "VIDAAA")
            }*/

        }

    }
//}

/*@Composable
fun tile(icon: ImageVector, topic: String) {
    Column {
        Icon(
            imageVector = icon,
            contentDescription = topic,
            modifier = Modifier.size(300.dp),
            tint = MaterialTheme.colors.primary
        )
        Text(text = topic)
    }
}*/