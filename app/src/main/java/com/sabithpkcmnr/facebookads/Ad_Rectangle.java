package com.sabithpkcmnr.facebookads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class Ad_Rectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_rectangle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final RelativeLayout adContainer = findViewById(R.id.ad_rectangle);
        AdView adView = new AdView(this, ActivityConfig.FB_RECTANGLE,
                AdSize.RECTANGLE_HEIGHT_250);
        adContainer.addView(adView);
        adView.loadAd();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}