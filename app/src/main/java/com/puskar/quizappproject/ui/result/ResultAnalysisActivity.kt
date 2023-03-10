package com.puskar.quizappproject.ui.result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.puskar.quizappproject.R
import com.puskar.quizappproject.databinding.ActivityResultAnalysisBinding
import com.puskar.quizappproject.viewModel.QueryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultAnalysisActivity : AppCompatActivity(R.layout.activity_result_analysis) {

    private lateinit var binding : ActivityResultAnalysisBinding
    private val viewModel: QueryViewModel by viewModels()
    private lateinit var adapter: ResultAnalysisAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultAnalysisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

        fetchData()
    }

    private fun initRecyclerView() {
        adapter = ResultAnalysisAdapter()
        binding.resultAnalysisRecyclerView.adapter = adapter
    }

    private fun fetchData() {
        viewModel.data.observe(this){quizList ->
            quizList?.let {
                adapter.updateList(it)
            }
        }
    }
}