package com.example.myliteratureproject.ui.screens.subjects.PhysicsScreens

import android.annotation.SuppressLint
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myliteratureproject.R
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainPhysicsScreen(navController: NavHostController){
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
        Body()
    }
}

@Composable
fun Body(){
    LazyColumn(
        Modifier
            //.width(400.dp)
            //.height(800.dp)){
            .fillMaxSize()){
        item{ Spacer(Modifier.height(30.dp)) }
        item{ MyTitle(stringResource(id = com.example.myliteratureproject.R.string.physic_topic_1))  }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_1)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_1), 170) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_2)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_2), 160) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_3), 50) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_3)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_4), 70) }
        item{ MySubtitle(stringResource(id= com.example.myliteratureproject.R.string.physic_subtopic_4)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_5), 160) }
        item{ MyTitle(stringResource(id = com.example.myliteratureproject.R.string.physic_topic_2)) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_5)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_6), 130) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_7), 225) }
        item{ Image(painter = painterResource(id= com.example.myliteratureproject.R.drawable.ec_mas), contentDescription = "Fórmulas",
            Modifier
                .padding(start = 25.dp)
                .size(width = 350.dp, height = 300.dp)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_8), 80) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_9), 60) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_6)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_10), 130) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_11), 130) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_12), 110) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_13), 130) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_7)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_14), 150) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_15), 100) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_16), 130) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_17), 100) }
        item{ MySubtitle(stringResource(id= com.example.myliteratureproject.R.string.physic_subtopic_8)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_18), 230) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_19), 210) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_20), 170) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_21), 160) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_22), 130) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_23), 210) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_24), 180) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_25), 180) }
        item{ MySubtitle(stringResource(id= com.example.myliteratureproject.R.string.physic_subtopic_9)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_26), 160) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_27), 130) }
        item{ MyTitle(stringResource(id = com.example.myliteratureproject.R.string.physic_topic_3)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_28), 160) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_10)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_29), 60) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_11)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_30), 80) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_12)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_31), 30) }
        item{ MySubtitle(stringResource(id= com.example.myliteratureproject.R.string.physic_subtopic_13)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_32), 80) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_14)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_33), 140) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_15)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_34), 110) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_35), 90) }
        item{ MySubtitle(stringResource(id = com.example.myliteratureproject.R.string.physic_subtopic_16)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_36), 80) }
        item{ MySubtitle(stringResource(id= com.example.myliteratureproject.R.string.physic_subtopic_17)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_37), 110) }
        item{ MySubtitle(stringResource(id= com.example.myliteratureproject.R.string.physic_subtopic_18)) }
        item{ MyParagraph(stringResource(id = com.example.myliteratureproject.R.string.physic_paragraph_38), 170) }
    }
}

@Composable
fun MyTitle(string: String){
    Text(string,
        Modifier
            //.width(400.dp)
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp)
            //.size(30.dp), fontFamily= FontFamily.Monospace, fontWeight = FontWeight.W900, textAlign= TextAlign.Center)
            , fontFamily= FontFamily.Monospace, fontWeight = FontWeight.W900, textAlign= TextAlign.Center)
    //Spacer(Modifier.width(350.dp).height(2.dp).padding(start = 30.dp).background(color = Color.Black))
}

@Composable
fun MySubtitle(string: String){
    Text(string,
        Modifier
            //.width(400.dp)
            .fillMaxWidth()
            .padding(start = 26.dp, end = 16.dp, top = 8.dp)
            //.size(30.dp), fontFamily= FontFamily.Serif, fontWeight= FontWeight.W600)
            , fontFamily= FontFamily.Serif, fontWeight= FontWeight.W600)
    //Spacer(Modifier.width(300.dp).height(1.dp).padding(start = 20.dp).background(color = Color.Black))
}

@Composable
fun MyParagraph(string: String, x: Int){
    Text(string,
        Modifier
            //.width(400.dp)
            .fillMaxWidth()
            //.height(x.dp)
            .padding(start = 10.dp, end = 16.dp, top = 5.dp)
            //.size(30.dp), fontFamily= FontFamily.Serif, fontWeight= FontWeight.W400)
            , fontFamily= FontFamily.Serif, fontWeight= FontWeight.W400)
}