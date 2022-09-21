package com.example.myliteratureproject.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.launch

@Composable
fun MainScreen(navController: NavHostController){
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Surface(color = MaterialTheme.colors.background) {
        Scaffold (
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
                    title = {Text(text = "Matagustinos")})
            },
            drawerContent = {
                Text(
                    text = "Lateral panel",
                    modifier = Modifier.padding(16.dp)
                )
                Divider()
            },
            drawerGesturesEnabled = true) {
            //Text("MenuScreen")
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Menu Screen")
                Text(text = "Esta Aplicacion pretende ser una ayuda a todos aquellos que buscan . . .")
                Spacer(modifier = Modifier.height(30.dp))
                OutlinedButton(onClick = {
                    navController.navigate(AppScreens.MenuScreen.route)
                }) {
                    Text(text = "Comencemos")
                }
            }
        }

    }
}