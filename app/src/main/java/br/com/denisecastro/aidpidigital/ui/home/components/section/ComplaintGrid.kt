package br.com.denisecastro.aidpidigital.ui.home.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.domain.model.ComplaintType

import br.com.denisecastro.aidpidigital.ui.home.components.card.ComplaintCard
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

@Composable
fun ComplaintGrid(
    complaints: List<ComplaintType>,
    onComplaintClick: (ComplaintType) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
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
                    Spacer(
                        modifier = Modifier.weight(1f)
                    )
                }
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun ComplaintGridPreview() {
    AidpiDigitalTheme {
        ComplaintGrid(
            complaints = ComplaintType.entries.toList(),
            onComplaintClick = {}
        )
    }
}