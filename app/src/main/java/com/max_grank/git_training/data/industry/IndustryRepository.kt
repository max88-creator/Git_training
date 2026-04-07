package com.max_grank.git_training.data.industry

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface IndustryRepository {
    fun insertManufacture(industry: Industry)
    fun deleteManufacture(industry: Industry)
    fun getAllManufactures(): Flow<List<Industry>>
    suspend fun getManufactureById(id: Int): Industry
}