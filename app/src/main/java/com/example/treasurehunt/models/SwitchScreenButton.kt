package com.example.treasurehunt.models

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SwitchScreenButton (
    buttonText: String,
    buttonFunc: () -> Unit
) {
    Button(onClick = buttonFunc,
        modifier = Modifier
            .padding(1.dp)
            .size(200.dp, 75.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF388E3C))
    ) { ButtonText(buttonText) }

}