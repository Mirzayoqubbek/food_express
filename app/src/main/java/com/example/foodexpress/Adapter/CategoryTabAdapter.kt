package com.example.foodexpress.Adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.R
import com.example.foodexpress.databinding.CategoryTabItemLayoutBinding
import com.example.foodexpress.model.CategoryTabModel

interface CategoryTabAdapterCallback {
    fun onClink(item: CategoryTabModel)
}

class CategoryTabAdapter(
    val items: List<CategoryTabModel>,
    val callback: CategoryTabAdapterCallback
) :
    RecyclerView.Adapter<CategoryTabAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: CategoryTabItemLayoutBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            CategoryTabItemLayoutBinding.inflate(
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
        holder.binding.textname.text = item.title

        holder.itemView.setOnClickListener {
            items.forEach {
                it.active = false
            }
            item.active = true
            notifyDataSetChanged()
            callback.onClink(item)
        }

        holder.binding.textname.setTextColor(
            if (item.active) ContextCompat.getColor(
                holder.itemView.context,
                R.color.color_accent
            ) else ContextCompat.getColor(holder.itemView.context, R.color.grey_color)
        )
    }
}