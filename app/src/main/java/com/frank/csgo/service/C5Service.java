package com.frank.csgo.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.frank.csgo.MainActivity;
import com.frank.csgo.R;
import com.frank.csgo.utils.ThreadUtils;
import com.frank.csgo.utils.TimeUtil;

public class C5Service extends Service {
    private int noteId = 3;
    private int count = 1;
    private String channel = "c5";

    NotificationManager notifyManager;

    public C5Guns c5Guns;
    public C5Knifes c5Knifes;
    public C5Gloves c5Gloves;

    public Handler handler = new Handler();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "C5服务启动...", Toast.LENGTH_LONG).show();
        createScanner();
        super.onCreate();
    }

    private void createScanner() {
        if (this.c5Guns == null) {
            this.c5Guns = new C5Guns(C5Service.this);
        }
        if (this.c5Gloves == null) {
            this.c5Gloves = new C5Gloves(C5Service.this);
        }
        if (this.c5Knifes == null) {
            this.c5Knifes = new C5Knifes(C5Service.this);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startScan();
        return super.onStartCommand(intent, flags, startId);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            updateNotification();
            count++;
            try {
                c5Guns.connect();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    };

    public void startScan(){
        ThreadUtils.THREAD.execute(runnable);
    }

    private void updateNotification() {
        if (notifyManager == null) {
            notifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        Uri mUri = Settings.System.DEFAULT_NOTIFICATION_URI;
        NotificationChannel mChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            mChannel = new NotificationChannel(channel, channel, NotificationManager.IMPORTANCE_LOW);
            mChannel.setDescription(channel);
            mChannel.setSound(mUri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            notifyManager.createNotificationChannel(mChannel);
        }
        //启用前台服务，主要是startForeground()
        Notification notification = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Intent mainIntent = new Intent(this, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, mainIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification = new Notification.Builder(this, channel)
//                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setSmallIcon(R.mipmap.cs)
                    .setSubText(channel)
                    .setContentText("扫描第" + count + "次                     " + TimeUtil.timeString(System.currentTimeMillis()))
                    .setContentIntent(pendingIntent)
                    .build();
            //设置通知默认效果
            notification.flags = Notification.FLAG_NO_CLEAR;
            startForeground(noteId, notification);
        }


    }

    @Override
    public void onDestroy() {
        stopDataService();
        super.onDestroy();
    }

    void stopDataService() {
        Toast.makeText(this, "服务停止...", Toast.LENGTH_LONG).show();
        notifyManager.cancel(noteId);
    }

}