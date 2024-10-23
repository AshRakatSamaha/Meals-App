package com.agileavengers.meals.domain.entities

data class MealsResponse(
    val categories: List<Meals> = emptyList()
)