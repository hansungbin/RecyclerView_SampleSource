package com.example.recyclerview_0913

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_0913.databinding.ListItemBinding

class RecyclerViewAdapter(private val dataSet: ArrayList<List<String>>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    //    private lateinit var binding:  AdapterRecycer
    override fun onBindViewHolder(holderList: ListViewHolder, position: Int) {
        holderList.bind(dataSet[position])

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ListViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: List<String>) {
            binding.tvMain.text = data[0]
            binding.tvSub.text = data[1]

        }
    }
}