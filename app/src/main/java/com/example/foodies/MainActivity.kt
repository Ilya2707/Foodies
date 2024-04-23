package com.example.foodies

import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.foodies.dagger.AppComponent
import com.example.foodies.dagger.DaggerAppComponent
import com.example.foodies.features.products_list.presentation.catalog_screen.CatalogViewModel
import com.example.foodies.navigation.Navigation
import com.example.foodies.ui.theme.Pink40
import com.example.foodies.ui.theme.Typography
import javax.inject.Inject


class MainApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is MainApp -> appComponent
        else -> this.applicationContext.appComponent
    }


class MainActivity : ComponentActivity() {

    @Inject
    lateinit var catalogViewModel: CatalogViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        //val catalogViewModel: CatalogViewModel = appComponent.catalogViewModel()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
                    Surface(
                        modifier = Modifier
                            .padding(padding)
                            .fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Navigation(catalogViewModel)
                    }
                } // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Composable
fun ApplicationTheme(
    content: @Composable () -> Unit
) {
    val ApplicationColorScheme = MaterialTheme.colorScheme.copy(
        primary = Color(0xFFF15412),
        secondary = Color(0xFFF5F5F5),
        tertiary = Pink40,
        background = Color(0xFFFFFF),
        surface = Color(0xFFFFFFFF),
        onSurface = Color.Black


        /* Other default colors to override
        background = Color(0xFFFFFBFE),
        surface = Color(0xFFFFFBFE),
        onPrimary = Color.White,
        onSecondary = Color.White,
        onTertiary = Color.White,
        onBackground = Color(0xFF1C1B1F),
        onSurface = Color(0xFF1C1B1F),
        */
    )
    MaterialTheme(
        colorScheme = ApplicationColorScheme,
        typography = Typography,
        content = content
    )
}




