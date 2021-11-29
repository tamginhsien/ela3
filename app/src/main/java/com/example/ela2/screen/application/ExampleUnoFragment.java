
package com.example.ela2.screen.application;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
        // Example 4
        // expandable layout expand/collapse controller
        binding.expandableExample4.setOnClickListener(v -> {
            if (binding.expandableExample4.isExpanded()) {
                binding.expandableExample4.collapse();
            } else binding.expandableExample4.expand();
        });

        // image click to image preview
        binding.expandableExample4.secondLayout.findViewById(R.id.schematic_examples3_2_1).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.schematic_examples3_2_1));
        });
        // image click to image preview
        binding.expandableExample4.secondLayout.findViewById(R.id.connection_examples3_2_1).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.connection_examples3_2_1));
        });

        //Example 4 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample4.secondLayout.findViewById(R.id.btn_example_4_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
        });

        // comment button example 4
        binding.expandableExample4.secondLayout.findViewById(R.id.btn_comment_4).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoComment("comments_example_4", "Example 4"));
        });



        // Example 5
        // expandable layout expand/collapse controller
        binding.expandableExample5.setOnClickListener(v -> {
            if (binding.expandableExample5.isExpanded()) {
                binding.expandableExample5.collapse();
            } else binding.expandableExample5.expand();
        });

        // image click to image preview
        binding.expandableExample5.secondLayout.findViewById(R.id.schematic_examples3_2_2).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.schematic_examples3_2_2));
        });
        // image click to image preview
        binding.expandableExample5.secondLayout.findViewById(R.id.connection_examples_3_2_2).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.connection_examples3_2_2));
        });

        //Example 5 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample5.secondLayout.findViewById(R.id.btn_example_5_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
        });

        // comment button example 5
        binding.expandableExample5.secondLayout.findViewById(R.id.btn_comment_5).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoComment("comments_example_5", "Example 5"));
        });



        // Example 6
        // expandable layout expand/collapse controller
        binding.expandableExample6.setOnClickListener(v -> {
            if (binding.expandableExample6.isExpanded()) {
                binding.expandableExample6.collapse();
            } else binding.expandableExample6.expand();
        });

        // image click to image preview
        binding.expandableExample6.secondLayout.findViewById(R.id.schematic_examples3_2_3).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.schematic_examples3_2_3));
        });
        // image click to image preview
        binding.expandableExample6.secondLayout.findViewById(R.id.connection_examples_3_2_3).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoImage(R.drawable.connection_examples3_2_3));
        });

        //Example 6 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample6.secondLayout.findViewById(R.id.btn_example_6_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
        });

        // comment button example 6
        binding.expandableExample6.secondLayout.findViewById(R.id.btn_comment_6).setOnClickListener(v -> {
            navController.navigate(ExampleUnoFragmentDirections.actionUnoComment("comments_example_6", "Example 6"));
        });


    }
}