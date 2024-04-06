package com.example.foodies.features.products_list.data.network

import com.example.foodies.features.products_list.domain.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepositoryImpl : Repository {

    override suspend fun getProducts(): List<ProductItem> {
        return  withContext(Dispatchers.IO) {
            WorkTestServerApi.retrofitService.getProductsList()
        }
    }

    override suspend fun getCategories(): List<Categories> {
        return withContext(Dispatchers.IO) {
            WorkTestServerApi.retrofitService.getCatigories()
        }
    }

    override suspend fun getTags(): List<Tag> {
        return withContext(Dispatchers.IO) {
            WorkTestServerApi.retrofitService.getTags()
        }
    }

}