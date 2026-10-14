package br.com.denisecastro.aidpidigital.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.denisecastro.aidpidigital.domain.model.ComplaintType
import br.com.denisecastro.aidpidigital.ui.assessment.screen.AssessmentResultScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.CoughAssessmentScreen
import br.com.denisecastro.aidpidigital.ui.assessment.viewmodel.AssessmentViewModel
import br.com.denisecastro.aidpidigital.ui.home.screen.HomeScreen

@Composable
fun AidpiNavHost(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val assessmentViewModel: AssessmentViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onComplaintClick = { complaint ->
                    if (complaint == ComplaintType.COUGH) {
                        assessmentViewModel.resetAssessment()

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
                    assessmentViewModel.selectAnswer(answer)

                    if (answer) {
                        navController.navigate(
                            Screen.AssessmentResult.route
                        )
                    }
                }
            )
        }

        composable(Screen.AssessmentResult.route) {
            AssessmentResultScreen(
                onBack = {
                    navController.popBackStack()
                },
                onNewAssessment = {
                    assessmentViewModel.resetAssessment()

                    navController.popBackStack(
                        route = Screen.Home.route,
                        inclusive = false
                    )
                }
            )
        }
    }
}
