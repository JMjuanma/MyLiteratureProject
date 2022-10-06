package com.example.myliteratureproject.ui.screens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animate
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myliteratureproject.R
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.launch
import org.w3c.dom.Text

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "SuspiciousIndentation")
@Composable
fun MainScreen(navController: NavHostController){

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var materiasExpanded by remember { mutableStateOf(false) }
    var equationsExpanded by remember { mutableStateOf(false)}

    val menuSurfaceColor by animateColorAsState(
        if (materiasExpanded) MaterialTheme.colors.secondaryVariant else MaterialTheme.colors.secondary
    )
    val equationsSurfaceColor by animateColorAsState(
        if (equationsExpanded) MaterialTheme.colors.secondaryVariant else MaterialTheme.colors.secondary
    )

    val materiasTextColor by animateColorAsState(
        if (materiasExpanded) MaterialTheme.colors.secondary else MaterialTheme.colors.primaryVariant
    )

    val equationsTextColor by animateColorAsState(
        if (equationsExpanded) MaterialTheme.colors.secondary else MaterialTheme.colors.primaryVariant
    )

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
                Surface(color = MaterialTheme.colors.background, modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp),
                elevation = 3.dp) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "logo",
                        )
                        Text(
                            text = "MATAGUSTINOS",
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp
                        )
                    }
                }
                Surface(color = MaterialTheme.colors.secondary, modifier = Modifier.fillMaxSize()) {
                    Column {

                        TextButton(
                            onClick = { navController.navigate(AppScreens.MainScreen.route) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Home, contentDescription = "Inicio", tint = MaterialTheme.colors.primaryVariant)
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Inicio", color = MaterialTheme.colors.primaryVariant)
                        }


                        Surface(
                            shape = MaterialTheme.shapes.medium,
                            elevation = 0.dp,
                            color = menuSurfaceColor,
                            modifier = Modifier
                                .animateContentSize()
                                .fillMaxWidth()
                                .padding(0.dp),

                            ) {
                            Column {
                                TextButton(
                                    onClick = { materiasExpanded = !materiasExpanded },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp),
                                ) {
                                    //Icon(imageVector = Icons.Default.Sos, contentDescription = "ayuda")
                                    Icon(imageVector = Icons.Default.MenuBook, contentDescription = "ayuda", tint = materiasTextColor)
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Text(text = "Materias", color = materiasTextColor)
                                }

                                if(materiasExpanded){
                                    TextButton(
                                        onClick = {
                                            //navController.navigate(AppScreens.MainMathScreen.route)
                                                  scope.launch {
                                                      scaffoldState.drawerState.apply{close()}
                                                      scaffoldState.snackbarHostState.showSnackbar("Ésta sección está en desarrollo")
                                                  }
                                        },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(6.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Calculate,
                                            contentDescription = "Mate",
                                            tint = MaterialTheme.colors.primary
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Mate",
                                            color = MaterialTheme.colors.primary
                                        )
                                    }

                                    TextButton(onClick = {
                                        navController.navigate(AppScreens.MainPhysicsScreen.route)
                                    }, modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp)) {
                                        Icon(
                                            imageVector = Icons.Default.Balance,
                                            contentDescription = "Fisica",
                                            tint = MaterialTheme.colors.primary
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Física",
                                            color = MaterialTheme.colors.primary
                                        )
                                    }

                                    TextButton(onClick = {
                                        //navController.navigate(AppScreens.MainChemScreen.route)
                                        scope.launch {
                                            scaffoldState.drawerState.apply{close()}
                                            scaffoldState.snackbarHostState.showSnackbar("Ésta sección está en desarrollo")
                                        }
                                    }, modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp)) {
                                        Icon(
                                            imageVector = Icons.Default.Science,
                                            contentDescription = "Quimica",
                                            tint = MaterialTheme.colors.primary
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Química",
                                            color = MaterialTheme.colors.primary
                                        )
                                    }
                                }
                            }

                        }

                        Surface(
                            shape = MaterialTheme.shapes.medium,
                            elevation = 0.dp,
                            color = equationsSurfaceColor,
                            modifier = Modifier
                                .animateContentSize()
                                .fillMaxWidth()
                                .padding(0.dp), ) {

                            Column {
                                TextButton(
                                    onClick = { equationsExpanded = !equationsExpanded },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp)
                                ) {
                                    Icon(imageVector = Icons.Default.Verified, contentDescription = "Verificado", tint = equationsTextColor)
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Text(text = "Ecuaciones", color = equationsTextColor)
                                }

                                if (equationsExpanded)
                                {
                                    TextButton(
                                        onClick = {
                                            //navController.navigate(AppScreens.MainMathScreen.route)
                                            scope.launch {
                                                scaffoldState.drawerState.apply{close()}
                                                scaffoldState.snackbarHostState.showSnackbar("Ésta sección está en desarrollo")
                                            }
                                        },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(6.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Calculate,
                                            contentDescription = "Mate",
                                            tint = MaterialTheme.colors.primary
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Mate",
                                            color = MaterialTheme.colors.primary
                                        )
                                    }

                                    TextButton(onClick = {
                                        //navController.navigate(AppScreens.MainPhysicsScreen.route)
                                        scope.launch {
                                            scaffoldState.drawerState.apply{close()}
                                            scaffoldState.snackbarHostState.showSnackbar("Ésta sección está en desarrollo")
                                        }
                                    }, modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp)) {
                                        Icon(
                                            imageVector = Icons.Default.Balance,
                                            contentDescription = "Fisica",
                                            tint = MaterialTheme.colors.primary
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Física",
                                            color = MaterialTheme.colors.primary
                                        )
                                    }

                                    TextButton(onClick = {
                                        //navController.navigate(AppScreens.MainChemScreen.route)
                                        scope.launch {
                                            scaffoldState.drawerState.apply{close()}
                                            scaffoldState.snackbarHostState.showSnackbar("Ésta sección está en desarrollo")
                                        }
                                    }, modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp)) {
                                        Icon(
                                            imageVector = Icons.Default.Science,
                                            contentDescription = "Quimica",
                                            tint = MaterialTheme.colors.primary
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Química",
                                            color = MaterialTheme.colors.primary
                                        )
                                    }
                                }
                            }

                        }

                        TextButton(onClick = {
                            navController.navigate(AppScreens.PayScreen.route)
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)) {
                            Icon(imageVector = Icons.Default.Paid, contentDescription = "Paga", tint = MaterialTheme.colors.primaryVariant)
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Contribuye", color = MaterialTheme.colors.primaryVariant)
                        }
                    }
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
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth())
            {
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "MatAgustinos es un proyecto creado para ayudar a las personas a incrementar su conocimiento",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Nos regimos por la filosofía de:",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Left
                )
                Text(
                    text = "Las ideas por sobre el procedimiento",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "Limitar la creatividad, es ir en contra de la naturaleza," +
                            " la evolución, la esencia del ser humano y todo lo que hizo grande.",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                )

            }
        }



}