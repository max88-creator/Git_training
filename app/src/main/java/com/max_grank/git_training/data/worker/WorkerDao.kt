package com.max_grank.git_training.data.worker

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorker(worker: Worker)
    @Delete
    suspend fun deleteWorker(worker: Worker)
    @Update
    suspend fun updateWorker(worker: Worker)
    @Query("SELECT * FROM worker")
    fun getAllWorkers(): Flow<List<Worker>>
    @Query("SELECT * FROM worker WHERE id = :id")
    fun getWorkerById(id: Int): Worker
}