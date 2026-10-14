
package br.com.denisecastro.aidpidigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.denisecastro.aidpidigital.ui.home.screen.HomeScreen
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                scrim = android.graphics.Color.WHITE,
                darkScrim = android.graphics.Color.WHITE
            ),
            navigationBarStyle = SystemBarStyle.light(
                scrim = android.graphics.Color.WHITE,
                darkScrim = android.graphics.Color.WHITE
            )
        )

        setContent {
            AidpiDigitalTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun HomeScreenPreview() {
    AidpiDigitalTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            HomeScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
