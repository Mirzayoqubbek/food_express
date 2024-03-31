package com.example.foodexpress.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.SlideItemLayoutBinding
import com.example.foodexpress.model.SlideModel

class SlideAdapter(val items: List<SlideModel>) : RecyclerView.Adapter<SlideAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: SlideItemLayoutBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            SlideItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.binding.sliderecyucler.setImageResource(item.image)
    }
}