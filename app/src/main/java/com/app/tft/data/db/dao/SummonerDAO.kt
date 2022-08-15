package com.app.tft.data.db.dao

import androidx.room.*
import com.app.tft.data.db.entity.SummonerEntity


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