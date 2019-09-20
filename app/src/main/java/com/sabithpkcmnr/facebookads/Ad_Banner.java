package com.sabithpkcmnr.facebookads;

import android.os.Bundle;
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

       /*
        public static String FB_BANNER = "607114842814465_1113505352175409";
        public static String FB_INTERSTITIAL = "607114842814465_1113617358830875";
        */

        final RelativeLayout adContainer = findViewById(R.id.ad_banner_50);
        AdView adView = new AdView(this, "607114842814465_1113505352175409",
                AdSize.BANNER_HEIGHT_50);
        adContainer.addView(adView);
        adView.loadAd();

        adView.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Toast.makeText(Ad_Banner.this, "Error: " + adError.getErrorMessage(), Toast.LENGTH_SHORT).show();
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
}