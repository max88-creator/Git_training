package com.max_grank.git_training.data.industry

import kotlinx.coroutines.flow.Flow

class IndustryRepoImpl(
    val dao: IndustryDao
): IndustryRepository {
    override fun insertManufacture(industry: Industry) {
        dao.insertManufacture(industry)
    }

    override fun deleteManufacture(industry: Industry) {
dao.deleteManufacture(industry)
    }

    override fun getAllManufactures(): Flow<List<Industry>> {
return dao.getAllManufactures()
    }

    override suspend fun getManufactureById(id: Int): Industry {
        return dao.getManufactureById(id)
    }
}