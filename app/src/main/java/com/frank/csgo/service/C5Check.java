package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5Weapon;
import com.frank.csgo.bean.IgxeWeapon;
import com.frank.csgo.utils.SendUtils;
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
            List<C5Weapon> weapons = response.body().getData().getList();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                double price = weapon.getPrice();
                String exterior_wear = weapon.getAssetInfo().getWear();
//                if (price <= minMoney) {
//                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
//                    list.add(weapon);
//                }else if (price <= value) {
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
//                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.C5_WEAPON);
                intent.putExtra(Constant.C5_WEAPON, list);
                SendUtils.sendBroadcast(mService,intent);
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
            C5 body = response.body();
            if (body == null) return;
            List<C5Weapon> weapons = body.getData().getList();
            int size = weapons.size();
            int max = size>=10?3:2;
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (int i=0;i<size;i++) {
                C5Weapon weapon = weapons.get(i);
                if (i>=max)break;
                double price = weapon.getPrice();
                String exterior_wear = weapon.getAssetInfo().getWear();
//                if (price <= minMoney) {
//                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
//                    list.add(weapon);
//                    break;
//                }else
////                    if (price <= value)
//                    {
                      if (!TextUtils.isEmpty(exterior_wear)) {
                            Double wear = Double.valueOf(exterior_wear);
                            if (wear <= w && wear!=0) {
                                weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                                list.add(weapon);
                                break;
                            }
                        else {
                                List<C5Weapon.AssetInfoBean.StickersBean> stickers = weapon.getAssetInfo().getStickers();
                                if (stickers != null&& stickers.size()==4){

                                    boolean isShow = true;
                                    for (C5Weapon.AssetInfoBean.StickersBean sticker : stickers) {
                                        boolean b = containSticke(sticker.getName());
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
//                        }
                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.C5_WEAPON);
                intent.putExtra(Constant.C5_WEAPON, list);
                SendUtils.sendBroadcast(mService,intent);
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
            List<C5Weapon> weapons = response.body().getData().getList();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                double price = weapon.getPrice();
                String exterior_wear = weapon.getAssetInfo().getWear();

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
                SendUtils.sendBroadcast(mService,intent);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected boolean containSticke(String title){
        if (!TextUtils.isEmpty(title)){
            if ((title.contains("全息") || title.contains("闪亮") || title.contains("金色"))&&!title.contains(("RMR"))){
                return true;
            }
        }
        return false;
    }

}
