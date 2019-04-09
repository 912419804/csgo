package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.Igxe;
import com.frank.csgo.bean.IgxeWeapon;
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
public class IgxeKnifes {

    private CatchService mService;

    public IgxeKnifes(CatchService service) {
        this.mService = service;
    }

    private void handleDataIgxe3(Response<Igxe> response, int value, double w, int minMoney) {
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
    }

    // 折叠刀（★） | 深红之网 (略有磨损)
    public void connect1200() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/17644")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1500, 0.10, 1200);
                        connect1201();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1201();
                    }
                });
    }

    // 折叠刀（★） | 深红之网 (久经沙场)
    private void connect1201() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4260")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 750, 0.20, 600);
                        connect1204();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1204();
                    }
                });
    }

    // 折叠刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1202() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/96501")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 750, 0.09, 600);
                        connect1203();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1203();
                    }
                });
    }

    // 折叠刀（★） | 传说 (崭新出厂)
    private void connect1203() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555840")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 2000, 0.03, 1500);
                        connect1204();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1204();
                    }
                });
    }

    // 折叠刀（★） | 传说 (久经沙场)
    private void connect1204() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555437")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 850, 0.20, 800);
                        connect1205();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1205();
                    }
                });
    }

    //   折叠刀（★） | 自动化 (略有磨损)
    private void connect1205() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555471")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 840, 0.09, 770);
                        connect1206();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1206();
                    }
                });
    }

    //   折叠刀（★） | 自动化 (久经沙场)
    private void connect1206() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555678")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 700, 0.16, 610);
                        connect1207();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1207();
                    }
                });
    }

    //   折叠刀（★） | 虎牙 (崭新出厂)
    private void connect1207() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7716")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 860, 0.003, 750);
                        connect1211();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1211();
                    }
                });
    }

    //   刺刀（★） | 传说 (久经沙场)
    private void connect1211() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555335")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1400, 0.18, 1200);
                        connect1212();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1212();
                    }
                });
    }

    //   刺刀（★） | 自动化 (久经沙场)
    private void connect1212() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555792")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1199, 0.17, 1100);
                        connect1213();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1213();
                    }
                });
    }

    //   刺刀（★） | 自动化 (略有磨损)
    private void connect1213() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555423")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1450, 0.08, 1350);
                        connect1214();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1214();
                    }
                });
    }

    //   刺刀（★） | 深红之网 (略有磨损)
    private void connect1214() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/16835")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1400, 0.09, 1100);
                        connect1215();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1215();
                    }
                });
    }

    //   刺刀（★） | 深红之网 (久经沙场)
    private void connect1215() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11557")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 720, 0.18, 600);
                        connect1216();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1216();
                    }
                });
    }

    //   刺刀（★） | 多普勒 (崭新出厂)
    private void connect1216() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5563")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1100, 0.01, 1000);
                        connect1217();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1217();
                    }
                });
    }

    //   刺刀（★） | 虎牙 (崭新出厂)
    private void connect1217() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6440")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1200, 0.01, 1050);
                        connect1221();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1221();
                    }
                });
    }

    //    "M9 刺刀（★） | 虎牙 (崭新出厂)",
    private void connect1221() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8084")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1400, 0.01, 1300);
                        connect1222();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1222();
                    }
                });
    }

    //   M9 刺刀（★） | 自动化 (久经沙场)
    private void connect1222() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555282")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1600, 0.17, 1400);
                        connect1223();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1223();
                    }
                });
    }


    //   M9 刺刀（★） | 多普勒 (崭新出厂)
    private void connect1223() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5562")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1380, 0.01, 1300);
                        connect1224();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1224();
                    }
                });
    }

    //   M9 刺刀（★） | 传说 (久经沙场)
    private void connect1224() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555575")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 2000, 0.19, 1600);
                        connect1225();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1225();
                    }
                });
    }

    //   M9 刺刀（★） | 深红之网 (略有磨损)
    private void connect1225() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5319")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 2600, 0.12, 2300);
                        connect1226();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1226();
                    }
                });
    }

    //   M9 刺刀（★） | 深红之网 (久经沙场)
    private void connect1226() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5034")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1100, 0.22, 900);
                        connect1227();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1227();
                    }
                });
    }

    //   M9 刺刀（★） | 北方森林 (久经沙场)
    private void connect1227() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11232")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 600, 0.17, 500);
                        connect1231();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1231();
                    }
                });
    }

    //   蝴蝶刀（★）
    private void connect1231() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3985")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1450, 0.10, 1350);
                        connect1232();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1232();
                    }
                });
    }

    //   蝴蝶刀（★） | 深红之网 (久经沙场)
    private void connect1232() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6285")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1500, 0.18, 1300);
                        connect1233();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1233();
                    }
                });
    }

    //   蝴蝶刀（★） | 北方森林 (略有磨损)
    private void connect1233() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/37226")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1000, 0.09, 800);
                        connect1234();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1234();
                    }
                });
    }

    //   蝴蝶刀（★） | 北方森林 (久经沙场)
    private void connect1234() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/18312")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 800, 0.17, 700);
                        connect1235();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1235();
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (略有磨损)
    private void connect1235() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/17636")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1500, 0.10, 1200);
                        connect1236();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1236();
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (久经沙场)
    private void connect1236() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5566")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 950, 0.18, 800);
                        connect1237();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1237();
                    }
                });
    }

    //   蝴蝶刀（★） | 森林DDPAT (略有磨损)
    private void connect1237() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4418")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 900, 0.09, 750);
                        connect1240();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1240();
                    }
                });
    }

    //爪子刀 无涂装
    private void connect1240() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5211")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1360, 0.12, 1200);
                        connect1241();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1241();
                    }
                });
    }

    //爪子刀（★） | 自动化 (久经沙场)
    private void connect1241() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555358")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 2150, 0.19, 1900);
                        connect1242();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1242();
                    }
                });
    }

    //爪子刀（★） | 虎牙 (崭新出厂)
    private void connect1242() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4003")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 2000, 0.005, 1700);
                        connect1243();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1243();
                    }
                });
    }

    //爪子刀（★） | 传说 (久经沙场)
    private void connect1243() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555242")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 2000, 0.19, 1700);
                        connect1244();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1244();
                    }
                });
    }

    //爪子刀（★） | 深红之网 (久经沙场)
    private void connect1244() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6285")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1480, 0.19, 1300);
                        connect1245();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1245();
                    }
                });
    }

    //爪子刀（★） | 森林 DDPAT (略有磨损)
    private void connect1245() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/87634")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 900, 0.09, 700);
                        connect1246();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1246();
                    }
                });
    }

    //爪子刀（★） | 森林 DDPAT (久经沙场)
    private void connect1246() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11158")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 730, 0.16, 600);
                        connect1247();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1247();
                    }
                });
    }

    //爪子刀（★） | 北方森林 (略有磨损)
    private void connect1247() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/87634")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 900, 0.09, 700);
                        connect1248();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1248();
                    }
                });
    }

    //爪子刀（★） | 北方森林 (久经沙场)
    private void connect1248() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8880")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 750, 0.17, 600);
                        connect1250();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1250();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变大理石 (崭新出厂)
    private void connect1250() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571592")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1050, 0.01, 950);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 多普勒 (崭新出厂)
    private void connect1251() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571856")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 950, 0.01, 900);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 多普勒 (崭新出厂)
    private void connect1252() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571856")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1050, 0.01, 900);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 深红之网 (略有磨损)
    private void connect1253() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/87786")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1000, 0.11, 850);
                        connect1254();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1254();
                    }
                });
    }

    //猎杀者匕首（★） | 深红之网 (久经沙场)
    private void connect1254() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15680")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 620, 0.20, 500);
                        connect1256();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1256();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变之色 (崭新出厂)
    private void connect1255() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15680")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 620, 0.01, 500);
                        connect1256();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1256();
                    }
                });
    }

    //猎杀者匕首（★） | 虎牙 (渐变之色)
    private void connect1256() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571718")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 830, 0.01, 740);
                        connect1257();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1257();
                    }
                });
    }

    //猎杀者匕首（★）
    private void connect1257() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6964")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 550, 0.16, 500);
                        connect1260();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1260();
                    }
                });
    }

    //熊刀（★） | 深红之网 (久经沙场)
    private void connect1260() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615773")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1550, 0.20, 1300);
                        connect1261();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1261();
                    }
                });
    }

    //熊刀（★）
    private void connect1261() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614794")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1250, 0.07, 1100);
                        connect1272();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1272();
                    }
                });
    }

    //鲍伊猎刀（★） | 多普勒 (崭新出厂)
    private void connect1271() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571703")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1000, 0.01, 900);
                        connect1272();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1272();
                    }
                });
    }

    //鲍伊猎刀（★） | 深红之网 (略有磨损)
    private void connect1272() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/103983")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1300, 0.10, 1050);
                        connect1273();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1273();
                    }
                });
    }

    //鲍伊猎刀（★） | 深红之网 (久经沙场)
    private void connect1273() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/121349")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 770, 0.19, 600);
                        connect1277();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1277();
                    }
                });
    }

    //鲍伊猎刀（★） | 虎牙 (崭新出厂)
    private void connect1274() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571701")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 880, 0.01, 800);
                        connect1277();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1277();
                    }
                });
    }

    //弯刀（★） | 多普勒 (崭新出厂)
    private void connect1275() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571789")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 900, 0.01, 800);
                        connect1276();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1276();
                    }
                });
    }

    //弯刀（★） | 渐变大理石 (崭新出厂)
    private void connect1276() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571713")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 900, 0.01, 800);
                        connect1277();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1277();
                    }
                });
    }

    //弯刀（★） | 虎牙 (崭新出厂)
    private void connect1277() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571834")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 730, 0.003, 610);
                        connect1278();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1278();
                    }
                });
    }

    //弯刀（★） | 深红之网 (略有磨损)
    private void connect1278() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15690")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 800, 0.11, 600);
                        connect1279();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1279();
                    }
                });
    }

    //弯刀（★） | 深红之网 (久经沙场)
    private void connect1279() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9530")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 520, 0.17, 400);
                        connect1280();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1280();
                    }
                });
    }

    //穿肠刀（★） | 自动化 (略有磨损)
    private void connect1280() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555287")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 700, 0.08, 600);
                        connect1281();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1281();
                    }
                });
    }

    //穿肠刀（★） | 自动化 (久经沙场)
    private void connect1281() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555629")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 600, 0.17, 500);
                        connect1283();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1283();
                    }
                });
    }

    //穿肠刀（★） | 伽玛多普勒 (崭新出厂)
    private void connect1282() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555181")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 620, 0.01, 500);
                        connect1283();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1283();
                    }
                });
    }

    //穿肠刀（★） | 虎牙 (崭新出厂)
    private void connect1283() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7188")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 500, 0.003, 400);
                        connect1284();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1284();
                    }
                });
    }

    //穿肠刀（★） | 传说 (崭新出厂)
    private void connect1284() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555624")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1200, 0.03, 1020);
                        connect1286();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1286();
                    }
                });
    }

    //穿肠刀（★） | 传说 (略有磨损)
    private void connect1285() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555630")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 870, 0.08, 760);
                        connect1286();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1286();
                    }
                });
    }

    //穿肠刀（★） | 传说 (久经沙场)
    private void connect1286() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555751")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 600, 0.17, 500);
                        connect1287();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1287();
                    }
                });
    }

    //穿肠刀（★） | 深红之网 (略有磨损)
    private void connect1287() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15688")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 550, 0.09, 450);
                        connect1288();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1288();
                    }
                });
    }

    //穿肠刀（★） | 深红之网 (久经沙场)
    private void connect1288() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/19646")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 400, 0.17, 300);
                        connect1289();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1289();
                    }
                });
    }

    //暗影双匕（★） | 渐变之色 (崭新出厂)
    private void connect1289() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11396")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 605, 0.01, 500);
                        connect1291();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1291();
                    }
                });
    }

    //暗影双匕（★） | 多普勒 (崭新出厂)
    private void connect1290() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571915")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 610, 0.01, 500);
                        connect1291();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1291();
                    }
                });
    }

    //暗影双匕（★） | 虎牙 (崭新出厂)
    private void connect1291() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571833")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 550, 0.01, 500);
                        connect1292();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1292();
                    }
                });
    }

    //短剑（★） | 深红之网 (略有磨损)
    private void connect1292() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615830")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1700, 0.09, 1300);
                        connect1293();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1293();
                    }
                });
    }

    //短剑（★） | 深红之网 (久经沙场)
    private void connect1293() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615688")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1000, 0.18, 640);
                        connect1295();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1295();
                    }
                });
    }

    //锯齿爪刀（★）
    private void connect1294() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615682")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1800, 0.10, 1600);
                        connect1295();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1295();
                    }
                });
    }

    //锯齿爪刀（★）|深红之网 (久经沙场)
    private void connect1295() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615682")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe3(response, 1600, 0.10, 1380);
                        if (Constant.BUFF == 1) {
                            mService.buffGuns.connect201();
                        }else {
                            mService.c5Guns.connect();
                        }
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        if (Constant.BUFF == 1) {
                            mService.buffGuns.connect201();
                        }else {
                            mService.c5Guns.connect();
                        }
                    }
                });
    }


}