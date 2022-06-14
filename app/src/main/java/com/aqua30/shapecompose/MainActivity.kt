package com.aqua30.shapecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aqua30.shapecompose.screens.Login
import com.aqua30.shapecompose.screens.Signup
import com.aqua30.shapecompose.shape.placeAt
import com.aqua30.shapecompose.ui.theme.ShapeComposeTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShapeComposeTheme {
                val density = LocalDensity.current
                val loginY = density.run { 510.dp.toPx() }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                ) {
                    Signup(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(600.dp)
                            .placeAt(0,0)
                    )
                    Login(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .placeAt(0,loginY.roundToInt())
                    )
                }
            }
        }
    }
}