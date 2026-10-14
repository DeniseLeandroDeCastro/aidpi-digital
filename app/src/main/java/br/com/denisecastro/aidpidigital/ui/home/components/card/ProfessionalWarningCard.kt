
package br.com.denisecastro.aidpidigital.ui.home.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val WarningBackground = Color(0xFF009688)

@Composable
fun ProfessionalWarningCard(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(WarningBackground)
            .padding(18.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "!",
            modifier = Modifier.size(44.dp),
            color = Color.White,
            fontSize = 42.sp,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            lineHeight = 44.sp
        )

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                text = "Atenção, profissional",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Esta ferramenta auxilia na avaliação clínica e não substitui o julgamento profissional.",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfessionalWarningCardPreview() {
    MaterialTheme {
        ProfessionalWarningCard(
            modifier = Modifier.padding(16.dp)
        )
    }
}
