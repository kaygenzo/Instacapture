package com.tarek360.sample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.tarek360.sample.databinding.ActivityDialogAndMenuSampleBinding;

public class DialogAndMenuSampleActivity extends BaseSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityDialogAndMenuSampleBinding binding =
                ActivityDialogAndMenuSampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.showDialog.setOnClickListener(v -> showAlertDialog());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        captureScreenshot();
        return true;
    }
}
