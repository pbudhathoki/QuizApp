package com.puskar.quizappproject.ui

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

    private val _data: MutableLiveData<List<Quiz>> = MutableLiveData()
    val data: LiveData<List<Quiz>> = _data

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            _data.postValue(repository.getQuestionList())
        }
    }

    fun resetDB(newList: MutableList<Quiz>) {
        viewModelScope.launch(Dispatchers.IO) {
            _data.postValue(newList)
        }
    }

    fun saveUserResult(quiz: Quiz) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertQuiz(quiz)
        }
    }
}