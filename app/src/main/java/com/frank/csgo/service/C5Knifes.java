package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5Weapon;
import com.frank.csgo.https.JsonCallback;
import com.frank.csgo.utils.TimeUtil;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/15 15:32
 * 类说明：
 */
public class C5Knifes {

    private C5Service mService;

    public C5Knifes(C5Service service) {
        this.mService = service;
    }

    private void handleDataC5(Response<C5> response, int i) {
        try {
            List<C5Weapon> weapons = response.body().getBody().getItems();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                String unit_price = weapon.getPrice();
                double price = Double.valueOf(unit_price);
                if (price <= i) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    String exterior_wear = weapon.getWear();
                    if (!TextUtils.isEmpty(exterior_wear)) {
                        Double wear = Double.valueOf(exterior_wear);
                        String name = weapon.getName();
                        if (name.equals("崭新出厂") && wear < 0.03) {
                            list.add(weapon);
                        } else if (name.equals("略有磨损") && wear < 0.09) {
                            list.add(weapon);
                        } else if (name.equals("久经沙场") && wear < 0.26) {
                            list.add(weapon);
                        } else if (name.equals("破损不堪") && wear < 0.39) {
                            list.add(weapon);
                        } else if (name.equals("战痕累累") && wear < 0.46) {
                            list.add(weapon);
                        } else {
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

        }

    }

    private void handleDataC52(Response<C5> response, int value, double w) {
        List<C5Weapon> weapons = response.body().getBody().getItems();
        ArrayList<C5Weapon> list = new ArrayList<>();
        for (C5Weapon weapon : weapons) {
            String unit_price = weapon.getPrice();
            double price = Double.valueOf(unit_price);
            if (price <= value) {
                weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                String exterior_wear = weapon.getWear();
                if (!TextUtils.isEmpty(exterior_wear)) {
                    Double wear = Double.valueOf(exterior_wear);
                    if (wear <= w) {
                        list.add(weapon);
                    }
                }

            }
        }
        if (!list.isEmpty()) {
            Intent intent = new Intent(Constant.C5_WEAPON);
            intent.putExtra(Constant.C5_WEAPON, list);
            mService.sendBroadcast(intent);
        }
    }

    private void handleDataC53(Response<C5> response, int value, double w, int minMoney) {
        try {
            List<C5Weapon> weapons = response.body().getBody().getItems();
            ArrayList<C5Weapon> list = new ArrayList<>();
            for (C5Weapon weapon : weapons) {
                String unit_price = weapon.getPrice();
                double price = Double.valueOf(unit_price);
                String exterior_wear = weapon.getWear();
                Double wear_ = Double.valueOf(exterior_wear);
                if (price <= value) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    if (price <= minMoney) {
                        list.add(weapon);
                    } else {
                        if (!TextUtils.isEmpty(exterior_wear) && wear_>0) {
                            Double wear = Double.valueOf(exterior_wear);
                            if (wear <= w) {
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

    // 折叠刀（★） | 深红之网 (略有磨损)
    public void connect1200() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=480376426&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.10, 1200);
                        connect1201();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1201();
                    }
                });
    }

    // 折叠刀（★） | 深红之网 (久经沙场)
    private void connect1201() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=972111&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.20, 600);
                        connect1204();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1204();
                    }
                });
    }

    // 折叠刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1202() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/96501")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.09, 600);
                        connect1203();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1203();
                    }
                });
    }

    // 折叠刀（★） | 传说 (崭新出厂)
    private void connect1203() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382789&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.03, 1500);
                        connect1204();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1204();
                    }
                });
    }

    // 折叠刀（★） | 传说 (久经沙场)
    private void connect1204() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=518937661&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 890, 0.20, 800);
                        connect1205();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1205();
                    }
                });
    }

    //   折叠刀（★） | 自动化 (略有磨损)
    private void connect1205() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=477808589&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 840, 0.09, 770);
                        connect1206();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1206();
                    }
                });
    }

    //   折叠刀（★） | 自动化 (久经沙场)
    private void connect1206() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=294552088&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.16, 610);
                        connect1207();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1207();
                    }
                });
    }

    //   折叠刀（★） | 虎牙 (崭新出厂)
    private void connect1207() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2945242&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 860, 0.003, 750);
                        connect1211();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1211();
                    }
                });
    }

    //   刺刀（★） | 传说 (久经沙场)
    private void connect1211() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=351375199&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.18, 1200);
                        connect1212();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1212();
                    }
                });
    }

    //   刺刀（★） | 自动化 (久经沙场)
    private void connect1212() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=471717855&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1199, 0.17, 1100);
                        connect1213();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1213();
                    }
                });
    }

    //   刺刀（★） | 自动化 (略有磨损)
    private void connect1213() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553398680&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1450, 0.08, 1350);
                        connect1214();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1214();
                    }
                });
    }

    //   刺刀（★） | 深红之网 (略有磨损)
    private void connect1214() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=487176191&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.09, 1100);
                        connect1215();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1215();
                    }
                });
    }

    //   刺刀（★） | 深红之网 (久经沙场)
    private void connect1215() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3014522&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 720, 0.18, 600);
                        connect1216();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1216();
                    }
                });
    }

    //   刺刀（★） | 多普勒 (崭新出厂)
    private void connect1216() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2885392&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1100, 0.01, 1000);
                        connect1217();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1217();
                    }
                });
    }

    //   刺刀（★） | 虎牙 (崭新出厂)
    private void connect1217() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2930929&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1200, 0.01, 1050);
                        connect1221();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1221();
                    }
                });
    }

    //    "M9 刺刀（★） | 虎牙 (崭新出厂)",
    private void connect1221() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=127160242&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.01, 1300);
                        connect1222();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1222();
                    }
                });
    }

    //   M9 刺刀（★） | 自动化 (久经沙场)
    private void connect1222() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=159462719&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1600, 0.17, 1400);
                        connect1223();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1223();
                    }
                });
    }


    //   M9 刺刀（★） | 多普勒 (崭新出厂)
    private void connect1223() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2901193&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1380, 0.01, 1300);
                        connect1224();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1224();
                    }
                });
    }

    //   M9 刺刀（★） | 传说 (久经沙场)
    private void connect1224() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=311508029&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.19, 1600);
                        connect1225();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1225();
                    }
                });
    }

    //   M9 刺刀（★） | 深红之网 (略有磨损)
    private void connect1225() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3225445&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2600, 0.12, 2300);
                        connect1226();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1226();
                    }
                });
    }

    //   M9 刺刀（★） | 深红之网 (久经沙场)
    private void connect1226() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=5212068&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1100, 0.22, 900);
                        connect1227();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1227();
                    }
                });
    }

    //   M9 刺刀（★） | 北方森林 (久经沙场)
    private void connect1227() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=93541089&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 580, 0.16, 500);
                        connect1231();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1231();
                    }
                });
    }

    //   蝴蝶刀（★）
    private void connect1231() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022906&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1450, 0.10, 1350);
                        connect1232();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1232();
                    }
                });
    }

    //   蝴蝶刀（★） | 深红之网 (久经沙场)
    private void connect1232() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=972030&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.18, 1220);
                        connect1233();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1233();
                    }
                });
    }

    //   蝴蝶刀（★） | 北方森林 (略有磨损)
    private void connect1233() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=171101981&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.09, 800);
                        connect1234();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1234();
                    }
                });
    }

    //   蝴蝶刀（★） | 北方森林 (久经沙场)
    private void connect1234() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3681179&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 770, 0.17, 700);
                        connect1235();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1235();
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (略有磨损)
    private void connect1235() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=54290774&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.09, 1200);
                        connect1236();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1236();
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (久经沙场)
    private void connect1236() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=89492705&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 950, 0.18, 800);
                        connect1237();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1237();
                    }
                });
    }

    //   蝴蝶刀（★） | 森林DDPAT (略有磨损)
    private void connect1237() {
        OkGo.<C5>get("ttps://www.c5game.com/api/product/sale.json?id=244594411&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.09, 750);
                        connect1240();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1240();
                    }
                });
    }

    //爪子刀 无涂装
    private void connect1240() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022898&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1360, 0.10, 1200);
                        connect1241();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1241();
                    }
                });
    }

    //爪子刀（★） | 自动化 (久经沙场)
    private void connect1241() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=506556951&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2150, 0.19, 1900);
                        connect1242();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1242();
                    }
                });
    }

    //爪子刀（★） | 虎牙 (崭新出厂)
    private void connect1242() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=246308426&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.005, 1700);
                        connect1243();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1243();
                    }
                });
    }

    //爪子刀（★） | 传说 (久经沙场)
    private void connect1243() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=338927257&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.19, 1700);
                        connect1244();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1244();
                    }
                });
    }

    //爪子刀（★） | 深红之网 (久经沙场)
    private void connect1244() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2920515&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1480, 0.19, 1300);
                        connect1245();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1245();
                    }
                });
    }

    //爪子刀（★） | 森林 DDPAT (略有磨损)
    private void connect1245() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=468576806&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.09, 700);
                        connect1246();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1246();
                    }
                });
    }

    //爪子刀（★） | 森林 DDPAT (久经沙场)
    private void connect1246() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3014987&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 730, 0.16, 600);
                        connect1247();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1247();
                    }
                });
    }

    //爪子刀（★） | 北方森林 (略有磨损)
    private void connect1247() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=326791947&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.09, 700);
                        connect1248();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1248();
                    }
                });
    }

    //爪子刀（★） | 北方森林 (久经沙场)
    private void connect1248() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=293012667&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.17, 600);
                        connect1250();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1250();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变大理石 (崭新出厂)
    private void connect1250() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553388741&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1050, 0.01, 950);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 多普勒 (崭新出厂)
    private void connect1251() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571856")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 950, 0.01, 900);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 多普勒 (崭新出厂)
    private void connect1252() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571856")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1050, 0.01, 900);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 深红之网 (略有磨损)
    private void connect1253() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/87786")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.11, 850);
                        connect1254();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1254();
                    }
                });
    }

    //猎杀者匕首（★） | 深红之网 (久经沙场)
    private void connect1254() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=514865097&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 620, 0.20, 500);
                        connect1256();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1256();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变之色 (崭新出厂)
    private void connect1255() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/15680")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 620, 0.01, 500);
                        connect1256();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1256();
                    }
                });
    }

    //猎杀者匕首（★） | 虎牙 (崭新出厂)
    private void connect1256() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553386012&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 820, 0.004, 740);
                        connect1257();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1257();
                    }
                });
    }

    //猎杀者匕首（★）
    private void connect1257() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2673583&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 550, 0.16, 500);
                        connect1260();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1260();
                    }
                });
    }

    //熊刀（★） | 深红之网 (久经沙场)
    private void connect1260() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458241&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1550, 0.20, 1300);
                        connect1261();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1261();
                    }
                });
    }

    //熊刀（★）
    private void connect1261() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457790&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        connect1272();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1272();
                    }
                });
    }

    //鲍伊猎刀（★） | 多普勒 (崭新出厂)
    private void connect1271() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571703")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.01, 900);
                        connect1272();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1272();
                    }
                });
    }

    //鲍伊猎刀（★） | 深红之网 (略有磨损)
    private void connect1272() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=510782880&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1300, 0.10, 1050);
                        connect1273();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1273();
                    }
                });
    }

    //鲍伊猎刀（★） | 深红之网 (久经沙场)
    private void connect1273() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=314118995&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 770, 0.19, 600);
                        connect1277();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1277();
                    }
                });
    }

    //鲍伊猎刀（★） | 虎牙 (崭新出厂)
    private void connect1274() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553394968&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 850, 0.01, 750);
                        connect1277();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1277();
                    }
                });
    }

    //弯刀（★） | 多普勒 (崭新出厂)
    private void connect1275() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571789")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.01, 800);
                        connect1276();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1276();
                    }
                });
    }

    //弯刀（★） | 渐变大理石 (崭新出厂)
    private void connect1276() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571713")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.01, 800);
                        connect1280();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1280();
                    }
                });
    }

    //弯刀（★） | 虎牙 (崭新出厂)
    private void connect1277() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401287&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 730, 0.003, 610);
                        connect1280();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1280();
                    }
                });
    }

    //弯刀（★） | 深红之网 (略有磨损)
    private void connect1278() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=198782556&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 800, 0.11, 600);
                        connect1279();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1279();
                    }
                });
    }

    //弯刀（★） | 深红之网 (久经沙场)
    private void connect1279() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022903&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 520, 0.17, 400);
                        connect1280();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1280();
                    }
                });
    }

    //穿肠刀（★） | 自动化 (略有磨损)
    private void connect1280() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382627&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.08, 600);
                        connect1281();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1281();
                    }
                });
    }

    //穿肠刀（★） | 自动化 (久经沙场)
    private void connect1281() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=298382699&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 600, 0.17, 500);
                        connect1283();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1283();
                    }
                });
    }

    //穿肠刀（★） | 伽玛多普勒 (崭新出厂)
    private void connect1282() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555181")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 620, 0.01, 500);
                        connect1283();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1283();
                    }
                });
    }

    //穿肠刀（★） | 虎牙 (崭新出厂)
    private void connect1283() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=56773232&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.003, 400);
                        connect1284();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1284();
                    }
                });
    }

    //穿肠刀（★） | 传说 (崭新出厂)
    private void connect1284() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380750&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1200, 0.02, 1020);
                        connect1285();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1285();
                    }
                });
    }

    //穿肠刀（★） | 传说 (略有磨损)
    private void connect1285() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=518944581&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 830, 0.08, 760);
                        connect1286();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1286();
                    }
                });
    }

    //穿肠刀（★） | 传说 (久经沙场)
    private void connect1286() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=261411545&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 600, 0.17, 500);
                        connect1287();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1287();
                    }
                });
    }

    //穿肠刀（★） | 深红之网 (略有磨损)
    private void connect1287() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3015014&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 550, 0.09, 450);
                        connect1289();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1289();
                    }
                });
    }

    //穿肠刀（★） | 深红之网 (久经沙场)
    private void connect1288() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/19646")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 400, 0.17, 300);
                        connect1289();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1289();
                    }
                });
    }

    //暗影双匕（★） | 渐变之色 (崭新出厂)
    private void connect1289() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=95254849&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 605, 0.01, 500);
                        connect1291();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1291();
                    }
                });
    }

    //暗影双匕（★） | 多普勒 (崭新出厂)
    private void connect1290() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571915")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 610, 0.01, 500);
                        connect1292();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1292();
                    }
                });
    }

    //暗影双匕（★） | 虎牙 (崭新出厂)
    private void connect1291() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553397036&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 550, 0.003, 500);
                        connect1292();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1292();
                    }
                });
    }

    //短剑（★） | 深红之网 (略有磨损)
    private void connect1292() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458872&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1700, 0.08, 1200);
                        connect1293();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1293();
                    }
                });
    }

    //短剑（★） | 深红之网 (久经沙场)
    private void connect1293() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458084&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 950, 0.18, 640);
                        connect1295();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1295();
                    }
                });
    }

    //锯齿爪刀（★）
    private void connect1294() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/615682")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1800, 0.10, 1600);
                        connect1295();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1295();
                    }
                });
    }

    //锯齿爪刀（★）|深红之网 (久经沙场)
    private void connect1295() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458275&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1600, 0.10, 1380);
                        mService.c5Gloves.connect1100();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        mService.c5Gloves.connect1100();
                    }
                });
    }


}