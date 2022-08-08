package com.app.tft.di

import android.app.Application
import com.app.tft.common.Constants
import com.app.tft.data.remote.RiotApi
import com.app.tft.data.repository.SummonerRepositoryImpl
import com.app.tft.domain.repository.SummonerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRiotApi(): RiotApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RiotApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSummonerApiRepository(api: RiotApi): SummonerRepository {
        return SummonerRepositoryImpl(api)
    }
}