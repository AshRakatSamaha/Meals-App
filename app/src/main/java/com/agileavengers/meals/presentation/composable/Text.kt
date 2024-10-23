package com.agileavengers.meals.presentation.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MealsNameText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier
            .padding(top = 16.dp),
        color = Color.Black,
        fontSize = 24.sp
    )

}

@Composable
fun MealsDescriptionText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier
            .padding(top = 16.dp),
        color = Color.Gray,
        fontSize = 16.sp
    )
}

