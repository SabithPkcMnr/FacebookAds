package com.sabithpkcmnr.facebookads;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class ActivityBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
    }
}
