package com.example.ela2.screen.application;

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
import com.example.ela2.databinding.FragmentExampleNanoBinding;
import com.example.ela2.databinding.FragmentMainBinding;


public class ExampleNanoFragment extends Fragment {

    private FragmentExampleNanoBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentExampleNanoBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.btnComment7.setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_7", "Example 7"));
        });

        binding.btnComment8.setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_8", "Example 8"));
        });

        binding.btnComment9.setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_9", "Example 9"));
        });
    }
}