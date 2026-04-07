package com.max_grank.git_training.data.industry

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface IndustryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertManufacture(industry: Industry)

    @Delete
    fun deleteManufacture(industry: Industry)

    @Query("SELECT * FROM industry")
    fun getAllManufactures(): Flow<List<Industry>>

    @Query("SELECT * FROM industry WHERE id = :id")
    suspend fun getManufactureById(id: Int): Industry
}