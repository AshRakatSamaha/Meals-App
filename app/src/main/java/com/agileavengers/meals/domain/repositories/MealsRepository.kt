package com.agileavengers.meals.domain.repositories

import com.agileavengers.meals.domain.entities.MealsResponse

interface MealsRepository {
    suspend fun getMealsFromRemote(): MealsResponse
}