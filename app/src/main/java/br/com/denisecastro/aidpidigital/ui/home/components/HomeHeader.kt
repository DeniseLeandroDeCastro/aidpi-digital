package br.com.denisecastro.aidpidigital.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(56.dp)
                .background(
                    color = Color(0xFF2563EB),
                    shape = RoundedCornerShape(16.dp)
                )
        )

        Spacer(
            modifier = Modifier.width(14.dp)
        )

        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "AIDPI Digital",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0F172A)
            )

            Text(
                text = "Atenção Integrada às Doenças Prevalentes na Infância",
                fontSize = 14.sp,
                color = Color(0xFF475569)
            )
        }
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 700
)
@Composable
private fun HomeHeaderPreview() {
    AidpiDigitalTheme {
        HomeHeader()
    }
}

