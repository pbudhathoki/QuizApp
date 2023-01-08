package com.puskar.quizappproject.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.puskar.quizappproject.data.Quiz
import com.puskar.quizappproject.repository.QuizRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(
    private val repository: QuizRepositoryImpl
) : ViewModel(){

    private val _resultData: MutableLiveData<List<Quiz>> = MutableLiveData()
    val data: LiveData<List<Quiz>> = _resultData

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            _resultData.postValue(repository.getQuestionList())
        }
    }

    fun resetDB(newList: MutableList<Quiz>) {
        viewModelScope.launch(Dispatchers.IO) {
            _resultData.postValue(newList)
        }
    }
}