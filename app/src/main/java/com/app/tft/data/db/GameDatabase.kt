package com.app.tft.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.tft.data.db.dao.SummonerDAO
import com.app.tft.data.db.entity.SummonerEntity

@Database(entities = [SummonerEntity::class], version = 1, exportSchema = false)
abstract class GameDatabase: RoomDatabase() {
    abstract fun summonerDao(): SummonerDAO
}