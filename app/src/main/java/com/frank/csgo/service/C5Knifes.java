package com.frank.csgo.service;

import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Knife.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/15 15:32
 * 类说明：
 */
public class C5Knifes extends C5Check{


    public C5Knifes(C5Service service) {
        super(service);
    }

    // 折叠刀（★） | 深红之网 (略有磨损)
    public void connect1200() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=480376426&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZDD_SHZW_LM);
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
                        handleDataC5(response, ZDD_SHZW_JJ);
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
                        handleDataC5(response, 750, 0.09, 600);
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
                        handleDataC5(response, ZDD_CS_ZX);
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
                        handleDataC5(response, ZDD_CS_JJ);
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
                        handleDataC5(response, ZDD_ZDH_LM);
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
                        handleDataC5(response, ZDD_ZDH_JJ);
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
                        handleDataC5(response, ZDD_HY_ZX);
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
                        handleDataC5(response, CD_CS_JJ);
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
                        handleDataC5(response, CD_ZDH_JJ);
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
                        handleDataC5(response, CD_ZDH_LM);
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
                        handleDataC5(response, CD_SHZW_LM);
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
                        handleDataC5(response, CD_SHZW_JJ);
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
                        handleDataC5(response, CD_DPL_ZX,true);
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
                        handleDataC5(response, CD_HY_ZX);
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
                        handleDataC5(response, M9_HY_ZX);
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
                        handleDataC5(response, M9_ZDH_JJ);
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
                        handleDataC5(response, M9_DPL_ZX,true);
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
                        handleDataC5(response, M9_CS_JJ);
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
                        handleDataC5(response, M9_SHZW_LM);
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
                        handleDataC5(response, M9_SHZW_JJ);
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
                        handleDataC5(response, M9_BFSL_JJ);
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
                        handleDataC5(response, HDD_WTZ);
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
                        handleDataC5(response, HDD_SHZW_JJ);
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
                        handleDataC5(response, HDD_BFSL_LM);
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
                        handleDataC5(response, HDD_BFSL_JJ);
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
                        handleDataC5(response, HDD_EMZY_LM);
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
                        handleDataC5(response, HDD_EMZY_JJ);
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
                        handleDataC5(response, HDD_SLD_LM);
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
                        handleDataC5(response, ZZD_WTZ);
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
                        handleDataC5(response, ZZD_ZDH_JJ);
                        connect1243();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1243();
                    }
                });
    }

    //爪子刀（★） | 虎牙 (崭新出厂)
    private void connect1242() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=246308426&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZZD_HY_ZX);
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
                        handleDataC5(response, ZZD_CS_JJ);
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
                        handleDataC5(response, ZZD_SHZW_JJ);
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
                        handleDataC5(response, ZZD_SLD_LM);
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
                        handleDataC5(response, ZZD_SLD_JJ);
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
                        handleDataC5(response, ZZD_BFSL_LM);
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
                        handleDataC5(response, ZZD_BFSL_JJ);
                        connect1254();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1254();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变大理石 (崭新出厂)
    private void connect1250() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553388741&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, LSZ_JBDLS_ZX);
                        connect1254();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1254();
                    }
                });
    }

    //猎杀者匕首（★） | 多普勒 (崭新出厂)
    private void connect1251() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571856")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, LSZ_DPL_ZX,true);
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
                        handleDataC5(response, LSZ_DPL_ZX);
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
                        handleDataC5(response, LSZ_SHZW_LM);
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
                        handleDataC5(response, LSZ_SHZW_JJ);
                        connect1260();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1260();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变之色 (崭新出厂)
    private void connect1255() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/15680")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, LSZ_JBZS_ZX);
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
                        handleDataC5(response, LSZ_HY_ZX);
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
                        handleDataC5(response, LSZ_WTZ);
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
                        handleDataC5(response, XD_SHZW_JJ);
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
                        connect1293();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        handleDataC5(response, XD_WTZ);
                        connect1293();
                    }
                });
    }

    //鲍伊猎刀（★） | 多普勒 (崭新出厂)
    private void connect1271() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571703")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 1000, 0.01, 900);
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
                        handleDataC5(response, 1300, 0.10, 1050);
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
                        handleDataC5(response, 770, 0.19, 600);
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
                        handleDataC5(response, 850, 0.01, 750);
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
                        handleDataC5(response, 900, 0.01, 800);
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
                        handleDataC5(response, 900, 0.01, 800);
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
                        handleDataC5(response, 730, 0.003, 610);
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
                        handleDataC5(response, 800, 0.11, 600);
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
                        handleDataC5(response, 520, 0.17, 400);
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
                        handleDataC5(response, 700, 0.08, 600);
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
                        handleDataC5(response, 600, 0.17, 500);
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
                        handleDataC5(response, 620, 0.01, 500);
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
                        handleDataC5(response, 500, 0.003, 400);
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
                        handleDataC5(response, 1200, 0.02, 1020);
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
                        handleDataC5(response, 830, 0.08, 760);
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
                        handleDataC5(response, 600, 0.17, 500);
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
                        handleDataC5(response, 550, 0.09, 450);
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
                        handleDataC5(response, 400, 0.17, 300);
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
                        handleDataC5(response, 605, 0.01, 500);
                        connect1292();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1292();
                    }
                });
    }

    //暗影双匕（★） | 多普勒 (崭新出厂)
    private void connect1290() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/571915")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 610, 0.01, 500);
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
                        handleDataC5(response, 550, 0.003, 500);
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
                        handleDataC5(response, DJ_SHZW_LM);
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
                        handleDataC5(response, DJ_SHZW_JJ);
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
                        handleDataC5(response, JCZD_WTZ);
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
                        handleDataC5(response, JCZD_SHZW_JJ);
                        connect1296();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
                        connect1296();
                    }
                });
    }

    //蝴蝶刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1296() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382312&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, HDD_ZMZLL_JJ);
                        connect1297();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1297();
                        super.onError(response);
                    }
                });
    }
    //刺刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1297() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553379884&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, CD_ZMZLL_LM);
                        connect1298();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1298();
                        super.onError(response);
                    }
                });
    }
    //M9刺刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1298() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=972081&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M9_ZMZLL_JJ);
                        connect1299();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1299();
                        super.onError(response);
                    }
                });
    }
    //爪子刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1299() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=158114591&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZZD_ZMZLL_JJ);
                        connect1300();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1300();
                        super.onError(response);
                    }
                });
    }
    //爪子刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1300() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=337111255&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZZD_ZMZLL_LM);
                        connect1301();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1301();
                        super.onError(response);
                    }
                });
    }
    //熊刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1301() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553465654&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XD_ZMZLL_JJ);
                        connect1302();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1302();
                        super.onError(response);
                    }
                });
    }
    //猎杀者匕首（★） | 致命紫罗兰 (略有磨损)
    private void connect1302() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553404959&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, LSZ_ZMZLL_LM);
                        connect1303();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1303();
                        super.onError(response);
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (略有磨损)
    private void connect1303() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=54290774&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, HDD_EMZY_LM);
                        connect1304();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1304();
                        super.onError(response);
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (久经沙场)
    private void connect1304() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=89492705&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, HDD_EMZY_JJ);
                        connect1305();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1305();
                        super.onError(response);
                    }
                });
    }

    //M9刺刀（★） | 噩梦之夜 (略有磨损)
    private void connect1305() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553379748&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M9_EMZY_LM);
                        connect1306();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1306();
                        super.onError(response);
                    }
                });
    }
    //M9刺刀（★） | 噩梦之夜 (久经沙场)
    private void connect1306() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=470633930&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M9_EMZY_JJ);
                        connect1307();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1307();
                        super.onError(response);
                    }
                });
    }

    //爪子刀（★） | 噩梦之夜 (久经沙场)
    private void connect1307() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2925249&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZZD_EMZY_JJ);
                        connect1308();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1308();
                        super.onError(response);
                    }
                });
    }

    //爪子刀（★） | 噩梦之夜 (略有磨损)
    private void connect1308() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=49315301&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZZD_EMZY_LM);
                        connect1309();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1309();
                        super.onError(response);
                    }
                });
    }

    //刺刀（★） | 噩梦之夜 (略有磨损)
    private void connect1309() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381353&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, CD_EMZY_LM);
                        connect1310();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1310();
                        super.onError(response);
                    }
                });
    }

    //刺刀（★） | 噩梦之夜 (久经沙场)
    private void connect1310() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=11070474&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, CD_EMZY_JJ);
                        connect1311();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1311();
                        super.onError(response);
                    }
                });
    }

    //猎杀者匕首（★） | 噩梦之夜 (略有磨损)
    private void connect1311() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553384054&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, LSZ_EMZY_LM);
                        connect1312();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1312();
                        super.onError(response);
                    }
                });
    }

    //猎杀者匕首（★） | 噩梦之夜 (久经沙场)
    private void connect1312() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=26044759&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, LSZ_EMZY_JJ);
                        connect1313();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1313();
                        super.onError(response);
                    }
                });
    }

    //折叠刀（★） | 噩梦之夜 (略有磨损)
    private void connect1313() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=268091170&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZDD_EMZY_LM);
                        connect1314();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1314();
                        super.onError(response);
                    }
                });
    }

    //折叠刀（★） | 噩梦之夜 (久经沙场)
    private void connect1314() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=26044732&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZDD_EMZY_JJ);
                        mService.c5Gloves.connect1100();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        mService.c5Gloves.connect1100();
                        super.onError(response);
                    }
                });
    }

}