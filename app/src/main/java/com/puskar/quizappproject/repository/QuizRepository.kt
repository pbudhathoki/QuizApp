package com.puskar.quizappproject.repository

import com.puskar.quizappproject.data.Quiz

interface QuizRepository {
    suspend fun insertQuizQuestions(quizList : MutableList<Quiz>)
    suspend fun insertQuiz(quiz: Quiz)
    suspend fun getQuestionList(): MutableList<Quiz>
    suspend fun resetQuizQuestionSet()
}