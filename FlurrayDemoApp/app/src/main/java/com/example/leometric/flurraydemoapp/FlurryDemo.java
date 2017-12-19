package com.example.leometric.flurraydemoapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.flurry.android.FlurryAgent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeoMetric on 12/19/2017.
 */

public class FlurryDemo extends Activity {
    TextView textView;
    Map<String, String> eventParams;



    @SuppressLint({"MissingPermission", "HardwareIds"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        eventParams = new HashMap<String, String>();
        //param keys and values have to be of String type
        eventParams.put("Author", "Abhay");
        eventParams.put("User_Status", "Auth");
        //up to 10 params can be logged with each event
//        FlurryAgent.logEvent("Register", eventParams);
        String device_id = Settings.Secure.ANDROID_ID;
        Toast.makeText(this, "Device id :- " + device_id, Toast.LENGTH_SHORT).show();
        FlurryAgent.setUserId(device_id);

    }


    @Override
    protected void onStart() {
        super.onStart();
        FlurryAgent.onStartSession(this);
        new FlurryAnalytics().logEvent("Register", eventParams,true );
        Toast.makeText(this, eventParams.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        new FlurryAnalytics().endTimedEvent("end of",eventParams);
    }
}
