package com.example.foodies.features.products_list.data.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

private val BASE_URL = "https://anika1d.github.io/WorkTestServer/"


private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory()).build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface WorkTestServerApiService {

    @GET("Products.json")
    suspend fun getProductsList(): List<ProductItem>

    @GET("Categories.json")
    suspend fun getCatigories(): List<Categories>

    @GET("Tags.json")
    suspend fun getTags(): List<Tag>
}

object WorkTestServerApi {
    val retrofitService: WorkTestServerApiService by lazy {
        retrofit.create(WorkTestServerApiService::class.java)
    }
}