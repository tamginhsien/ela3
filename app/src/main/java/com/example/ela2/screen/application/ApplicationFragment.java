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
import com.example.ela2.databinding.FragmentApplicationBinding;
import com.example.ela2.databinding.FragmentMegaBinding;


public class ApplicationFragment extends Fragment {

    private FragmentApplicationBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentApplicationBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.btnExampleMega.setOnClickListener(v -> {
            navController.navigate(R.id.action_applicationFragment_to_exampleMegaFragment);
        });

        binding.btnExampleUno.setOnClickListener(v -> {
            navController.navigate(R.id.action_applicationFragment_to_exampleUnoFragment);
        });

        binding.btnExampleNano.setOnClickListener(v -> {
            navController.navigate(R.id.action_applicationFragment_to_exampleNanoFragment);
        });
    }
}