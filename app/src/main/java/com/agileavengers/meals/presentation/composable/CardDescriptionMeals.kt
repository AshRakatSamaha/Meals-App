package com.agileavengers.meals.presentation.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agileavengers.meals.domain.entities.Meals


@Composable
fun CardDescriptionMeals(
    modifier: Modifier = Modifier, meals: Meals, onClick: (Meals) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable {
                onClick(meals)
            },
        colors = CardDefaults.cardColors(
            Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {

            MealsImage(
                imageUrl = meals.strCategoryThumb, modifier = Modifier.size(50.dp)
            )

            Text(
                text = meals.strCategory, modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .align(Alignment.CenterVertically),
                color = Color.Black,
                fontSize = 20.sp
            )

        }


    }
}





