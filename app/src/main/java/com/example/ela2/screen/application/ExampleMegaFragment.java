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
        // Example 1
        // expandable layout expand/collapse controller
        binding.expandableExample1.setOnClickListener(v -> {
            if (binding.expandableExample1.isExpanded()) {
                binding.expandableExample1.collapse();
            } else binding.expandableExample1.expand();
        });

        // Example 2
        // expandable layout expand/collapse controller
        binding.expandableExample2.setOnClickListener(v -> {
            if (binding.expandableExample2.isExpanded()) {
                binding.expandableExample2.collapse();
            } else binding.expandableExample2.expand();
        });

        // Example 3
        // expandable layout expand/collapse controller
        binding.expandableExample3.setOnClickListener(v -> {
            if (binding.expandableExample3.isExpanded()) {
                binding.expandableExample3.collapse();
            } else binding.expandableExample3.expand();
        });

        // comment button
        binding.expandableExample1.secondLayout.findViewById(R.id.btn_comment_1).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_1", "Example 1"));
        });

        binding.expandableExample2.secondLayout.findViewById(R.id.btn_comment_2).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_2", "Example 2"));
        });

        binding.expandableExample3.secondLayout.findViewById(R.id.btn_comment_3).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_3", "Example 2"));
        });
    }
}