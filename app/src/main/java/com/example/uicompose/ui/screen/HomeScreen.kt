package com.example.uicompose.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uicompose.R
import com.example.uicompose.ui.theme.Purple200

@Composable
fun HomeScreen(text: String) {
    val painter = painterResource(id = R.drawable.imgg)
    val contentDescription = "image"
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(12.dp)
    ) {
        ImageCard(
            painter = painter,
            text = text,
            contentDescription = contentDescription
        )
    }

}

@Composable
fun ImageCard(
    painter: Painter,
    text: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        elevation = 8.dp
    ) {
        Box(modifier = Modifier.height(150.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = (0.2*150.dp.value).toFloat()
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = text,
                    style = TextStyle(
                        color = Purple200,
                        fontSize = 16.sp
                    )
                )
            }

        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    HomeScreen(text = "adios")
}