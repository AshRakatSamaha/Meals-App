package com.agileavengers.meals

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.agileavengers.meals.presentation.screens.meals.mealsRoute
import com.agileavengers.meals.presentation.screens.mealsDetails.mealsDetailsRoute

@Composable
fun MealsNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "mealsScreen") {
        mealsRoute(navController = navController)
        mealsDetailsRoute()

    }
}


