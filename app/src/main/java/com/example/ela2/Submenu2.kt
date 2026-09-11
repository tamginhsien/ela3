package com.example.ela2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ela2.databinding.ActivitySubmenu2Binding

class Submenu2 : Fragment() {
    private var _binding: ActivitySubmenu2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivitySubmenu2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button21.setOnClickListener {
            findNavController().navigate(R.id.action_submenu2Fragment_to_submenu21Fragment)
        }

        binding.button22.setOnClickListener {
            findNavController().navigate(R.id.action_submenu2Fragment_to_submenu22Fragment)
        }

        binding.button23.setOnClickListener {
            findNavController().navigate(R.id.action_submenu2Fragment_to_submenu23Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
