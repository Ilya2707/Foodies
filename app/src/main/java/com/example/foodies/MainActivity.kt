package com.example.foodies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.foodies.navigation.Navigation
import com.example.foodies.ui.theme.Pink40
import com.example.foodies.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
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
                        Navigation()
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




