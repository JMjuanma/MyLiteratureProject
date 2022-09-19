package com.example.myliteratureproject.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MenuScreen(navController: NavHostController){
    //Surface (
        //modifier = Modifier.fillMaxSize()
            //)
    Surface(color = MaterialTheme.colors.background){
        Scaffold (
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
                        }
                    },
                    title = {Text(text = "hola")})
            }) {
            Text("MenuScreen")
            LazyVerticalGrid(
                contentPadding = PaddingValues(4.dp),
                cells = GridCells.Adaptive(150.dp)
            ){

            }
            }

    }
}

@Composable
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
}