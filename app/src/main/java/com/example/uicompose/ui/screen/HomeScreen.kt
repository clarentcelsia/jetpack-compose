package com.example.uicompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uicompose.ui.theme.Purple200

@Composable
fun HomeScreen(text: String) {
    Row {
        Text(
            text = text,
            color = Purple200,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Black)
                .weight(3f)
                .border(1.5.dp, Color.White, RectangleShape)
                .padding(10.dp)
        )

        Text(
            text = text,
            color = Purple200,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .background(Color.DarkGray)
                .weight(2f)
                .border(1.5.dp, Color.White, RectangleShape)
                .padding(start = 10.dp)
        )

        Text(
            text = text,
            color = Purple200,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Right,
            modifier = Modifier
                .background(Color.White)
                .weight(1f)
                .border(1.5.dp, Color.Black, RectangleShape)
                .padding(start = 10.dp)
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    HomeScreen(text = "Adios")
}