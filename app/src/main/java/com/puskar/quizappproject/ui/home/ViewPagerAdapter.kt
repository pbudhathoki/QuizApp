package com.puskar.quizappproject.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.puskar.quizappproject.constants.Constant.IS_CONTROL_CHECK_BOX
import com.puskar.quizappproject.constants.Constant.IS_CONTROL_RADIO_BUTTON
import com.puskar.quizappproject.data.Quiz
import com.puskar.quizappproject.ui.checkBoxQuestions.CheckBoxQuestionFragment
import com.puskar.quizappproject.ui.radioButtonQuestions.RadioButtonQuestionFragment
import com.puskar.quizappproject.ui.result.ResultFragment
import com.google.gson.Gson

class ViewPagerAdapter(
    fragment: Fragment,
    private val questionList: List<Quiz>
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = questionList.size + 1

    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = if (position == 15) {
            ResultFragment.newInstance()
        }else {
            val quiz = questionList[position]
            //creating fragment object according to position
            when(quiz.questionType) {

                IS_CONTROL_CHECK_BOX -> CheckBoxQuestionFragment.newInstance(Gson().toJson(quiz))

                IS_CONTROL_RADIO_BUTTON -> RadioButtonQuestionFragment.newInstance(Gson().toJson(quiz))

                else -> ResultFragment.newInstance()
            }
        }

        return fragment
    }

}