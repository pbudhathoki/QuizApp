package com.puskar.quizappproject.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.puskar.quizappproject.data.Quiz
import com.puskar.quizappproject.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QueryViewModel @Inject constructor(
    private val repository: QuizRepository
) : ViewModel(){

    private val _queryData: MutableLiveData<List<Quiz>> = MutableLiveData()
    val data: LiveData<List<Quiz>> = _queryData

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            _queryData.postValue(repository.getQuestionList())
        }
    }

    fun resetDB(newList: MutableList<Quiz>) {
        viewModelScope.launch(Dispatchers.IO) {
            _queryData.postValue(newList)
        }
    }

    fun saveUserResult(quiz: Quiz) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertQuiz(quiz)
        }
    }
}