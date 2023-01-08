package com.puskar.quizappproject.database

import android.content.Context
import androidx.room.Room
import com.puskar.quizappproject.constants.Constant
import com.puskar.quizappproject.data.QuizDAO

class QuizDB(context: Context) {

    private var quizDatabase: QuizDatabase = Room.databaseBuilder(
        context,
        QuizDatabase::class.java,
        Constant.DB_NAME
    ).build()

    fun getQuizDAO(): QuizDAO = quizDatabase.quizDAO
}