package com.example.uicompose.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uicompose.ui.theme.Purple200
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun HomeScreen() {
    BottomSheet()
}

@Composable
fun SideDrawer() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        //init
        scaffoldState = scaffoldState,
        drawerBackgroundColor = Purple200,
        drawerContent = {
            Text(text = "Title")
            Divider()
            Text(text = "Hello")
            //Drawer Items
        },
        drawerGesturesEnabled = true,
        floatingActionButton = {
            ExtendedFloatingActionButton(text = { Text(text = "Open or Close Drawer") },
                onClick = {
                    //run
                    scope.launch {
                        scaffoldState.drawerState.apply {
                            if (this.isClosed) open()
                            else close()
                        }
                    }
                })
        }
    ) {
        //Screen Content
    }

    // Implementing navigation drawer without scaffold
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    ModalDrawer(
        drawerState = drawerState,
        drawerContent = {
            Text(text = "This is an example of the usage of Modal Drawer")
            Divider(thickness = 2.dp)
            Text(text = "Modal Drawer")
        },
        gesturesEnabled = true,
        drawerBackgroundColor = Purple200,
        scrimColor = Color.Red,
        drawerElevation = 5.dp
    ) {
        //screen content
        Text(text = "Content")
    }
}

@ExperimentalMaterialApi
@Composable
fun BottomDrawers() {
    val (gesturesEnabled, toggleGesturesEnabled) = remember { mutableStateOf(true) }
    val drawerState = rememberBottomDrawerState(initialValue = BottomDrawerValue.Closed)
    val scope = rememberCoroutineScope()
    BottomDrawer(
        drawerState = drawerState,
        drawerContent = {
            Button(
                onClick = {
                    scope.launch {
                        if (drawerState.isClosed) drawerState.open()
                        else drawerState.close()
                    }
                },
                content = { Text(text = "Click") }
            )
            LazyColumn {
                items(25) {
                    ListItem(
                        text = { Text("Item $it") },
                        icon = {
                            Icon(
                                Icons.Default.Favorite,
                                contentDescription = "description"
                            )
                        }
                    )
                }
            }
        }
    )
    {
        //screen content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val openText = if (gesturesEnabled) " Pull up " else "Click the button!"
            Text(text = if (drawerState.isClosed) openText else "Drag down")
            Spacer(Modifier.height(20.dp))
            Button(onClick = { scope.launch { drawerState.open() } }) {
                Text("Click to open")
            }
        }
    }

}

@ExperimentalMaterialApi
@Composable
fun BottomSheet() {
    val scope = rememberCoroutineScope()
    val state = rememberBottomSheetScaffoldState()
    BottomSheetScaffold(
        scaffoldState = state,
        backgroundColor = Purple200,
        sheetElevation = 8.dp,
        topBar = {
            TopAppBar(
                title = { Text("Bottom sheet scaffold") },
                navigationIcon = {
                    IconButton(onClick = { scope.launch { state.drawerState.open() } }) {
                        Icon(Icons.Default.Menu, contentDescription = "Localized description")
                    }
                }
            )
        },
        floatingActionButton = {
            var clickCount by remember { mutableStateOf(0) }
            FloatingActionButton(
                onClick = {
                    // show snackbar as a suspend function
                    scope.launch {
                        state.snackbarHostState.showSnackbar("Snackbar #${++clickCount}")
                    }
                }
            ) {
                Icon(Icons.Default.Favorite, contentDescription = "Localized description")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        sheetPeekHeight = 125.dp,
        drawerContent = {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Drawer content")
                Spacer(Modifier.height(20.dp))
                Button(onClick = { scope.launch { state.drawerState.close() } }) {
                    Text("Click to close drawer")
                }
            }
        },
        sheetContent = {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Swipe up")
            }
            Column {
                Button(onClick = {
                    scope.launch {
                        if (state.bottomSheetState.isCollapsed) state.bottomSheetState.expand()
                        else state.bottomSheetState.collapse()
                    }})
                {
                    Text(text = "Click")
                }
                Text(text = "Bottom Sheet Content")
            }
        }) {
        //screen content
    }
}

@ExperimentalMaterialApi
@Preview
@Composable
fun DefaultPreview() {
    HomeScreen()
}