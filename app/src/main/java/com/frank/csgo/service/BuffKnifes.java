package com.frank.csgo.service;

import com.frank.csgo.bean.Buff;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Knife.*;
/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/15 15:32
 * 类说明：
 */
public class BuffKnifes extends BuffCheck{


    public BuffKnifes(BuffService mService) {
        super(mService);
    }

    // 折叠刀（★） | 深红之网 (略有磨损)
    public void connect3200() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42713&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551061110945")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "折叠刀（★） | 深红之网 (略有磨损)");
                        handleDataForBuff(response, ZDD_SHZW_LM);
                        connect3201();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3201();
                    }
                });
            }
         });
    }

    // 折叠刀（★） | 深红之网 (久经沙场)
    private void connect3201() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42712&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551061367817")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "折叠刀（★） | 深红之网 (久经沙场)");
                        handleDataForBuff(response, ZDD_SHZW_JJ);
                        connect3204();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3204();
                    }
                });
            }
         });
    }
    // 折叠刀（★） | 致命紫罗兰 (略有磨损)
    private void connect3202() {
    }

    // 折叠刀（★） | 传说 (崭新出厂)
    private void connect3203() {

    }

    // 折叠刀（★） | 传说 (久经沙场)
    private void connect3204() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42738&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551061756758")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "折叠刀（★） | 传说 (久经沙场)");
                        handleDataForBuff(response, ZDD_CS_JJ);
                        connect3205();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3205();
                    }
                });
            }
         });
    }

    //   折叠刀（★） | 自动化 (略有磨损)
    private void connect3205() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42686&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062070434")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "折叠刀（★） | 自动化 (略有磨损)");
                        handleDataForBuff(response, ZDD_ZDH_LM);
                        connect3206();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3206();
                    }
                });
            }
         });
    }
    //   折叠刀（★） | 自动化 (久经沙场)
    private void connect3206() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42685&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062111330")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "折叠刀（★） | 自动化 (久经沙场)");
                        handleDataForBuff(response, ZDD_ZDH_JJ);
                        connect3211();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3211();
                    }
                });
            }
         });
    }

    //   折叠刀（★） | 虎牙 (崭新出厂)
    private void connect3207() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42768&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062480681")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "折叠刀（★） | 虎牙 (崭新出厂)");
                        handleDataForBuff(response, ZDD_HY_ZX);
                        connect3211();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3211();
                    }
                });
            }
         });
    }

    //   刺刀（★） | 传说 (久经沙场)
    private void connect3211() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42406&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062594118")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "刺刀（★） | 传说 (久经沙场)");
                        handleDataForBuff(response, CD_CS_JJ);
                        connect3212();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3212();
                    }
                });
            }
         });
    }

    //   刺刀（★） | 自动化 (久经沙场)
    private void connect3212() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42352&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062754150")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "刺刀（★） | 自动化 (久经沙场)");
                        handleDataForBuff(response, CD_ZDH_JJ);
                        connect3213();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3213();
                    }
                });
            }
         });
    }

    //   刺刀（★） | 自动化 (略有磨损)
    private void connect3213() {
         mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42353&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554886698933")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "刺刀（★） | 自动化 (略有磨损)");
                        handleDataForBuff(response, CD_ZDH_LM);
                        connect3214();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect3214();
                    }
                });
            }
         });
    }

//       刺刀（★） | 深红之网 (略有磨损)
    private void connect3214() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42382&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554886956228")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "刺刀（★） | 深红之网 (略有磨损)");
                                handleDataForBuff(response, CD_SHZW_LM);
                                connect3215();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3215();
                            }
                        });
            }
        });

    }
//
//    //   刺刀（★） | 深红之网 (久经沙场)
    private void connect3215() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42381&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887089740")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "刺刀（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, CD_SHZW_JJ);
                                connect3222();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3222();
                            }
                        });
            }
        });

    }

//    //   刺刀（★） | 多普勒 (崭新出厂)
//    private void connect3216() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/5563")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1150, 0.01, 1000);
//                        connect3217();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3217();
//                    }
//                });
//    }
//
//    //   刺刀（★） | 虎牙 (崭新出厂)
    private void connect3217() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42434&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887393940")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "刺刀（★） | 虎牙 (崭新出厂)");
                                handleDataForBuff(response, CD_HY_ZX);
                                connect3221();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3221();
                            }
                        });
            }
        });

    }
//
//    //    "M9 刺刀（★） | 虎牙 (崭新出厂)",
    private void connect3221() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43136&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887562915")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M9 刺刀（★） | 虎牙 (崭新出厂)");
                                handleDataForBuff(response, M9_HY_ZX);
                                connect3222();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3222();
                            }
                        });
            }
        });

    }
//
//    //   M9 刺刀（★） | 自动化 (久经沙场)
    private void connect3222() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43055&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887726414")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M9 刺刀（★） | 自动化 (久经沙场)");
                                handleDataForBuff(response, M9_ZDH_JJ);
                                connect3224();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3224();
                            }
                        });
            }
        });
    }
//
//
//    M9 刺刀（★） | 多普勒 (崭新出厂)
//    private void connect3223() {
//        mService.post(new Runnable() {
//            @Override
//            public void run() {
//                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43055&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887726414")
//                        .execute(new JsonCallback<Buff>(Buff.class) {
//                            @Override
//                            public void onSuccess(Response<Buff> response) {
//                                fillBuff(response, "M9 刺刀（★） | 自动化 (久经沙场)");
//                                handleDataForBuff(response, 1500, 0.25);
//                                connect3223();
//                            }
//
//                            @Override
//                            public void onError(Response<Buff> response) {
//                                connect3223();
//                            }
//                        });
//            }
//        });
//    }
//
//    //   M9 刺刀（★） | 传说 (久经沙场)
    private void connect3224() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43107&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887901126")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M9 刺刀（★） | 传说 (久经沙场)");
                                handleDataForBuff(response, M9_CS_JJ);
                                connect3225();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3225();
                            }
                        });
            }
        });
    }
//
//    //   M9 刺刀（★） | 深红之网 (略有磨损)
    private void connect3225() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43084&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888007063")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M9 刺刀（★） | 深红之网 (略有磨损)");
                                handleDataForBuff(response, M9_SHZW_LM);
                                connect3226();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3226();
                            }
                        });
            }
        });
    }
//
//    //   M9 刺刀（★） | 深红之网 (久经沙场)
    private void connect3226() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43083&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888258479")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M9 刺刀（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, M9_SHZW_JJ);
                                connect3232();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3232();
                            }
                        });
            }
        });
    }
//
//    //   M9 刺刀（★） | 北方森林 (久经沙场)
//    private void connect3227() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/11232")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 600, 0.17, 500);
//                        connect3231();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3231();
//                    }
//                });
//    }
//
//    //   蝴蝶刀（★）
//    private void connect3231() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/3985")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1450, 0.16, 1300);
//                        connect3232();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3232();
//                    }
//                });
//    }
//
//    //   蝴蝶刀（★） | 深红之网 (久经沙场)
    private void connect3232() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42547&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888415762")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "蝴蝶刀（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, HDD_SHZW_JJ);
                                connect3233();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3233();
                            }
                        });
            }
        });
    }
//
//    //   蝴蝶刀（★） | 北方森林 (略有磨损)
    private void connect3233() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42539&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888538319")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "蝴蝶刀（★） | 北方森林 (略有磨损)");
                                handleDataForBuff(response, HDD_BFSL_LM);
                                connect3241();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3241();
                            }
                        });
            }
        });
    }
//
//    //   蝴蝶刀（★） | 北方森林 (久经沙场)
//    private void connect3234() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/18312")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 800, 0.17, 700);
//                        connect3235();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3235();
//                    }
//                });
//    }
//
//    //   蝴蝶刀（★） | 噩梦之夜 (略有磨损)
//    private void connect3235() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/17636")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1500, 0.10, 1200);
//                        connect3236();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3236();
//                    }
//                });
//    }
//
//    //   蝴蝶刀（★） | 噩梦之夜 (久经沙场)
//    private void connect3236() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/5566")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 950, 0.18, 800);
//                        connect3237();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3237();
//                    }
//                });
//    }
//
//    //   蝴蝶刀（★） | 森林DDPAT (略有磨损)
//    private void connect3237() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/4418")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 900, 0.09, 750);
//                        connect3240();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        connect3240();
//                    }
//                });
//    }
//
//    //爪子刀 无涂装
//    private void connect3240() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/5211")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1360, 0.12, 1200);
//                        connect3241();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3241();
//                    }
//                });
//    }
//
//    //爪子刀（★） | 自动化 (久经沙场)
    private void connect3241() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42964&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888716058")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "爪子刀（★） | 自动化 (久经沙场)");
                                handleDataForBuff(response, ZZD_ZDH_JJ);
                                connect3243();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3243();
                            }
                        });
            }
        });
    }
//
//    //爪子刀（★） | 虎牙 (崭新出厂)
//    private void connect3242() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/4003")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 2000, 0.01, 1800);
//                        connect3243();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3243();
//                    }
//                });
//    }
//
//    //爪子刀（★） | 传说 (久经沙场)
    private void connect3243() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42964&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888716058")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "爪子刀（★） | 传说 (久经沙场)");
                                handleDataForBuff(response, ZZD_CS_JJ);
                                connect3244();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3244();
                            }
                        });
            }
        });
    }
//
//    //爪子刀（★） | 深红之网 (久经沙场)
    private void connect3244() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42990&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888998839")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "爪子刀（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, ZZD_SHZW_JJ);
                                connect3245();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3245();
                            }
                        });
            }
        });
    }
//
    //爪子刀（★） | 森林 DDPAT (略有磨损)
    private void connect3245() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43004&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889133184")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "爪子刀（★） | 森林 DDPAT (略有磨损)");
                                handleDataForBuff(response, ZZD_SLD_LM);
                                connect3247();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3247();
                            }
                        });
            }
        });
    }
//
//    //爪子刀（★） | 森林 DDPAT (久经沙场)
//    private void connect3246() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/11158")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 750, 0.17, 600);
//                        connect3247();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3247();
//                    }
//                });
//    }
//
    //爪子刀（★） | 北方森林 (略有磨损)
    private void connect3247() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42978&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889247843")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "爪子刀（★） | 北方森林 (略有磨损)");
                                handleDataForBuff(response, ZZD_BFSL_LM);
                                connect3253();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3253();
                            }
                        });
            }
        });
    }
//
//    //爪子刀（★） | 北方森林 (久经沙场)
//    private void connect3248() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/8880")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 750, 0.17, 600);
//                        connect3250();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3250();
//                    }
//                });
//    }
//
//    //猎杀者匕首（★） | 渐变大理石 (崭新出厂)
//    private void connect3250() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571592")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1150, 0.01, 1010);
//                        connect3251();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3251();
//                    }
//                });
//    }
//
//    //猎杀者匕首（★） | 多普勒 (崭新出厂)
//    private void connect3251() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571856")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1050, 0.01, 900);
//                        connect3252();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3252();
//                    }
//                });
//    }
//
//    //猎杀者匕首（★） | 多普勒 (崭新出厂)
//    private void connect3252() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571856")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1050, 0.01, 900);
//                        connect3253();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3253();
//                    }
//                });
//    }
//
    //猎杀者匕首（★） | 深红之网 (略有磨损)
    private void connect3253() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42910&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889348366")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "猎杀者匕首（★） | 深红之网 (略有磨损)");
                                handleDataForBuff(response, LSZ_SHZW_LM);
                                connect3254();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3254();
                            }
                        });
            }
        });
    }
//
    //猎杀者匕首（★） | 深红之网 (久经沙场)
    private void connect3254() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42909&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889412405")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "猎杀者匕首（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, LSZ_SHZW_JJ);
                                connect3260();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3260();
                            }
                        });
            }
        });
    }
//
//    //猎杀者匕首（★） | 渐变之色 (崭新出厂)
//    private void connect3255() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/15680")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 620, 0.01, 500);
//                        connect3256();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3256();
//                    }
//                });
//    }
//
//    //猎杀者匕首（★） | 虎牙 (渐变之色)
//    private void connect3256() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571718")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 830, 0.01, 740);
//                        connect3257();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3257();
//                    }
//                });
//    }
//
//    //猎杀者匕首（★）
//    private void connect3257() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/6964")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 620, 0.16, 500);
//                        connect3260();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3260();
//                    }
//                });
//    }
//
    //熊刀（★） | 深红之网 (久经沙场)
    private void connect3260() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759405&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889684277")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "熊刀（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, XD_SHZW_JJ);
                                connect3261();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3261();
                            }
                        });
            }
        });
    }
//
    //熊刀（★）
    private void connect3261() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759460&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889773265")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "熊刀（★）");
                                handleDataForBuff(response, XD_WTZ);
                                connect3293();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3293();
                            }
                        });
            }
        });
    }
//
//    //鲍伊猎刀（★） | 多普勒 (崭新出厂)
//    private void connect3271() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571703")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1000, 0.01, 900);
//                        connect3272();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3272();
//                    }
//                });
//    }
//
//    //鲍伊猎刀（★） | 深红之网 (略有磨损)
//    private void connect3272() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/103983")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1300, 0.10, 1050);
//                        connect3273();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3273();
//                    }
//                });
//    }
//
//    //鲍伊猎刀（★） | 深红之网 (久经沙场)
//    private void connect3273() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/121349")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 770, 0.19, 600);
//                        connect3274();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3274();
//                    }
//                });
//    }
//
//    //鲍伊猎刀（★） | 虎牙 (崭新出厂)
//    private void connect3274() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571701")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 880, 0.01, 800);
//                        connect3275();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3275();
//                    }
//                });
//    }
//
//    //弯刀（★） | 多普勒 (崭新出厂)
//    private void connect3275() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571789")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 900, 0.01, 800);
//                        connect3276();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3276();
//                    }
//                });
//    }
//
//    //弯刀（★） | 渐变大理石 (崭新出厂)
//    private void connect3276() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571713")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 900, 0.01, 800);
//                        connect3277();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3277();
//                    }
//                });
//    }
//
//    //弯刀（★） | 虎牙 (崭新出厂)
//    private void connect3277() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571834")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 730, 0.01, 610);
//                        connect3278();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3278();
//                    }
//                });
//    }
//
//    //弯刀（★） | 深红之网 (略有磨损)
//    private void connect3278() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/15690")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 800, 0.11, 600);
//                        connect3279();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3279();
//                    }
//                });
//    }
//
//    //弯刀（★） | 深红之网 (久经沙场)
//    private void connect3279() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/9530")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 520, 0.17, 400);
//                        connect3280();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3280();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 自动化 (略有磨损)
//    private void connect3280() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/555287")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 700, 0.08, 600);
//                        connect3281();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3281();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 自动化 (久经沙场)
//    private void connect3281() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/555629")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 600, 0.17, 500);
//                        connect3282();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3282();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 伽玛多普勒 (崭新出厂)
//    private void connect3282() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/555181")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 620, 0.01, 500);
//                        connect3283();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3283();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 虎牙 (崭新出厂)
//    private void connect3283() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/7188")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 500, 0.01, 400);
//                        connect3284();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3284();
//                    }
//                });
//    }
//    //穿肠刀（★） | 传说 (崭新出厂)
//    private void connect3284() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/555624")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1200, 0.03, 1020);
//                        connect3285();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3285();
//                    }
//                });
//    }
//    //穿肠刀（★） | 传说 (略有磨损)
//    private void connect3285() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/555630")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 870, 0.08, 760);
//                        connect3286();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3286();
//                    }
//                });
//    }
//    //穿肠刀（★） | 传说 (久经沙场)
//    private void connect3286() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/555751")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 600, 0.17, 500);
//                        connect3287();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3287();
//                    }
//                });
//    }
//    //穿肠刀（★） | 深红之网 (略有磨损)
//    private void connect3287() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/15688")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 550, 0.09, 450);
//                        connect3288();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3288();
//                    }
//                });
//    }
//    //穿肠刀（★） | 深红之网 (久经沙场)
//    private void connect3288() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/19646")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 400, 0.17, 300);
//                        connect3289();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3289();
//                    }
//                });
//    }
//    //暗影双匕（★） | 渐变之色 (崭新出厂)
//    private void connect3289() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/11396")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 605, 0.01, 500);
//                        connect3290();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3290();
//                    }
//                });
//    }
//    //暗影双匕（★） | 多普勒 (崭新出厂)
//    private void connect3290() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571915")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 610, 0.01, 500);
//                        connect3291();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3291();
//                    }
//                });
//    }
//    //暗影双匕（★） | 虎牙 (崭新出厂)
//    private void connect3291() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/571833")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 600, 0.01, 500);
//                        connect3292();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3292();
//                    }
//                });
//    }
//    //短剑（★） | 深红之网 (略有磨损)
//    private void connect3292() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/615830")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1800, 0.11, 1500);
//                        connect3293();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3293();
//                    }
//                });
//    }
    //短剑（★） | 深红之网 (久经沙场)
    private void connect3293() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759454&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889919282")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "短剑（★） | 深红之网 (久经沙场)");
                                handleDataForBuff(response, DJ_SHZW_JJ);
                                connect3295();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect3295();
                            }
                        });
            }
        });
    }
//    //锯齿爪刀（★）
//    private void connect3294() {
//        OkGo.<Buff>get("https://www.Buff.cn/product/trade/730/615682")
//                .execute(new JsonCallback<Buff>(Buff.class) {
//                    @Override
//                    public void onSuccess(Response<Buff> response) {
//                        handleDataBuff3(response, 1800, 0.16, 1600);
//                        connect3295();
//                    }
//
//                    @Override
//                    public void onError(Response<Buff> response) {
//                        super.onError(response);
//                        connect3295();
//                    }
//                });
//    }
    //锯齿爪刀（★）|深红之网 (久经沙场)
    private void connect3295() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759327&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554890113928")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "锯齿爪刀（★）|深红之网 (久经沙场)");
                                handleDataForBuff(response, JCZD_SHZW_JJ);
                                connect1296();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1296();
                            }
                        });
            }
        });
    }

    //蝴蝶刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1296() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42590&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641890129")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "蝴蝶刀（★） | 致命紫罗兰 (久经沙场)");
                        handleDataForBuff(response, HDD_ZMZLL_JJ);
                        connect1297();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect1297();
                        super.onError(response);
                    }
                });
    }
    //刺刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1297() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42439&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641943624")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "刺刀（★） | 致命紫罗兰 (略有磨损)");
                        handleDataForBuff(response, CD_ZMZLL_LM);
                        connect1298();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect1298();
                        super.onError(response);
                    }
                });
    }
    //M9刺刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1298() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43139&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641968399")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M9刺刀（★） | 致命紫罗兰 (久经沙场)");
                        handleDataForBuff(response, M9_ZMZLL_JJ);
                        connect1299();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect1299();
                        super.onError(response);
                    }
                });
    }
    //爪子刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1299() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43045&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559642010093")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "爪子刀（★） | 致命紫罗兰 (久经沙场)");
                        handleDataForBuff(response, ZZD_ZMZLL_JJ);
                        connect1300();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect1300();
                        super.onError(response);
                    }
                });
    }
    //爪子刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1300() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43046&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641997385")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "爪子刀（★） | 致命紫罗兰 (略有磨损)");
                        handleDataForBuff(response, ZZD_ZMZLL_LM);
                        connect1301();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect1301();
                        super.onError(response);
                    }
                });
    }
    //熊刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1301() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769504&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559642034251")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "熊刀（★） | 致命紫罗兰 (久经沙场)");
                        handleDataForBuff(response, XD_ZMZLL_JJ);
                        connect1302();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect1302();
                        super.onError(response);
                    }
                });
    }
    //猎杀者匕首（★） | 致命紫罗兰 (略有磨损)
    private void connect1302() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42954&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559642054243")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "猎杀者匕首（★） | 致命紫罗兰 (略有磨损)");
                        handleDataForBuff(response, LSZ_ZMZLL_LM);
                        mService.buffGloves.connect1100();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        mService.buffGloves.connect1100();
                        super.onError(response);
                    }
                });
    }


}