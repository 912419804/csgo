package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5Weapon;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5;
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
public class C5Guns {

    private C5Service mService;

    public C5Guns(C5Service service) {
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
                            if (wear <= w && wear!=0) {
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

    //awp 二西莫夫 久经
    public void connect() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=450860&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 250, 0.25, 200);
                        connect2();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect2();
                    }
                });
    }

    //    M4A4 | 二西莫夫 久经
    private void connect2() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2640100&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 350, 0.27, 300);
                        connect4();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect4();
                    }
                });
    }


    //AK-47 | 血腥运动 (崭新出厂)
    private void connect4() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553389296&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 280, 0.02, 230);
                        connect9();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect9();
                    }
                });
    }


    //    "折叠刀（★） | 渐变大理石 (崭新出厂)
    private void connect6() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/7798?page_no=1&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=7798&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.01, 900);
                        connect13();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect13();
                    }
                });
    }


    //   折叠刀（★）
    private void connect9() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/3817")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 400);
                        connect13();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect13();
                    }
                });
    }


    //   M4A4 | 喧嚣杀戮 (崭新出厂)
    private void connect13() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=488231038&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 170, 0.02, 110);
                        connect14();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect14();
                    }
                });
    }

    //   M4A4 | 龙王 (崭新出厂)
    private void connect14() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3344373&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 90, 0.03, 75);
                        connect15();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect15();
                    }
                });
    }

    //   AK-47 | 燃料喷射器 (略有磨损)
    private void connect15() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2910560&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 270, 0.09, 240);
                        connect15_1();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect15_1();
                    }
                });
    }

    //   AK-47 | 燃料喷射器 (崭新出厂)
    private void connect15_1() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022897&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.04, 450);
                        connect17();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect17();
                    }
                });
    }

    //   AK-47 | 表面淬火 (略有磨损)
    private void connect16() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/6437?page_no=1&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=6437&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 170, 0.08, 150);
                        connect17();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect17();
                    }
                });
    }

    //   沙漠之鹰 | 炽烈之炎 (崭新出厂)
    private void connect17() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2991442&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 600, 0.01, 520);
                        connect18();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect18();
                    }
                });
    }

    //   AWP（StatTrak™） | 二西莫夫 (久经沙场)
    private void connect18() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2821576&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 650, 0.25, 550);
                        connect21();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect21();
                    }
                });
    }

    //   AWP（StatTrak™） | 二西莫夫 (破损不堪)
    private void connect19() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/49366")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 380, 0.38, 320);
                        connect20();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect20();
                    }
                });
    }

    //   USP 消音版 | 枪响人亡 (略有磨损)
    private void connect20() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=1040270&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 240, 0.09, 200);
                        connect21();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect21();
                    }
                });
    }

    //   USP 消音版 | 枪响人亡 (崭新出厂)
    private void connect21() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=166004563&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 450, 0.03, 380);
                        connect27();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect27();
                    }
                });
    }


    //   AK-47 | 红线 (略有磨损)
    private void connect27() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3344374&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 210, 0.11, 150);
                        connect28();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect28();
                    }
                });
    }

    //   AWP | 红线 (略有磨损)
    private void connect28() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3925612&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 110, 0.12, 80);
                        connect29();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect29();
                    }
                });
    }

    //   AWP | 鬼退治 (崭新出厂)
    private void connect29() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553395929&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 360, 0.02, 290);
                        connect31();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect31();
                    }
                });
    }

    //   AWP | 暴怒野兽 (久经沙场)
    private void connect30() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4337")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 120, 0.16, 100);
                        connect31();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect31();
                    }
                });
    }

    //   AWP | 暴怒野兽 (略有磨损)
    private void connect31() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=108436&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 190, 0.08, 130);
                        connect32();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect32();
                    }
                });
    }

    //   AWP | 暴怒野兽 (崭新出厂)
    private void connect32() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=74940165&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 270, 0.03, 200);
                        connect33();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect33();
                    }
                });
    }

    //  M4A1 消音版 | 暴怒野兽 (略有磨损)
    private void connect33() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=450898&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 80, 0.08, 60);
                        connect34();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect34();
                    }
                });
    }

    //  M4A1 消音版 | 暴怒野兽 (崭新出厂)
    private void connect34() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=62794001&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.01, 190);
                        connect35();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect35();
                    }
                });
    }

    //  AK-47 | 表面淬火 (崭新出厂)
    private void connect35() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022901&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 300, 0.02, 260);
                        connect39();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect39();
                    }
                });
    }

    //  AK-47 | 表面淬火 (久经沙场)
    private void connect36() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4346")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 145, 0.16, 120);
                        connect39();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect39();
                    }
                });
    }

    //  蝴蝶刀（★） | 虎牙 (崭新出厂)
    private void connect37() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571637")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2100, 0.01, 1900);
                        connect38();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect38();
                    }
                });
    }

    //  驾驶手套（★） | 月色织物 (久经沙场)
    private void connect38() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566281")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.22, 600);
                        connect39();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect39();
                    }
                });
    }

    //  AWP | Mortis (崭新出厂) 死神
    private void connect39() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445828&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 65, 0.01, 40);
                        connect40();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect40();
                    }
                });
    }

    //  AWP | *嘣* (略有磨损)
    private void connect40() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3344375&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 110, 0.08, 90);
                        connect42();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect42();
                    }
                });
    }

    //  USP 消音版 | 黑色魅影 (略有磨损)
    private void connect41() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571584")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 165, 0.08, 130);
                        connect42();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect42();
                    }
                });
    }

    // USP 消音版 | 黑色魅影 (崭新出厂)
    private void connect42() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382761&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 260, 0.020, 210);
                        connect43();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect43();
                    }
                });
    }

    // USP 消音版 | 猎户 (崭新出厂)
    private void connect43() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3025226&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 70, 0.02, 55);
                        connect46();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect46();
                    }
                });
    }

    // M4A4 | 喧嚣杀戮 (略有磨损)
    private void connect44() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=307505433&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.08, 70);
                        connect45();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect45();
                    }
                });
    }

    // M4A4 | 喧嚣杀戮 (久经沙场)
    private void connect45() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=468653823&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 70, 0.16, 40);
                        connect46();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect46();
                    }
                });
    }

    // M4A4 | 二西莫夫 (破损不堪)
    private void connect46() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=82285335&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 230, 0.39, 200);
                        connect47();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect47();
                    }
                });
    }

    // M4A4 | 二西莫夫 (战痕累累)
    private void connect47() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3344372&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 130, 0.47, 110);
                        connect49();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect49();
                    }
                });
    }

    // 爪子刀（★） | 虎牙 (崭新出厂)
    private void connect48() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4003")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1900, 0.01, 1800);
                        connect49();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect49();
                    }
                });
    }

    // USP 消音版 | 脑洞大开 (崭新出厂)
    private void connect49() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446119&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 110, 0.02, 90);
                        connect50();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect50();
                    }
                });
    }

    // USP 消音版 | 枪响人亡 (久经沙场)
    private void connect50() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3010758&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 160, 0.17, 120);
                        connect52();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect52();
                    }
                });
    }

    // "USP 消音版 | 枪响人亡 (破损不堪)
    private void connect51() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/3874")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 108, 0.39, 95);
                        connect52();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect52();
                    }
                });
    }

    // "USP 消音版 | 脑洞大开 (略有磨损)",
    private void connect52() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445946&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 55, 0.08, 45);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | Cortex (久经沙场)",
    private void connect53() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610667")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 35, 0.16, 25);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | Cortex (破损不堪)",
    private void connect54() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610667")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 30);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | 不锈钢 (崭新出厂)",
    private void connect55() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=144902242&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 55, 0.01, 40);
                        connect56();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect56();
                    }
                });
    }

    //USP 消音版 | 次时代 (崭新出厂)",
    private void connect56() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=352874619&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 24, 0.01, 18);
                        connect59();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect59();
                    }
                });
    }

    //USP 消音版 | 公路杀手 (崭新出厂)"
    private void connect57() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4313")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 84, 0.01, 65);
                        connect59();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect59();
                    }
                });
    }

    //USP 消音版 | 公路杀手 (久经沙场)"
    private void connect58() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/89352")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 40);
                        connect59();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect59();
                    }
                });
    }

    //USP 消音版 | 蓝图 (崭新出厂)",
    private void connect59() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553398626&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 45, 0.01, 35);
                        connect60();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect60();
                    }
                });
    }

    //P90 | 二西莫夫 (崭新出厂)",
    private void connect60() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3011039&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 130, 0.03, 110);
                        connect61();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect61();
                    }
                });
    }

    //P90 | 二西莫夫 (略磨)",
    private void connect61() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2777065&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.08, 50);
                        connect62();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect62();
                    }
                });
    }

    //UMP-45 | 炽烈之炎 (崭新出厂)",
    private void connect62() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2991441&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 62, 0.01, 50);
                        connect63();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect63();
                    }
                });
    }

    //法玛斯 | 防滚架 (崭新出厂)",
    private void connect63() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382200&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 110, 0.02, 90);
                        connect64();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect64();
                    }
                });
    }

    //加利尔 AR | 地狱看门犬 (崭新出厂)",
    private void connect64() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=220002371&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 85, 0.01, 50);
                        connect65();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect65();
                    }
                });
    }

    //加利尔 AR | 喧闹骷髅 (破损不堪)",
    private void connect65() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=176162044&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 23, 0.39, 15);
                        connect66();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect66();
                    }
                });
    }

    //加利尔 AR | ~甜甜的~ (崭新出厂)",
    private void connect66() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553395948&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.01, 40);
                        connect67();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect67();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (崭新出厂)",
    private void connect67() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553395894&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 150, 0.02, 100);
                        connect71();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect71();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (略磨)",
    private void connect68() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553395866&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 90, 0.08, 75);
                        connect70();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect70();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (久经)",
    private void connect69() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/580400")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.16, 45);
                        connect71();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect71();
                    }
                });
    }

    //M4A4 | 沙漠精英 (崭新出厂)",
    private void connect70() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3025223&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 45, 0.01, 30);
                        connect73();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect73();
                    }
                });
    }

    //M4A4 | 龙王 (略磨",
    private void connect71() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/3734")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 50, 0.073, 40);
                        connect73();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect73();
                    }
                });
    }

    //M4A4 | 龙王 (久经",
    private void connect72() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/6107")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 40, 0.16, 30);
                        connect73();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect73();
                    }
                });
    }

    //M4A4 | 狮鹫 (崭新出厂)",
    private void connect73() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3025886&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 40, 0.01, 30);
                        connect74();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect74();
                    }
                });
    }

    //M4A4 | 皇家圣骑士 (略磨)",
    private void connect74() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3023216&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 145, 0.08, 110);
                        connect76();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect76();
                    }
                });
    }

    //M4A4 | X光 (略磨)",
    private void connect75() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/19475")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 45, 0.08, 35);
                        connect76();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect76();
                    }
                });
    }

    //M4A4 | X光 (崭新)",
    private void connect76() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2914656&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 70, 0.01, 40);
                        connect77();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect77();
                    }
                });
    }

    //M4A4 |死寂空间 (崭新)",
    private void connect77() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=7424865&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 170, 0.02, 110);
                        connect78();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect78();
                    }
                });
    }

    //M4A4 |死寂空间 (略磨)",
    private void connect78() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2996384&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 85, 0.075, 60);
                        connect81();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |死寂空间 (久经)",
    private void connect79() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555149")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 58, 0.16, 45);
                        connect81();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |死寂空间 (破损)",
    private void connect80() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555277")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 40);
                        connect81();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |黑色魅影 (久经)",
    private void connect81() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445891&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 180, 0.20, 120);
                        connect82();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect82();
                    }
                });
    }

    //M4A4 |黑色魅影 (略有磨损)",
    private void connect82() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445825&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 340, 0.08, 290);
                        connect86();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect86();
                    }
                });
    }

    //M4A4 |黑色魅影 (战痕)",
    private void connect83() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610665")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 95, 0.46, 70);
                        connect84();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect84();
                    }
                });
    }

    //M4A4 |弹雨 (久经)",
    private void connect84() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/10076")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 36, 0.16, 25);
                        connect85();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect85();
                    }
                });
    }

    //M4A4 |弹雨 (略磨)",
    private void connect85() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/8443")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 57, 0.08, 45);
                        connect86();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect86();
                    }
                });
    }

    //M4A4 |弹雨 (崭新)",
    private void connect86() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=156213218&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 120, 0.02, 70);
                        connect87();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect87();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (崭新出厂)",
    private void connect87() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453516&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 120, 0.02, 80);
                        connect88();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect88();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (略磨)",
    private void connect88() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453341&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 55, 0.08, 35);
                        connect89();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect89();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 久经)",
    private void connect89() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453642&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 25, 0.16, 18);
                        connect90();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect90();
                    }
                });
    }

    //M4A1 消音版 | 伊卡洛斯殒落 (崭新出厂)",
    private void connect90() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2913091&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 250, 0.01, 200);
                        connect91();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect91();
                    }
                });
    }

    //M4A1 消音版 | 破碎千秋 (崭新出厂)",
    private void connect91() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553421575&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 45, 0.02, 30);
                        connect92_1();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect92_1();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (崭新出厂)
    private void connect92_1() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=291084193&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 350, 0.02, 270);
                        connect92();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect92();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (略有磨损)
    private void connect92() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=85476444&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 140, 0.08, 100);
                        connect93();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect93();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (久经)
    private void connect93() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022886&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 70, 0.16, 50);
                        connect94();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect94();
                    }
                });
    }

    //M4A1 消音版 | 赤红新星 (崭新)
    private void connect94() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3225405&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 350, 0.01, 270);
                        connect95();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect95();
                    }
                });
    }

    //M4A1 消音版 | 毁灭者2000 (崭新)
    private void connect95() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553386906&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 75, 0.01, 40);
                        connect96();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect96();
                    }
                });
    }

    //M4A1 消音版 | 机型工业 (崭新)
    private void connect96() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=176161570&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 170, 0.02, 120);
                        connect97();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect97();
                    }
                });
    }

    //M4A1 消音版 | 机型工业 (略磨)
    private void connect97() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=92241231&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 85, 0.08, 50);
                        connect98();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect98();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (崭新)
    private void connect98() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=965297&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 200, 0.02, 140);
                        connect99();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect99();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (略磨)
    private void connect99() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3004508&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.08, 70);
                        connect101();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect101();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (久经)
    private void connect100() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4253")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 45, 0.16, 32);
                        connect101();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect101();
                    }
                });
    }

    //M4A1 消音版 | 次时代 (崭新)
    private void connect101() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=1092592&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 70, 0.02, 40);
                        connect102();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect102();
                    }
                });
    }

    //M4A1 消音版 | 守护者 (崭新)
    private void connect102() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2915205&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 50, 0.01, 30);
                        connect103();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect103();
                    }
                });
    }

    //AWP | 巨龙传说 (崭新出厂)
    private void connect103() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2964080&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 9800, 0.04, 9500);
                        connect104();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect104();
                    }
                });
    }

    //AK-47 | 皇后 (略有磨损)
    private void connect104() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553420995&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 300, 0.09, 250);
                        connect105();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect105();
                    }
                });
    }

    //AK-47 | 皇后 (久经沙场)
    private void connect105() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553421182&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.18, 190);
                        connect106();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect106();
                    }
                });
    }

    //AK-47 | 皇后 (崭新出厂)
    private void connect106() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553421077&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 580, 0.04, 520);
                        connect107();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect107();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (崭新出厂)
    private void connect107() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553455806&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.03, 380);
                        connect108();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect108();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (略有磨损)
    private void connect108() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453354&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 290, 0.08, 220);
                        connect109();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect109();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (久经沙场)
    private void connect109() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453676&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 190, 0.17, 120);
                        connect110();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect110();
                    }
                });
    }

    //AK-47 | 霓虹革命 (崭新出厂)
    private void connect110() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=105863825&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 250, 0.01, 200);
                        connect112();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect112();
                    }
                });
    }

    //AK-47 | 霓虹革命 (略有磨损)
    private void connect111() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555892")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 140, 0.075, 110);
                        connect112();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect112();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (崭新出厂)
    private void connect112() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457614&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 320, 0.03, 240);
                        connect113();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect113();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (略有磨损)
    private void connect113() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453577&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 170, 0.08, 110);
                        connect114();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect114();
                    }
                });
    }

    //AK-47 | 深海复仇 (崭新出厂)
    private void connect114() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2881710&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.020, 160);
                        connect115();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect115();
                    }
                });
    }

    //AK-47 | 深海复仇 (略有磨损)
    private void connect115() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2640101&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 140, 0.080, 115);
                        connect116();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect116();
                    }
                });
    }

    //AK-47 | 水栽竹 (崭新出厂)
    private void connect116() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022904&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 850, 0.030, 720);
                        connect117();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect117();
                    }
                });
    }

    //AK-47 | 水栽竹 (略有磨损)
    private void connect117() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2921387&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.08, 440);
                        connect118();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect118();
                    }
                });
    }

    //AK-47 | 水栽竹 (久经沙场)
    private void connect118() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3006407&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 310, 0.17, 240);
                        connect120();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect120();
                    }
                });
    }

    //AK-47 | 安全网格 (崭新出厂)
    private void connect119() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/616501")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 95, 0.010, 70);
                        connect120();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect120();
                    }
                });
    }

    //AK-47 | 二西莫夫 (久经沙场)
    private void connect120() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460590&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 300, 0.16, 180);
                        connect121();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect121();
                    }
                });
    }

    //AK-47 | 二西莫夫 (略有磨损)
    private void connect121() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460664&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 420, 0.09, 280);
                        connect123();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect123();
                    }
                });
    }

    //AK-47 | 二西莫夫 (久经沙场)
    private void connect122() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618577")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 400, 0.17, 320);
                        connect123();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect123();
                    }
                });
    }

    //M4A4 | 镁元素 (崭新出厂)
    private void connect123() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460647&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 22, 0.003, 8);
                        connect124();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect124();
                    }
                });
    }

    //沙漠之鹰 | 机械工业 (崭新出厂)
    private void connect124() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460597&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.010, 40);
                        connect126();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect126();
                    }
                });
    }

    //沙漠之鹰 | 机械工业 (略有磨损)
    private void connect125() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618619")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 55, 0.071, 40);
                        connect126();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect126();
                    }
                });
    }

    //MP5 | 磷光体(崭新出厂)
    private void connect126() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460659&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.010, 40);
                        connect127();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect127();
                    }
                });
    }

    //P250 | 二西莫夫(略有磨损)
    private void connect127() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=224589334&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 95, 0.11, 60);
                        connect128();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect128();
                    }
                });
    }

    //AWP | 黑色魅影（崭新出厂）
    private void connect128() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460591&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.02, 330);
                        connect131();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect131();
                    }
                });
    }

    //AWP | 黑色魅影（略有磨损）
    private void connect129() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618614")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 430, 0.08, 380);
                        connect131();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect131();
                    }
                });
    }

    //AWP | 黑色魅影（久经沙场）
    private void connect130() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618654")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 330, 0.17, 290);
                        connect131();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect131();
                    }
                });
    }

    //    AK47 | 荒野反叛（略有磨损）
    private void connect131() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=162587166&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 160, 0.09, 120);
                        connect132();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect132();
                    }
                });
    }

    //    格洛克18 | 荒野反叛（崭新出厂）
    private void connect132() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=226063881&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.02, 45);
                        connect133();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect133();
                    }
                });
    }

    //    AK-47 | 火蛇 (久经沙场)
    private void connect133() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2821575&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.17, 850);
                        connect134();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect134();
                    }
                });
    }

    //    AK-47 | 火蛇 (略有磨损)
    private void connect134() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=4001444&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1450, 0.09, 1300);
                        connect135();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect135();
                    }
                });
    }

    // M4A4（StatTrak™） | 二西莫夫 (久经沙
    private void connect135() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=135504917&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1200, 0.26, 1000);
                        connect138();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect138();
                    }
                });
    }

    // M4A4（StatTrak™） | 二西莫夫 (破损不堪）
    private void connect136() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/11759")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.39, 690);
                        connect137();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect137();
                    }
                });
    }

    // M4A4（StatTrak™） | 二西莫夫 (战痕累累）
    private void connect137() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/55831")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 380, 0.46, 320);
                        connect138();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect138();
                    }
                });
    }

    // M4A4 | 咆哮 (略有磨损)
    private void connect138() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3000164&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 4800, 0.08, 4300);
                        connect154();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect154();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (久经沙场)
    private void connect139() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566738")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1700, 0.20, 1400);
                        connect140();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect140();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (略有磨损)
    private void connect140() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566434")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 3700, 0.09, 1400);
                        connect141();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect141();
                    }
                });
    }

    // 驾驶手套（★） | 月色织物 (略有磨损)
    private void connect141() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566867")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1700, 0.09, 1400);
                        connect142();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect142();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (略有磨损)
    private void connect142() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566494")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.09, 1500);
                        connect147();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect147();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (久经沙场)
    private void connect143() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566238")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.20, 800);
                        connect144();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect144();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (略有磨损)
    private void connect144() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566238")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1300, 0.09, 1100);
                        connect145();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect145();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (久经沙场)
    private void connect145() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566321")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 800, 0.20, 700);
                        connect146();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect146();
                    }
                });
    }

    // 驾驶手套（★） | 王蛇 (久经沙场)
    private void connect146() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566321")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1350, 0.20, 1150);
                        connect147();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect147();
                    }
                });
    }

    // 驾驶手套（★） | 护卫 (略有磨损)
    private void connect147() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566248")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.09, 600);
                        connect148();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect148();
                    }
                });
    }

    // 裹手（★） | 森林色调 (久经沙场)
    private void connect148() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610880")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 700, 0.20, 600);
                        connect149();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect149();
                    }
                });
    }

    // 裹手（★） | 套印 (久经沙场)
    private void connect149() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/611006")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1600, 0.20, 1300);
                        connect150();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect150();
                    }
                });
    }

    // 裹手（★） | 屠夫 (略有磨损)
    private void connect150() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566659")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2300, 0.09, 2000);
                        connect151();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect151();
                    }
                });
    }

    // 裹手（★） | 屠夫 (久经沙场)
    private void connect151() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566204")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1300, 0.20, 1100);
                        connect152();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect152();
                    }
                });
    }

    // 裹手（★） | 恶土 (久经沙场)
    private void connect152() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566719")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 850, 0.20, 750);
                        connect153();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect153();
                    }
                });
    }

    // 裹手（★） | 恶土 (略有磨损)
    private void connect153() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566901")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1400, 0.09, 1200);
                        connect154();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect154();
                    }
                });
    }

    // P250 | 生化短吻鳄 (崭新出厂)
    private void connect154() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553421993&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 95, 0.02, 60);
                        connect155();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect155();
                    }
                });
    }

    // P250 | 银装素裹 (略有磨损)
    private void connect155() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=212405541&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 35, 0.11, 25);
                        connect156();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect156();
                    }
                });
    }

    // SG 553 | 意式拉力 (略有磨损)
    private void connect156() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458406&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 300, 0.09, 250);
                        connect157();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect157();
                    }
                });
    }

    // SG 553 | 意式拉力 (久经沙场)
    private void connect157() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553459179&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 170, 0.20, 110);
                        connect160();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect160();
                    }
                });
    }

    //计数器
    //USP 消音版（StatTrak™） | 疯狂蔓延 (略磨)
    private void connect158() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/8106")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 200, 0.10, 140);
                        connect159();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect159();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 疯狂蔓延 (久经)
    private void connect159() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/16993")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.19, 60);
                        connect160();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect160();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 脑洞大开 (崭新)
    private void connect160() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446806&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 420, 0.02, 330);
                        connect162();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect162();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 脑洞大开 (略磨)
    private void connect161() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445942&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.09, 160);
                        connect162();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect162();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 次时代(崭新)
    private void connect162() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=492402546&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.02, 70);
                        connect163();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect163();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 不锈钢(略磨)
    private void connect163() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=235600380&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 90, 0.08, 70);
                        connect164();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect164();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 不锈钢(崭新)
    private void connect164() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=195129503&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 270, 0.02, 200);
                        connect165();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect165();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 蓝图(崭新)
    private void connect165() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402641&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 230, 0.02, 190);
                        connect166();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect166();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 闪回(崭新)
    private void connect166() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460606&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.01, 30);
                        connect167();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect167();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(崭新)
    private void connect167() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401286&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.03, 780);
                        connect168();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect168();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(略磨)
    private void connect168() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553393319&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 555, 0.072, 440);
                        connect169();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect169();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(久经)
    private void connect169() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553397961&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 300, 0.17, 260);
                        connect170();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect170();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 枪响人亡(略有磨损)
    private void connect170() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=9765056&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 850, 0.09, 750);
                        connect171();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect171();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 力矩(崭新)
    private void connect171() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2934261&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 35, 0.02, 20);
                        connect172();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect172();
                    }
                });
    }

    //格洛克18（StatTrak™） | 水灵(崭新)
    private void connect172() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=9765059&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.02, 150);
                        connect173();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect173();
                    }
                });
    }

    //P250（StatTrak™） | 生化短尾鳄(崭新)
    private void connect173() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553426866&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 420, 0.03, 340);
                        connect178();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect178();
                    }
                });
    }

    //P250（StatTrak™） | 生化短尾鳄(略磨)
    private void connect174() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/606203")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.08, 160);
                        connect175();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect175();
                    }
                });
    }

    //P250（StatTrak™） | 二西末夫(略磨)
    private void connect175() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/554032")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 420, 0.11, 350);
                        connect176();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect176();
                    }
                });
    }

    //P250（StatTrak™） | 二西末夫(久经)
    private void connect176() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/445663")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 150, 0.18, 90);
                        connect177();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect177();
                    }
                });
    }

    //P250（StatTrak™） | 超新星(崭新)
    private void connect177() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/6441")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 30, 0.015, 15);
                        connect178();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect178();
                    }
                });
    }

    //P250（StatTrak™） | 元素轮廓(崭新)
    private void connect178() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=7567702&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 30, 0.003, 15);
                        connect179();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect179();
                    }
                });
    }

    //CZ75（StatTrak™） | 经济(崭新)
    private void connect179() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458264&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 82, 0.01, 50);
                        connect180();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect180();
                    }
                });
    }

    //CZ75（StatTrak™） | 战术高手(崭新)
    private void connect180() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553424082&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 45, 0.01, 30);
                        connect181();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect181();
                    }
                });
    }

    //CZ75（StatTrak™） | 猛虎(崭新)
    private void connect181() {
        OkGo.<C5>get("hhttps://www.c5game.com/api/product/sale.json?id=219848481&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 50, 0.01, 30);
                        connect182();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect182();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 机械工业(崭新)
    private void connect182() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460806&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 350, 0.02, 180);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 机械工业(略磨)
    private void connect183() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618663")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.08, 200);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 指挥(略磨)
    private void connect184() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/559259")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.09, 45);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 大佬龙(崭新)
    private void connect185() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/188881")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 380, 0.02, 300);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 红色代号(略磨)
    private void connect186() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457995&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.09, 400);
                        connect189();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect189();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 红色代号(久经)
    private void connect187() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/615407")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 350, 0.16, 230);
                        connect188();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect188();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 阴谋者(崭新)
    private void connect188() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/7720")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 120, 0.02, 100);
                        connect189();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect189();
                    }
                });
    }

    //P90（StatTrak™） | 二西莫夫 (略磨)
    private void connect189() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2920119&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 240, 0.08, 190);
                        connect190();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect190();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (崭新)
    private void connect190() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553399058&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 680, 0.03, 460);
                        connect191();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect191();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (略磨)
    private void connect191() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=488344775&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 310, 0.08, 240);
                        connect196();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect196();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (久经)
    private void connect192() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/565880")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 230, 0.18, 200);
                        connect193();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect193();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (崭新)
    private void connect193() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555182")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 530, 0.03, 450);
                        connect194();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect194();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (略磨)
    private void connect194() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555296")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 270, 0.09, 220);
                        connect195();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect195();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (久经)
    private void connect195() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555325")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 180, 0.17, 140);
                        connect196();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect196();
                    }
                });
    }

    //M4A4（StatTrak™） | 黑色魅影 (久经)
    private void connect196() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446299&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 510, 0.18, 330);
                        connect197();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect197();
                    }
                });
    }

    //M4A4（StatTrak™） | 镁元素 (崭新)
    private void connect197() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460853&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 120, 0.01, 60);
                        connect199();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect199();
                    }
                });
    }

    //M4A4（StatTrak™） | 镁元素 (略磨)
    private void connect198() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618655")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 50, 0.08, 30);
                        connect199();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect199();
                    }
                });
    }

    //M4A4（StatTrak™） | 龙王 (崭新)
    private void connect199() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=56949938&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 320, 0.03, 220);
                        connect1000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1000();
                    }
                });
    }

    //M4A4（StatTrak™） | 杀意大名 (崭新)
    private void connect1000() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=168412637&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 110, 0.01, 80);
                        connect1001();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1001();
                    }
                });
    }

    //M4A4（StatTrak™） | 狮鹫 (崭新)
    private void connect1001() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=221545531&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 150, 0.01, 100);
                        connect1002();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1002();
                    }
                });
    }

    //AK-47（StatTrak™） | 皇后 (崭新出厂)
    private void connect1002() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553429623&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 2000, 0.04, 1750);
                        connect1003();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1003();
                    }
                });
    }

    //AK-47（StatTrak™） | 皇后 (略有磨损)
    private void connect1003() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553427304&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 950, 0.09, 800);
                        connect1004();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1004();
                    }
                });
    }

    // AK-47（StatTrak™） | 皇后 (久经沙场)
    private void connect1004() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553424042&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 630, 0.17, 550);
                        connect1005();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1005();
                    }
                });
    }

    // AK-47（StatTrak™） | 火神 (崭新出厂)
    private void connect1005() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2901159&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1900, 0.03, 1600);
                        connect1006();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1006();
                    }
                });
    }

    // AK-47（StatTrak™） | 火神 (略有磨损)
    private void connect1006() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=350557533&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.09, 800);
                        connect1007();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1007();
                    }
                });
    }

    // AK-47（StatTrak™） | 火神 (久经沙场)
    private void connect1007() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2903253&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.17, 380);
                        connect1008();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1008();
                    }
                });
    }

    // AK-47（StatTrak™） | 霓虹骑士 (崭新出厂)
    private void connect1008() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457437&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1600, 0.04, 1350);
                        connect1009();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1009();
                    }
                });
    }

    // AK-47（StatTrak™） | 霓虹骑士 (略有磨损)
    private void connect1009() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453815&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.09, 670);
                        connect1010();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1010();
                    }
                });
    }

    // AK-47（StatTrak™） | 霓虹骑士 (久经沙场)
    private void connect1010() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453515&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.18, 380);
                        connect1011();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1011();
                    }
                });
    }

    // AK-47（StatTrak™） | 燃料喷射器 (略有磨损)
    private void connect1011() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=326790835&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 830, 0.09, 740);
                        connect1012();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1012();
                    }
                });
    }

    // AK-47（StatTrak™） | 燃料喷射器 (久经沙场)
    private void connect1012() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=248282386&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 550, 0.17, 430);
                        connect1013();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1013();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (崭新出厂)
    private void connect1013() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380464&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 750, 0.02, 600);
                        connect1014();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1014();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (略有磨损)
    private void connect1014() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=9765061&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 400, 0.09, 350);
                        connect1015();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1015();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (久经沙场)
    private void connect1015() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=137283214&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 260, 0.20, 220);
                        connect1016();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1016();
                    }
                });
    }

    // AK-47（StatTrak™） | 血腥运动 (崭新出厂)
    private void connect1016() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401259&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 900, 0.03, 750);
                        connect1018();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1018();
                    }
                });
    }

    // AK-47（StatTrak™） | 血腥运动 (略有磨损)
    private void connect1017() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571781")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 650, 0.08, 550);
                        connect1018();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1018();
                    }
                });
    }

    // AK-47（StatTrak™） | 红线 (略有磨损)
    private void connect1018() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=12153022&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 650, 0.12, 550);
                        connect1019();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1019();
                    }
                });
    }

    // AK-47（StatTrak™） | 红线 (久经沙场)
    private void connect1019() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=450896&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 200, 0.17, 130);
                        connect1020();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1020();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (崭新出厂)
    private void connect1020() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2915212&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 600, 0.02, 450);
                        connect1021();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1021();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (略有磨损)
    private void connect1021() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=497117284&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 320, 0.08, 270);
                        connect1022();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1022();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (久经沙场)
    private void connect1022() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3023211&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.19, 180);
                        connect1023();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1023();
                    }
                });
    }

    // AK-47（StatTrak™） | 轨道 (崭新出厂)
    private void connect1023() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553398220&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.02, 150);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 卡特尔 (崭新出厂)
    private void connect1024() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/13052")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 200, 0.03, 140);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 精英之作 (崭新出厂)
    private void connect1025() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=6014030&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 120, 0.01, 90);
                        connect1027();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1027();
                    }
                });
    }

    // AK-47（StatTrak™） | 精英之作 (略有磨损)
    private void connect1026() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4553")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 60, 0.08, 45);
                        connect1028();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1028();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 梦魇  (久经沙场)
    private void connect1027() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457518&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 80, 0.17, 45);
                        connect1028();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1028();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 梦魇  (略有磨损)
    private void connect1028() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457078&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 180, 0.08, 130);
                        connect1032();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1032();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 暴怒野兽  (崭新出厂)
    private void connect1029() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553391082&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1000, 0.01, 800);
                        connect1030();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1030();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 暴怒野兽  (略有磨损)
    private void connect1030() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/3879")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 270, 0.08, 200);
                        connect1031();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1031();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 暴怒野兽  (久经沙场)
    private void connect1031() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4339")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 140, 0.18, 100);
                        connect1032();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1032();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 机械工业  (略有磨损)
    private void connect1032() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=502469430&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 280, 0.08, 200);
                        connect1034();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1034();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 梦魇  (崭新出厂)
    private void connect1033() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/615118")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.02, 350);
                        connect1034();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1034();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 女火神之炽焰  (略有磨损)
    private void connect1034() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=515385240&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 400, 0.08, 320);
                        connect1035();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1035();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 女火神之炽焰  (久经沙场)
    private void connect1035() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=490745631&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 220, 0.17, 150);
                        connect1036();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1036();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 次时代 (崭新出厂)
    private void connect1036() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=135504920&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 230, 0.02, 170);
                        connect1038();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1038();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 次时代 (久经沙场)
    private void connect1037() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=51147895&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 90, 0.18, 60);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect2000();
                    }
                });
    }


    // M4A4 | 皇帝 (崭新出厂)
    private void connect1038() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464834&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1200, 0.03, 900);
                        connect1039();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1039();
                    }
                });
    }
    // M4A4 | 皇帝 (略有磨损)
    private void connect1039() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464752&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 600, 0.08, 480);
                        connect1040();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1040();
                    }
                });
    }
    // M4A4 | 皇帝 (久经沙场)
    private void connect1040() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464746&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 300, 0.22, 220);
                        connect1041();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1041();
                    }
                });
    }
    // M4A4（StatTrak™） | 皇帝 (久经沙场)
    private void connect1041() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464890&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 610, 0.25, 500);
                        connect1042();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1042();
                    }
                });
    }
    // M4A4（StatTrak™） | 皇帝 (略有磨损)
    private void connect1042() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553465314&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 1700, 0.08, 1500);
                        connect1043();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1043();
                    }
                });
    }
    // 沙漠之鹰 | 轻轨 (崭新出厂)
    private void connect1043() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464726&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 50, 0.01, 30);
                        connect1044();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1044();
                    }
                });
    }
    // 沙漠之鹰（StatTrak™） | 轻轨 (崭新出厂)
    private void connect1044() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464950&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 200, 0.01, 130);
                        connect1045();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1045();
                    }
                });
    }

    // AWP | 树蝰 (崭新出厂)
    private void connect1045() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464784&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 200, 0.02, 130);
                        connect1046();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1046();
                    }
                });
    }
    // AWP（StatTrak™） | 树蝰 (崭新出厂)
    private void connect1046() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464893&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 500, 0.02, 400);
                        connect1047();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1047();
                    }
                });
    }
    // AUG | 动量 (崭新出厂)
    private void connect1047() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553465433&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 320, 0.04, 250);
                        connect1048();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1048();
                    }
                });
    }
    // AUG | 动量 (略有磨损)
    private void connect1048() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464873&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.09, 70);
                        connect1049();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1049();
                    }
                });
    }
    // AUG | 动量 (久经沙场)
    private void connect1049() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464779&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 35, 0.17, 20);
                        connect1050();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1050();
                    }
                });
    }
    // AUG（StatTrak™） | 动量 (久经沙场)
    private void connect1050() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464825&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 100, 0.18, 60);
                        connect1051();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1051();
                    }
                });
    }
    // AUG（StatTrak™） | 动量 (略有磨损)
    private void connect1051() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553465306&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 310, 0.09, 250);
                        connect1052();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1052();
                    }
                });
    }

    // AWP（StatTrak™） | 树蝰 (略有磨损)
    private void connect1052() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464943&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 310, 0.08, 220);
                        connect1053();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1053();
                    }
                });
    }
    //  AWP（StatTrak™） | 树蝰 (久经沙场)
    private void connect1053() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464914&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 150, 0.17, 100);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect2000();
                    }
                });
    }


    // 格洛克 18 型 | 红苹果 (崭新出厂)
    public void connect2000() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2900481&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC53(response, 5, 0.01, 2);
                        mService.c5Knifes.connect1200();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        mService.c5Knifes.connect1200();
                    }
                });
    }
}