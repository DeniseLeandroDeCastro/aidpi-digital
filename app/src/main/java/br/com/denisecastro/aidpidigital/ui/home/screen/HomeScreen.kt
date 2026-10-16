package br.com.denisecastro.aidpidigital.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.domain.model.ComplaintType
import br.com.denisecastro.aidpidigital.ui.home.components.card.AgeRangeCard
import br.com.denisecastro.aidpidigital.ui.home.components.card.ProfessionalWarningCard
import br.com.denisecastro.aidpidigital.ui.home.components.hero.HeroSection
import br.com.denisecastro.aidpidigital.ui.home.components.section.ComplaintGrid
import br.com.denisecastro.aidpidigital.ui.home.components.section.ComplaintSectionHeader
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AidpiSurface

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onComplaintClick: (ComplaintType) -> Unit = {}
) {
    val complaints = ComplaintType.entries.toList()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AidpiSurface)
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
            ComplaintSectionHeader()
            Spacer(Modifier.height(16.dp))
            ComplaintGrid(
                complaints = complaints,
                onComplaintClick = onComplaintClick
            )
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun HomeScreenPreview() {
    AidpiDigitalTheme {
        HomeScreen()
    }
}