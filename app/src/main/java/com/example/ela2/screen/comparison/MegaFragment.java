package com.example.ela2.screen.comparison;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ela2.R;
import com.example.ela2.databinding.FragmentMainBinding;
import com.example.ela2.databinding.FragmentMegaBinding;


public class MegaFragment extends Fragment {

    private FragmentMegaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMegaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.ivPinsArduinoMega.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WUd_uFH0ToHs4sUFIgHFi_EHhc6YhN_F/view?usp=sharing")));
        });

        binding.btnDownload.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qDsMpXOoQfEz8mwOlhnmcXqV4_JIUaGH/view?usp=sharing")));
        });
    }
}