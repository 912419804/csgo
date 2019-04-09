package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5Weapon;
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
 * @createTime 创建时间： 2019/2/14 14:16
 * 类说明：
 */
public class C5Gloves {

    private CatchService mService;

    public C5Gloves(CatchService service) {
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

    // 血猎手套（★） | 焦炭 (略有磨损)
    public void connect1100() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553391349&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1900, 0.11, 1600);
                        connect1101();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1101();
                    }
                });
    }

    // 血猎手套（★） | 焦炭 (久经沙场)
    private void connect1101() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380561&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 950, 0.20, 850);
                        connect1102();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1102();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (略有磨损)
    private void connect1102() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553404048&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1750, 0.10, 1500);
                        connect1103();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1103();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (久经沙场)
    private void connect1103() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380786&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 920, 0.19, 750);
                        connect1104();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1104();
                    }
                });
    }

    // 血猎手套（★） | 染铜 (略有磨损)
    private void connect1104() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553392871&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.10, 1100);
                        connect1105();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1105();
                    }
                });
    }

    // 血猎手套（★） | 染铜 (久经沙场)
    private void connect1105() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381094&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.18, 700);
                        connect1106();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1106();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (略有磨损)
    private void connect1106() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553379525&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1350, 0.10, 1100);
                        connect1107();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1107();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (久经沙场)
    private void connect1107() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=529369193&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.18, 720);
                        connect1108();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1108();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (久经沙场)
    private void connect1108() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381164&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1900, 0.25, 1500);
                        connect1109();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1109();
                    }
                });
    }

    // 驾驶手套（★） | 紫蓝格子 (久经沙场)
    private void connect1109() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446784&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1900, 0.22, 1500);
                        connect1110();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1110();
                    }
                });
    }

    // 驾驶手套（★） | 王蛇 (久经沙场)
    private void connect1110() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446249&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1600, 0.20, 1300);
                        connect1111();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1111();
                    }
                });
    }

    // 驾驶手套（★） | 月色织物 (略有磨损)
    private void connect1111() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401455&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1600, 0.10, 1300);
                        connect1112();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1112();
                    }
                });
    }

    //  驾驶手套（★） | 月色织物 (久经沙场)
    private void connect1112() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553383483&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.23, 620);
                        connect1113();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1113();
                    }
                });
    }

    //  驾驶手套（★） | 超越 (略有磨损)
    private void connect1113() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553447258&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.09, 1300);
                        connect1114();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1114();
                    }
                });
    }

    //  驾驶手套（★） | 超越 (久经沙场)
    private void connect1114() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446584&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 850, 0.20, 680);
                        connect1115();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1115();
                    }
                });
    }

    //  驾驶手套（★） | 菱背蛇纹 (略有磨损)
    private void connect1115() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402412&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.09, 800);
                        connect1116();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1116();
                    }
                });
    }

    //  驾驶手套（★） | 护卫 (略有磨损)
    private void connect1116() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=325679735&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 800, 0.08, 600);
                        connect1117();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1117();
                    }
                });
    }

    //  驾驶手套（★） | 墨绿色调(略有磨损)
    private void connect1117() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446583&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.08, 600);
                        connect1118();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1118();
                    }
                });
    }

    //  裹手（★） | 钴蓝骷髅 (久经沙场)
    private void connect1118() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446629&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2500, 0.25, 2000);
                        connect1119();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1119();
                    }
                });
    }

    //  裹手（★） | 屠夫 (略有磨损)
    private void connect1119() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402166&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2500, 0.10, 1950);
                        connect1120();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1120();
                    }
                });
    }

    //  裹手（★） | 屠夫 (久经沙场)
    private void connect1120() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401394&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.20, 1200);
                        connect1121();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1121();
                    }
                });
    }

    //  裹手（★） | 恶土 (略有磨损)
    private void connect1121() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553390271&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1440, 0.10, 1100);
                        connect1122();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1122();
                    }
                });
    }

    //  裹手（★） | 恶土 (久经沙场)
    private void connect1122() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401795&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 930, 0.18, 800);
                        connect1123();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1123();
                    }
                });
    }

    //  裹手（★） | 皮革 (略有磨损)
    private void connect1123() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553397160&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1350, 0.10, 1100);
                        connect1124();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1124();
                    }
                });
    }

    //  裹手（★） | 皮革 (久经沙场)
    private void connect1124() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=503511490&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 800, 0.20, 680);
                        connect1125();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1125();
                    }
                });
    }

    //  裹手（★） | 森林色调 (略有磨损)
    private void connect1125() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446557&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1200, 0.10, 1000);
                        connect1126();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1126();
                    }
                });
    }

    //  裹手（★） | 森林色调 (久经沙场)
    private void connect1126() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446363&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.22, 640);
                        connect1127();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1127();
                    }
                });
    }

    //  裹手（★） | 云杉DDPAT(略有磨损)
    private void connect1127() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553379531&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 950, 0.09, 800);
                        connect1128();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1128();
                    }
                });
    }

    //  摩托手套（★） | 薄荷 (久经沙场)
    private void connect1128() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553391476&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2550, 0.25, 2400);
                        connect1129();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1129();
                    }
                });
    }

    //  摩托手套（★） | 清凉薄荷 (略有磨损)
    private void connect1129() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553390569&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2800, 0.12, 2400);
                        connect1130();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1130();
                    }
                });
    }

    //  摩托手套（★） | 清凉薄荷 (久经沙场)
    private void connect1130() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381913&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.25, 1100);
                        connect1131();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1131();
                    }
                });
    }

    //  摩托手套（★） | *嘣！* (略有磨损)
    private void connect1131() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382356&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2200, 0.09, 1800);
                        connect1132();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1132();
                    }
                });
    }

    //  摩托手套（★） | *嘣！* (久经沙场)
    private void connect1132() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566443")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1050, 0.25, 800);
                        connect1134();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1134();
                    }
                });
    }

    //  摩托手套（★） | 嘭！ (久经沙场)
    private void connect1133() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610808")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1800, 0.25, 1500);
                        connect1134();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1134();
                    }
                });
    }

    //  摩托手套（★） | 交运 (略有磨损)
    private void connect1134() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446760&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.08, 1150);
                        connect1135();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1135();
                    }
                });
    }

    //  摩托手套（★） | 交运 (久经沙场)
    private void connect1135() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446278&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 780, 0.18, 600);
                        connect1136();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1136();
                    }
                });
    }

    //  摩托手套（★） | 多边形 (久经沙场)
    private void connect1136() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445898&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.20, 1300);
                        connect1137();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1137();
                    }
                });
    }

    //  摩托手套（★） | 玳瑁 (久经沙场)
    private void connect1137() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446598&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1450, 0.25, 1200);
                        connect1138();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1138();
                    }
                });
    }

    //  摩托手套（★） | 日蚀 (略有磨损)
    private void connect1138() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402777&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1900, 0.11, 1500);
                        connect1139();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1139();
                    }
                });
    }

    //  摩托手套（★） | 日蚀 (久经沙场)
    private void connect1139() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380487&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.25, 750);
                        connect1140();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1140();
                    }
                });
    }
    //  专业手套（★） | 深红和服 (久经沙场)
    private void connect1140() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381074&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 3400, 0.22, 2400);
                        connect1141();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1141();
                    }
                });
    }
    //  专业手套（★） | 深红之网 (略有磨损)
    private void connect1141() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553448127&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 3800, 0.12, 3000);
                        connect1142();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1142();
                    }
                });
    }
    //  专业手套（★） | 深红之网 (久经沙场)
    private void connect1142() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446851&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.17, 1350);
                        connect1143();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1143();
                    }
                });
    }
    //  专业手套（★） | 大腕 (略有磨损)
    private void connect1143() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610677")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2700, 0.11, 2300);
                        connect1144();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1144();
                    }
                });
    }
    //  专业手套（★） | 大腕 (久经沙场)
    private void connect1144() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446071&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.17, 1200);
                        connect1145();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1145();
                    }
                });
    }
    //  专业手套（★） | 元勋 (略有磨损)
    private void connect1145() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553394969&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2900, 0.10, 2300);
                        connect1146();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1146();
                    }
                });
    }
    //  专业手套（★） | 元勋 (久经沙场)
    private void connect1146() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=501540030&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.20, 1000);
                        connect1147();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1147();
                    }
                });
    }
    //  专业手套（★） | 渐变之色 (久经沙场)
    private void connect1147() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446680&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2600, 0.20, 1800);
                        connect1148();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1148();
                    }
                });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1148() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566199")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1800, 0.18, 1400);
                        connect1149();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1149();
                    }
                });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1149() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380463&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1800, 0.18, 1400);
                        connect1150();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1150();
                    }
                });
    }
    //  专业手套（★） | 狩鹿(略有磨损)
    private void connect1150() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446816&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.11, 700);
                        connect1151();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1151();
                    }
                });
    }
    //  专业手套（★） | 狩鹿(久经沙场)
    private void connect1151() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446556&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 620, 0.17, 500);
                        connect1152();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1152();
                    }
                });
    }
    //  专业手套（★） | 森林 DDPAT (略有磨损)
    private void connect1152() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553396165&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.10, 750);
                        connect1153();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1153();
                    }
                });
    }
    //  专业手套（★） | 森林 DDPAT (久经沙场)
    private void connect1153() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380209&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 600, 0.17, 500);
                        connect1154();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1154();
                    }
                });
    }
    //  运动手套（★） | 潘多拉之盒(久经沙场)
    private void connect1154() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=496333498&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 5000, 0.22, 3900);
                        connect1155();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1155();
                    }
                });
    }
    //  运动手套（★） | 迈阿密风云(久经沙场)
    private void connect1155() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445829&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 4000, 0.22, 3400);
                        connect1156();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1156();
                    }
                });
    }
    //  运动手套（★） | 超导体(久经沙场)
    private void connect1156() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553392507&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2600, 0.18, 2000);
                        connect1157();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1157();
                    }
                });
    }
    //  运动手套（★） | 树篱迷宫(久经沙场)
    private void connect1157() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=529677218&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2400, 0.20, 2000);
                        connect1158();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1158();
                    }
                });
    }
    //  运动手套（★） | 双栖(久经沙场)
    private void connect1158() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446498&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2400, 0.20, 2000);
                        connect1159();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1159();
                    }
                });
    }
    //  运动手套（★） | 欧米伽(久经沙场)
    private void connect1159() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446431&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2200, 0.20, 1700);
                        connect1160();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1160();
                    }
                });
    }
    // 九头蛇手套（★） | 表面淬火(略有磨损)
    private void connect1160() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553447331&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1800, 0.09, 1300);
                        connect1161();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1161();
                    }
                });
    }
    // 九头蛇手套（★） | 表面淬火(久经沙场)
    private void connect1161() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446561&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1020, 0.20, 800);
                        connect1162();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1162();
                    }
                });
    }
    // 九头蛇手套（★） | 翡翠色调(略有磨损)
    private void connect1162() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446648&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1500, 0.10, 1100);
                        connect1163();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1163();
                    }
                });
    }
    // 九头蛇手套（★） | 翡翠色调(久经沙场)
    private void connect1163() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446372&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.17, 740);
                        connect1164();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1164();
                    }
                });
    }
    // 九头蛇手套（★） | 响尾蛇(略有磨损)
    private void connect1164() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446123&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1200, 0.10, 1000);
                        connect1165();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1165();
                    }
                });
    }
    // 九头蛇手套（★） | 响尾蛇(久经沙场)
    private void connect1165() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446295&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 800, 0.17, 650);
                        connect1166();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1166();
                    }
                });
    }
    // 九头蛇手套（★） | 红树林(略有磨损)
    private void connect1166() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446701&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.09, 700);
                    }

                    @Override
                    public void onError(Response<C5> response) {

                    }
                });
    }
    // 九头蛇手套（★） | 红树林(久经沙场)
    private void connect1167() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446745&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.16, 600);
                    }

                    @Override
                    public void onError(Response<C5> response) {
                    }
                });
    }
}