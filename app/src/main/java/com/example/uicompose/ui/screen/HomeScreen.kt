package com.example.uicompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uicompose.ui.theme.Purple200

@Composable
fun HomeScreen(text: String) {
    Text(
        text = text,
        color = Purple200,
        fontSize = 20.sp,
        fontFamily = FontFamily.SansSerif,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .padding(20.dp)
    )
}

@Preview
@Composable
fun DefaultPreview() {
    HomeScreen(text = "Adios")
}