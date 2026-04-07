package com.max_grank.git_training.di

import android.app.Application
import androidx.room.Room
import com.max_grank.git_training.data.AppDataBase
import com.max_grank.git_training.data.industry.IndustryRepoImpl
import com.max_grank.git_training.data.industry.IndustryRepository
import com.max_grank.git_training.data.worker.WorkerRepository
import com.max_grank.git_training.data.worker.WorkerRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun provideMainDB(app: Application): AppDataBase {
        return Room.databaseBuilder(
            app,
            AppDataBase::class.java,
            "industrial_db"
        ).build()
    }
}

@Provides
@Singleton
fun provideWorkerRepository(appDataBase: AppDataBase): WorkerRepository {
    return WorkerRepositoryImpl(appDataBase.workerDao())
}

@Provides
@Singleton
fun provideIndustrialRepository(appDataBase: AppDataBase): IndustryRepository {
    return IndustryRepoImpl(appDataBase.industryDao())
}