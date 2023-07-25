package com.tarek360.sample;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tarek360.sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.sampleGoogleMapFragment.setOnClickListener(v ->
                startActivity(new Intent(this, MapFragmentSampleActivity.class)));
        binding.sampleGoogleMapView.setOnClickListener(v ->
                startActivity(new Intent(this, MapViewSampleActivity.class)));
        binding.sampleDialog.setOnClickListener(v ->
                startActivity(new Intent(this, DialogAndMenuSampleActivity.class)));
        binding.sampleMapDialog.setOnClickListener(v ->
                startActivity(new Intent(this, MapAndDialogSampleActivity.class)));
        binding.sampleIgnoreViews.setOnClickListener(v ->
                startActivity(new Intent(this, IgnoreViewsSampleActivity.class)));
        binding.sampleCustomView.setOnClickListener(v ->
                startActivity(new Intent(this, CustomViewSampleActivity.class)));
        binding.sampleGlSurfaceView.setOnClickListener(v ->
                startActivity(new Intent(this, GLSurfaceViewSampleActivity.class)));
    }
}
