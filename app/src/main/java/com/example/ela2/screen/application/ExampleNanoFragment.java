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
import android.widget.TextView;

import com.example.ela2.R;
import com.example.ela2.Utils;
import com.example.ela2.databinding.FragmentExampleNanoBinding;
import com.example.ela2.databinding.FragmentMainBinding;


public class ExampleNanoFragment extends Fragment {

    private FragmentExampleNanoBinding binding;
    private NavController navController;
    private final Utils utils = new Utils();

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

        // image click to image preview
        binding.expandableExample7.secondLayout.findViewById(R.id.schematic_examples3_3_1).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoImage(R.drawable.schematic_examples3_3_1));
        });
        // image click to image preview
        binding.expandableExample7.secondLayout.findViewById(R.id.connection_examples3_3_1).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoImage(R.drawable.connection_examples3_3_1));
        });

        //Coding Example 7
        TextView tv331 = binding.expandableExample7.secondLayout.findViewById(R.id.textView_coding3_3_1);
        tv331.setText(utils.getCodeFromTxt(requireContext(), R.raw.coding3_3_1));

        //Example 7 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample7.secondLayout.findViewById(R.id.btn_example_7_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/d6MoIg0VJOM")));
        });

        // comment button example 7
        binding.expandableExample7.secondLayout.findViewById(R.id.btn_comment_7).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_7", "Example 7"));
        });



        // Example 8
        // expandable layout expand/collapse controller
        binding.expandableExample8.setOnClickListener(v -> {
            if (binding.expandableExample8.isExpanded()) {
                binding.expandableExample8.collapse();
            } else binding.expandableExample8.expand();
        });

        // image click to image preview
        binding.expandableExample8.secondLayout.findViewById(R.id.schematic_examples3_3_2).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoImage(R.drawable.schematic_examples3_3_2));
        });
        // image click to image preview
        binding.expandableExample8.secondLayout.findViewById(R.id.connection_examples_3_3_2).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoImage(R.drawable.connection_examples3_3_2));
        });

        //Coding Example 8
        TextView tv332 = binding.expandableExample8.secondLayout.findViewById(R.id.textView_coding3_3_2);
        tv332.setText(utils.getCodeFromTxt(requireContext(), R.raw.coding3_3_2));

        //Example 8 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample8.secondLayout.findViewById(R.id.btn_example_8_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/d-Em3nUdov0")));
        });

        // comment button example 8
        binding.expandableExample8.secondLayout.findViewById(R.id.btn_comment_8).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_8", "Example 8"));
        });



        // Example 9
        // expandable layout expand/collapse controller
        binding.expandableExample9.setOnClickListener(v -> {
            if (binding.expandableExample9.isExpanded()) {
                binding.expandableExample9.collapse();
            } else binding.expandableExample9.expand();
        });

        // image click to image preview
        binding.expandableExample9.secondLayout.findViewById(R.id.schematic_examples3_3_3).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoImage(R.drawable.schematic_examples3_3_3));
        });
        // image click to image preview
        binding.expandableExample9.secondLayout.findViewById(R.id.connection_examples_3_3_3).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoImage(R.drawable.connection_examples3_3_3));
        });

        //Coding Example 9
        TextView tv333 = binding.expandableExample9.secondLayout.findViewById(R.id.textView_coding3_3_3);
        tv333.setText(utils.getCodeFromTxt(requireContext(), R.raw.coding3_3_3));

        //Example 9 Demonstration Video Button
        // TODO - Remember to add in the Uri of Demonstration Video
        binding.expandableExample9.secondLayout.findViewById(R.id.btn_example_9_video).setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/QUSUySVf8Bg")));
        });

        // comment button example 9
        binding.expandableExample9.secondLayout.findViewById(R.id.btn_comment_9).setOnClickListener(v -> {
            navController.navigate(ExampleNanoFragmentDirections.actionNanoComment("comments_example_9", "Example 9"));
        });

    }
}