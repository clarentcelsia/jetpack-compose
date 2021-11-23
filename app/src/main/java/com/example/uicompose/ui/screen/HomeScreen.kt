package com.example.uicompose.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uicompose.ui.theme.Purple200
import kotlinx.coroutines.launch

// https://developer.android.com/jetpack/compose/state
@Composable
fun HomeScreen() {
    Scaffolds()
}

@Composable
fun Buttons() {
    Column {
        Button(
            onClick = { },
            contentPadding = PaddingValues(
                top = 8.dp,
                bottom = 8.dp,
                start = 12.dp,
                end = 12.dp
            ),
            enabled = true,
            colors = ButtonDefaults.buttonColors(Purple200)
        ) {
            //Inner content including an icon and a text label
            Icon(
                Icons.Filled.Face,
                "myface",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Click Me!")
        }

        Spacer(modifier = Modifier.height(10.dp))

        ExtendedFloatingActionButton(
            text = {
                Text(text = "Save me!")
            },
            onClick = { },
            icon = {
                Icon(
                    Icons.Filled.Notifications,
                    contentDescription = "save me"
                )
            }
        )
    }

}

//https://developer.android.com/jetpack/compose/layouts/material
// Layout
@Composable
fun Scaffolds() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                backgroundColor = Purple200,
                elevation = 5.dp
            ) {
                //Row content
            }
        },
        bottomBar = {
            BottomAppBar(backgroundColor = Purple200, elevation = 5.dp) {
                //content
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                scope.launch {
                    val result = scaffoldState.snackbarHostState
                        .showSnackbar("Show snackbar")

                    when(result){
                        SnackbarResult.ActionPerformed ->{}
                        SnackbarResult.Dismissed->{}
                    }
                }
            }, backgroundColor = Purple200) {
                Text(text = "Button")
            }
        },
        isFloatingActionButtonDocked = true
    ) {
        //screen content
        Column {
            Text(text = "Hello")
            Spacer(modifier = Modifier.height(10.dp))
            Buttons()
        }

    }
}

@Preview
@Composable
fun DefaultPreview() {
    HomeScreen()
}