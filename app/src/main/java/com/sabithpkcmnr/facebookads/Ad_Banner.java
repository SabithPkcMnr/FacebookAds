package com.sabithpkcmnr.facebookads;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class Ad_Banner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_banner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadAdFifty();
        loadAdNinety();
    }

    private void loadAdFifty() {
        final RelativeLayout adContainer = findViewById(R.id.ad_banner_50);
        AdView adView = new AdView(this, ActivityConfig.FB_BANNER,
                AdSize.BANNER_HEIGHT_50);
        adContainer.addView(adView);
        adView.loadAd();

        adView.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Toast.makeText(Ad_Banner.this, "Ad 50 Error: " + adError.getErrorMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Toast.makeText(Ad_Banner.this, "Ad Loaded", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });
    }

    private void loadAdNinety() {
        final RelativeLayout adContainer = findViewById(R.id.ad_banner_90);
        AdView adView = new AdView(this, "607114842814465_1115067832019161",
                AdSize.BANNER_HEIGHT_90);
        adContainer.addView(adView);
        adView.loadAd();

        adView.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Toast.makeText(Ad_Banner.this, "Ad 90 Error: " + adError.getErrorMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Toast.makeText(Ad_Banner.this, "Ad Loaded", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}