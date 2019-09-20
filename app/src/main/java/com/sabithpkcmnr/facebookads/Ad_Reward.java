package com.sabithpkcmnr.facebookads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.facebook.ads.RewardedVideoAd;

public class Ad_Reward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_reward);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //607114842814465_1120504261475518

        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(this, ActivityConfig.FB_REWARD);
        rewardedVideoAd.loadAd();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}