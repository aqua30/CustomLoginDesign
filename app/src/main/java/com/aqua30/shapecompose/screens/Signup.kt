package com.aqua30.shapecompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aqua30.shapecompose.shape.CurveType
import com.aqua30.shapecompose.shape.CurvedShape

/**
 * Created by Saurabh
 */
@Composable
fun Signup(
    modifier: Modifier
) {

    var text by remember {
        mutableStateOf("")
    }

    Box(
        modifier = modifier
            .graphicsLayer {
                shape = CurvedShape(CurveType.LTR)
                clip = true
            }
            .background(Color.Cyan)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Name",
                modifier = Modifier.padding(start = 18.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            )
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = {
                    text = it
                },
                label = {
                    Text(
                        "Enter name",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.W900
                        ),
                    )
                },
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.W900
                ),
                leadingIcon = {
                    Icon(
                        Icons.Default.Person,
                        "",
                        tint = Color.Black
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Email",
                modifier = Modifier.padding(start = 18.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            )
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = {
                    text = it
                },
                label = {
                    Text(
                        "Enter email",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.W900
                        ),
                    )
                },
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.W900
                ),
                leadingIcon = {
                    Icon(
                        Icons.Default.Email,
                        "",
                        tint = Color.Black
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Password",
                modifier = Modifier.padding(start = 18.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            )
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = {
                    text = it
                },
                label = {
                    Text(
                        "Enter password",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.W900
                        ),
                    )
                },
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.W900
                ),
                leadingIcon = {
                    Icon(
                        Icons.Default.Lock,
                        "",
                        tint = Color.Black
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = true, onCheckedChange = {})
                Text(
                    text = "Agree to our terms and conditions",
                    modifier = Modifier.padding(start = 8.dp),
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.BottomEnd
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .graphicsLayer {
                            shadowElevation = 12.dp.toPx()
                            clip = true //make sure to set clip to true
                            shape = CircleShape
                        }
                        .background(Color.Blue),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Default.ArrowForward,
                        "",
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }
}