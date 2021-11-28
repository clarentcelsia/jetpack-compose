package com.example.uicompose.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uicompose.R
import com.example.uicompose.ui.theme.LightPurple200
import com.example.uicompose.ui.theme.LightPurple2200
import com.example.uicompose.ui.theme.Purple200
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun HomeScreen() {
    Navigation()

}

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun Navigation() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerGesturesEnabled = true,
        drawerContent = {
            Column {
                Card(Modifier.fillMaxWidth(), RectangleShape) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.background),
                            contentDescription = "background"
                        )
                        Column(Modifier.padding(vertical = 18.dp, horizontal = 22.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = "MyProfile",
                                contentScale = ContentScale.Inside,
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(120.dp)
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(text = "Anna Winstour", fontSize = 22.sp, fontWeight = Bold)
                            Text(text = "Graphic Designer", fontSize = 16.sp)
                        }
                    }
                }
                Spacer(Modifier.height(12.dp))
                LazyColumn(Modifier.padding(horizontal = 20.dp, vertical = 10.dp), content = {
                    item {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Filled.Person,
                                    contentDescription = "Person",
                                    Modifier.size(24.dp),
                                    tint = Color.DarkGray
                                )
                                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                                Text(text = "Profile", color = Color.DarkGray, fontSize = 18.sp)
                            }
                        }
                    }
                    item {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painterResource(id = R.drawable.messages),
                                    contentDescription = "Messages",
                                    Modifier.size(24.dp),
                                    tint = Color.DarkGray
                                )
                                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                                Text(text = "Messages", color = Color.DarkGray, fontSize = 18.sp)
                            }
                        }
                    }
                    item {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Filled.Notifications,
                                    contentDescription = "Notifications",
                                    Modifier.size(24.dp),
                                    tint = Color.DarkGray
                                )
                                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                                Text(
                                    text = "Notifications",
                                    color = Color.DarkGray,
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                    item {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Filled.List,
                                    contentDescription = "Lists",
                                    Modifier.size(24.dp),
                                    tint = Color.DarkGray
                                )
                                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                                Text(text = "Lists", color = Color.DarkGray, fontSize = 18.sp)
                            }
                        }
                    }
                    item {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Filled.Settings,
                                    contentDescription = "settings",
                                    Modifier.size(24.dp),
                                    tint = Color.DarkGray
                                )
                                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                                Text(text = "Settings", color = Color.DarkGray, fontSize = 18.sp)
                            }
                        }
                    }
                    item {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painterResource(id = R.drawable.signout),
                                    contentDescription = "Out",
                                    Modifier.size(28.dp),
                                    tint = Color.DarkGray
                                )
                                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                                Text(text = "Sign out", color = Color.DarkGray, fontSize = 18.sp)
                            }
                        }
                    }
                })
            }
        },
        content = {
            Contents(scope, scaffoldState)
        }
    )

}

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun Contents(scope: CoroutineScope, state: ScaffoldState) {
    Box(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.3f)
                .fillMaxWidth()
                .background(Purple200)
                .align(TopCenter)
        ) {
            Canvas(Modifier.fillMaxSize(), onDraw = {
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawCircle(
                    LightPurple200,
                    center = Offset.Zero,
                    radius = size.minDimension / 3
                )

                drawCircle(
                    LightPurple200,
                    center = Offset(x = canvasWidth, y = canvasHeight / 2),
                    radius = size.minDimension / 3
                )

                drawCircle(
                    LightPurple200,
                    radius = size.minDimension / 3
                )

                drawCircle(
                    LightPurple2200,
                    radius = size.minDimension / 4
                )

                drawCircle(
                    Color.White,
                    radius = size.minDimension / 4.7f
                )
            })

            Icon(Icons.Filled.ArrowBack, contentDescription = "back",
                Modifier
                    .padding(12.dp)
                    .size(24.dp)
                    .clickable {
                        scope.launch { state.snackbarHostState.showSnackbar("Arrow Back") }
                    })

            Column(
                Modifier.align(Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Score",
                    fontSize = 16.sp,
                    color = Purple200
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "150",
                    fontSize = 33.sp,
                    color = Purple200,
                    fontWeight = Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                .align(BottomCenter)
        )

        Column(
            Modifier
                .align(Center)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(Modifier.background(Color.Transparent)) {
                Card(
                    Modifier
                        .fillMaxWidth(0.8f)
                        .height(135.dp)
                        .padding(top = 25.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp
                ) {
                    Column(Modifier.padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        LazyVerticalGrid(
                            cells = GridCells.Fixed(2),
                            content = {
                                item {
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .clip(CircleShape)
                                                .background(Purple200)
                                                .size(5.dp)
                                        )
                                        Text(
                                            buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        color = Purple200,
                                                        fontSize = 15.sp,
                                                        fontWeight = Bold
                                                    )
                                                ) {
                                                    append("100%\n")
                                                }
                                                append("Completion")
                                            },
                                            fontSize = 12.sp,
                                            color = Color.DarkGray
                                        )
                                    }
                                }
                                item {
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .clip(CircleShape)
                                                .background(Purple200)
                                                .size(5.dp)
                                        )
                                        Text(
                                            buildAnnotatedString {
                                                withStyle(
                                                    SpanStyle(
                                                        Purple200, fontSize = 15.sp,
                                                        fontWeight = Bold
                                                    )
                                                ) {
                                                    append("20\n")
                                                }
                                                append("Total Question")
                                            },
                                            fontSize = 12.sp,
                                            color = Color.DarkGray
                                        )
                                    }
                                }
                            }
                        )

                        LazyVerticalGrid(
                            cells = GridCells.Fixed(2),
                            content = {
                                item {
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .clip(CircleShape)
                                                .background(Color.Green)
                                                .size(5.dp)
                                        )
                                        Text(
                                            buildAnnotatedString {
                                                withStyle(
                                                    SpanStyle(
                                                        Color.Green,
                                                        fontWeight = Bold,
                                                        fontSize = 15.sp
                                                    )
                                                ) {
                                                    append("15\n")
                                                }
                                                append("Correct")
                                            },
                                            fontSize = 12.sp,
                                            color = Color.DarkGray
                                        )
                                    }
                                }
                                item {
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .clip(CircleShape)
                                                .background(Color.Red)
                                                .size(5.dp)
                                        )
                                        Text(
                                            buildAnnotatedString {
                                                withStyle(
                                                    SpanStyle(
                                                        Color.Red,
                                                        fontSize = 15.sp,
                                                        fontWeight = Bold
                                                    )
                                                ) {
                                                    append("05\n")
                                                }
                                                append("Wrong")
                                            },
                                            fontSize = 12.sp,
                                            color = Color.DarkGray
                                        )
                                    }
                                }
                            }
                        )
                    }
                }
            }
            LazyVerticalGrid(
                cells = GridCells.Fixed(3),
                contentPadding = PaddingValues(50.dp),
                content = {
                    item {
                        Box(Modifier.aspectRatio(1f).padding(8.dp)) {
                            Column(
                                Modifier.align(Center).clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Play Again")
                                    }
                                },
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(Color.Gray)){

                                    Icon(
                                        Icons.Filled.Refresh,
                                        contentDescription = "refresh",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(CircleShape)
                                            .align(Center)
                                    )
                                }

                                Text(
                                    text = "Play Again",
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 3.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                    color = Color.DarkGray
                                )
                            }
                        }
                    }
                    item {
                        Box(Modifier.aspectRatio(1f).padding(8.dp)) {
                            Column(
                                Modifier.align(Center).clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Review")
                                    }
                                },
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(Color.Gray)) {

                                    Icon(
                                        painterResource(id = R.drawable.review),
                                        contentDescription = "review",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(CircleShape)
                                            .background(Color.Gray)
                                            .align(Center)
                                    )
                                }
                                Text(
                                    text = "Review Answer",
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 3.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                    color = Color.DarkGray
                                )
                            }
                        }
                    }
                    item {
                        Box(Modifier.aspectRatio(1f).padding(8.dp)) {
                            Column(
                                Modifier.align(Center).clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Review")
                                    }
                                },
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(Color.Gray)) {

                                    Icon(
                                        Icons.Filled.Share,
                                        contentDescription = "share",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(CircleShape)
                                            .background(Color.Gray)
                                            .align(Center)
                                    )
                                }
                                Text(
                                    text = "Share",
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 3.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                    color = Color.DarkGray
                                )
                            }
                        }
                    }
                    item {
                        Box(Modifier.aspectRatio(1f).padding(8.dp)) {
                            Column(
                                Modifier.align(Center).clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Review")
                                    }
                                },
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(Color.Gray)) {

                                    Icon(
                                        Icons.Filled.ShoppingCart,
                                        contentDescription = "Shop",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(CircleShape)
                                            .background(Color.Gray)
                                            .align(Center)
                                    )
                                }
                                Text(
                                    text = "Shop",
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 3.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                    color = Color.DarkGray
                                )
                            }
                        }
                    }
                    item {
                        Box(Modifier.aspectRatio(1f).padding(8.dp)) {
                            Column(
                                Modifier.align(Center).clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Review")
                                    }
                                },
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(Color.Gray)) {

                                    Icon(
                                        Icons.Filled.Home,
                                        contentDescription = "Home",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(CircleShape)
                                            .background(Color.Gray)
                                            .align(Center)
                                    )
                                }
                                Text(
                                    text = "Home",
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 3.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                    color = Color.DarkGray
                                )
                            }
                        }
                    }
                    item {
                        Box(Modifier.aspectRatio(1f).padding(8.dp)) {
                            Column(
                                Modifier.align(Center).clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Leaderboard")
                                    }
                                },
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                                    .background(Color.Gray)) {

                                    Icon(
                                        painterResource(id = R.drawable.leaderboard),
                                        contentDescription = "leaderboard",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(CircleShape)
                                            .background(Color.Gray)
                                            .align(Center)
                                    )
                                }
                                Text(
                                    text = "Leaderboard",
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 3.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                    color = Color.DarkGray
                                )
                            }
                        }
                    }
                })
        }
    }
}

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Preview
@Composable
fun DefaultPreview() {
    HomeScreen()
}