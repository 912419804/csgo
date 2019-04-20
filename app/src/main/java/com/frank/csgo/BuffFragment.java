package com.frank.csgo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.frank.csgo.bean.BuffWeapon;
import com.frank.csgo.utils.MediaUtils;

import java.util.ArrayList;
import java.util.List;


public class BuffFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private List<BuffWeapon> weapons = new ArrayList<>();
    private BaseQuickAdapter<BuffWeapon, BaseViewHolder> adapter;

    private Context mContex;

    public BuffFragment() { }

    public static BuffFragment newInstance(String param1, String param2) {
        BuffFragment fragment = new BuffFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_buff, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_list);
        setList();
        registerDataReceiver();
    }

    private void registerDataReceiver() {
        IntentFilter filter = new IntentFilter(Constant.BUFF_WEAPON);
        mContex.registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                try {
                    boolean isUpdate = false;
                    ArrayList<BuffWeapon> list = (ArrayList<BuffWeapon>) intent.getSerializableExtra(Constant.BUFF_WEAPON);
                    for (BuffWeapon w : list) {
                        if (!weapons.contains(w)) {
                            weapons.add(0, w);
                            isUpdate = true;
                        }
                    }
                    if (isUpdate) {
                        if (Constant.TYPE==1){
                            MediaUtils.playRing((Activity) mContex);
                            MediaUtils.vibrate((Activity) mContex, new long[]{100L, 200L, 300L, 400L}, -1);
                        }if (Constant.TYPE==2){
                            MediaUtils.playRing((Activity) mContex);
                        }else {
                            MediaUtils.vibrate((Activity) mContex, new long[]{100L, 200L, 300L, 400L}, -1);
                        }
                        adapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, filter);
    }

    private void setList() {
        LinearLayoutManager manager = new LinearLayoutManager(mContex);
        recyclerView.setLayoutManager(manager);
        adapter = new BaseQuickAdapter<BuffWeapon, BaseViewHolder>(R.layout.item_weapon, weapons) {
            @Override
            protected void convert(BaseViewHolder helper, BuffWeapon item) {
                helper.setText(R.id.tv_name, item.getName());
                helper.setText(R.id.tv_price, item.getPrice());
                String exterior_wear = item.getAsset_info().getPaintwear();
                helper.setText(R.id.tv_degree, exterior_wear);
                TextView view = helper.getView(R.id.tv_degree);
                if (!TextUtils.isEmpty(exterior_wear)) {
                    Double wear = Double.valueOf(exterior_wear);
                    if (item.getTags_exterior().equals("崭新出厂") && wear < 0.01) {
                        view.setTextColor(getResources().getColor(R.color.red));
                    } else if (item.getTags_exterior().equals("略有磨损") && wear < 0.09) {
                        view.setTextColor(getResources().getColor(R.color.red));
                    } else if (item.getTags_exterior().equals("久经沙场") && wear < 0.18) {
                        view.setTextColor(getResources().getColor(R.color.red));
                    } else if (item.getTags_exterior().equals("破损不堪") && wear < 0.39) {
                        view.setTextColor(getResources().getColor(R.color.red));
                    } else if (item.getTags_exterior().equals("战痕累累") && wear < 0.46) {
                        view.setTextColor(getResources().getColor(R.color.red));
                    } else {
                        view.setTextColor(getResources().getColor(R.color.black));
                    }
                } else {
                    view.setTextColor(getResources().getColor(R.color.black));
                }
                helper.setText(R.id.tv_date, item.getTime());
                Glide.with(mContex).load(item.getAsset_info().getInfo().getIcon_url()).into((ImageView) helper.getView(R.id.iv_weapon));
                ArrayList<BuffWeapon.AssetInfoBean.StickersBean> list = item.getAsset_info().getInfo().getStickers();
                if (list!=null && list.size()>0){
                    int size = list.size();
                    if (size == 1){
                        Glide.with(mContex).load(list.get(0).getImg_url()).into((ImageView) helper.getView(R.id.st_1));
                        Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_2));
                        Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_3));
                        Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_4));
                    }
                    if (size == 2){
                        Glide.with(mContex).load(list.get(0).getImg_url()).into((ImageView) helper.getView(R.id.st_1));
                        Glide.with(mContex).load(list.get(1).getImg_url()).into((ImageView) helper.getView(R.id.st_2));
                        Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_3));
                        Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_4));
                    }
                    if (size == 3){
                        Glide.with(mContex).load(list.get(0).getImg_url()).into((ImageView) helper.getView(R.id.st_1));
                        Glide.with(mContex).load(list.get(1).getImg_url()).into((ImageView) helper.getView(R.id.st_2));
                        Glide.with(mContex).load(list.get(2).getImg_url()).into((ImageView) helper.getView(R.id.st_3));
                        Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_4));
                    }
                    if (size == 4){
                        Glide.with(mContex).load(list.get(0).getImg_url()).into((ImageView) helper.getView(R.id.st_1));
                        Glide.with(mContex).load(list.get(1).getImg_url()).into((ImageView) helper.getView(R.id.st_2));
                        Glide.with(mContex).load(list.get(2).getImg_url()).into((ImageView) helper.getView(R.id.st_3));
                        Glide.with(mContex).load(list.get(3).getImg_url()).into((ImageView) helper.getView(R.id.st_4));
                    }
                }else {
                    Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_1));
                    Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_2));
                    Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_3));
                    Glide.with(mContex).load(R.drawable.bg_transparent).into((ImageView) helper.getView(R.id.st_4));
                }
            }
        };
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContex = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    public void clear() {
        this.weapons.clear();
        adapter.notifyDataSetChanged();
    }

}
