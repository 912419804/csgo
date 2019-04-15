package com.frank.csgo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.frank.csgo.bean.IgxeWeapon;
import com.frank.csgo.service.C5Service;
import com.frank.csgo.utils.MediaUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private Button btnStop;
    private RecyclerView recyclerView;
    private List<IgxeWeapon> weapons = new ArrayList<>();
    private BaseQuickAdapter<IgxeWeapon, BaseViewHolder> adapter;

    private Intent service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btn_start_service);
        btnStop = findViewById(R.id.btn_stop_service);
        recyclerView = findViewById(R.id.rv_list);
        setClickListener();
        setList();
        registerDataReceiver();
    }

    private void registerDataReceiver() {
        IntentFilter filter = new IntentFilter(Constant.IGXE_WEAPON);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                try {
                    boolean isUpdate = false;
                    ArrayList<IgxeWeapon> list = (ArrayList<IgxeWeapon>) intent.getSerializableExtra(Constant.IGXE_WEAPON);
                    for (IgxeWeapon w : list) {
                        if (!weapons.contains(w)) {
                            weapons.add(0,w);
                            isUpdate = true;
                        }
                    }
                    if (isUpdate) {
                        MediaUtils.vibrate(MainActivity.this, new long[]{100L, 200L, 300L, 400L}, -1);
                        adapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, filter);
    }

    private void setList() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new BaseQuickAdapter<IgxeWeapon, BaseViewHolder>(R.layout.item_weapon, weapons) {
            @Override
            protected void convert(BaseViewHolder helper, IgxeWeapon item) {
                helper.setText(R.id.tv_name, item.getName());
                helper.setText(R.id.tv_price, item.getUnit_price());
                String exterior_wear = item.getExterior_wear();
                helper.setText(R.id.tv_degree, exterior_wear);
                TextView view = helper.getView(R.id.tv_degree);
                if (!TextUtils.isEmpty(exterior_wear)){
                    Double wear = Double.valueOf(exterior_wear);
                    if (item.getTags_exterior().equals("崭新出厂") && wear<0.01){
                        view.setTextColor(getResources().getColor(R.color.red));
                    }else if (item.getTags_exterior().equals("略有磨损") && wear<0.09){
                        view.setTextColor(getResources().getColor(R.color.red));
                    }else if (item.getTags_exterior().equals("久经沙场") && wear<0.18){
                        view.setTextColor(getResources().getColor(R.color.red));
                    }else if (item.getTags_exterior().equals("破损不堪") && wear<0.39){
                        view.setTextColor(getResources().getColor(R.color.red));
                    }else if (item.getTags_exterior().equals("战痕累累") && wear<0.46) {
                        view.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        view.setTextColor(getResources().getColor(R.color.black));
                    }
                }else {
                    view.setTextColor(getResources().getColor(R.color.black));
                }
                helper.setText(R.id.tv_date, item.getTime());
                Glide.with(MainActivity.this).load("http:" + item.getIcon_url()).into((ImageView) helper.getView(R.id.iv_weapon));
            }
        };
        recyclerView.setAdapter(adapter);
    }

    private void setClickListener() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                service = new Intent(MainActivity.this, C5Service.class);
                startService(service);
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (service != null) {
                    stopService(service);
                    weapons.clear();
                    adapter.notifyDataSetChanged();
                }
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            Intent intent = new Intent(Intent.ACTION_MAIN, null);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}
