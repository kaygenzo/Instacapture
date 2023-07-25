package com.tarek360.sample;

import android.os.Bundle;

import com.tarek360.sample.databinding.ActivitySurfaceViewSampleBinding;

/**
 * Created by tarek on 10/4/16.
 */

public class SurfaceViewSampleActivity extends BaseSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySurfaceViewSampleBinding binding =
                ActivitySurfaceViewSampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.fab.setOnClickListener(this::captureScreenshot);
    }
}
