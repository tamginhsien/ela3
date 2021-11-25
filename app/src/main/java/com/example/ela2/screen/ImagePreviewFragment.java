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
import com.example.ela2.databinding.FragmentComparisonBinding;
import com.example.ela2.databinding.FragmentImagePreviewBinding;


public class ImagePreviewFragment extends Fragment {

    private FragmentImagePreviewBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentImagePreviewBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        int image = ImagePreviewFragmentArgs.fromBundle(getArguments()).getImage();

        binding.ivImage.setImageResource(image);

        binding.btnBack.setOnClickListener(v -> navController.navigateUp());
    }
}