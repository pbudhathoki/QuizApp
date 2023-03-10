package com.puskar.quizappproject.ui.radioButtonQuestions

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.puskar.quizappproject.R
import com.puskar.quizappproject.data.Quiz
import com.puskar.quizappproject.databinding.FragmentRadioButtonQuestionBinding
import com.puskar.quizappproject.viewModel.QueryViewModel
import com.puskar.quizappproject.util.RadioClickInterface
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RadioButtonQuestionFragment : Fragment(R.layout.fragment_radio_button_question), RadioClickInterface {
    private lateinit var quiz: Quiz
    private lateinit var viewModel: QueryViewModel
    private lateinit var binding: FragmentRadioButtonQuestionBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgumentsData()
        initSetup(view)
    }

    private fun initSetup(view: View) {
        binding = FragmentRadioButtonQuestionBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity())[QueryViewModel::class.java]

        binding.questionTextView.text = quiz.question

        //initializing recycler view
        val adapter = RBQuestionAdapter(quiz.options, this)
        binding.optionsRecyclerView.adapter = adapter
    }

    override fun onRadioButtonClicked(optionPos: Int, userAnswerDesc: String) {
        quiz.userAnswer = when(optionPos) {
            0 -> "a"
            1 -> "b"
            2 -> "c"
            3 -> "d"
            else -> ""
        }
        quiz.userAnswerDesc = userAnswerDesc
        viewModel.saveUserResult(quiz)
    }

    private fun getArgumentsData() {
        arguments?.let {
            quiz = Gson().fromJson(it.getString("quiz"), Quiz::class.java)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(quiz: String) = RadioButtonQuestionFragment().apply {
            arguments = Bundle().apply {
                putString("quiz", quiz)
            }
        }
    }
}