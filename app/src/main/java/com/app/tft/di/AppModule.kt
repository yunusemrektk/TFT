package com.app.tft.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.app.tft.common.Constants
import com.app.tft.data.db.GameDatabase
import com.app.tft.data.db.dao.SummonerDAO
import com.app.tft.data.db.mapper.SummonerMapper
import com.app.tft.data.remote.api.RiotApi
import com.app.tft.data.repository.SummonerDataSource
import com.app.tft.data.repository.SummonerDataSourceImpl
import com.app.tft.data.repository.SummonerDbImpl
import com.app.tft.data.repository.SummonerRepositoryImpl
import com.app.tft.domain.repository.SummonerDbRepository
import com.app.tft.domain.repository.SummonerRepository
import com.app.tft.domain.usecases.DeleteSummonerUseCase
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

    @Provides
    @Singleton
    fun provideDataSourceImpl( summonerDAO: SummonerDAO, summonerMapper: SummonerMapper): SummonerDataSource {
        return SummonerDataSourceImpl(summonerDAO, summonerMapper)
    }

    @Provides
    @Singleton
    fun provideDbImpl(summonerDataSource: SummonerDataSource): SummonerDbRepository {
        return SummonerDbImpl(summonerDataSource)
    }

    @Provides
    @Singleton
    fun provideDatabase(application: Application) : GameDatabase {
        return Room.databaseBuilder(application, GameDatabase::class.java, "GameDatabase.db").build()
    }

    @Provides
    @Singleton
    fun provideDao(database: GameDatabase) = database.summonerDao()

    @Provides
    @Singleton
    fun provideSummonerMapper(): SummonerMapper {
        return SummonerMapper()
    }
}