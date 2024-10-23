package com.agileavengers.meals.presentation.screens.mealsDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agileavengers.meals.domain.entities.Meals
import com.agileavengers.meals.presentation.composable.MealsDescriptionText
import com.agileavengers.meals.presentation.composable.MealsImage
import com.agileavengers.meals.presentation.composable.MealsNameText
import com.agileavengers.meals.ui.theme.Background


@Composable
fun MealsDetailsScreen(
    meals: Meals
) {
    MealsDetailsContent(
        meals = meals
    )
}

@Composable
fun MealsDetailsContent(
    meals: Meals
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)

    ) {
        MealsImage(
            imageUrl = meals.strCategoryThumb,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
        MealsNameText(
            text = meals.strCategory,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
        MealsDescriptionText(
            text = meals.strCategoryDescription
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMealsDetailsScreen() {
    MealsDetailsScreen(
        meals = Meals(
            strCategory = "Category",
            strCategoryDescription = "Category Description",
            strCategoryThumb = "Category Thumb",
            idCategory = "Category Id",
        )
    )
}



