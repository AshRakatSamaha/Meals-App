package com.agileavengers.meals.domain.usecases

import com.agileavengers.meals.domain.repositories.MealsRepository

class GetMeals (private val mealsRepository: MealsRepository) {
    suspend operator fun invoke() = mealsRepository.getMealsFromRemote()
}