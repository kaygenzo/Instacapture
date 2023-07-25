package com.tarek360.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

import com.squareup.picasso.Picasso;
import com.tarek360.sample.databinding.ActivityShowScreenShotBinding;

import java.io.File;

public class ShowScreenShotActivity extends AppCompatActivity {

    private final static String KEY_FILE_PATH = "file";

    public static Intent buildIntent(Context context, String filePath) {
        Intent intent = new Intent(context, ShowScreenShotActivity.class);
        intent.putExtra(KEY_FILE_PATH, filePath);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityShowScreenShotBinding binding =
                ActivityShowScreenShotBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        String filePath = getIntent().getStringExtra(KEY_FILE_PATH);
        if (filePath != null) {
            Picasso.get().load(new File(filePath)).into(binding.imageView);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
