package com.gmproduction.match3poc.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.gmproduction.core_ui.Dimensions
import com.gmproduction.core_ui.LocalSpacing

private val DarkColorPalette = darkColors(primaryVariant = Color(0xff3f51b5))
private val LightColorPalette = lightColors(primaryVariant = Color(0xff1da9da))

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) DarkColorPalette else LightColorPalette
    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            content = content,
        )
    }
}
