package com.sabithpkcmnr.facebookads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

public class ActivityHome extends AppCompatActivity {

    Button btGitHub;
    MaterialCardView cdBanner, cdInterstitial, cdRectangle, cdReward, cdNative, cdGitHub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cdBanner = findViewById(R.id.cdBanner);
        cdRectangle = findViewById(R.id.cdRectangle);
        cdInterstitial = findViewById(R.id.cdInterstitial);
        cdReward = findViewById(R.id.cdReward);
        cdNative = findViewById(R.id.cdNative);
        btGitHub = findViewById(R.id.btGitHub);
        cdGitHub = findViewById(R.id.cdGitHub);

        cdBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Ad_Banner.class));
            }
        });

        cdRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Ad_Rectangle.class));
            }
        });

        cdInterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Ad_Interstitial.class));
            }
        });

        cdReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Ad_Reward.class));
            }
        });

        cdNative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Ad_Native.class));
            }
        });

        btGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SabithPkcMnr"));
                startActivity(browserIntent);
            }
        });

        cdGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SabithPkcMnr"));
                startActivity(browserIntent);
            }
        });
    }
}