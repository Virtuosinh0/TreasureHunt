package com.example.treasurehunt.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.treasurehunt.models.QuestionText
import com.example.treasurehunt.models.SwitchScreenButton

@Composable
fun TreasureScreen(goHome: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF66BB6A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        QuestionText("Meus Parabéns, você achou o tesouro")
        QuestionText("Tesouro*")

        SwitchScreenButton("Início", goHome)
    }
}