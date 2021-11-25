package com.example.ela2.screen;

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
import com.example.ela2.databinding.FragmentIntroBinding;
import com.example.ela2.databinding.FragmentMainBinding;


public class IntroFragment extends Fragment {

    private FragmentIntroBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIntroBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.btnLink1.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.arduino.cc/en/software")));
        });

        binding.btnLink2.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NxH5RNbIxBk")));
        });

        binding.btnLink3.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oXjWl8tbyiA")));
        });

        binding.btnLink4.setOnClickListener(v -> {
            // TODO - remove empty string
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
        });

        binding.btnProteusofficial.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.labcenter.com/downloads/")));
        });

        binding.btnCrackproteus1.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://getintopc.com/?s=proteus")));
        });

        binding.btnCrackproteus2.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2cw9oQbmlzs")));
        });

        binding.btnNoLibrary.setOnClickListener(v -> {
            // TODO - remove empty string
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("")));
        });

        binding.btnLibrary1.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eN78XItzolO85AH83Q5xP44Eao2c-vuQ/view?usp=sharing")));
        });

        binding.btnLibrary2.setOnClickListener(v -> {
            // TODO - remove empty string
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("")));
        });

        binding.btnKicad.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kicad.org/download/")));
        });

        binding.btnFritzing1.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://fritzing.org/download/")));
        });

        binding.btnFritzing2.setOnClickListener(v -> {
            startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qciDMZit1D2NbIRbiPLO5KiO_qbW5iA_/view?usp=sharing")));
        });

        binding.btnVirtualbreadboard.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.microsoft.com/en-my/p/virtual-breadboard/9nblggh4tj3w?cid=storebadge&ocid=badge&activetab=pivot:overviewtab")));
        });


    }
}