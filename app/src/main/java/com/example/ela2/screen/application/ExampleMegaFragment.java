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
import com.example.ela2.databinding.FragmentExampleMegaBinding;
import com.example.ela2.databinding.FragmentMainBinding;


public class ExampleMegaFragment extends Fragment {

    private FragmentExampleMegaBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentExampleMegaBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.btnComment1.setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_1", "Example 1"));
        });

        binding.btnComment2.setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_2", "Example 2"));
        });

        binding.btnComment3.setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_3", "Example 3"));
        });
    }
}