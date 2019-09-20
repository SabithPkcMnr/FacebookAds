package com.sabithpkcmnr.facebookads;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBannerPage(View view) {
        startActivity(new Intent(MainActivity.this, Ad_Banner.class));
    }

    public void openInterstitialPage(View view) {
        startActivity(new Intent(MainActivity.this, Ad_Interstitial.class));
    }
}