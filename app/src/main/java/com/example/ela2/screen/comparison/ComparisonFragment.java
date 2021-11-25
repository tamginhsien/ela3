package com.example.ela2.screen.comparison;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ela2.R;
import com.example.ela2.databinding.FragmentComparisonBinding;
import com.example.ela2.databinding.FragmentMegaBinding;


public class ComparisonFragment extends Fragment {

    private FragmentComparisonBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentComparisonBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.btnMega.setOnClickListener(v -> {
            navController.navigate(R.id.action_comparisonFragment_to_megaFragment);
        });

        binding.btnUno.setOnClickListener(v -> {
            navController.navigate(R.id.action_comparisonFragment_to_unoFragment);
        });

        binding.btnNano.setOnClickListener(v -> {
            navController.navigate(R.id.action_comparisonFragment_to_nanoFragment);
        });
    }
}