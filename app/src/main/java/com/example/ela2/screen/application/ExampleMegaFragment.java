package com.example.ela2.screen.application;

import android.content.Intent;
import android.net.Uri;
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

        // image click to image preview
        binding.expandableExample1.secondLayout.findViewById(R.id.schematic_examples3_1_1).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaImage(R.drawable.schematic_examples3_2_1));
        });
        // image click to image preview
        binding.expandableExample1.secondLayout.findViewById(R.id.connection_examples3_1_1).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaImage(R.drawable.connection_examples3_1_1));
        });

        //Example 1 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample1.secondLayout.findViewById(R.id.btn_example_1_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/A0JoCosAPT8")));
                });

        // comment button example 1
        binding.expandableExample1.secondLayout.findViewById(R.id.btn_comment_1).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_1", "Example 1"));
        });



        // Example 2
        // expandable layout expand/collapse controller
        binding.expandableExample2.setOnClickListener(v -> {
            if (binding.expandableExample2.isExpanded()) {
                binding.expandableExample2.collapse();
            } else binding.expandableExample2.expand();
        });

        // image click to image preview
        binding.expandableExample2.secondLayout.findViewById(R.id.schematic_examples3_1_2).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaImage(R.drawable.schematic_examples3_2_2));
        });
        // image click to image preview
        binding.expandableExample2.secondLayout.findViewById(R.id.connection_examples3_1_2).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaImage(R.drawable.connection_examples3_1_2));
        });

        //Example 2 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample2.secondLayout.findViewById(R.id.btn_example_2_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/A0JoCosAPT8")));
        });

        // comment button example 2
        binding.expandableExample2.secondLayout.findViewById(R.id.btn_comment_2).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_2", "Example 2"));
        });



        // Example 3
        // expandable layout expand/collapse controller
        binding.expandableExample3.setOnClickListener(v -> {
            if (binding.expandableExample3.isExpanded()) {
                binding.expandableExample3.collapse();
            } else binding.expandableExample3.expand();
        });

        // image click to image preview
        binding.expandableExample3.secondLayout.findViewById(R.id.schematic_examples3_1_3).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaImage(R.drawable.schematic_examples3_2_3));
        });
        // image click to image preview
        binding.expandableExample3.secondLayout.findViewById(R.id.connection_examples3_1_3).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaImage(R.drawable.connection_examples3_2_3));
        });

        //Example 3 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample3.secondLayout.findViewById(R.id.btn_example_3_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/A0JoCosAPT8")));
        });

        // comment button example 3
        binding.expandableExample3.secondLayout.findViewById(R.id.btn_comment_3).setOnClickListener(v -> {
            navController.navigate(ExampleMegaFragmentDirections.actionMegaComment("comments_example_3", "Example 2"));
        });





    }
}