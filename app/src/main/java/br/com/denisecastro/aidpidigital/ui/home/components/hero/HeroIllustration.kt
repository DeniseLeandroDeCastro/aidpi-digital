package br.com.denisecastro.aidpidigital.ui.home.components.hero

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.R

@Composable
fun HeroIllustration(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.aidpi_child),
        contentDescription = "Criança sorrindo com um ursinho",
        contentScale = ContentScale.Fit,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun HeroIllustrationPreview() {
    HeroIllustration(
        modifier = Modifier.size(220.dp)
    )
}