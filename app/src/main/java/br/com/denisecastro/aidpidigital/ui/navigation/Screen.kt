package br.com.denisecastro.aidpidigital.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object CoughAssessment : Screen("cough_assessment")
    data object AssessmentResult : Screen("assessment_result")
}