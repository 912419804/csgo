package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.Buff;
import com.frank.csgo.bean.BuffWeapon;
import com.frank.csgo.utils.SendUtils;
import com.frank.csgo.utils.TimeUtil;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

public class BuffCheck {

    protected BuffService mService;

    public BuffCheck(BuffService mService) {
        this.mService = mService;
    }

    protected void handleDataForBuff(Response<Buff> response, int p, double w) {
        List<BuffWeapon> weapons = response.body().getData().getItems();
        ArrayList<BuffWeapon> list = new ArrayList<>();
        for (BuffWeapon weapon : weapons) {
            String unit_price = weapon.getPrice();
            double price = Double.valueOf(unit_price);
            if (price < p) {
                String exterior_wear = weapon.getAsset_info().getPaintwear();
                if (!TextUtils.isEmpty(exterior_wear)) {
                    Double wear = Double.valueOf(exterior_wear);
                    if (wear < w) {
                        weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                        list.add(weapon);
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            Intent intent = new Intent(Constant.BUFF_WEAPON);
            intent.putExtra(Constant.BUFF_WEAPON, list);
            SendUtils.sendBroadcast(mService,intent);
        }
    }
    protected void handleDataForBuff(Response<Buff> response, double[] res) {
        double p = res[0];
        double w = res[1];
        List<BuffWeapon> weapons = response.body().getData().getItems();
        int size = weapons.size();
        int max = size>10?5:3;
        ArrayList<BuffWeapon> list = new ArrayList<>();
        for (int i=0;i<size;i++) {
            if (i>=max)break;
            BuffWeapon weapon = weapons.get(i);
//            String unit_price = weapon.getPrice();
//            double price = Double.valueOf(unit_price);
//            if (price < p) {
                String exterior_wear = weapon.getAsset_info().getPaintwear();
                if (!TextUtils.isEmpty(exterior_wear)) {
                    Double wear = Double.valueOf(exterior_wear);
                    if (wear < w) {
                        weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                        list.add(weapon);
                        break;
                    }else {
                        BuffWeapon.AssetInfoBean.InfoBean info = weapon.getAsset_info().getInfo();
                        ArrayList<BuffWeapon.AssetInfoBean.StickersBean> stickers = info.getStickers();
                        if (stickers!=null&&stickers.size()==4){
                            boolean isShow = true;
                            for (BuffWeapon.AssetInfoBean.StickersBean sticker : stickers) {
                                boolean b = containSticke(sticker.getNameX());
                                if (!b){
                                    isShow = false;
                                    break;
                                }
                            }
                            if (isShow){
                                weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                                list.add(weapon);
                            }
                        }
                    }
                }
//            }
        }
        if (!list.isEmpty()) {
            Intent intent = new Intent(Constant.BUFF_WEAPON);
            intent.putExtra(Constant.BUFF_WEAPON, list);
            SendUtils.sendBroadcast(mService,intent);
        }
    }

    protected void fillBuff(Response<Buff> response, String name) {
        Buff buff = response.body();
        List<BuffWeapon> items = buff.getData().getItems();
        for (BuffWeapon item : items) {
            String exterior = "";
            if (name.contains("崭新")){
                exterior = Constant.ZXCC;
            }else if (name.contains("略磨")){
                exterior = Constant.LYMS;
            }else if(name.contains("久经")){
                exterior = Constant.JJSC;
            }else if (name.contains("破损")){
                exterior = Constant.PSBK;
            }else {
                exterior = Constant.ZHLL;
            }
            item.setTags_exterior(exterior);
            item.setName(name);
        }
    }

    protected boolean containSticke(String title){
        if (!TextUtils.isEmpty(title)){
            if (title.contains("全息") | title.contains("闪亮") || title.contains("金色")){
                return true;
            }
        }
        return false;
    }

}
