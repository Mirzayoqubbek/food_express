package com.example.foodexpress.Adapter


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.ReustarantItemLayoutBinding
import com.example.foodexpress.model.RestarantModel
import com.example.foodexpress.screen.main.restarants.detail.ReastarantDetailActivity

class RestarantAdapter(val items: List<RestarantModel>) : RecyclerView.Adapter<RestarantAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: ReustarantItemLayoutBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            ReustarantItemLayoutBinding.inflate(
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
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, ReastarantDetailActivity::class.java)
            intent.putExtra("id", item)
            it.context.startActivity(intent)
        }
        holder.binding.imageRestarant.setImageResource(item.image)
        holder.binding.name.text = item.name
        holder.binding.lakatsa.text = item.lakatsa
        holder.binding.km.text = item.masofa
    }
}