package com.agileavengers.meals.presentation.screens.meals

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val ROUTE = "mealsScreen"
fun NavGraphBuilder.mealsRoute(navController: NavController) {
    composable(ROUTE,) {
        MealsScreen(navController,)
    }
}




