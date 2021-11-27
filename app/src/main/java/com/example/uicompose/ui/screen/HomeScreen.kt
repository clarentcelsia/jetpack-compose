package com.example.uicompose.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.uicompose.R
import com.example.uicompose.ui.theme.Purple200
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun HomeScreen() {
    Navigation()

}

@ExperimentalMaterialApi
@Composable
fun Navigation() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(backgroundColor = Purple200, elevation = 0.dp) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(Icons.Filled.Menu, contentDescription = "menu", Modifier.clickable {
                        scope.launch {
                            if (scaffoldState.drawerState.isClosed) scaffoldState.drawerState.open()
                            else scaffoldState.drawerState.close()
                        }
                    })
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "imageprofile",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(28.dp)
                            .clip(CircleShape)
                            .clickable {
                                scope.launch {
                                    scaffoldState.snackbarHostState.showSnackbar("My Profile")
                                }
                            }
                    )
                }

            }
        },
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
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            Color.Red,
                            fontWeight = Bold,
                            fontSize = 45.sp
                        )
                    ) {
                        append("Q")
                    }
                    append("uiz")
                },
                fontSize = 32.sp,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
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
                        .height(180.dp)
                        .padding(top = 25.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp
                ) {
                    Column(
                        Modifier.fillMaxWidth().padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Questions",
                            fontWeight = Bold,
                            fontSize = 14.sp,
                            color = Purple200
                        )
                        Spacer(modifier = Modifier.height(25.dp))
                        Text(
                            text = "Who is the first president of America ?",
                            fontSize = 18.sp,
                            color = Color.DarkGray,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.5.em
                        )
                    }
                }

                Text(
                    text = "12",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .border(1.dp, Purple200, CircleShape)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(16.dp)
                        .align(TopCenter)
                )
            }
            LazyColumn(contentPadding = PaddingValues(50.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                content = {
                    item {
                        Text(text = "Barack Obama",
                            Modifier
                                .fillMaxWidth()
                                .border(
                                    BorderStroke(1.dp, Color.LightGray),
                                    RoundedCornerShape(16.dp)
                                )
                                .padding(16.dp)
                                .clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Barack Obama")
                                    }
                                })
                    }

                    item {
                        Text(
                            text = "George Washington",
                            Modifier
                                .fillMaxWidth()
                                .border(BorderStroke(1.5.dp, Purple200), RoundedCornerShape(16.dp))
                                .padding(16.dp)
                                .clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("George Washington")
                                    }
                                }
                        )
                    }

                    item {
                        Text(
                            text = "John F. Kennedy",
                            Modifier
                                .fillMaxWidth()
                                .border(
                                    BorderStroke(1.dp, Color.LightGray),
                                    RoundedCornerShape(16.dp)
                                )
                                .padding(16.dp)
                                .clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("John F. Kennedy")
                                    }
                                }
                        )
                    }

                    item {
                        Text(
                            text = "Donald Trump",
                            Modifier
                                .fillMaxWidth()
                                .border(BorderStroke(1.5.dp, Color.Red), RoundedCornerShape(16.dp))
                                .padding(16.dp)
                                .clickable {
                                    scope.launch {
                                        state.snackbarHostState.showSnackbar("Donald Trump")
                                    }
                                }
                        )
                    }
                })
        }
    }
}

@ExperimentalMaterialApi
@Preview
@Composable
fun DefaultPreview() {
    HomeScreen()
}