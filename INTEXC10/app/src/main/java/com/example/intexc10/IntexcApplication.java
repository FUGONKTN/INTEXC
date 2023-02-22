package com.example.intexc10;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class IntexcApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey("4f697435-bb41-4f3a-a999-4265dee587be");
    }
}
