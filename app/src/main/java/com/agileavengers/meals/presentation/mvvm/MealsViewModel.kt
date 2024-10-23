package com.agileavengers.meals.presentation.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agileavengers.meals.domain.entities.MealsResponse
import com.agileavengers.meals.domain.usecases.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUseCases: GetMeals,
) : ViewModel() {
    private val _mealsState = MutableStateFlow(MealsResponse())
    val mealsState = _mealsState.asStateFlow()



    init {
        getMeals()
    }

    private fun getMeals() {
        viewModelScope.launch {
            try {
                _mealsState.value = getMealsUseCases()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    }



}