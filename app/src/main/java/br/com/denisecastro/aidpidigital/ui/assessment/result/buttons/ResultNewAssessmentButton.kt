package br.com.denisecastro.aidpidigital.ui.assessment.result.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.ResultButtonBlue
import br.com.denisecastro.aidpidigital.ui.theme.ResultButtonContent

@Composable
fun ResultNewAssessmentButton(
    onClick: () -> Unit,
    isLoading: Boolean = false
) {
    Button(
        onClick = onClick,
        enabled = !isLoading,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ResultButtonBlue,
            contentColor = ResultButtonContent,
            disabledContainerColor = ResultButtonBlue,
            disabledContentColor = ResultButtonContent
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 2.dp,
            pressedElevation = 1.dp
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            if (isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(18.dp),
                    color = ResultButtonContent,
                    strokeWidth = 2.dp,
                    strokeCap = StrokeCap.Round
                )
            }

            Text(
                text = stringResource(
                    R.string.result_new_assessment
                ),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(name = "Botão Nova Avaliação", showSystemUi = true)
@Composable
private fun ResultNewAssessmentButtonPreview() {
    AidpiDigitalTheme {
        ResultNewAssessmentButton(
            onClick = {}
        )
    }
}

@Preview(name = "Botão em carregamento", showBackground = true)
@Composable
private fun ResultNewAssessmentButtonLoadingPreview() {
    AidpiDigitalTheme {
        ResultNewAssessmentButton(
            onClick = {},
            isLoading = true
        )
    }
}