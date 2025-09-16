package com.example.practica_1_bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ladoverde(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(Color.Green)
            .fillMaxHeight()
    )
}
