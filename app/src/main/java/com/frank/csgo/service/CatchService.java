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
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.frank.csgo.Constant;
import com.frank.csgo.Main2Activity;
import com.frank.csgo.R;
import com.frank.csgo.utils.TimeUtil;

public class CatchService extends Service {

    private int count = 1;
    private int interval = 1000 * 180;
    private BroadcastReceiver startActionReceiver;
    private AlarmManager am;
    private PendingIntent sender;

    NotificationManager notifyManager;

    public IgxeGloves igxeGloves;
    public IgxeKnifes igxeKnifes;
    public IgxeGuns igxeGuns;
    public C5Guns c5Guns;
    public C5Knifes c5Knifes;
    public C5Gloves c5Gloves;
    public BuffGuns buffGuns;
    public BuffKnifes buffKnifes;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "服务启动...", Toast.LENGTH_LONG).show();
        createScanner();
        //闹钟定时服务
        if (startActionReceiver == null) {
            startActionReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    updateNotification();
                    count++;
                    igxeGuns.connect();
                }
            };
        }
        registerReceiver(startActionReceiver, new IntentFilter(Constant.START));
        //启动闹钟服务
        try {
            Intent intent = new Intent(Constant.START);
            sender = PendingIntent
                    .getBroadcast(this, 1000, intent, 0);
            //开始时间
            long firsTime = SystemClock.elapsedRealtime();
            am = (AlarmManager) getSystemService(ALARM_SERVICE);
            am.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, 0, interval, sender);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onCreate();
    }

    private void createScanner() {
        if (this.igxeGloves == null) {
            this.igxeGloves = new IgxeGloves(CatchService.this);
        }
        if (this.igxeKnifes == null) {
            this.igxeKnifes = new IgxeKnifes(CatchService.this);
        }
        if (this.igxeGuns == null) {
            this.igxeGuns = new IgxeGuns(CatchService.this);
        }
        if (this.c5Guns == null) {
            this.c5Guns = new C5Guns(CatchService.this);
        }
        if (this.c5Gloves == null) {
            this.c5Gloves = new C5Gloves(CatchService.this);
        }
        if (this.c5Knifes == null) {
            this.c5Knifes = new C5Knifes(CatchService.this);
        }
        if (this.buffGuns == null) {
            this.buffGuns = new BuffGuns(CatchService.this);
        }
        if (this.buffKnifes == null) {
            this.buffKnifes = new BuffKnifes(CatchService.this);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    private void updateNotification() {
        if (notifyManager == null) {
            notifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        Uri mUri = Settings.System.DEFAULT_NOTIFICATION_URI;
        NotificationChannel mChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            mChannel = new NotificationChannel("999", "999", NotificationManager.IMPORTANCE_LOW);
            mChannel.setDescription("csgo");
            mChannel.setSound(mUri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            notifyManager.createNotificationChannel(mChannel);
        }
        //启用前台服务，主要是startForeground()
        Notification notification = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Intent mainIntent = new Intent(this, Main2Activity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, mainIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification = new Notification.Builder(this, "999")
//                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setSmallIcon(R.mipmap.cs)
                    .setContentText("扫描第" + count + "次                     " + TimeUtil.timeString(System.currentTimeMillis()))
                    .setContentIntent(pendingIntent)
                    .build();
            //设置通知默认效果
            notification.flags = Notification.FLAG_NO_CLEAR;
            startForeground(1, notification);
        }


    }

    @Override
    public void onDestroy() {
        stopDataService();
        super.onDestroy();
    }

    void stopDataService() {
        Toast.makeText(this, "服务停止...", Toast.LENGTH_LONG).show();
        notifyManager.cancel(1);
        if (sender != null) {
            am.cancel(sender);
        }
        if (startActionReceiver != null) {
            unregisterReceiver(startActionReceiver);
        }
    }


}