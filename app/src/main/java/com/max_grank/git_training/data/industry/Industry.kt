package com.max_grank.git_training.data.industry

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Industry(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val city: String,
    val destination: Destination
)

enum class Destination {
    AUTOMOBILE,
    SHIP,
    PLANE
}