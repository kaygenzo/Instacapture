package com.tarek360.sample;

import android.os.Bundle;

import com.tarek360.sample.databinding.ActivityMapFragmentBinding;

/**
 * Created by tarek on 5/28/16.
 */
public class MapFragmentSampleActivity extends BaseSampleActivity {

    protected ActivityMapFragmentBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.fab.setOnClickListener(this::captureScreenshot);
    }
}
