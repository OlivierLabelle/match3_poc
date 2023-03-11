package com.gmproduction.match3poc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.gmproduction.match3poc.ui.AppTheme
import com.gmproduction.match3poc.viewmodel.GameViewModel
import com.gmproduction.match3poc.viewmodel.GameViewModelFactory
import com.gmproduction.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gameViewModel by viewModels<GameViewModel> { GameViewModelFactory(this) }

        setContent {
            AppTheme {
                WelcomeScreen()
            }
        }
    }
}
