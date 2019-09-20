package com.sabithpkcmnr.facebookads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAd;

public class Ad_Interstitial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_interstitial);

        InterstitialAd interstitialAd = new InterstitialAd(this, "607114842814465_1113617358830875");
        interstitialAd.loadAd();
        interstitialAd.setAdListener(new AbstractAdListener() {
            @Override
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                Toast.makeText(Ad_Interstitial.this, "Loaded", Toast.LENGTH_SHORT).show();
            }
        });
    }
}