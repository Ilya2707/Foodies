package com.example.foodies.features.products_list.domain

import com.example.foodies.features.products_list.data.network.Categories
import com.example.foodies.features.products_list.data.network.ProductItem
import com.example.foodies.features.products_list.data.network.Tag

interface Repository {

   suspend fun getProducts(): List<ProductItem>

   suspend fun getCategories(): List<Categories>

    suspend fun getTags(): List<Tag>
}