package com.example.match3poc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.match3poc.viewmodel.GameViewModel
import com.example.match3poc.viewmodel.GameViewModelFactory

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gameViewModel by viewModels<GameViewModel> { GameViewModelFactory(this) }

        setContent {
        }
    }
}
