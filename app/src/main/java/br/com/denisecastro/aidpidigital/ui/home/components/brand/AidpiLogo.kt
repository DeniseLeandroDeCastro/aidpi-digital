
package br.com.denisecastro.aidpidigital.ui.home.components.brand

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

@Composable
fun AidpiLogo(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.aidpi_logo_crianca_coracao),
        contentDescription = "Logomarca AIDPI Digital",
        modifier = Modifier.size(52.dp),
        contentScale = ContentScale.Fit
    )
}

@Preview(showSystemUi = true)
@Composable
private fun AidpiLogoPreview() {
    AidpiDigitalTheme {
        AidpiLogo()
    }
}
