package com.frank.csgo.service;

import com.frank.csgo.bean.Buff;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Glove.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/14 14:16
 * 类说明：
 */
public class BuffGloves extends BuffCheck{


    public BuffGloves(BuffService mService) {
        super(mService);
    }

    // 血猎手套（★） | 焦炭 (略有磨损)
    public void connect1100() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42452&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554954162295")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 焦炭 (略有磨损)");
                                handleDataForBuff(response, XL_JT_LM);
                                connect1101();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1101();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 焦炭 (久经沙场)
    private void connect1101() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42451&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554954189139")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 焦炭 (久经沙场)");
                                handleDataForBuff(response, XL_JT_JJ);
                                connect1102();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1102();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 蛇咬 (略有磨损)
    private void connect1102() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42459&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554955219035")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 蛇咬 (略有磨损)");
                                handleDataForBuff(response, XL_SY_LM);
                                connect1103();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1103();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 蛇咬 (久经沙场)
    private void connect1103() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42458&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554963091066")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 蛇咬 (久经沙场)");
                                handleDataForBuff(response, XL_SY_JJ);
                                connect1104();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1104();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 染铜 (略有磨损)
    private void connect1104() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42448&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554964002854")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 染铜 (略有磨损)");
                                handleDataForBuff(response, XL_RT_LM);
                                connect1105();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1105();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 染铜 (久经沙场)
    private void connect1105() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42447&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554964331519")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 染铜 (久经沙场)");
                                handleDataForBuff(response, XL_RT_JJ);
                                connect1106();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1106();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 游击队 (略有磨损)
    private void connect1106() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42456&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554967238015")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 游击队 (略有磨损)");
                                handleDataForBuff(response, XL_YJD_LM);
                                connect1107();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1107();
                            }
                        });
            }
        });
    }

    // 血猎手套（★） | 游击队 (久经沙场)
    private void connect1107() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42455&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554968008907")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "血猎手套（★） | 游击队 (久经沙场)");
                                handleDataForBuff(response, XL_YJD_JJ);
                                connect1108();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1108();
                            }
                        });
            }
        });
    }

    // 驾驶手套（★） | 深红织物 (久经沙场)
    private void connect1108() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42602&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554968980127")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 深红织物 (久经沙场)");
                                handleDataForBuff(response, XL_SHZW_JJ);
                                connect1109();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1109();
                            }
                        });
            }
        });
    }

    // 驾驶手套（★） | 紫蓝格子 (久经沙场)
    private void connect1109() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45549&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969156076")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 紫蓝格子 (久经沙场)");
                                handleDataForBuff(response, XL_LZGZ_JJ);
                                connect1110();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1110();
                            }
                        });
            }
        });
    }

    // 驾驶手套（★） | 王蛇 (久经沙场)
    private void connect1110() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45549&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969156076")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 王蛇 (久经沙场)");
                                handleDataForBuff(response, XL_WS_JJ);
                                connect1111();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1111();
                            }
                        });
            }
        });
    }

    // 驾驶手套（★） | 月色织物 (略有磨损)
    private void connect1111() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42612&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969582539")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 月色织物 (略有磨损)");
                                handleDataForBuff(response, XL_YSZW_LM);
                                connect1112();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1112();
                            }
                        });
            }
        });
    }

    //  驾驶手套（★） | 月色织物 (久经沙场)
    private void connect1112() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42611&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969741663")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 月色织物 (久经沙场)");
                                handleDataForBuff(response, XL_YSZW_JJ);
                                connect1113();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1113();
                            }
                        });
            }
        });
    }

    //  驾驶手套（★） | 超越 (略有磨损)
    private void connect1113() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45533&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969918026")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 超越 (略有磨损)");
                                handleDataForBuff(response, JS_CY_LM);
                                connect1114();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1114();
                            }
                        });
            }
        });
    }

    //  驾驶手套（★） | 超越 (久经沙场)
    private void connect1114() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45492&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969980079")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 超越 (久经沙场)");
                                handleDataForBuff(response, JS_CY_JJ);
                                connect1115();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1115();
                            }
                        });
            }
        });
    }

    //  驾驶手套（★） | 菱背蛇纹 (略有磨损)
    private void connect1115() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42608&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970478588")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 菱背蛇纹 (略有磨损)");
                                handleDataForBuff(response, JS_LBSW_LM);
                                connect1116();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1116();
                            }
                        });
            }
        });
    }

    //  驾驶手套（★） | 护卫 (略有磨损)
    private void connect1116() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42599&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970616830")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 护卫 (略有磨损)");
                                handleDataForBuff(response, JS_HW_LM);
                                connect1117();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1117();
                            }
                        });
            }
        });
    }

    //  驾驶手套（★） | 墨绿色调(略有磨损)
    private void connect1117() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45551&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970727376")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "驾驶手套（★） | 墨绿色调(略有磨损)");
                                handleDataForBuff(response, JS_MLSD_LM);
                                connect1118();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1118();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 钴蓝骷髅 (久经沙场)
    private void connect1118() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45471&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970803831")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 钴蓝骷髅 (久经沙场)");
                                handleDataForBuff(response, GS_GLKL_JJ);
                                connect1119();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1119();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 屠夫 (略有磨损)
    private void connect1119() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42884&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970914561")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 屠夫 (略有磨损)");
                                handleDataForBuff(response, GS_TF_LM);
                                connect1120();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1120();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 屠夫 (久经沙场)
    private void connect1120() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42883&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971128994")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 屠夫 (久经沙场)");
                                handleDataForBuff(response, GS_TF_JJ);
                                connect1121();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1121();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 恶土 (略有磨损)
    private void connect1121() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42876&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971191720")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 恶土 (略有磨损)");
                                handleDataForBuff(response, GS_ET_LM);
                                connect1122();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1122();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 恶土 (久经沙场)
    private void connect1122() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42875&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971266994")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 恶土 (久经沙场)");
                                handleDataForBuff(response, GS_ET_JJ);
                                connect1123();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1123();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 皮革 (略有磨损)
    private void connect1123() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42880&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971410718")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 皮革 (略有磨损)");
                                handleDataForBuff(response, GS_PG_LM);
                                connect1124();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1124();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 皮革 (久经沙场)
    private void connect1124() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42879&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971486082")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 皮革 (久经沙场)");
                                handleDataForBuff(response, GS_PG_JJ);
                                connect1125();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1125();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 森林色调 (略有磨损)
    private void connect1125() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45506&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971920868")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 森林色调 (略有磨损)");
                                handleDataForBuff(response, GS_SLSD_LM);
                                connect1126();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1126();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 森林色调 (久经沙场)
    private void connect1126() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45450&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971989125")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 森林色调 (久经沙场)");
                                handleDataForBuff(response, GS_SLSD_JJ);
                                connect1127();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1127();
                            }
                        });
            }
        });
    }

    //  裹手（★） | 云杉DDPAT(略有磨损)
    private void connect1127() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42889&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972053819")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "裹手（★） | 云杉DDPAT(略有磨损)");
                                handleDataForBuff(response, GS_YS_LM);
                                connect1128();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1128();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 薄荷 (久经沙场)
    private void connect1128() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43159&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972194963")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 薄荷 (久经沙场)");
                                handleDataForBuff(response, GS_BH_JJ);
                                connect1129();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1129();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 清凉薄荷 (略有磨损)
    private void connect1129() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43152&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972524257")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 清凉薄荷 (略有磨损)");
                                handleDataForBuff(response, MT_QLBH_LM);
                                connect1130();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1130();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 清凉薄荷 (久经沙场)
    private void connect1130() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43151&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972733525")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 清凉薄荷 (久经沙场)");
                                handleDataForBuff(response, MT_QLBH_JJ);
                                connect1131();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1131();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | *嘣！* (略有磨损)
    private void connect1131() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43148&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973056441")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | *嘣！* (略有磨损)");
                                handleDataForBuff(response, MT_B_LM);
                                connect1132();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1132();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | *嘣！* (久经沙场)
    private void connect1132() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43147&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973267137")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | *嘣！* (久经沙场)");
                                handleDataForBuff(response, MT_B_JJ);
                                connect1133();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1133();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 嘭！ (久经沙场)
    private void connect1133() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45432&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973333338")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 嘭！ (久经沙场)");
                                handleDataForBuff(response, MT_P_LM);
                                connect1134();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1134();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 交运 (略有磨损)
    private void connect1134() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45493&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973453800")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 交运 (略有磨损)");
                                handleDataForBuff(response, MT_JY_LM);
                                connect1135();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1135();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 交运 (久经沙场)
    private void connect1135() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 交运 (久经沙场)");
                                handleDataForBuff(response, MT_JY_JJ);
                                connect1136();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1136();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 多边形 (久经沙场)
    private void connect1136() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45473&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975231755")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 多边形 (久经沙场)");
                                handleDataForBuff(response, MT_DBX_JJ);
                                connect1137();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1137();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 玳瑁 (久经沙场)
    private void connect1137() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45488&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975287147")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 玳瑁 (久经沙场)");
                                handleDataForBuff(response, MT_DM_JJ);
                                connect1138();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1138();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 日蚀 (略有磨损)
    private void connect1138() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43156&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975370979")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 日蚀 (略有磨损)");
                                handleDataForBuff(response, MT_RS_LM);
                                connect1139();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1139();
                            }
                        });
            }
        });
    }

    //  摩托手套（★） | 日蚀 (久经沙场)
    private void connect1139() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43155&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975418874")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "摩托手套（★） | 日蚀 (久经沙场)");
                                handleDataForBuff(response, MT_RS_JJ);
                                connect1140();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1140();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 深红和服 (久经沙场)
    private void connect1140() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43233&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975545829")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 深红和服 (久经沙场)");
                                handleDataForBuff(response, ZY_SHHF_JJ);
                                connect1141();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1141();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 深红之网 (略有磨损)
    private void connect1141() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=422853&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975679756")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 深红之网 (略有磨损)");
                                handleDataForBuff(response, ZY_SHZW_LM);
                                connect1142();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1142();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 深红之网 (久经沙场)
    private void connect1142() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45412&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975733233")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, ZY_SHZW_JJ);
                                connect1143();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1143();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 大腕 (略有磨损)
    private void connect1143() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45606&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975801052")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 大腕 (略有磨损)");
                                handleDataForBuff(response, ZY_DW_LM);
                                connect1144();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1144();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 大腕 (久经沙场)
    private void connect1144() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45376&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975861228")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 大腕 (久经沙场)");
                                handleDataForBuff(response, ZY_DW_JJ);
                                connect1145();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1145();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 元勋 (略有磨损)
    private void connect1145() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43247&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975925016")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 元勋 (略有磨损)");
                                handleDataForBuff(response, ZY_YX_LM);
                                connect1146();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1146();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 元勋 (久经沙场)
    private void connect1146() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43246&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975968513")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 元勋 (久经沙场)");
                                handleDataForBuff(response, ZY_YX_JJ);
                                connect1147();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1147();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 渐变之色 (久经沙场)
    private void connect1147() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45508&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976006928")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 渐变之色 (久经沙场)");
                                handleDataForBuff(response, ZY_JBZS_JJ);
                                connect1148();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1148();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1148() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43237&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976048425")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 翠绿之网 (久经沙场)");
                                handleDataForBuff(response, ZY_CLZW_JJ);
                                connect1150();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1150();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1149() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 翠绿之网 (久经沙场)");
                                handleDataForBuff(response, ZY_CLZW_JJ);
                                connect1136();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1136();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 狩鹿(略有磨损)
    private void connect1150() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45565&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976119916")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 狩鹿(略有磨损)");
                                handleDataForBuff(response, ZY_SL_LM);
                                connect1152();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1152();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 狩鹿(久经沙场)
    private void connect1151() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 狩鹿(久经沙场)");
                                handleDataForBuff(response, ZY_SL_JJ);
                                connect1136();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1136();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 森林 DDPAT (略有磨损)
    private void connect1152() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43243&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976180417")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 森林 DDPAT (略有磨损)");
                                handleDataForBuff(response, ZY_SLD_LM);
                                connect1154();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1154();
                            }
                        });
            }
        });
    }
    //  专业手套（★） | 森林 DDPAT (久经沙场)
    private void connect1153() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "专业手套（★） | 森林 DDPAT (久经沙场)");
                                handleDataForBuff(response, ZY_SLD_JJ);
                                connect1136();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1136();
                            }
                        });
            }
        });
    }
    //  运动手套（★） | 潘多拉之盒(久经沙场)
    private void connect1154() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43259&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976240458")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "运动手套（★） | 潘多拉之盒(久经沙场)");
                                handleDataForBuff(response, YD_PDLZH_JJ);
                                connect1155();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1155();
                            }
                        });
            }
        });
    }
    //  运动手套（★） | 迈阿密风云(久经沙场)
    private void connect1155() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45582&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976379943")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "运动手套（★） | 迈阿密风云(久经沙场)");
                                handleDataForBuff(response, YD_MAMFY_JJ);
                                connect1156();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1156();
                            }
                        });
            }
        });
    }
    //  运动手套（★） | 超导体(久经沙场)
    private void connect1156() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43262&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976864300")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "运动手套（★） | 超导体(久经沙场)");
                                handleDataForBuff(response, YD_CDT_JJ);
                                connect1157();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1157();
                            }
                        });
            }
        });
    }
    //  运动手套（★） | 树篱迷宫(久经沙场)
    private void connect1157() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43255&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976911891")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "运动手套（★） | 树篱迷宫(久经沙场)");
                                handleDataForBuff(response, YD_SLMG_JJ);
                                connect1158();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1158();
                            }
                        });
            }
        });
    }
    //  运动手套（★） | 双栖(久经沙场)
    private void connect1158() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45451&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976963839")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "运动手套（★） | 双栖(久经沙场)");
                                handleDataForBuff(response, YD_SX_JJ);
                                connect1159();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1159();
                            }
                        });
            }
        });
    }
    //  运动手套（★） | 欧米伽(久经沙场)
    private void connect1159() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45509&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977093242")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "运动手套（★） | 欧米伽(久经沙场)");
                                handleDataForBuff(response, YD_OMJ_JJ);
                                connect1160();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1160();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 表面淬火(略有磨损)
    private void connect1160() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45556&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977150918")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 表面淬火(略有磨损)");
                                handleDataForBuff(response, JTS_BMCH_LM);
                                connect1161();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1161();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 表面淬火(久经沙场)
    private void connect1161() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45431&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977202481")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 表面淬火(久经沙场)");
                                handleDataForBuff(response, JTS_BMCH_JJ);
                                connect1162();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1162();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 翡翠色调(略有磨损)
    private void connect1162() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45579&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977262000")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 翡翠色调(略有磨损)");
                                handleDataForBuff(response, JTS_FCSD_LM);
                                connect1163();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1163();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 翡翠色调(久经沙场)
    private void connect1163() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45558&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977309970")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 翡翠色调(久经沙场)");
                                handleDataForBuff(response, JTS_FCSD_JJ);
                                connect1164();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1164();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 响尾蛇(略有磨损)
    private void connect1164() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45472&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977351879")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 响尾蛇(略有磨损)");
                                handleDataForBuff(response, JTS_XWS_LM);
                                connect1165();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1165();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 响尾蛇(久经沙场)
    private void connect1165() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45410&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977393624")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 响尾蛇(久经沙场)");
                                handleDataForBuff(response, JTS_XWS_JJ);
                                mService.startScan();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                mService.startScan();
                            }
                        });
            }
        });
    }
    // 九头蛇手套（★） | 红树林(略有磨损)
    private void connect1166() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45512&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977448300")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "九头蛇手套（★） | 红树林(略有磨损)");
                                handleDataForBuff(response, JTS_HSL_LM);
                                mService.startScan();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                mService.startScan();
                            }
                        });
            }
        });
    }
}