package com.agileavengers.meals.data.di

import com.agileavengers.meals.data.repositories.MealsRepositoryImp
import com.agileavengers.meals.data.source.ApiService
import com.agileavengers.meals.domain.repositories.MealsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(apiService: ApiService): MealsRepository = MealsRepositoryImp(apiService)
}