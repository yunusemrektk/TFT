package com.app.tft.di

import android.app.Application
import androidx.room.Room
import com.app.tft.data.db.GameDatabase
import com.app.tft.data.db.dao.SummonerDAO
import com.app.tft.data.db.mapper.SummonerMapper
import com.app.tft.data.repository.SummonerDbImpl
import com.app.tft.domain.repository.SummonerDbRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application) = Room.databaseBuilder(application, GameDatabase::class.java, "GameDatabase.db").allowMainThreadQueries().build()

    @Provides
    @Singleton
    fun provideDbImpl(summonerDAO: SummonerDAO, summonerMapper: SummonerMapper): SummonerDbRepository {
        return SummonerDbImpl(summonerDAO, summonerMapper)
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