package br.com.denisecastro.aidpidigital.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.ui.home.components.HomeHeader
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF4F8FF))
            .padding(28.dp)
    ) {
        HomeHeader()
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 700,
    heightDp = 800
)
@Composable
private fun HomeScreenPreview() {
    AidpiDigitalTheme {
        HomeScreen()
    }
}

