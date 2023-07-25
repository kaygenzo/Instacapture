package com.tarek360.sample;

import android.os.Bundle;

import com.squareup.picasso.Picasso;
import com.tarek360.sample.databinding.ActivityCustomViewSampleBinding;

public class CustomViewSampleActivity extends BaseSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityCustomViewSampleBinding binding =
                ActivityCustomViewSampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Picasso.get().load(R.drawable.header).into(binding.header);
        Picasso.get().load(R.drawable.chart).into(binding.content.chart);
        binding.fab.setOnClickListener(this::captureScreenshot);
    }
}
