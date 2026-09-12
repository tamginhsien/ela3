package com.example.ela2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ela2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Submenu1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_submenu1Fragment)
        }

        binding.Submenu2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_submenu2Fragment)
        }

        binding.Submenu3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_submenu3Fragment)
        }

                binding.buttonFavorites.setOnClickListener {
            startActivity(Intent(requireContext(), FavoritesActivity::class.java))
        }

        binding.Submenu4.setOnClickListener {
            android.app.AlertDialog.Builder(requireContext())
                .setTitle("About ELA")
                .setMessage("E-Learning on Arduino (ELA)\n\nA comprehensive toolkit for learning Arduino, wiring diagrams, and embedded programming.\n\nVersion 2.0 (Modernized)")
                .setPositiveButton("Close", null)
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
