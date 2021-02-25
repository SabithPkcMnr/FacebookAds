package com.sabithpkcmnr.facebookads;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;

public class Ad_Interstitial extends AppCompatActivity {

    TextView txStatus;
    ProgressBar progress;

    boolean canShowFullscreenAd;
    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_interstitial);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txStatus = findViewById(R.id.interstitial_status);
        progress = findViewById(R.id.interstitial_progress);

        interstitialAd = new InterstitialAd(this, ActivityConfig.FB_INTERSTITIAL);
        AbstractAdListener adListener = new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                progress.setVisibility(View.GONE);
                txStatus.setText("Ad Failed to load");
                Toast.makeText(Ad_Interstitial.this, "Error loading ad: " + error.getErrorMessage(), Toast.LENGTH_SHORT).show();
                super.onError(ad, error);
            }
            @Override
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                txStatus.setText("Ad Loaded");
                if (canShowFullscreenAd) {
                    interstitialAd.show();
                }
            }
            @Override
            public void onAdClicked(Ad ad) {
                super.onAdClicked(ad);
            }
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                super.onInterstitialDisplayed(ad);
                progress.setVisibility(View.GONE);
                txStatus.setText("Ad Displayed");
            }
            @Override
            public void onInterstitialDismissed(Ad ad) {
                super.onInterstitialDismissed(ad);
                progress.setVisibility(View.GONE);
                txStatus.setText("Ad Closed");
            }
        };
        InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig = interstitialAd.buildLoadAdConfig()
                .withAdListener(adListener)
                .build();
        interstitialAd.loadAd(interstitialLoadAdConfig);
    }

    @Override
    protected void onPause() {
        super.onPause();
        canShowFullscreenAd = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        canShowFullscreenAd = true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}