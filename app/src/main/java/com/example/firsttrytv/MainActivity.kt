package com.example.firsttrytv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.example.firsttrytv.ui.FirstTryApp
import com.example.firsttrytv.ui.theme.FirstTryTVTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstTryTVTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    FirstTryApp()
                }
            }
        }
    }
}