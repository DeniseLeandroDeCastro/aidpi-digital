package br.com.denisecastro.aidpidigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.denisecastro.aidpidigital.ui.home.screen.HomeScreen
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AidpiDigitalTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}