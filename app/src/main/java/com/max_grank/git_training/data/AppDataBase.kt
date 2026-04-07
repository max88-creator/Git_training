package com.max_grank.git_training.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.max_grank.git_training.data.industry.Industry
import com.max_grank.git_training.data.industry.IndustryDao
import com.max_grank.git_training.data.worker.Worker
import com.max_grank.git_training.data.worker.WorkerDao

@Database(
    entities = [Worker::class, Industry::class],
    version = 1
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun workerDao(): WorkerDao
    abstract fun industryDao(): IndustryDao
}