package br.com.denisecastro.aidpidigital.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object CoughAssessment : Screen("cough_assessment")
    data object WheezingQuestion : Screen("wheezing_question")
    data object RespiratorySignsQuestion : Screen("respiratory_signs_question")
    data object ChildAgeQuestion : Screen("child_age_question")
    data object AssessmentResult : Screen("assessment_result")
    data object WheezingResult : Screen("wheezing_result")
    data object RespiratorySignsResult : Screen("respiratory_signs_result")
}
