
package com.example.ela2.screen.application;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ela2.R;
import com.example.ela2.databinding.FragmentExampleUnoBinding;
import com.example.ela2.databinding.FragmentMainBinding;

public class ExampleUnoFragment extends Fragment {

    private FragmentExampleUnoBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentExampleUnoBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.expandableExample4.setOnClickListener(v -> {
            if (binding.expandableExample4.isExpanded()) {
                binding.expandableExample4.collapse();
            } else binding.expandableExample4.expand();
        });

        binding.expandableExample4.secondLayout.findViewById(R.id.btn_comment_4).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoComment("comments_example_4", "Example 4"));
        });

        binding.expandableExample4.secondLayout.findViewById(R.id.schematic_examples3_2_1).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.schematic_examples3_2_1));
        });

        binding.expandableExample4.secondLayout.findViewById(R.id.connection_examples3_2_1).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.connection_examples3_2_1));
        });

        binding.expandableExample5.setOnClickListener(v -> {
            if (binding.expandableExample5.isExpanded()) {
                binding.expandableExample5.collapse();
            } else binding.expandableExample5.expand();
        });

        binding.expandableExample5.secondLayout.findViewById(R.id.btn_comment_5).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoComment("comments_example_5", "Example 5"));
        });

        binding.expandableExample5.secondLayout.findViewById(R.id.schematic_examples3_2_2).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.schematic_examples3_2_2));
        });

        binding.expandableExample5.secondLayout.findViewById(R.id.connection_examples_3_2_2).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.connection_examples3_2_2));
        });

        binding.expandableExample6.setOnClickListener(v -> {
            if (binding.expandableExample6.isExpanded()) {
                binding.expandableExample6.collapse();
            } else binding.expandableExample6.expand();
        });

        binding.expandableExample6.secondLayout.findViewById(R.id.btn_comment_6).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoComment("comments_example_6", "Example 6"));
        });

        binding.expandableExample6.secondLayout.findViewById(R.id.schematic_examples3_2_3).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.schematic_examples3_2_3));
        });

        binding.expandableExample6.secondLayout.findViewById(R.id.connection_examples_3_2_3).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.connection_examples3_2_3));
        });
    }
}