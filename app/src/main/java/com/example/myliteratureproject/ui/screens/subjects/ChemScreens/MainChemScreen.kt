package com.example.myliteratureproject.ui.screens.subjects.ChemScreens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myliteratureproject.ui.navigaton.AppScreens
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainChemScreen(navController: NavHostController){
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
                    title = { Text(text = "Quimica") })
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
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Main Chem Screen")
            }

            /*if (darkTheme) {
                Text(text = "MUERTEEEEE")
            } else {
                Text(text = "VIDAAA")
            }*/

        }

    }
}