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
    data object RespiratoryRateUnder12 : Screen("respiratory_rate_under_12")
    data object RespiratoryRateFrom1To5 : Screen("respiratory_rate_from_1_to_5")
    data object PneumoniaResult : Screen("pneumonia_result")
    data object CoughDurationQuestion : Screen("cough_duration_question")
}
