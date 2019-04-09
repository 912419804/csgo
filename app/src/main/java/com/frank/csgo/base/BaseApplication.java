package com.frank.csgo.base;

import android.app.Application;

import com.lzy.okgo.OkGo;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkGo.getInstance().init(this);
    }
}
