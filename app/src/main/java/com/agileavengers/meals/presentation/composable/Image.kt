package com.agileavengers.meals.presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun MealsImage(
    imageUrl: String,
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier
            .size(150.dp)
            .clip(CircleShape)
            .border(1.dp, Color.Gray, CircleShape),
        painter = rememberAsyncImagePainter(model =imageUrl),
        contentDescription = "image of meals",
        contentScale = ContentScale.Crop
    )

}

