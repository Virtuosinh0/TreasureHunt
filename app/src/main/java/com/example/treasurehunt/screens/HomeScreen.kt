package com.example.treasurehunt.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.treasurehunt.models.QuestionText
import com.example.treasurehunt.models.SwitchScreenButton
import kotlin.system.exitProcess

@Composable
fun HomeScreen(
    screenOne: () -> Unit,
    screenTwo: () -> Unit
){
    BackHandler {
        exitProcess(0)
    }

    Column(
        modifier = Modifier.fillMaxSize()
        .background(Color(0xFF66BB6A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        QuestionText("Bem vindo a caça ao tesouro")
        QuestionText("Responda as perguntas certas para encontrar o tesouro")
        SwitchScreenButton("Tesouro 1", screenOne)
        SwitchScreenButton("Tesouro 2", screenTwo)
    }
}