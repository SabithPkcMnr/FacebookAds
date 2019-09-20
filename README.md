# FacebookAds
An Android app that displays all the Facebook Mobile Ads based on Audience Network SDK. Replace the existing adunits from ActivityConfig.java class. Facebook offer some extra tips on how to implement the ads for Android on this [page](https://developers.facebook.com/docs/audience-network/sdk-integration-tips-on-android/).

# Implementation
Add the audience network sdk dependency to build.gradle(Module: app)
```
implementation 'com.facebook.android:audience-network-sdk:5.3.1'
```


Initialize the AudienceNetworkAds class.
```groovy
AudienceNetworkAds.initialize(this);
```
        

# Ads Implemented
The ads may not be displaying on Android Emulators so try to run the app on a real Android Phone or Tablet:
<h3>Ad Types</h3>
-Banner Ad (50 & 90 Sized)<br>
-Interstitial Ad<br>
-Rectangle Banner Ad<br>
-Reward Ad (Require approval)<br>
<img src="/screenshots/sabith_pkc_mnr_github_fb_ads_repo_intro.png">

<br>
<br>
<br>
Feel free to give a star, fork and play around!
