package com.agileavengers.meals.data.source

import com.agileavengers.meals.domain.entities.MealsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): MealsResponse
}