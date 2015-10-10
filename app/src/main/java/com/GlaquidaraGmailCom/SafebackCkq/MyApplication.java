package com.GlaquidaraGmailCom.SafebackCkq;

import android.app.Application;

import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.EstimoteSDK;
import com.estimote.sdk.Region;

import java.util.UUID;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initializes Estimote SDK with your App ID and App Token from Estimote Cloud.
        // You can find your App ID and App Token in the
        // Apps section of the Estimote Cloud (http://cloud.estimote.com).
        EstimoteSDK.initialize(this, "safeback-ckq", "0254ab34de3f9ac765bfc32b18954660");

        // Configure verbose debug logging.
        EstimoteSDK.enableDebugLogging(true);
    }
}
