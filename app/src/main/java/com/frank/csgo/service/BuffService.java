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

import com.frank.csgo.Constant;
import com.frank.csgo.MainActivity;
import com.frank.csgo.R;
import com.frank.csgo.utils.NumUtils;
import com.frank.csgo.utils.ThreadUtils;
import com.frank.csgo.utils.TimeUtil;

public class BuffService extends Service {
    private int noteId = 2;
    private int count = 1;
    private String channel = "buff";

    NotificationManager notifyManager;

    public BuffGuns buffGuns;
    public BuffKnifes buffKnifes;
    public BuffGloves buffGloves;
    public BuffLast buffLast;

    public Handler handler = new Handler();

    public AlarmManager am;
    private PendingIntent sender;
    private BroadcastReceiver startActionReceiver;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
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
        if (this.buffLast == null){
            this.buffLast = new BuffLast(BuffService.this);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (Constant.LAST == 1){
            Toast.makeText(this, "buff轮询访问...", Toast.LENGTH_LONG).show();
            startLast();
        }else {
            Toast.makeText(this, "buff顺序访问...", Toast.LENGTH_LONG).show();
            startScan();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            updateNotification();
            count++;
            if (Constant.BUFF == 0){
                buffGuns.connect201();
            }else {
                buffKnifes.connect3200();
            }
        }
    };
    private Runnable lastTask = new Runnable() {
        @Override
        public void run() {
            updateNotification();
            count++;
            if (Constant.BUFF == 0){
                buffGuns.connect201();
            }else {
                buffKnifes.connect3200();
            }
        }
    };

    public void startScan(){
        ThreadUtils.THREAD.execute(runnable);
    }
    public void startLast(){

        //闹钟定时服务
        if (startActionReceiver == null) {
            startActionReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    updateNotification();
                    count++;
                    buffLast.scann();
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
            am = (AlarmManager) getSystemService(ALARM_SERVICE);
            am.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, 0, getInterval(), sender);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void updateNotification() {
        if (notifyManager == null) {
            notifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        Uri mUri = Settings.System.DEFAULT_NOTIFICATION_URI;
        NotificationChannel mChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            mChannel = new NotificationChannel(channel, channel, NotificationManager.IMPORTANCE_LOW);
            mChannel.setDescription("buff");
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
                    .setContentText("扫描第" + count + "次                     " + TimeUtil.timeString(System.currentTimeMillis()))
                    .setSubText(channel)
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
        if (startActionReceiver != null){
            unregisterReceiver(startActionReceiver);
        }

        super.onDestroy();
    }

    void stopDataService() {
        Toast.makeText(this, "服务停止...", Toast.LENGTH_LONG).show();
        notifyManager.cancel(noteId);
    }

    private static int MIN_DELAY = 1000;
    private static int MAX_DELAY = 3000;
    public void post(Runnable r){
        handler.postDelayed(r, 0);
//        handler.postDelayed(r, Long.parseLong(NumUtils.getRandom(MIN_DELAY,MAX_DELAY)));
    }

    private static int MIN_DELAY_LAST = 5000;
    private static int MAX_DELAY_LAST = 15000;
    public long getInterval(){
        return 8;
//        return Long.parseLong(NumUtils.getRandom(MIN_DELAY_LAST,MAX_DELAY_LAST));
    }

}