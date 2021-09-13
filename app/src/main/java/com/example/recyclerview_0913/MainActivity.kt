package com.example.recyclerview_0913

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_0913.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataSet : ArrayList<List<String>> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addData()
        binding.recyclerView.layoutManager =LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = RecyclerViewAdapter(dataSet)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
        )
    }

    private fun addData() {
        for (i in 0..10) {
            dataSet.add(listOf("$i th main", "$i th sub"))
        }
    }
}