package com.tarek360.sample;

import android.os.Bundle;
import android.view.View;

import com.tarek360.sample.databinding.ActivityIgnoreViewsSampleBinding;

import java.util.ArrayList;
import java.util.List;

public class IgnoreViewsSampleActivity extends BaseSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityIgnoreViewsSampleBinding binding =
                ActivityIgnoreViewsSampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.fab.setOnClickListener(v -> {
            List<View> views = new ArrayList<>();

            views.add(v);

            if (!binding.content.textViewCheckBox.isChecked()) {
                views.add(binding.content.textView);
            }
            if (!binding.content.buttonCheckBox.isChecked()) {
                views.add(binding.content.button);
            }
            if (!binding.content.imageViewCheckBox.isChecked()) {
                views.add(binding.content.imageView);
            }

            View[] ignoredViews = new View[views.size()];
            ignoredViews = views.toArray(ignoredViews);

            captureScreenshot(ignoredViews);
        });

        binding.content.textView.setOnClickListener(v ->
                binding.content.textViewCheckBox
                        .setChecked(!binding.content.textViewCheckBox.isChecked()));
        binding.content.button.setOnClickListener(v ->
                binding.content.buttonCheckBox
                        .setChecked(!binding.content.buttonCheckBox.isChecked()));
        binding.content.imageView.setOnClickListener(v ->
                binding.content.imageViewCheckBox
                        .setChecked(!binding.content.imageViewCheckBox.isChecked()));
    }
}
