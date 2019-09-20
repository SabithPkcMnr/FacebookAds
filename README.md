# FacebookAds
An Android app that displays all the Facebook Mobile Ads based on Audience Network SDK. Replace the existing adunits from <b>ActivityConfig.java class</b>. Facebook offer some extra tips on how to implement the ads for Android on this [page](https://developers.facebook.com/docs/audience-network/sdk-integration-tips-on-android/).

## Implementation
Add the audience network sdk dependency to build.gradle(Module: app)
```
implementation 'com.facebook.android:audience-network-sdk:5.3.1'
```


Initialize the AudienceNetworkAds class.
```groovy
AudienceNetworkAds.initialize(this);
```
        

## Ads Implemented in the app
The ads may not be displaying on Android Emulators so try to run the app on a real Android Phone or Tablet:
<h3>Ad Types</h3>
** -Banner Ad (50 & 90 Sized**<br>
** -Interstitial Ad**<br>
** -Rectangle Banner Ad**<br>
** -Reward Ad (Require approval)**<br>
<img src="/screenshots/sabith_pkc_mnr_github_fb_ads_repo_intro.png">

<br>
<br>
Now grab a cup of hot or cold coffee☕ and let's get started. Feel free to give a star, fork and play around the ads.

This app make it easy for you to implement Facebook ads very easily into your Android App and it is very similar to how we used to  implement the [Google AdMob Ads](https://developers.google.com/admob/android/quick-start/ "Yoo my boi click to open this page").
