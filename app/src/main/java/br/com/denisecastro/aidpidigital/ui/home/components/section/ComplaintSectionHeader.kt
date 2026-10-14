package br.com.denisecastro.aidpidigital.ui.home.components.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiBlue
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AidpiTextPrimary
import br.com.denisecastro.aidpidigital.ui.theme.AidpiTextSecondary

@Composable
fun ComplaintSectionHeader(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {

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
            text = stringResource(
                R.string.home_complaint_title
            ),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AidpiTextPrimary
        )
        Spacer(Modifier.height(5.dp))
        Text(
            text = stringResource(
                R.string.home_complaint_description
            ),
            style = MaterialTheme.typography.bodySmall,
            color = AidpiTextSecondary
        )
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun ComplaintSectionHeaderPreview() {
    AidpiDigitalTheme {
        ComplaintSectionHeader()
    }
}


