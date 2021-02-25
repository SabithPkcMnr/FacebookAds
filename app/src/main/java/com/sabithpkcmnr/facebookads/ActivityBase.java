package com.sabithpkcmnr.facebookads;

import android.app.Application;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class ActivityBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);

        //This will make the ad run on the test device, let's say your Android AVD emulator
        if (BuildConfig.DEBUG){
            AdSettings.setTestMode(true);
        }


    }
}