package com.tarek360.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowScreenShotActivity extends AppCompatActivity {

    private final static String KEY_FILE_PATH = "file";
    @BindView(R.id.imageView)
    ImageView imageView;

    public static Intent buildIntent(Context context, String filePath) {
        Intent intent = new Intent(context, ShowScreenShotActivity.class);
        intent.putExtra(KEY_FILE_PATH, filePath);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_screen_shot);

        ButterKnife.bind(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        String filePath = getIntent().getStringExtra(KEY_FILE_PATH);
        if (filePath != null) {
            Picasso.get().load(new File(filePath)).into(imageView);
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
