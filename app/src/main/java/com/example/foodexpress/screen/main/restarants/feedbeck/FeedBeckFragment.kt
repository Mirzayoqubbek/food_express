package com.example.foodexpress.screen.main.restarants.feedbeck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodexpress.R
import com.example.foodexpress.databinding.FragmentFeedBeckBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class FeedBeckFragment : BottomSheetDialogFragment() {

    lateinit var binding: FragmentFeedBeckBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBeckBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            FeedBeckFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}