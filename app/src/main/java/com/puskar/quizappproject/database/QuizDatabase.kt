package com.puskar.quizappproject.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.puskar.quizappproject.data.Quiz
import com.puskar.quizappproject.data.QuizDAO
import com.puskar.quizappproject.util.Converter


@Database(
    entities = [Quiz::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class QuizDatabase: RoomDatabase() {
    abstract val quizDAO: QuizDAO
}