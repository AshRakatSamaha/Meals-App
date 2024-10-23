package com.agileavengers.meals.presentation.mvvm

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agileavengers.meals.domain.entities.Meals
import com.agileavengers.meals.domain.entities.MealsResponse
import com.agileavengers.meals.domain.usecases.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class DetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _mealsState = MutableStateFlow("")
    val mealsState = _mealsState.asStateFlow()


    val mealsArgs: String = checkNotNull(savedStateHandle.get<String>("mealsId"))


    init {
        passMealsToDetailsByArgs()
    }


    private fun passMealsToDetailsByArgs() {
        viewModelScope.launch {
            try {
                _mealsState.value = mealsArgs
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


}