package com.tarek360.sample;

import android.os.Bundle;

import com.tarek360.sample.databinding.ActivityMapViewBinding;

public class MapViewSampleActivity extends BaseSampleActivity {

    private ActivityMapViewBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.mapView.onCreate(savedInstanceState);
        binding.fab.setOnClickListener(this::captureScreenshot);
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.mapView.onResume();
    }

    @Override
    protected void onPause() {
        binding.mapView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        binding.mapView.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        if (binding != null && binding.mapView != null) {
            binding.mapView.onSaveInstanceState(outState);
        }

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        if (binding != null && binding.mapView != null) {
            binding.mapView.onLowMemory();
        }

        super.onLowMemory();
    }
}
