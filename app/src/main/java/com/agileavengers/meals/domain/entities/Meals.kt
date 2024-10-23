package com.agileavengers.meals.domain.entities

import java.io.Serializable


data class Meals(
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)