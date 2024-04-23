package com.example.foodies.features.products_list.presentation.catalog_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodies.features.products_list.data.network.Categories
import com.example.foodies.features.products_list.data.network.ProductItem
import com.example.foodies.features.products_list.data.network.RepositoryImpl
import com.example.foodies.features.products_list.data.network.Tag
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CatalogViewModel(
    private val repository: RepositoryImpl
) : ViewModel() {

    private val _productListState = MutableStateFlow(emptyList<ProductItem>())
    val productListState: StateFlow<List<ProductItem>> = _productListState.asStateFlow()

    private val _categoriesState = MutableStateFlow(emptyList<Categories>())
    val categoriesState: StateFlow<List<Categories>> = _categoriesState.asStateFlow()

    private val _tagsState = MutableStateFlow(emptyList<Tag>())
    val tagsState: StateFlow<List<Tag>> = _tagsState.asStateFlow()

    init {
        viewModelScope.launch {
            _productListState.value = repository.getProducts()
        }
    }


}