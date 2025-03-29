package com.example.treasurehunt.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.treasurehunt.models.SwitchScreenButton

@Composable
fun HomeScreen(
    screenOne: () -> Unit,
    screenTwo: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
        .background(Color(0x99009900)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Bem vindo a caça ao tesouro")
        Text("Responda as perguntas certas para encontrar o tesouro")
        SwitchScreenButton("Tesouro 1", screenOne)
        SwitchScreenButton("Tesouro 2", screenTwo)
    }
}