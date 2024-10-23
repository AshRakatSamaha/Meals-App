package com.agileavengers.meals.presentation.screens.mealsDetails

import android.net.Uri
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.agileavengers.meals.domain.entities.Meals
import com.google.gson.Gson


private const val ROUTE = "mealsDetailsScreen"
fun NavGraphBuilder.mealsDetailsRoute() {
//    composable("$ROUTE/{mealsId}", arguments = listOf(navArgument("mealsId"){
//        type = NavType.StringType
//    }
//    )) {
//        MealsDetailsScreen()
//    }

    composable("$ROUTE/{mealsJson}", arguments = listOf(navArgument("mealsJson") {
        type = NavType.StringType
    })) { backStackEntry ->
        val mealsJson = backStackEntry.arguments?.getString("mealsJson")
        val meals = Gson().fromJson(mealsJson, Meals::class.java)
        MealsDetailsScreen(meals)
    }

}

fun NavController.navigateToMealsDetailsScreen(meals: Meals) {
    val gson = Gson()
    val mealsJson = Uri.encode(gson.toJson(meals))
    navigate("$ROUTE/$mealsJson")
}


