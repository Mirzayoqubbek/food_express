package com.example.foodexpress.screen.main.order.checkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodexpress.databinding.FragmentTopayBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class TopayFragment : BottomSheetDialogFragment() {

    lateinit var binding: FragmentTopayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTopayBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }


    companion object {
        @JvmStatic
        fun newInstance() =
            TopayFragment()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}