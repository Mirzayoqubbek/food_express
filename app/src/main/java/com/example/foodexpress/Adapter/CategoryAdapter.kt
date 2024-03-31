package com.example.foodexpress.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.CategoryItemLayoutBinding
import com.example.foodexpress.model.CategoryModel
import com.example.foodexpress.screen.main.restarants.detail.ReastarantDetailActivity

class CategoryAdapter(val items: List<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: CategoryItemLayoutBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            CategoryItemLayoutBinding.inflate(
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
        holder.binding.imagesCategory.setImageResource(item.image)
        holder.binding.textCategory.text = item.name
    }
}