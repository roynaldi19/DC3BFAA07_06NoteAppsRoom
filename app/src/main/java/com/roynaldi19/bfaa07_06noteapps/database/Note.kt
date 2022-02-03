package com.roynaldi19.bfaa07_06noteapps.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
        )