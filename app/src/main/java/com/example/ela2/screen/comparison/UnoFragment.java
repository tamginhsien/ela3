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
import com.example.ela2.databinding.FragmentUnoBinding;


public class UnoFragment extends Fragment {

    private FragmentUnoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUnoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.ivPinsArduinoUno.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/101xaqXo1DkEOkN76OFPYm2p-0rRT074q/view?usp=sharing")));
        });

        binding.btnDownload.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11bpiXXO8nNrNwvbqdIb6G2SZPhq6q0os/view?usp=sharing")));
        });
    }
}