package com.example.myliteratureproject.ui.screens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
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
                    title = {Text(text = "Matagustinos")},)
            },
            drawerContent = {
                Text(
                    text = "MATAGUSTINOS",
                    modifier = Modifier.padding(16.dp)
                )
                Divider()
                TextButton(
                    onClick = { navController.navigate(AppScreens.MainScreen.route) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Inicio")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Inicio")
                }
                val menuSurfaceColor by animateColorAsState(
                    if (materiasExpanded) MaterialTheme.colors.secondary else MaterialTheme.colors.surface
                )
                val equationsSurfaceColor by animateColorAsState(
                    if (equationsExpanded) MaterialTheme.colors.primaryVariant else MaterialTheme.colors.surface
                )

                TextButton(
                    onClick = { materiasExpanded = !materiasExpanded },
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    //Icon(imageVector = Icons.Default.Sos, contentDescription = "ayuda")
                    Icon(imageVector = Icons.Default.MenuBook, contentDescription = "ayuda")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Materias")
                }

                Surface(
                    shape = MaterialTheme.shapes.medium,
                    elevation = 1.dp,
                    color = menuSurfaceColor,
                    modifier = Modifier
                        .animateContentSize()
                        .fillMaxWidth()
                        .padding(2.dp),

                ) {
                    if(materiasExpanded){
                        Column (
                            modifier = Modifier
                                .padding(1.dp)
                        ){
                            TextButton(
                                onClick = {
                                    navController.navigate(AppScreens.MainMathScreen.route)
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Calculate,
                                    contentDescription = "Mate",
                                    tint = MaterialTheme.colors.primaryVariant
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "Mate",
                                    color = MaterialTheme.colors.primaryVariant
                                )
                            }

                            TextButton(onClick = {
                                navController.navigate(AppScreens.MainPhysicsScreen.route)
                            }, modifier = Modifier.fillMaxWidth()) {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "Fisica",
                                    tint = MaterialTheme.colors.secondary
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "Física",
                                    color = MaterialTheme.colors.secondary
                                )
                            }

                            TextButton(onClick = {
                                navController.navigate(AppScreens.MainChemScreen.route)
                            }, modifier = Modifier.fillMaxWidth()) {
                                Icon(
                                    imageVector = Icons.Default.Science,
                                    contentDescription = "Quimica",
                                    tint = MaterialTheme.colors.secondary
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "Química",
                                    color = MaterialTheme.colors.secondary
                                )
                            }
                        }
                    }
                }
                
                TextButton(onClick = { equationsExpanded = !equationsExpanded }) {
                    Icon(imageVector = Icons.Default.Verified, contentDescription = "Verificado")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Ecuaciones")
                }

                Surface(shape = MaterialTheme.shapes.medium,
                    elevation = 1.dp,
                    color = menuSurfaceColor,
                    modifier = Modifier
                        .animateContentSize()
                        .fillMaxWidth()
                        .padding(1.dp), ) {

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