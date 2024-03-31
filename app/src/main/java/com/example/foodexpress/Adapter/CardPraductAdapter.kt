package com.example.foodexpress.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodexpress.databinding.CardPraductItemLayoutBinding
import com.example.foodexpress.databinding.PraductItemLayoutBinding
import com.example.foodexpress.model.CardProductModel

class CardProductAdapter(val items: List<CardProductModel>) : RecyclerView.Adapter<CardProductAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: CardPraductItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            CardPraductItemLayoutBinding.inflate(
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