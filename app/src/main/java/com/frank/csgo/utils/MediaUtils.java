package com.frank.csgo.utils;

import android.app.Activity;
import android.app.Service;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;

public class MediaUtils {

    private static MediaPlayer mMediaPlayer;

    //以pattern[]方式震动
    public static void vibrate(final Activity activity, long[] pattern,int repeat){
        Vibrator vib = (Vibrator) activity.getSystemService(Service.VIBRATOR_SERVICE);
        vib.vibrate(pattern,repeat);
    }

    //开始播放
    public static void playRing(final Activity activity) {
        try {
            Uri alert = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);//用于获取手机默认铃声的Uri
            Ringtone r = RingtoneManager.getRingtone(activity, alert);
            r.play();
//            if (mMediaPlayer == null) {
//                mMediaPlayer = new MediaPlayer();
//            }
//            mMediaPlayer.setDataSource(activity, alert);
//            mMediaPlayer.setAudioStreamType(AudioManager.STREAM_RING);//告诉mediaPlayer播放的是铃声流
//            mMediaPlayer.setLooping(true);
//            mMediaPlayer.prepare();
//            mMediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //停止播放
    public static void stopRing() {
        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying()) {
                mMediaPlayer.stop();
                mMediaPlayer.release();
            }
        }
    }
}
