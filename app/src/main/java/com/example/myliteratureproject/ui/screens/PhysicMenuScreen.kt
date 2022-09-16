package com.example.myliteratureproject.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun PhysicMenuScreen(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text("Physic Menu Screen")
    }
}