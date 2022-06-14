package com.aqua30.shapecompose.shape

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout

/**
 * Created by Saurabh
 */
@Composable
fun Modifier.placeAt(
    x: Int,
    y: Int,
) = layout { measurables, constraints ->
    val placeable = measurables.measure(constraints)
    layout(placeable.width, placeable.height) {
        placeable.placeRelative(x,y)
    }
}