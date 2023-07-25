package com.tarek360.sample;

import android.os.Bundle;

import com.tarek360.sample.databinding.ActivityGlSurfaceViewSampleBinding;
import com.tarek360.sample.uncapturableViews.GLSurfaceViewRenderer;

/**
 * Created by tarek on 10/4/16.
 */

public class GLSurfaceViewSampleActivity extends BaseSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityGlSurfaceViewSampleBinding binding =
                ActivityGlSurfaceViewSampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.glSurfaceView.setRenderer(new GLSurfaceViewRenderer());
        binding.fab.setOnClickListener(this::captureScreenshot);
    }
}
