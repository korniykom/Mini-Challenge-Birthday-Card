package com.korniykom.birthdaycard.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val LightColorScheme = lightColorScheme(
    background = Background,
    surface = Surface,
    onSurface = OnSurface
)

@Composable
fun BirthdayCardTheme(
    content: @Composable () -> Unit
) {
     MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}