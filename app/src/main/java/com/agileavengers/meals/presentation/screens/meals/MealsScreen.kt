package com.agileavengers.meals.presentation.screens.meals

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.agileavengers.meals.domain.entities.Meals
import com.agileavengers.meals.domain.entities.MealsResponse
import com.agileavengers.meals.presentation.composable.CardDescriptionMeals
import com.agileavengers.meals.presentation.mvvm.MealsViewModel
import com.agileavengers.meals.presentation.screens.mealsDetails.navigateToMealsDetailsScreen
import com.agileavengers.meals.ui.theme.Background


@Composable
fun MealsScreen(
    navController: NavController,
    viewModel: MealsViewModel = hiltViewModel()
) {
    val mealsState by viewModel.mealsState.collectAsState()
    MealsContent(
        mealsState = mealsState,
        onClickItem = {
            navController.navigateToMealsDetailsScreen(it)
        }


    )
}


@Composable
fun MealsContent(
    mealsState: MealsResponse,
    onClickItem: (Meals) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(mealsState.categories) { meals ->
                CardDescriptionMeals(
                    meals = meals,
                    onClick = onClickItem,
                )
            }
        }
    }

}

