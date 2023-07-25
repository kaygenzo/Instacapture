package com.tarek360.sample;

import android.os.Bundle;

public class MapAndDialogSampleActivity extends MapFragmentSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.fab.setOnClickListener(v -> showAlertDialog());
    }
}
