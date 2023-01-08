package com.puskar.quizappproject.util

import com.puskar.quizappproject.data.AnswerModel

interface CheckClickInterface {
    fun onCheckBoxChecked(answerModel: AnswerModel)
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}