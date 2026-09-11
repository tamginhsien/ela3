package com.example.ela2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ela2.databinding.ActivitySubmenu3Binding

class Submenu3 : Fragment() {
    private var _binding: ActivitySubmenu3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivitySubmenu3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button31.setOnClickListener {
            findNavController().navigate(R.id.action_submenu3Fragment_to_submenu31Fragment)
        }

        binding.button32.setOnClickListener {
            findNavController().navigate(R.id.action_submenu3Fragment_to_submenu32Fragment)
        }

        binding.button33.setOnClickListener {
            findNavController().navigate(R.id.action_submenu3Fragment_to_submenu33Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
