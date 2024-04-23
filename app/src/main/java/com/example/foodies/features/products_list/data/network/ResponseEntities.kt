package com.example.foodies.features.products_list.data.network

import com.squareup.moshi.Json

data class ProductItem(
    @Json(name = "id") val id: Int? = null,
    @Json(name = "category_id") val categoryId: Int? = null,
    @Json(name = "name") val name: String = "",
    @Json(name = "description") val description: String = "",
    @Json(name = "image") val image: String = "",
    @Json(name = "price_current") val priceCurrent: Int? = null,
    @Json(name = "price_old") val priceOld: Int? = null,
    @Json(name = "measure") val measure: Int? = null,
    @Json(name = "measure_unit") val measureUnit: String = "",
    @Json(name = "energy_per_100_grams") val energyPer: Double? = null,
    @Json(name = "proteins_per_100_grams") val proteinsPer: Double? = null,
    @Json(name = "fats_per_100_grams") val fatsPer: Double? = null,
    @Json(name = "carbohydrates_per_100_grams") val carbohydratesPer: Double? = null,
    @Json(name = "tag_ids") val tagIds: List<Int> = emptyList()
)

data class Categories(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String
)

data class Tag(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String
)