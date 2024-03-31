package com.example.foodexpress.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.CategoryItemLayoutBinding
import com.example.foodexpress.databinding.PraductItemLayoutBinding
import com.example.foodexpress.model.CategoryModel
import com.example.foodexpress.model.ProductModel

class ProductAdapter(val items: List<ProductModel>) : RecyclerView.Adapter<ProductAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: PraductItemLayoutBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            PraductItemLayoutBinding.inflate(
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
        holder.binding.image.setImageResource(item.image)
        holder.binding.name.text = item.name
        holder.binding.summa.text = item.summa
    }


}