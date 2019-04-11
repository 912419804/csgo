package com.frank.csgo.service;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.frank.csgo.Main2Activity;
import com.frank.csgo.R;
import com.frank.csgo.utils.NumUtils;
import com.frank.csgo.utils.ThreadUtils;
import com.frank.csgo.utils.TimeUtil;

public class BuffService extends Service {

    private int count = 1;

    NotificationManager notifyManager;

    public BuffGuns buffGuns;
    public BuffKnifes buffKnifes;
    public BuffGloves buffGloves;

    public Handler handler = new Handler();


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        Toast.makeText(this, "buff服务启动...", Toast.LENGTH_LONG).show();
        createScanner();
        super.onCreate();
    }

    private void createScanner() {
        if (this.buffGuns == null) {
            this.buffGuns = new BuffGuns(BuffService.this);
        }
        if (this.buffKnifes == null) {
            this.buffKnifes = new BuffKnifes(BuffService.this);
        }
        if (this.buffGloves == null) {
            this.buffGloves = new BuffGloves(BuffService.this);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startScann();
        return super.onStartCommand(intent, flags, startId);
    }

    public void startScann(){
        ThreadUtils.THREAD.execute(new Runnable() {
            @Override
            public void run() {
                updateNotification();
                count++;
                buffGuns.connect201();
            }
        });

    }

    private void updateNotification() {
        if (notifyManager == null) {
            notifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        Uri mUri = Settings.System.DEFAULT_NOTIFICATION_URI;
        NotificationChannel mChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            mChannel = new NotificationChannel("9999", "9999", NotificationManager.IMPORTANCE_LOW);
            mChannel.setDescription("buff");
            mChannel.setSound(mUri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            notifyManager.createNotificationChannel(mChannel);
        }
        //启用前台服务，主要是startForeground()
        Notification notification = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Intent mainIntent = new Intent(this, Main2Activity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, mainIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification = new Notification.Builder(this, "9999")
//                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setSmallIcon(R.mipmap.cs)
                    .setContentText("扫描第" + count + "次                     " + TimeUtil.timeString(System.currentTimeMillis()))
                    .setContentIntent(pendingIntent)
                    .build();
            //设置通知默认效果
            notification.flags = Notification.FLAG_NO_CLEAR;
            startForeground(2, notification);
        }


    }

    @Override
    public void onDestroy() {
        stopDataService();
        super.onDestroy();
    }

    void stopDataService() {
        Toast.makeText(this, "服务停止...", Toast.LENGTH_LONG).show();
        notifyManager.cancel(2);
    }

    private static int MIN_DELAY = 2000;
    private static int MAX_DELAY = 5000;
    public void post(Runnable r){
        handler.postDelayed(r, Long.parseLong(NumUtils.getRandom(MIN_DELAY,MAX_DELAY)));
    }

}