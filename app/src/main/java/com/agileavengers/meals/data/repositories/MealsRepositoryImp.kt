package com.agileavengers.meals.data.repositories

import com.agileavengers.meals.data.source.ApiService
import com.agileavengers.meals.domain.entities.MealsResponse
import com.agileavengers.meals.domain.repositories.MealsRepository

class MealsRepositoryImp(private val apiService: ApiService):MealsRepository {
    override suspend fun getMealsFromRemote(): MealsResponse = apiService.getMeals()
}