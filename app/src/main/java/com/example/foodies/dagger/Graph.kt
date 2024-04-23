package com.example.foodies.dagger

import com.example.foodies.MainActivity
import com.example.foodies.features.products_list.data.network.RepositoryImpl
import com.example.foodies.features.products_list.presentation.catalog_screen.CatalogViewModel
import dagger.Component
import dagger.Module
import dagger.Provides


@Component(modules = [AppModule::class])
interface AppComponent {
 fun catalogViewModel(): CatalogViewModel

 fun inject(activity: MainActivity)
}

@Module
object AppModule {

    @Provides
    fun provideCatalogViewModel(repositoryImpl: RepositoryImpl): CatalogViewModel {
        return CatalogViewModel(
            repository = repositoryImpl
        )
    }

    @Provides
    fun provideRepositoryImpl(): RepositoryImpl {
        return RepositoryImpl()
    }
}