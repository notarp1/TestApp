package com.notarmaso.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(text: String = "Menu"){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
        .background(Color.DarkGray), contentAlignment = Alignment.Center){
        Text(text = text)
    }
}

@Composable
fun MenuButton(text: String = "Knap", onClick: ()->Unit){
    OutlinedButton(onClick = { onClick()}, modifier = Modifier.width(200.dp)) {
        Text(text = text, color = Color.Black)
    }
<<<<<<< Updated upstream
=======
}

@Composable
fun MenuButton2(text: String = "Knap", onClick: ()->Unit){
    OutlinedButton(onClick = { onClick()}, modifier = Modifier.width(200.dp)) {
        Text(text = dasdasdasdtext, color = Color.Black)
    }
>>>>>>> Stashed changes
}