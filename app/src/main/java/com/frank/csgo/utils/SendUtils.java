package com.frank.csgo.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;


public class SendUtils {

    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();


    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = LocalBroadcastManager.getInstance(context);
            }
            return mInstance;
        }
    }

    public static void sendBroadcast(@NonNull Context context, @NonNull Intent intent) {
        getInstance(context).sendBroadcast(intent);
    }

}
