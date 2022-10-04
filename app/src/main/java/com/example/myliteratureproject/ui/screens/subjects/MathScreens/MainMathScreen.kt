package com.example.myliteratureproject.ui.screens.subjects.MathScreens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composer
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.ComposableInvoker
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainMathScreen(navController: NavHostController){
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Surface(color = MaterialTheme.colors.background){
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
                    title = {Text(text = "Mate")})
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



        }

    }
}


