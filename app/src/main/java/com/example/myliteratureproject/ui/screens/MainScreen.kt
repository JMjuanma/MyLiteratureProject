package com.example.myliteratureproject.ui.screens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.launch
import org.w3c.dom.Text

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController){
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var materiasExpanded by remember { mutableStateOf(false) }
    var equationsExpanded by remember { mutableStateOf(false)}

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
                    text = "MATAGUSTINOS",
                    modifier = Modifier.padding(16.dp)
                )
                Divider()
                
                TextButton(onClick = {
                    navController.navigate(AppScreens.MainMathScreen.route)
                }, modifier = Modifier.fillMaxWidth()) {
                    Icon(imageVector = Icons.Default.Calculate, contentDescription = "Mate")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Mate")
                }

                TextButton(onClick = {
                    navController.navigate(AppScreens.MainPhysicsScreen.route)
                }, modifier = Modifier.fillMaxWidth()) {
                    Icon(imageVector = Icons.Default.Balance, contentDescription = "Fisica")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Física")
                }

                TextButton(onClick = {
                    navController.navigate(AppScreens.MainChemScreen.route)
                }, modifier = Modifier.fillMaxWidth()) {
                    Icon(imageVector = Icons.Default.Science, contentDescription = "Quimica")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Química")
                }

                TextButton(onClick = {
                    navController.navigate(AppScreens.PayScreen.route)
                }, modifier = Modifier.fillMaxWidth()) {
                    Icon(imageVector = Icons.Default.Paid, contentDescription = "Paga")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Contribuye")
                }
            },
            drawerGesturesEnabled = true,
            floatingActionButton = {
                ExtendedFloatingActionButton(
                    text = { Text(text = "Comencemos") },
                    onClick = {
                        navController.navigate(AppScreens.MenuScreen.route)
                    }
                )
            },
            floatingActionButtonPosition = FabPosition.Center
            ) {
            //Text("MenuScreen")
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Main Screen")
                Text(text = "Esta Aplicacion pretende ser una ayuda a todos aquellos que buscan . . .")

            }
        }

    }
}