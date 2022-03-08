package com.example.restaurantreview.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantreview.databinding.ItemReviewBinding

class ReviewAdapter (private val listReview : List<String>) :
    RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {
    class ViewHolder (val binding : ItemReviewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(data : String){
            binding.tvItem.text = data
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindData(listReview[position])
    }

    override fun getItemCount() = listReview.size
}