package com.example.ela2.screen.comparison;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ela2.R;
import com.example.ela2.databinding.FragmentMainBinding;
import com.example.ela2.databinding.FragmentNanoBinding;


public class NanoFragment extends Fragment {

   private FragmentNanoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNanoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
       binding.ivPinsArduinoMega.setOnClickListener(v -> {
           startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vUVK_BNdXCOZO9N3x_sRN0UisU1eRSjw/view?usp=sharing")));
       });

       binding.btnDownload.setOnClickListener(v -> {
           startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LT_qRvciq6kgEKGmjnOr3SBQUVYMQLDP/view?usp=sharing")));
       });

        binding.expandable.setOnClickListener(v -> {
            if (binding.expandable.isExpanded()) {
                binding.expandable.collapse();
            } else binding.expandable.expand();
        });

        TextView tvMegaContent = binding.expandable.secondLayout.findViewById(R.id.tv_nano_content);
        tvMegaContent.setMovementMethod(LinkMovementMethod.getInstance());
    }
}