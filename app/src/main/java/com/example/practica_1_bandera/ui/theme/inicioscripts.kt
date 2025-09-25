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

@Composable
fun fondo(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)
    )
}

@Composable
fun lineavertical() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Spacer(
            modifier = Modifier
                .width(30.dp)
                .fillMaxHeight()
                .background(Color.White)


        )
    }
}

@Composable
fun lineahorizontal(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.White)
                .align(Alignment.CenterStart)
        )
    }
}



