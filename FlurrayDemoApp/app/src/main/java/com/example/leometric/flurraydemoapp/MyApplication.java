package com.example.leometric.flurraydemoapp;

import android.app.Application;
import android.util.Log;


import com.flurry.android.FlurryAgent;

import static android.util.Log.VERBOSE;

/**
 * Created by LeoMetric on 12/19/2017.
 */

public class MyApplication extends Application {


    public static final String LOG_TAG = MyApplication.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .withCaptureUncaughtExceptions(true)
                .withContinueSessionMillis(10)
                .withLogLevel(VERBOSE)
                .build(this, getString(R.string.flurry_api_key));

        Log.i(LOG_TAG, "Initialized FLurry Agent");
    }

}
