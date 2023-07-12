package com.example.composemeditation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composemeditation.ui.HomeScreen
import com.example.composemeditation.ui.theme.ComposeMeditationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMeditationTheme {
                HomeScreen()
            }
        }
    }
}

