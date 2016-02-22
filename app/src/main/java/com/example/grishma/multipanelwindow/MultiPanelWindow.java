package com.example.grishma.multipanelwindow;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by grishma on 2/22/16.
 */
public class MultiPanelWindow extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
