package com.example.foodexpress.screen.main.restarants.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodexpress.Adapter.CategoryTabAdapter
import com.example.foodexpress.Adapter.CategoryTabAdapterCallback
import com.example.foodexpress.Adapter.ProductAdapter
import com.example.foodexpress.R
import com.example.foodexpress.databinding.ActivityReastarantDetailBinding
import com.example.foodexpress.model.CategoryModel
import com.example.foodexpress.model.CategoryTabModel
import com.example.foodexpress.model.ProductModel
import com.example.foodexpress.model.RestarantModel
import com.example.foodexpress.screen.main.main.MainFragment
import com.example.foodexpress.screen.main.restarants.feedbeck.FeedBeckFragment

class ReastarantDetailActivity : AppCompatActivity() {

    lateinit var item: RestarantModel
    lateinit var binding: ActivityReastarantDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReastarantDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nazad.setOnClickListener {
            finish()
        }

        binding.recyclerCategories.adapter = CategoryTabAdapter(
            listOf(
                CategoryTabModel("Hod dog"),
                CategoryTabModel("Lavash"),
                CategoryTabModel("Sendvich"),
                CategoryTabModel("Pitsa"),
                CategoryTabModel("KFC"),
                CategoryTabModel("Tandir lavash"),
                CategoryTabModel("Danar")
            ), object : CategoryTabAdapterCallback {
                override fun onClink(item: CategoryTabModel) {
                    //
                }
            }
        )

        binding.recyclerPraducts.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerPraducts.adapter = ProductAdapter(
            listOf(
                ProductModel(R.drawable.lavash, "Lavash", "29 000 sum"),
                ProductModel(R.drawable.sendvich, "Sendvich", "25 000 sum"),
                ProductModel(R.drawable.tandirlavash, "Tandor lavash", "31 000 sum"),
                ProductModel(R.drawable.pizza, "Pizza", "51 000 sum"),
                ProductModel(R.drawable.kfs, "KFC", "80 000 sum"),
                ProductModel(R.drawable.hoddog, "Hod dog", "18 000 sum"),
                ProductModel(R.drawable.lavash, "Lavash", "29 000 sum"),
            )
        )

        binding.btnFeedbeck.setOnClickListener {
            val fragment = FeedBeckFragment.newInstance()
            fragment.show(supportFragmentManager, fragment.tag)
        }

        item = intent.getSerializableExtra("id") as RestarantModel

        binding.imagesCategory.setImageResource(item.image)
        binding.textCategory.text = item.name
        binding.lakatsa.text = item.lakatsa
        binding.masofa.text = item.masofa

    }

}