package com.app.tft.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.app.tft.data.db.entity.SummonerEntity
import com.app.tft.data.remote.dto.user.SummonerDto
import dagger.Provides

@Dao
interface SummonerDAO {

    @Insert
    fun insert(summoner: SummonerEntity)

    @Delete
    fun delete(summoner: SummonerEntity)

    @Query("SELECT * FROM Summoner")
    fun getAllSummoner(): List<SummonerEntity>


    @Query("SELECT * FROM Summoner WHERE name = :name")
    fun getSummonerByName(name: String): SummonerEntity
}