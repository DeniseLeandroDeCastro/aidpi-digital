package br.com.denisecastro.aidpidigital.ui.assessment.viewmodel

import androidx.lifecycle.ViewModel
import br.com.denisecastro.aidpidigital.ui.assessment.state.AssessmentUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AssessmentViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(AssessmentUiState())
    val uiState: StateFlow<AssessmentUiState> = _uiState.asStateFlow()

    fun selectAnswer(answer: Boolean) {
        _uiState.value = _uiState.value.copy(
            selectedAnswer = answer
        )
    }

    fun selectWheezingAnswer(answer: Boolean) {
        _uiState.value = _uiState.value.copy(
            wheezingAnswer = answer
        )
    }

    fun resetAssessment() {
        _uiState.value = AssessmentUiState()
    }
}