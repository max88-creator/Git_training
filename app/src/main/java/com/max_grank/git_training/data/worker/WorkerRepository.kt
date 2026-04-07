package com.max_grank.git_training.data.worker

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface WorkerRepository {
    suspend fun insertWorker(worker: Worker)
    suspend fun deleteWorker(worker: Worker)
    suspend fun updateWorker(worker: Worker)
    fun getAllWorkers(): Flow<List<Worker>>
    fun getWorkerById(id: Int): Worker
}