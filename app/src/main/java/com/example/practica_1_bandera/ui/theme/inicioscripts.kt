package com.example.practica_1_bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun franjablanca(modifier: Modifier = Modifier){
    Spacer(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
    )
}
@Composable
fun franjaroja(modifier: Modifier = Modifier){
    Spacer(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Red)
    )
}
@Composable
fun cuadroazul(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(Color.Blue)
    )
}



