package br.com.denisecastro.aidpidigital.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.denisecastro.aidpidigital.domain.model.ComplaintType
import br.com.denisecastro.aidpidigital.ui.assessment.screen.AssessmentResultScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.ChildAgeQuestionScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.CoughAssessmentScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.RespiratoryRateFrom1To5Screen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.RespiratoryRateUnder12Screen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.RespiratorySignsQuestionScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.RespiratorySignsResultScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.WheezingQuestionScreen
import br.com.denisecastro.aidpidigital.ui.assessment.screen.WheezingResultScreen
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
                    } else {
                        navController.navigate(
                            Screen.WheezingQuestion.route
                        )
                    }
                }
            )
        }

        composable(Screen.WheezingQuestion.route) {
            WheezingQuestionScreen(
                onBack = {
                    navController.popBackStack()
                },
                onAnswerSelected = { answer ->
                    assessmentViewModel.selectWheezingAnswer(answer)

                    if (answer) {
                        navController.navigate(
                            Screen.WheezingResult.route
                        )
                    } else {
                        navController.navigate(
                            Screen.RespiratorySignsQuestion.route
                        )
                    }
                }
            )
        }

        composable(Screen.RespiratorySignsQuestion.route) {
            RespiratorySignsQuestionScreen(
                onBack = {
                    navController.popBackStack()
                },
                onAnswerSelected = { answer ->
                    if (answer) {
                        navController.navigate(
                            Screen.RespiratorySignsResult.route
                        )
                    } else {
                        navController.navigate(
                            Screen.ChildAgeQuestion.route
                        )
                    }
                }
            )
        }

        composable(Screen.ChildAgeQuestion.route) {
            ChildAgeQuestionScreen(
                onBack = {
                    navController.popBackStack()
                },
                onAgeSelected = { under12Months ->
                    if (under12Months) {
                        navController.navigate(
                            Screen.RespiratoryRateUnder12.route
                        )
                    } else {
                        navController.navigate(
                            Screen.RespiratoryRateFrom1To5.route
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

        composable(Screen.WheezingResult.route) {
            WheezingResultScreen(
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

        composable(Screen.RespiratorySignsResult.route) {
            RespiratorySignsResultScreen(
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

        composable(Screen.RespiratoryRateUnder12.route) {
            RespiratoryRateUnder12Screen(
                onBack = {
                    navController.popBackStack()
                },
                onAnswerSelected = { isRapid ->
                    // Próxima etapa do fluxograma:
                    // será conectada quando definirmos o destino.
                }
            )
        }

        composable(Screen.RespiratoryRateFrom1To5.route) {
            RespiratoryRateFrom1To5Screen(
                onBack = {
                    navController.popBackStack()
                },
                onAnswerSelected = { isRapid ->
                    // A próxima etapa será conectada
                    // quando tivermos a tela seguinte.
                }
            )
        }
    }
}
