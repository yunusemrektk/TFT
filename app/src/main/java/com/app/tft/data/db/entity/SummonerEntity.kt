package com.app.tft.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Summoner")
class SummonerEntity (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "sid")
    var sid: String,

    @ColumnInfo(name = "accountId")
    var accountId: String,

    @ColumnInfo(name = "puuid")
    var puuid: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "profileIconId")
    var profileIconId: Int,

    @ColumnInfo(name = "revisionDate")
    var revisionDate: Long,

    @ColumnInfo(name = "summonerLevel")
    var summonerLevel: Int
    )