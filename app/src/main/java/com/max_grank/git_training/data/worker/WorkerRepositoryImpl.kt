package com.max_grank.git_training.data.worker

import kotlinx.coroutines.flow.Flow

class WorkerRepositoryImpl(
    private val dao: WorkerDao
) : WorkerRepository {
    override suspend fun insertWorker(worker: Worker) {
        dao.insertWorker(worker)
    }

    override suspend fun deleteWorker(worker: Worker) {
        dao.deleteWorker(worker)
    }

    override suspend fun updateWorker(worker: Worker) {
        dao.updateWorker(worker)
    }

    override fun getAllWorkers(): Flow<List<Worker>> {
        return dao.getAllWorkers()
    }

    override fun getWorkerById(id: Int): Worker {
        return dao.getWorkerById(id)
    }
}