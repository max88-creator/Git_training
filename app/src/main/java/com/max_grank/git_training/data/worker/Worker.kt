package com.max_grank.git_training.data.worker

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "worker")
data class Worker(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val lastName: String,
   // val position: Position
)

enum class Position(var level: Int) {
    WELDER(0),
    STEAMFITTER(0),
    MECHANIC(0),
    TURNER(0),
    DEVELOPER(0)
}