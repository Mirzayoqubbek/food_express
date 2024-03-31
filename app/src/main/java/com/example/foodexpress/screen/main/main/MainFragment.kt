package com.example.foodexpress.screen.main.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodexpress.R
import com.example.foodexpress.Adapter.CategoryAdapter
import com.example.foodexpress.Adapter.RestarantAdapter
import com.example.foodexpress.Adapter.SlideAdapter
import com.example.foodexpress.databinding.FragmentMainBinding
import com.example.foodexpress.model.CategoryModel
import com.example.foodexpress.model.RestarantModel
import com.example.foodexpress.model.SlideModel

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        fun newInstance() =
            MainFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerSlides.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerSlides.adapter = SlideAdapter(
            listOf(
                SlideModel(R.drawable.img, "", ""),
                SlideModel(R.drawable.img_1, "", ""),
                SlideModel(R.drawable.img_2, "", "")
            )
        )
        binding.recyclerCategories.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerCategories.adapter = CategoryAdapter(
            listOf(
                CategoryModel(R.drawable.oqtepa, "Oq Tepa"),
                CategoryModel(R.drawable.maxway, "Max Way"),
                CategoryModel(R.drawable.evos, "EVOS"),
                CategoryModel(R.drawable.img_2, "STREET 77"),
                CategoryModel(R.drawable.kfc, "KFC"),
                CategoryModel(R.drawable.belissimo, "Bellissimo"),
                CategoryModel(R.drawable.romopiza, "Romo Pizza")
            )
        )


        binding.recyclerNearbyrestaurants.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.recyclerNearbyrestaurants.adapter = RestarantAdapter(
            listOf(
                RestarantModel(R.drawable.maxway, "MAx Way", "Minor metro. Toshkent", "2.4 km"),
                RestarantModel(R.drawable.oqtepa, "Oq Tepa", "Bodomzor 2. Toshkent", "1.1 km"),
                RestarantModel(R.drawable.kfc, "KFC", "Malika bozori. Toshkent", "2 km"),
                RestarantModel(R.drawable.romopiza, "Romo Pizza", "Bogishamol 6. Toshkent", "500 m")

            )
        )

        binding.recyclertoprestaurants.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.recyclertoprestaurants.adapter = RestarantAdapter(
            listOf(
                RestarantModel(
                    R.drawable.maxway,
                    "MAx Way",
                    "Buyuk ipak yo'li 4. Toshkent",
                    "5.4 km"
                ),
                RestarantModel(R.drawable.oqtepa, "Oq Tepa", "Bodomzor 2. Toshkent", "1.1 km"),
                RestarantModel(R.drawable.evos, "EVOS", "Minor metro. Toshkent", "2.4 km"),
                RestarantModel(
                    R.drawable.img_2,
                    "STREET 77",
                    "G'ofur G'ulom 5. Toshkent",
                    "6.7 km"
                ),
                RestarantModel(R.drawable.kfc, "KFC", "Malika bozori. Toshkent", "2 km"),
                RestarantModel(
                    R.drawable.belissimo,
                    "Bellissimo",
                    "Chilonzor 2. Toshkent",
                    "10.2 km"
                ),
                RestarantModel(R.drawable.romopiza, "Romo Pizza", "Bogishamol 6. Toshkent", "500 m")
            )
        )

    }
}

