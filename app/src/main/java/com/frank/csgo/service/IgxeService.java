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
import com.frank.csgo.bean.Igxe;
import com.frank.csgo.utils.ThreadUtils;
import com.frank.csgo.utils.TimeUtil;

public class IgxeService extends Service {

    private int noteId = 1;
    private int count = 1;
    private String channel = "igxe";

    NotificationManager notifyManager;

    public IgxeGloves igxeGloves;
    public IgxeKnifes igxeKnifes;
    public IgxeGuns igxeGuns;
    public IgxePicker igxePicker;

    public Handler handler = new Handler();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "igxe服务启动...", Toast.LENGTH_LONG).show();
        createScanner();
        super.onCreate();
    }

    private void createScanner() {
        if (this.igxeGloves == null) {
            this.igxeGloves = new IgxeGloves(IgxeService.this);
        }
        if (this.igxeKnifes == null) {
            this.igxeKnifes = new IgxeKnifes(IgxeService.this);
        }
        if (this.igxeGuns == null) {
            this.igxeGuns = new IgxeGuns(IgxeService.this);
        }
        if (this.igxePicker == null) {
            this.igxePicker = new IgxePicker(IgxeService.this);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        startScan();
        startScan2();
        return super.onStartCommand(intent, flags, startId);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            updateNotification();
            count++;
            try {
                igxeGuns.connect();
            }catch (Exception e){
               e.printStackTrace();
            }
        }
    };
    private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            updateNotification();
            count++;
            try {
                igxePicker.start();
                handler.postDelayed(this,2000);
            }catch (Exception e){
               e.printStackTrace();
            }
        }
    };

    public void startScan(){
        ThreadUtils.THREAD.execute(runnable);
    }
    public void startScan2(){
//        ThreadUtils.THREAD.execute(runnable);
        handler.postDelayed(runnable2,2000);
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