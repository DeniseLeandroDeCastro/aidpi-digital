package br.com.denisecastro.aidpidigital.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.denisecastro.aidpidigital.domain.model.ComplaintType
import br.com.denisecastro.aidpidigital.ui.assessment.screen.AssessmentResultScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.CoughAssessmentScreen
import br.com.denisecastro.aidpidigital.ui.home.screen.HomeScreen

@Composable
fun AidpiNavHost(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onComplaintClick = { complaint ->
                    if (complaint == ComplaintType.COUGH) {
                        navController.navigate(
                            Screen.CoughAssessment.route
                        )
                    }
                }
            )
        }

        composable(Screen.CoughAssessment.route) {
            CoughAssessmentScreen(
                onBack = {
                    navController.popBackStack()
                },
                onAnswerSelected = { answer ->
                    if (answer) {
                        navController.navigate(
                            Screen.AssessmentResult.route
                        )
                    }
                    // A resposta NÃO será conectada
                    // quando tivermos a próxima pergunta.
                }
            )
        }

        composable(Screen.AssessmentResult.route) {
            AssessmentResultScreen(
                onBack = {
                    navController.popBackStack()
                },
                onNewAssessment = {
                    navController.popBackStack(
                        route = Screen.Home.route,
                        inclusive = false
                    )
                }
            )
        }
    }
}
