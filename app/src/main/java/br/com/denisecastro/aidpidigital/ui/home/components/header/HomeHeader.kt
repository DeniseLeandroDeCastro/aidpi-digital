package br.com.denisecastro.aidpidigital.ui.home.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.ui.theme.AidpiBlue
import br.com.denisecastro.aidpidigital.ui.theme.AidpiBlueDark
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AidpiTextPrimary
import br.com.denisecastro.aidpidigital.ui.theme.AidpiTextSecondary

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            AidpiLogo()

            Spacer(
                modifier = Modifier.width(12.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "AIDPI Digital",
                    style = MaterialTheme.typography.titleLarge,
                    color = AidpiTextPrimary
                )

                Spacer(
                    modifier = Modifier.height(2.dp)
                )

                Text(
                    text = "Atenção Integrada à Saúde da Criança",
                    style = MaterialTheme.typography.bodySmall,
                    color = AidpiTextSecondary
                )
            }
        }

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        Text(
            text = "Como podemos ajudar?",
            style = MaterialTheme.typography.headlineMedium,
            color = AidpiTextPrimary
        )

        Spacer(
            modifier = Modifier.height(6.dp)
        )

        Text(
            text = "Selecione a principal queixa da criança para iniciar a avaliação.",
            style = MaterialTheme.typography.bodyMedium,
            color = AidpiTextSecondary
        )
    }
}

@Composable
private fun AidpiLogo() {
    Box(
        modifier = Modifier
            .size(46.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        AidpiBlue,
                        AidpiBlueDark
                    )
                )
            )
    )
}

@Preview(
    showBackground = true,
    widthDp = 390
)
@Composable
private fun HomeHeaderPreview() {
    AidpiDigitalTheme {
        HomeHeader()
    }
}

