package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5Weapon;
import com.frank.csgo.bean.IgxeWeapon;
import com.frank.csgo.utils.TimeUtil;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

public class C5Check {

    protected C5Service mService;

    public C5Check(C5Service service) {
        this.mService = service;
    }

    protected void handleDataC5(Response<C5> response, int value, double w, int minMoney) {
        try {
            List<C5Weapon> weapons = response.body().getBody().getItems();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                String unit_price = weapon.getPrice();
                double price = Double.valueOf(unit_price);
                String exterior_wear = weapon.getWear();
                if (price <= minMoney) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    list.add(weapon);
                }else if (price <= value) {
                    if (!TextUtils.isEmpty(exterior_wear)) {
                        double wear = Double.valueOf(exterior_wear);
                        if (wear <= w && wear!=0) {
                            weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                            list.add(weapon);
                        }
//                        else {
//                            List<C5Weapon.StickerBean> stickers = weapon.getSticker();
//                            if (stickers != null && stickers.size() >= 3) {
//                                list.add(weapon);
//                            }
//                        }
                    }
                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.C5_WEAPON);
                intent.putExtra(Constant.C5_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    protected void handleDataC5(Response<C5> response, double[] res) {
        try {
            double value = res[0];
            double w     = res[1];
            double minMoney = res[2];
            C5.BodyBean body = response.body().getBody();
            if (body == null) return;
            List<C5Weapon> weapons = body.getItems();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                String unit_price = weapon.getPrice();
                double price = Double.valueOf(unit_price);
                String exterior_wear = weapon.getWear();
                if (price <= minMoney) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    list.add(weapon);
                    break;
                }else if (price <= value) {
                      if (!TextUtils.isEmpty(exterior_wear)) {
                            Double wear = Double.valueOf(exterior_wear);
                            if (wear <= w && wear!=0) {
                                weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                                list.add(weapon);
                                break;
                            }
                        else {
                            C5Weapon.GemBean gem = weapon.getGem();
                                List<String> images = gem.getImage();
                                if (gem.isHas_gem()&& images.size()==4){

                                    boolean isShow = true;
                                    for (String sticker : images) {
                                        boolean b = containSticke(sticker);
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
                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.C5_WEAPON);
                intent.putExtra(Constant.C5_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected  void handleDataC5(Response<C5> response, double[] res, boolean isMin) {
        try {
            double value = res[0];
            double w = res[1];
            double minMoney = res[2];
            List<C5Weapon> weapons = response.body().getBody().getItems();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                String unit_price = weapon.getPrice();
                double price = Double.valueOf(unit_price);
                String exterior_wear = weapon.getWear();

                    if (price <= minMoney) {
                        weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                        list.add(weapon);
                    }
                    if (isMin) continue;
                    if (price <= value) {
                        if (!TextUtils.isEmpty(exterior_wear)) {
                            Double wear = Double.valueOf(exterior_wear);
                            if (wear <= w) {
                                weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                                list.add(weapon);
                            }
//                        else {
//                            List<C5Weapon.StickerBean> stickers = weapon.getSticker();
//                            if (stickers != null && stickers.size() >= 3) {
//                                list.add(weapon);
//                            }
//                        }
                        }
                    }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.C5_WEAPON);
                intent.putExtra(Constant.C5_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected boolean containSticke(String title){
        if (!TextUtils.isEmpty(title)){
            if (title.contains("holo") | title.contains("foil") || title.contains("gold")){
                return true;
            }
        }
        return false;
    }

}
