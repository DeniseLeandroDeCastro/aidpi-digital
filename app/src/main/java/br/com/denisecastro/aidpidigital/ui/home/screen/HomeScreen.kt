
package br.com.denisecastro.aidpidigital.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.ui.home.components.card.AgeRangeCard
import br.com.denisecastro.aidpidigital.ui.home.components.card.ComplaintCard
import br.com.denisecastro.aidpidigital.ui.home.components.card.ComplaintType
import br.com.denisecastro.aidpidigital.ui.home.components.card.ProfessionalWarningCard
import br.com.denisecastro.aidpidigital.ui.home.components.hero.HeroSection
import br.com.denisecastro.aidpidigital.ui.theme.AidpiBackground
import br.com.denisecastro.aidpidigital.ui.theme.AidpiBlue
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AidpiTextPrimary
import br.com.denisecastro.aidpidigital.ui.theme.AidpiTextSecondary

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onComplaintClick: (ComplaintType) -> Unit = {}
) {
    val complaints = ComplaintType.entries.toList()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        HeroSection()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(8.dp))

            AgeRangeCard()

            Spacer(Modifier.height(14.dp))

            ProfessionalWarningCard()

            Spacer(Modifier.height(22.dp))

            Box(
                modifier = Modifier
                    .width(32.dp)
                    .height(3.dp)
                    .background(
                        AidpiBlue,
                        RoundedCornerShape(50)
                    )
            )

            Spacer(Modifier.height(12.dp))

            Text(
                text = "Selecione a queixa principal",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = AidpiTextPrimary
            )

            Spacer(Modifier.height(5.dp))

            Text(
                text = "Toque em uma das opções abaixo para iniciar a avaliação.",
                style = MaterialTheme.typography.bodySmall,
                color = AidpiTextSecondary
            )

            Spacer(Modifier.height(16.dp))

            complaints.chunked(2).forEach { pair ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    pair.forEach { complaint ->
                        ComplaintCard(
                            complaint = complaint,
                            onClick = {
                                onComplaintClick(complaint)
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    if (pair.size == 1) {
                        Spacer(Modifier.weight(1f))
                    }
                }

                Spacer(Modifier.height(10.dp))
            }

            Spacer(Modifier.height(24.dp))
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun HomeScreenPreview() {
    AidpiDigitalTheme {
        HomeScreen()
    }
}
