package br.com.denisecastro.aidpidigital.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = AidpiBlue,
    secondary = RespiratoryBlueIcon,
    tertiary = WheezingPurpleIcon,
    background = AidpiTextPrimary,
    surface = AidpiTextPrimary,
    onPrimary = Color.White,
    onBackground = AidpiSurface,
    onSurface = AidpiSurface
)

private val LightColorScheme = lightColorScheme(
    primary = AidpiBlue,
    secondary = RespiratoryBlueIcon,
    tertiary = WheezingPurpleIcon,
    background = AidpiBackground,
    surface = AidpiSurface,
    onPrimary = Color.White,
    onBackground = AidpiTextPrimary,
    onSurface = AidpiTextPrimary
)

@Composable
fun AidpiDigitalTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AidpiTypography,
        content = content
    )
}