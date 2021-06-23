package com.ec.MuseumAR.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Position(
    @PrimaryKey
    val id: Long,
    val to1: String?,
    val to2: String?,
    val to3: String?,
    val to4: String?,
    val to5: String?,
    val to6: String?,
    val to7: String?,
    val to8: String?,
    val to9: String?,
    val to10: String?
)