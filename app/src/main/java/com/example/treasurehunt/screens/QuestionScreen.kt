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
import com.example.treasurehunt.models.QuestionText
import com.example.treasurehunt.models.SwitchScreenButton

@Composable
fun TipQuestionScreen(
    question : String,
    rightScreen: () -> Unit,
    wrongScreen: () -> Unit,
    answerOne : String,
    answerTwo : String,
    answerThree : String,
    rightAnswer: Int
    ){

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF66BB6A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        QuestionText(question)

        when (rightAnswer) {
            1 -> {SwitchScreenButton(answerOne, rightScreen)
                SwitchScreenButton(answerTwo, wrongScreen)
                SwitchScreenButton(answerThree, wrongScreen)
            }
            2 -> {
                SwitchScreenButton(answerOne, wrongScreen)
                SwitchScreenButton(answerTwo, rightScreen)
                SwitchScreenButton(answerThree, wrongScreen)
            }
            3 -> {
                SwitchScreenButton(answerOne, wrongScreen)
                SwitchScreenButton(answerTwo, wrongScreen)
                SwitchScreenButton(answerThree, rightScreen)
            }
        }
    }
}