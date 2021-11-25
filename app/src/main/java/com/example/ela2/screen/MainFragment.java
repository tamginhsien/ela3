package com.example.ela2.screen;

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
import com.example.ela2.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {

    private FragmentMainBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.Submenu1.setOnClickListener(v -> {
            navController.navigate(R.id.action_mainFragment_to_introFragment);
        });

        binding.Submenu2.setOnClickListener(v -> {
            navController.navigate(R.id.action_mainFragment_to_comparisonFragment);
        });

        binding.Submenu3.setOnClickListener(v -> {
            navController.navigate(R.id.action_mainFragment_to_applicationFragment);
        });

        binding.Submenu4.setOnClickListener(v -> {
            navController.navigate(R.id.action_mainFragment_to_aboutFragment);
        });
    }
}