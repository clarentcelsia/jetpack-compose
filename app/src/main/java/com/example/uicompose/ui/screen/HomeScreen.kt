package com.example.uicompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

// https://developer.android.com/jetpack/compose/state
@Composable
fun HomeScreen() {
    Column {
        ClickBox()
        TextFIeld()
    }
}

@Composable
fun TextFIeld(modifier: Modifier = Modifier) {
    //Name yang akan diobserve setiap saat.
    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        modifier = Modifier.fillMaxWidth()
    )

    Text(text = name, color = Color.Black)
}

@Composable
fun ClickBox(
    modifier: Modifier = Modifier
) {
    //Berubah pada saat tertentu
    val color = remember { mutableStateOf(Color.Green) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(color.value)
            .clickable {
                //Change color every time box is clicked
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat()
                )

            }
    )
}

@Preview
@Composable
fun DefaultPreview() {
    HomeScreen()
}