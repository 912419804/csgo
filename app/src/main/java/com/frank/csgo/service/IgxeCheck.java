package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.Igxe;
import com.frank.csgo.bean.IgxeWeapon;
import com.frank.csgo.utils.TimeUtil;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

public class IgxeCheck {
    protected IgxeService mService;

    public IgxeCheck(IgxeService service) {
        this.mService = service;
    }

    protected void handleDataIgxe(Response<Igxe> response, int value, double w, int minMoney) {
        try {
            List<IgxeWeapon> weapons = response.body().getD_list();
            ArrayList<IgxeWeapon> list = new ArrayList<>();
            for (IgxeWeapon weapon : weapons) {
                String unit_price = weapon.getUnit_price();
                double price = Double.valueOf(unit_price);
                if (price <= value) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    if (price <= minMoney) {
                        list.add(weapon);
                    } else {
                        String exterior_wear = weapon.getExterior_wear();
                        if (!TextUtils.isEmpty(exterior_wear)) {
                            Double wear = Double.valueOf(exterior_wear);
                            if (wear <= w) {
                                list.add(weapon);
                            }
//                        else {
//                            List<IgxeWeapon.StickerBean> stickers = weapon.getSticker();
//                            if (stickers != null && stickers.size() >= 3) {
//                                list.add(weapon);
//                            }
//                        }
                        }
                    }
                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.IGXE_WEAPON);
                intent.putExtra(Constant.IGXE_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){

        }

    }
    protected void handleDataIgxe(Response<Igxe> response, double[] res) {
        try {
            double value = res[0];
            double w     = res[1];
            double minMoney = res[2];
            List<IgxeWeapon> weapons = response.body().getD_list();
            ArrayList<IgxeWeapon> list = new ArrayList<>();
            for (IgxeWeapon weapon : weapons) {
                String unit_price = weapon.getUnit_price();
                double price = Double.valueOf(unit_price);
                if (price <= value) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    if (price <= minMoney) {
                        list.add(weapon);
                    } else {
                        String exterior_wear = weapon.getExterior_wear();
                        if (!TextUtils.isEmpty(exterior_wear)) {
                            Double wear = Double.valueOf(exterior_wear);
                            if (wear <= w) {
                                list.add(weapon);
                            }
//                        else {
//                            List<IgxeWeapon.StickerBean> stickers = weapon.getSticker();
//                            if (stickers != null && stickers.size() >= 3) {
//                                list.add(weapon);
//                            }
//                        }
                        }
                    }
                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.IGXE_WEAPON);
                intent.putExtra(Constant.IGXE_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){

        }

    }

    protected void handleDataIgxe(Response<Igxe> response, double[] res,boolean isMin) {
        try {
            double value = res[0];
            double w = res[1];
            double minMoney = res[2];
            List<IgxeWeapon> weapons = response.body().getD_list();
            ArrayList<IgxeWeapon> list = new ArrayList<>();
            for (IgxeWeapon weapon : weapons) {
                String unit_price = weapon.getUnit_price();
                double price = Double.valueOf(unit_price);
                if (isMin){

                }else {
                    if (price <= value) {
                        weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                        if (price <= minMoney) {
                            list.add(weapon);
                        } else {
                            String exterior_wear = weapon.getExterior_wear();
                            if (!TextUtils.isEmpty(exterior_wear)) {
                                Double wear = Double.valueOf(exterior_wear);
                                if (wear <= w) {
                                    list.add(weapon);
                                }
//                        else {
//                            List<IgxeWeapon.StickerBean> stickers = weapon.getSticker();
//                            if (stickers != null && stickers.size() >= 3) {
//                                list.add(weapon);
//                            }
//                        }
                            }
                        }
                    }
                }

            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.IGXE_WEAPON);
                intent.putExtra(Constant.IGXE_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){

        }

    }
}