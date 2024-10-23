package com.agileavengers.meals.data.di

import com.agileavengers.meals.domain.repositories.MealsRepository
import com.agileavengers.meals.domain.usecases.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideUseCase(mealsRepository: MealsRepository): GetMeals = GetMeals(mealsRepository)

}