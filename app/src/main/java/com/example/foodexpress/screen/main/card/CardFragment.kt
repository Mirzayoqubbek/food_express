package com.example.foodexpress.screen.main.card

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foodexpress.Adapter.CardProductAdapter
import com.example.foodexpress.R
import com.example.foodexpress.databinding.ActivityChackoutBinding
import com.example.foodexpress.databinding.FragmentCardBinding
import com.example.foodexpress.model.CardProductModel
import com.example.foodexpress.screen.main.order.checkout.ChackoutActivity


class cardFragment : Fragment() {

    lateinit var binding: FragmentCardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = cardFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnchackout.setOnClickListener {
            openNewActivity()
        }

        binding.cardpraductrecycler.layoutManager = GridLayoutManager(context, 2)
        binding.cardpraductrecycler.adapter = CardProductAdapter(listOf(
            CardProductModel(R.drawable.lavash, "Lavash", "29 000 sum"),
            CardProductModel(R.drawable.sendvich, "Sendvich", "25 000 sum"),
            CardProductModel(R.drawable.kfs, "KFC", "80 000 sum")
        ))
    }

    private fun openNewActivity() {
        val intent = Intent(activity, ChackoutActivity::class.java)
        startActivity(intent)
    }

}