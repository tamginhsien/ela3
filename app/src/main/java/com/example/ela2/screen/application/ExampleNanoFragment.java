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
        // Example 7
        // expandable layout expand/collapse controller
        binding.expandableExample7.setOnClickListener(v -> {
            if (binding.expandableExample7.isExpanded()) {
                binding.expandableExample7.collapse();
            } else binding.expandableExample7.expand();
        });

        // Example 8
        // expandable layout expand/collapse controller
        binding.expandableExample8.setOnClickListener(v -> {
            if (binding.expandableExample8.isExpanded()) {
                binding.expandableExample8.collapse();
            } else binding.expandableExample8.expand();
        });

        // Example 9
        // expandable layout expand/collapse controller
        binding.expandableExample9.setOnClickListener(v -> {
            if (binding.expandableExample9.isExpanded()) {
                binding.expandableExample9.collapse();
            } else binding.expandableExample9.expand();
        });

        // comment button
        binding.expandableExample7.secondLayout.findViewById(R.id.btn_comment_7).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_7", "Example 7"));
        });

        binding.expandableExample8.secondLayout.findViewById(R.id.btn_comment_8).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_8", "Example 8"));
        });

        binding.expandableExample9.secondLayout.findViewById(R.id.btn_comment_9).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_9", "Example 9"));
        });
    }
}