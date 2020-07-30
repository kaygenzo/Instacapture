package com.tarek360.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.OnClick;

public class CustomViewSampleActivity extends BaseSampleActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.header)
    ImageView header;
    @BindView(R.id.chart)
    ImageView chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_sample);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Picasso.get().load(R.drawable.header).into(header);
        Picasso.get().load(R.drawable.chart).into(chart);
    }

    @OnClick(R.id.fab)
    public void onClickFAB(View view) {
        captureScreenshot(view);
    }
}
