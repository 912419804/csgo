package com.frank.csgo.service;

import com.frank.csgo.bean.Buff;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;
import static com.frank.csgo.price.Gun.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/20 14:58
 * 类说明：
 */
public class BuffGuns extends BuffCheck{


    public BuffGuns(BuffService mService) {
        super(mService);
    }

    //火灵（崭新出厂）
    public void connect201() {
        connect202();
//        mService.post(new Runnable() {
//            @Override
//            public void run() {
//                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35914&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543411868124")
//                        .execute(new JsonCallback<Buff>(Buff.class) {
//                            @Override
//                            public void onSuccess(Response<Buff> response) {
//                                fillBuff(response, "P2000 | 火灵 (崭新出厂)");
//                                handleDataForBuff(response, 60, 0.02);
//                                connect202();
//                            }
//
//                            @Override
//                            public void onError(Response<Buff> response) {
//                                connect202();
//                            }
//                        });
//            }
//        });

    }

    //USP 消音版 | 次时代 (崭新出厂)
    private void connect202() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42166&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543454332986")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 次时代 (崭新出厂)");
                                handleDataForBuff(response, USP_CSD_ZX);
                                connect211();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect211();
                            }
                        });
            }
        });

    }

    private void connect203() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42166&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543454332986")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 次时代 (崭新出厂)");
                                handleDataForBuff(response, 25, 0.01);
                                connect204();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect204();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 枪响人亡 (崭新出厂)
    private void connect204() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/market/item_detail?appid=730&game=csgo&classid=1312321419&instanceid=480085569&assetid=14928331584&contextid=2&_=1543454585575")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 枪响人亡 (崭新出厂)");
                                handleDataForBuff(response, 430, 0.03);
                                connect207();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect207();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 枪响人亡 (略有磨损)
    private void connect205() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/market/item_detail?appid=730&game=csgo&classid=1312321419&instanceid=480085569&assetid=14928331584&contextid=2&_=1543454585575")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 枪响人亡 (略有磨损)");
                                handleDataForBuff(response, 300, 0.08);
                                connect207();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect207();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 枪响人亡 (久经沙场)
    private void connect206() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42182&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543454816828")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 枪响人亡 (久经沙场)");
                                handleDataForBuff(response, 200, 0.16);
                                connect207();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect207();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 黑色魅影 (崭新出厂)
    private void connect207() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42191&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543455069431")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 黑色魅影 (崭新出厂)");
                                handleDataForBuff(response, USP_HSMY_ZX);
                                connect211();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect211();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 黑色魅影 (略有磨损)
    private void connect208() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42193&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543456376846")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 黑色魅影 (略有磨损)");
                                handleDataForBuff(response, 160, 0.08);
                                connect211();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect211();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 黑色魅影 (久经沙场)
    private void connect209() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42192&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543456903616")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 黑色魅影 (久经沙场)");
                                handleDataForBuff(response, 105, 0.17);
                                connect211();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect211();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 黑色魅影 (久经沙场)
    private void connect210() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42192&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543456903616")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 黑色魅影 (久经沙场)");
                                handleDataForBuff(response, 90, 0.17);
                                connect211();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect211();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 脑洞大开 (崭新出厂)
    private void connect211() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45369&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457130726")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 脑洞大开 (崭新出厂)");
                                handleDataForBuff(response, USP_NDDK_ZX);
                                connect214();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect214();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 脑洞大开 (略有磨损)
    private void connect212() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45371&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457306693")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 脑洞大开 (略有磨损)");
                                handleDataForBuff(response, 56, 0.08);
                                connect213();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect213();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 不锈钢 (崭新出厂)
    private void connect213() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42229&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457511281")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 不锈钢 (崭新出厂)");
                                handleDataForBuff(response, 55, 0.01);
                                connect214();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect214();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 猎户 (崭新出厂)
    private void connect214() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42201&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457789142")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 猎户 (崭新出厂)");
                                handleDataForBuff(response, USP_LH_ZX);
                                connect217();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect217();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 蓝图 (崭新出厂)
    private void connect215() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42153&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543458328635")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 蓝图 (崭新出厂)");
                                handleDataForBuff(response, 45, 0.01);
                                connect217();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect217();
                            }
                        });
            }
        });

    }

    //USP 消音版 | 蓝图 (崭新出厂)
    private void connect216() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42153&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543458328635")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "USP 消音版 | 蓝图 (崭新出厂)");
                                handleDataForBuff(response, 35, 0.01);
                                connect217();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect217();
                            }
                        });
            }
        });

    }

    //格洛克 18 型 | 水灵 (崭新出厂)
    private void connect217() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35072&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543458768570")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "格洛克 18 型 | 水灵 (崭新出厂)");
                                handleDataForBuff(response, GLK_SL_ZX);
                                connect225();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect225();
                            }
                        });
            }
        });

    }

    //格洛克 18 型 | 荒野反叛 (崭新出厂)
    private void connect218() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35067&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460061670")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "格洛克 18 型 | 荒野反叛 (崭新出厂)");
                                handleDataForBuff(response, 65, 0.02);
                                connect223();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect223();
                            }
                        });
            }
        });

    }

    //格洛克 18 型 | 暮光星系 (崭新出厂)
    private void connect219() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35063&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460281254")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "格洛克 18 型 | 暮光星系 (崭新出厂)");
                                handleDataForBuff(response, 80, 0.02);
                                connect222();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect222();
                            }
                        });
            }
        });

    }

    //格洛克 18 型 | 暮光星系 (崭新出厂)
    private void connect220() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35063&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460281254")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "格洛克 18 型 | 暮光星系 (崭新出厂)");
                                handleDataForBuff(response, 65, 0.03);
                                connect221();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect221();
                            }
                        });
            }
        });

    }

    //格洛克 18 型 | 核子反应 (崭新出厂)
    private void connect221() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35046&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460427097")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "格洛克 18 型 | 核子反应 (崭新出厂)");
                                handleDataForBuff(response, 35, 0.02);
                                connect222();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect222();
                            }
                        });
            }
        });

    }

    //格洛克 18 型 | Nuclear Garden (崭新出厂)
    private void connect222() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=762185&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460579683")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "格洛克 18 型 | Nuclear Garden (崭新出厂)");
                                handleDataForBuff(response, 85, 0.02);
                                connect223();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect223();
                            }
                        });
            }
        });

    }

    //P250 | 生化短吻鳄 (崭新出厂)
    private void connect223() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36077&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460863761")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "P250 | 生化短吻鳄 (崭新出厂)");
                                handleDataForBuff(response, 95, 0.02);
                                connect225();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect225();
                            }
                        });
            }
        });

    }

    //P250 | 生化短吻鳄 (略有磨损)
    private void connect224() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36079&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460963028")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "P250 | 生化短吻鳄 (略有磨损)");
                                handleDataForBuff(response, 55, 0.08);
                                connect225();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect225();
                            }
                        });
            }
        });

    }

    //P250 | 二西莫夫 (略有磨损)
    private void connect225() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35986&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461080142")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "P250 | 二西莫夫 (略有磨损)");
                                handleDataForBuff(response, P250_EXMF_LM);
                                connect237();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect237();
                            }
                        });
            }
        });

    }

    //P250 | 二西莫夫 (久经沙场)
    private void connect226() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35985&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461213725")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "P250 | 二西莫夫 (久经沙场)");
                                handleDataForBuff(response, 25, 0.17);
                                connect237();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect237();
                            }
                        });
            }
        });

    }

    //P250 | 银装素裹 (略有磨损)
    private void connect227() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36102&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461418178")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "P250 | 银装素裹 (略有磨损)");
                                handleDataForBuff(response, 35, 0.09);
                                connect236();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect236();
                            }
                        });
            }
        });

    }

    //P250 | 暗潮 (崭新出厂)
    private void connect228() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36091&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461600295")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "P250 | 暗潮 (崭新出厂)");
                                handleDataForBuff(response, 39, 0.01);
                                connect229();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect229();
                            }
                        });
            }
        });

    }

    //FN57 | 暴怒野兽 (崭新出厂)
    private void connect229() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34743&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461949263")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "FN57 | 暴怒野兽 (崭新出厂)");
                                handleDataForBuff(response, 300, 0.03);
                                connect230();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect230();
                            }
                        });
            }
        });

    }

    //FN57 | 暴怒野兽 (略有磨损)
    private void connect230() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34745&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543462039139")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "FN57 | 暴怒野兽 (略有磨损)");
                                handleDataForBuff(response, 140, 0.10);
                                connect232();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect232();
                            }
                        });
            }
        });

    }

    //FN57 | 暴怒野兽 (久经沙场)
    private void connect231() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34744&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543462149710")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "FN57 | 暴怒野兽 (久经沙场)");
                                handleDataForBuff(response, 85, 0.20);
                                connect232();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect232();
                            }
                        });
            }
        });

    }

    //FN57 | 耍猴把戏 (略有磨损)
    private void connect232() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34757&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474164592")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "FN57 | 耍猴把戏 (略有磨损)");
                                handleDataForBuff(response, 45, 0.11);
                                connect233();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect233();
                            }
                        });
            }
        });

    }

    //FCZ75 自动手枪 | 相柳 (崭新出厂)
    private void connect233() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34359&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474549446")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "CZ75 自动手枪 | 相柳 (崭新出厂)");
                                handleDataForBuff(response, 35, 0.02);
                                connect234();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect234();
                            }
                        });
            }
        });

    }

    //CZ75 自动手枪 | 黄夹克 (崭新出厂)
    private void connect234() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34364&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474688036")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "CZ75 自动手枪 | 黄夹克 (崭新出厂)");
                                handleDataForBuff(response, 50, 0.01);
                                connect235();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect235();
                            }
                        });
            }
        });

    }

    //Tec-9 | 燃料喷射器 (崭新出厂)
    private void connect235() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=41992&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474804200")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "Tec-9 | 燃料喷射器 (崭新出厂)");
                                handleDataForBuff(response, 35, 0.02);
                                connect236();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect236();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 红色代号 (崭新出厂)
    private void connect236() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759243&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475040856")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 红色代号 (崭新出厂)");
                                handleDataForBuff(response, 310, 0.02);
                                connect237();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect237();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 红色代号 (略有磨损)
    private void connect237() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759245&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475211688")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 红色代号 (略有磨损)");
                                handleDataForBuff(response, SMZY_HSDH_LM);
                                connect239();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect239();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 红色代号 (久经沙场)
    private void connect238() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759244&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475318621")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 红色代号 (久经沙场)");
                                handleDataForBuff(response, 100, 0.17);
                                connect239();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect239();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 炽烈之炎 (崭新出厂)
    private void connect239() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34389&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475470973")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 炽烈之炎 (崭新出厂)");
                                handleDataForBuff(response, SMZY_CLZY_ZX);
                                connect248();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect248();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 大佬龙 (崭新出厂)
    private void connect240() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34431&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475586496")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 大佬龙 (崭新出厂)");
                                handleDataForBuff(response, 85, 0.01);
                                connect242();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect242();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 大佬龙 (略有磨损)
    private void connect241() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34433&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475710609")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 大佬龙 (略有磨损)");
                                handleDataForBuff(response, 45, 0.071);
                                connect242();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect242();
                            }
                        });
            }
        });

    }

    //沙沙漠之鹰 | 飞行员 (崭新出厂)
    private void connect242() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34461&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475939163")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 飞行员 (崭新出厂)");
                                handleDataForBuff(response, 256, 0.02);
                                connect243();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect243();
                            }
                        });
            }
        });

    }

    //沙沙漠之鹰 | 飞行员 (略有磨损)
    private void connect243() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34463&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543476147565")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 飞行员 (略有磨损)");
                                handleDataForBuff(response, 150, 0.08);
                                connect245();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect245();
                            }
                        });
            }
        });

    }

    //沙漠之鹰 | 飞行员 (略有磨损)
    private void connect244() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34463&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543476147565")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 飞行员 (略有磨损)");
                                handleDataForBuff(response, 150, 0.08);
                                connect245();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect245();
                            }
                        });
            }
        });

    }

    //加利尔 AR | 地狱看门犬 (崭新出厂)
    private void connect245() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34902&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477324839")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "加利尔 AR | 地狱看门犬 (崭新出厂)");
                                handleDataForBuff(response, 85, 0.02);
                                connect246();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect246();
                            }
                        });
            }
        });

    }

    //加利尔 AR | ~甜甜的~ (崭新出厂)
    private void connect246() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34963&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477464971")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "加利尔 AR | ~甜甜的~ (崭新出厂)");
                                handleDataForBuff(response, 75, 0.01);
                                connect247();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect247();
                            }
                        });
            }
        });

    }

    //加利尔 AR | 「经济」克鲁尔 (略有磨损)
    private void connect247() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34916&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477672911")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "加利尔 AR | 「经济」克鲁尔 (略有磨损)");
                                handleDataForBuff(response, 55, 0.09);
                                connect248();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect248();
                            }
                        });
            }
        });

    }

    //加利尔 AR | 「经济」克鲁尔 (久经沙场)
    private void connect248() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34915&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477829307")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "加利尔 AR | 「经济」克鲁尔 (久经沙场)");
                                handleDataForBuff(response, JLE_JJ_JJ);
                                connect249();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect249();
                            }
                        });
            }
        });

    }

    //AWP | 二西莫夫 (久经沙场)
    public void connect249() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34066&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477983488")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 二西莫夫 (久经沙场)");
                                handleDataForBuff(response, AWP_EXMF_JJ);
                                connect252();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect252();
                            }
                        });
            }
        });

    }

    //AWP | 死神 (崭新出厂)
    private void connect250() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45247&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479183613")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 死神 (崭新出厂)");
                                handleDataForBuff(response, AWP_SS_ZX);
                                connect252();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect252();
                            }
                        });
            }
        });

    }

    //AWP | 死神 (崭新出厂)
    private void connect251() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45247&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479556659")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 死神 (崭新出厂)");
                                handleDataForBuff(response, 60, 0.02);
                                connect252();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect252();
                            }
                        });
            }
        });

    }

    //AWP | 暴怒野兽 (崭新出厂)
    private void connect252() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34095&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479632564")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 暴怒野兽 (崭新出厂)");
                                handleDataForBuff(response, AWP_BNYS_ZX);
                                connect261();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect261();
                            }
                        });
            }
        });

    }

    //AWP | 暴怒野兽 (略有磨损)
    private void connect253() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34097&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479770945")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 暴怒野兽 (略有磨损)");
                                handleDataForBuff(response, 180, 0.08);
                                connect255();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect255();
                            }
                        });
            }
        });

    }

    //AWP | 暴怒野兽 (久经沙场)
    private void connect254() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34096&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479870551")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 暴怒野兽 (久经沙场)");
                                handleDataForBuff(response, 125, 0.17);
                                connect261();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect261();
                            }
                        });
            }
        });

    }

    //AWP | 浮生如梦 (崭新出厂)
    private void connect255() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34088&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480354611")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 浮生如梦 (崭新出厂)");
                                handleDataForBuff(response, 50, 0.02);
                                connect261();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect261();
                            }
                        });
            }
        });

    }

    //AWP | 鬼退治 (崭新出厂)
    private void connect256() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34108&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480466460")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 鬼退治 (崭新出厂)");
                                handleDataForBuff(response, 355, 0.02);
                                connect260();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect260();
                            }
                        });
            }
        });

    }

    //AWP | 鬼退治 (略有磨损)
    private void connect257() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34110&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480535184")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 鬼退治 (略有磨损)");
                                handleDataForBuff(response, 280, 0.09);
                                connect258();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect258();
                            }
                        });
            }
        });

    }

    //AWP | 鬼退治 (久经沙场)
    private void connect258() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34109&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480608246")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 鬼退治 (久经沙场)");
                                handleDataForBuff(response, 200, 0.17);
                                connect260();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect260();
                            }
                        });
            }
        });

    }

    //AWP | 鬼退治 (久经沙场)
    private void connect259() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34109&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480608246")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 鬼退治 (久经沙场)");
                                handleDataForBuff(response, 180, 0.17);
                                connect260();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect260();
                            }
                        });
            }
        });

    }

    //AWP | 电子蜂巢 (崭新出厂)
    private void connect260() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34078&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480737879")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 电子蜂巢 (崭新出厂)");
                                handleDataForBuff(response, 75, 0.02);
                                connect261();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect261();
                            }
                        });
            }
        });

    }

    //AWP | 巨龙传说 (崭新出厂)
    private void connect261() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=44060&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481004692")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 巨龙传说 (崭新出厂)");
                                handleDataForBuff(response, AWP_JLCS_ZX);
                                connect266();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect266();
                            }
                        });
            }
        });

    }

    //AWP | 巨龙传说 (崭新出厂)
    private void connect262() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=44060&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481004692")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 巨龙传说 (崭新出厂)");
                                handleDataForBuff(response, 9300, 0.04);
                                connect266();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect266();
                            }
                        });
            }
        });

    }

    //AK-47 | 火神 (崭新出厂)
    private void connect263() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33974&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481445591")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 火神 (崭新出厂)");
                                handleDataForBuff(response, 510, 0.02);
                                connect266();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect264();
                            }
                        });
            }
        });

    }

    //AK-47 | 火神 (略有磨损)
    private void connect264() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33976&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481571960")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 火神 (略有磨损)");
                                handleDataForBuff(response, 270, 0.08);
                                connect265();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect265();
                            }
                        });
            }
        });

    }

    //AK-47 | 火神 (久经沙场)
    private void connect265() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33975&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543482929338")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 火神 (久经沙场)");
                                handleDataForBuff(response, 165, 0.17);
                                connect266();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect266();
                            }
                        });
            }
        });

    }

    //AK-47 | 霓虹革命 (崭新出厂)
    private void connect266() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33935&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543483083123")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 霓虹革命 (崭新出厂)");
                                handleDataForBuff(response, AK47_NHGM_ZX);
                                connect268();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect268();
                            }
                        });
            }
        });

    }

    //AK-47 | 霓虹革命 (略有磨损)
    private void connect267() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33937&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543483283552")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 霓虹革命 (略有磨损)");
                                handleDataForBuff(response, 155, 0.08);
                                connect268();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect268();
                            }
                        });
            }
        });

    }

    //AK-47 | 皇后 (崭新出厂)
    public void connect268() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33969&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543483449650")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 皇后 (崭新出厂)");
                                handleDataForBuff(response, AK47_HH_ZX);
                                connect269();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect269();
                            }
                        });
            }
        });

    }

    //AK-47 | 皇后 (略有磨损)
    private void connect269() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33971&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543545419527")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 皇后 (略有磨损)");
                                handleDataForBuff(response, AK47_HH_LM);
                                connect270();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect270();
                            }
                        });
            }
        });

    }

    //AK-47 | 皇后 (久经沙场)
    private void connect270() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33970&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543545564032")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 皇后 (久经沙场)");
                                handleDataForBuff(response, AK47_HH_JJ);
                                connect271();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect271();
                            }
                        });
            }
        });

    }

    //AK-47 | 燃料喷射器 (崭新出厂)
    public void connect271() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33910&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546134659")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 燃料喷射器 (崭新出厂)");
                                handleDataForBuff(response, AK47_RLPSQ_ZX);
                                connect276();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect276();
                            }
                        });
            }
        });

    }

    //AK-47 | 燃料喷射器 (略有磨损)
    private void connect272() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33912&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546244620")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 燃料喷射器 (略有磨损)");
                                handleDataForBuff(response, 260, 0.09);
                                connect273();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect273();
                            }
                        });
            }
        });

    }

    //AK-47 | 燃料喷射器 (久经沙场)
    private void connect273() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33911&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546332653")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 燃料喷射器 (久经沙场)");
                                handleDataForBuff(response, 175, 0.17);
                                connect274();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect274();
                            }
                        });
            }
        });

    }

    //AK-47 | 深海复仇 (崭新出厂)
    private void connect274() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33859&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546576633")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 深海复仇 (崭新出厂)");
                                handleDataForBuff(response, 215, 0.03);
                                connect276();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect276();
                            }
                        });
            }
        });

    }

    //AK-47 | 深海复仇 (略有磨损)
    private void connect275() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33861&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546652958")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 深海复仇 (略有磨损)");
                                handleDataForBuff(response, 160, 0.08);
                                connect276();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect276();
                            }
                        });
            }
        });

    }

    //AK-47 | 血腥运动 (崭新出厂)
    public void connect276() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33868&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546743907")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 血腥运动 (崭新出厂)");
                                handleDataForBuff(response, AK47_XXYD_ZX);
                                connect280();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect280();
                            }
                        });
            }
        });

    }

    //AK-47 | 血腥运动 (略有磨损)
    private void connect277() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33870&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546991926")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 血腥运动 (略有磨损)");
                                handleDataForBuff(response, 210, 0.08);
                                connect280();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect280();
                            }
                        });
            }
        });

    }

    //AK-47 | 前线迷雾 (崭新出厂)
    private void connect278() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33905&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543547429327")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 前线迷雾 (崭新出厂)");
                                handleDataForBuff(response, 200, 0.03);
                                connect280();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect280();
                            }
                        });
            }
        });

    }

    //AK-47 | 前线迷雾 (略有磨损)
    private void connect279() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33907&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543547577596")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 前线迷雾 (略有磨损)");
                                handleDataForBuff(response, 100, 0.08);
                                connect280();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect280();
                            }
                        });
            }
        });

    }

    //AK-47 | 表面淬火 (崭新出厂)
    private void connect280() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33881&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543547983188")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 表面淬火 (崭新出厂)");
                                handleDataForBuff(response, AK47_BMCH_ZX);
                                connect282();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect282();
                            }
                        });
            }
        });

    }

    //AK-47 | 表面淬火 (略有磨损)
    private void connect281() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33883&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548073573")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 表面淬火 (略有磨损)");
                                handleDataForBuff(response, 210, 0.08);
                                connect282();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect282();
                            }
                        });
            }
        });

    }

    //AK-47 | 霓虹骑士 (崭新出厂)
    public void connect282() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759363&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548232525")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 霓虹骑士 (崭新出厂)");
                                handleDataForBuff(response, AK47_NHQS_ZX);
                                connect289();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect289();
                            }
                        });
            }
        });

    }

    //AK-47 | 霓虹骑士 (略有磨损)
    private void connect283() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759234&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548319962")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 霓虹骑士 (略有磨损)");
                                handleDataForBuff(response, 300, 0.08);
                                connect285();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect285();
                            }
                        });
            }
        });

    }

    //AK-47 | 霓虹骑士 (久经沙场)
    private void connect284() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759341&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548423057")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 霓虹骑士 (久经沙场)");
                                handleDataForBuff(response, 170, 0.17);
                                connect285();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect285();
                            }
                        });
            }
        });

    }

    //AK-47 | 混沌点阵 (崭新出厂)
    private void connect285() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33945&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548568689")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 混沌点阵 (崭新出厂)");
                                handleDataForBuff(response, 190, 0.03);
                                connect289();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect289();
                            }
                        });
            }
        });

    }

    //AK-47 | 混沌点阵 (略有磨损)
    private void connect286() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33947&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548924345")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 混沌点阵 (略有磨损)");
                                handleDataForBuff(response, 130, 0.08);
                                connect287();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect287();
                            }
                        });
            }
        });

    }

    //AK-47 | Safety Net (崭新出厂)
    private void connect287() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=762172&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543549729645")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | Safety Net (崭新出厂)");
                                handleDataForBuff(response, 90, 0.01);
                                connect288();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect288();
                            }
                        });
            }
        });

    }

    //AK-47 | 轨道 Mk01 (崭新出厂)
    private void connect288() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33940&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543559027631")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 轨道 Mk01 (崭新出厂)");
                                handleDataForBuff(response, 70, 0.01);
                                connect289();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect289();
                            }
                        });
            }
        });

    }

    //AK-47 | 水栽竹 (久经沙场)
    private void connect289() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33916&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543559328914")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 水栽竹 (久经沙场)");
                                handleDataForBuff(response, AK47_SZZ_JJ);
                                connect289_1();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect289_1();
                            }
                        });
            }
        });

    }
    //AK-47 | 水栽竹 (略有磨损)
    private void connect289_1() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33917&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551800287883")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 水栽竹 (略有磨损)");
                                handleDataForBuff(response, AK47_SZZ_LM);
                                connect289_2();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect289_2();
                            }
                        });
            }
        });

    }
    //AK-47 | 水栽竹 (崭新出厂)
    private void connect289_2() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33915&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551800377431")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AK-47 | 水栽竹 (崭新出厂)");
                                handleDataForBuff(response, AK47_SZZ_ZX);
                                connect290();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect290();
                            }
                        });
            }
        });

    }

    //法玛斯 | 防滚架 (崭新出厂)
    private void connect290() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34670&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560178466")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "法玛斯 | 防滚架 (崭新出厂)");
                                handleDataForBuff(response, FMS_FGJ_ZX);
                                connect293();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect293();
                            }
                        });
            }
        });

    }

    //法玛斯 | 防滚架 (略有磨损)
    private void connect291() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34672&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560336622")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "法玛斯 | 防滚架 (略有磨损)");
                                handleDataForBuff(response, 35, 0.08);
                                connect292();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect292();
                            }
                        });
            }
        });

    }

    //法玛斯 | 机械工业 (崭新出厂)
    private void connect292() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34656&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560450205")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "法玛斯 | 机械工业 (崭新出厂)");
                                handleDataForBuff(response, 29, 0.02);
                                connect293();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect293();
                            }
                        });
            }
        });

    }

    //M4A4 | 龙王 (崭新出厂)
    private void connect293() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35353&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560639899")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 龙王 (崭新出厂)");
                                handleDataForBuff(response, M4A4_LW_ZX);
                                connect295();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect295();
                            }
                        });
            }
        });

    }

    //M4A4 | 龙王 (略有磨损)
    private void connect294() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35355&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560755035")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 龙王 (略有磨损)");
                                handleDataForBuff(response, 56, 0.08);
                                connect295();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect295();
                            }
                        });
            }
        });

    }

    //M4A4 | 杀意大名 (崭新出厂)
    private void connect295() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35286&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561039641")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 杀意大名 (崭新出厂)");
                                handleDataForBuff(response, M4A4_SYDM_ZX);
                                connect297();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect297();
                            }
                        });
            }
        });

    }

    //M4A4 | 杀意大名 (崭新出厂)
    private void connect296() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35286&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561039641")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 杀意大名 (崭新出厂)");
                                handleDataForBuff(response, 30, 0.03);
                                connect297();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect297();
                            }
                        });
            }
        });

    }

    //M4A4 | 黑色魅影 (略有磨损)
    private void connect297() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45385&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561971452")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 黑色魅影 (略有磨损)");
                                handleDataForBuff(response, M4A4_HSMY_LM);
                                connect297_1();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect297_1();
                            }
                        });
            }
        });

    }
    //M4A4（StatTrak™） | 黑色魅影 (略有磨损)
    private void connect297_1() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45501&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1576307682887")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4（StatTrak™） | 黑色魅影 (略有磨损)");
                                handleDataForBuff(response, M4A4_HSMY_LM_ST);
                                connect299();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect299();
                            }
                        });
            }
        });

    }

    //M4A4 | 黑色魅影 (久经沙场)
    private void connect298() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45385&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561971452")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 黑色魅影 (久经沙场)");
                                handleDataForBuff(response, M4A4_HSMY_JJ);
                                connect299();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect299();
                            }
                        });
            }
        });

    }

    //M4A4 | 二西莫夫 (久经沙场)
    private void connect299() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35253&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562226052")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 二西莫夫 (久经沙场)");
                                handleDataForBuff(response, M4A4_EXMF_JJ);
                                connect308();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect308();
                            }
                        });
            }
        });

    }

    //M4A4 | 二西莫夫 (破损不堪)
    private void connect300() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35254&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562381309")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 二西莫夫 (破损不堪)");
                                handleDataForBuff(response, 220, 0.39);
                                connect301();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect301();
                            }
                        });
            }
        });

    }

    //M4A4 | 二西莫夫 (战痕累累)
    private void connect301() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35252&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562500561")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 二西莫夫 (战痕累累)");
                                handleDataForBuff(response, 130, 0.46);
                                connect302();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect302();
                            }
                        });
            }
        });

    }

    //M4A4（StatTrak™） | 二西莫夫 (战痕累累)
    private void connect302() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=38843&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562568149")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4（StatTrak™） | 二西莫夫 (战痕累累)");
                                handleDataForBuff(response, 410, 0.46);
                                connect308();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect308();
                            }
                        });
            }
        });

    }

    //M4A4 | X 光 (崭新出厂)
    private void connect303() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35345&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562812410")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | X 光 (崭新出厂)");
                                handleDataForBuff(response, 65, 0.01);
                                connect304();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect304();
                            }
                        });
            }
        });

    }

    //M4A4 | 皇家圣骑士 (略有磨损)
    private void connect304() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35328&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563005412")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 皇家圣骑士 (略有磨损)");
                                handleDataForBuff(response, 140, 0.08);
                                connect306();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect306();
                            }
                        });
            }
        });

    }

    //M4A4 | 皇家圣骑士 (久经沙场)
    private void connect305() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35327&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563106073")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 皇家圣骑士 (久经沙场)");
                                handleDataForBuff(response, 55, 0.17);
                                connect308();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect308();
                            }
                        });
            }
        });

    }

    //M4A4 | 死寂空间 (崭新出厂)
    private void connect306() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35281&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563282154")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 死寂空间 (崭新出厂)");
                                handleDataForBuff(response, 165, 0.02);
                                connect308();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect308();
                            }
                        });
            }
        });

    }

    //M4A4 | 死寂空间 (略有磨损)
    private void connect307() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35283&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563902110")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 死寂空间 (略有磨损)");
                                handleDataForBuff(response, 80, 0.08);
                                connect308();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect308();
                            }
                        });
            }
        });

    }

    //M4A4 | 喧嚣杀戮 (崭新出厂)
    private void connect308() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35261&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564075953")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 喧嚣杀戮 (崭新出厂)");
                                handleDataForBuff(response, M4A4_XXSL_ZX);
                                connect325();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect325();
                            }
                        });
            }
        });

    }

    //M4A4 | 喧嚣杀戮 (略有磨损)
    private void connect309() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35263&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564253193")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 喧嚣杀戮 (略有磨损)");
                                handleDataForBuff(response, 100, 0.09);
                                connect311();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect311();
                            }
                        });
            }
        });

    }

    //M4A4 | 喧嚣杀戮 (久经沙场)
    private void connect310() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35263&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564253193")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 喧嚣杀戮 (久经沙场)");
                                handleDataForBuff(response, 74, 0.17);
                                connect311();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect311();
                            }
                        });
            }
        });

    }

    //M4A4 | 弹雨 (崭新出厂)
    private void connect311() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35256&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564386488")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 弹雨 (崭新出厂)");
                                handleDataForBuff(response, 125, 0.03);
                                connect325();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect325();
                            }
                        });
            }
        });

    }

    //M4A4 | 弹雨 (略有磨损)
    private void connect312() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35258&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564469264")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 弹雨 (略有磨损)");
                                handleDataForBuff(response, 60, 0.08);
                            }

                            @Override
                            public void onError(Response<Buff> response) {

                            }
                        });
            }
        });

    }

    //M4A4 | 弹雨 (略有磨损)
    private void connect313() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35258&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564469264")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 弹雨 (略有磨损)");
                                handleDataForBuff(response, 58, 0.08);
                                connect314();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect314();
                            }
                        });
            }
        });

    }

    //M4A4 | 地狱烈焰 (崭新出厂)
    private void connect314() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35300&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564569337")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 地狱烈焰 (崭新出厂)");
                                handleDataForBuff(response, 140, 0.03);
                                connect316();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect316();
                            }
                        });
            }
        });

    }

    //M4A4 | 地狱烈焰 (略有磨损)
    private void connect315() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35302&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564630936")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 地狱烈焰 (略有磨损)");
                                handleDataForBuff(response, 88, 0.09);
                                connect316();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect316();
                            }
                        });
            }
        });

    }

    //M4A4 | 战场之星 (崭新出厂)
    private void connect316() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35331&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564738791")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 战场之星 (崭新出厂)");
                                handleDataForBuff(response, 70, 0.01);
                                connect319();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect319();
                            }
                        });
            }
        });

    }

    //M4A4 | 都市 DDPAT (崭新出厂)
    private void connect317() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35341&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564893530")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 都市 DDPAT (崭新出厂)");
                                handleDataForBuff(response, 25, 0.02);
                                connect319();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect319();
                            }
                        });
            }
        });

    }

    //M4A4 | 狮鹫 (崭新出厂)
    private void connect318() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35295&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564979058")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 狮鹫 (崭新出厂)");
                                handleDataForBuff(response, 42, 0.01);
                                connect319();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect319();
                            }
                        });
            }
        });

    }

    //M4A4 | 辐射危机 (略有磨损)
    private void connect319() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35323&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543565131445")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 辐射危机 (略有磨损)");
                                handleDataForBuff(response, 155, 0.10);
                                connect325();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect325();
                            }
                        });
            }
        });

    }

    //M4A4 | 辐射危机 (久经沙场)
    private void connect320() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35322&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543565231394")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 辐射危机 (久经沙场)");
                                handleDataForBuff(response, 47, 0.20);
                                connect321();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect321();
                            }
                        });
            }
        });

    }

    //M4A4 | 星级 (崭新出厂)
    private void connect321() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35348&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566083122")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 星级 (崭新出厂)");
                                handleDataForBuff(response, 85, 0.02);
                                connect325();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect325();
                            }
                        });
            }
        });

    }

    //M4A4 | 星级 (略有磨损)
    private void connect322() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35350&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566182437")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 星级 (略有磨损)");
                                handleDataForBuff(response, 30, 0.08);
                                connect323();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect323();
                            }
                        });
            }
        });

    }

    //M4A4 | 破晓 (崭新出厂)
    private void connect323() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35266&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566259983")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 破晓 (崭新出厂)");
                                handleDataForBuff(response, 110, 0.03);
                                connect324();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect324();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 闪回 (崭新出厂)
    private void connect324() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35202&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566476459")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 闪回 (崭新出厂)");
                                handleDataForBuff(response, 25, 0.01);
                                connect325();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect325();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 梦魇 (崭新出厂)
    private void connect325() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759260&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566672108")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 梦魇 (崭新出厂)");
                                handleDataForBuff(response, M4A1_MY_ZX);
                                connect328();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect328();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 梦魇 (略有磨损)
    private void connect326() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759261&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566747749")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 梦魇 (略有磨损)");
                                handleDataForBuff(response, 50, 0.08);
                                connect328();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect328();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 梦魇 (久经沙场)
    private void connect327() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759220&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566842068")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 梦魇 (久经沙场)");
                                handleDataForBuff(response, 24, 0.17);
                                connect328();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect328();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 金蛇缠绕 (崭新出厂)
    private void connect328() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35207&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566954644")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 金蛇缠绕 (崭新出厂)");
                                handleDataForBuff(response, M4A1_JSCR_ZX);
                                connect330();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect330();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 金蛇缠绕 (略有磨损)
    private void connect329() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35209&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568535166")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 金蛇缠绕 (略有磨损)");
                                handleDataForBuff(response, 110, 0.08);
                                connect330();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect330();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 机械工业 (崭新出厂)
    private void connect330() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35238&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568629163")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 机械工业 (崭新出厂)");
                                handleDataForBuff(response, M4A1_JXGY_ZX);
                                connect336_1();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect336_1();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 机械工业 (略有磨损)
    private void connect331() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35240&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568712731")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 机械工业 (略有磨损)");
                                handleDataForBuff(response, 90, 0.072);
                                connect332();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect332();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 暴怒野兽 (崭新出厂)
    private void connect332() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35219&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568836031")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 暴怒野兽 (崭新出厂)");
                                handleDataForBuff(response, 300, 0.01);
                                connect335();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect335();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 暴怒野兽 (略有磨损)
    private void connect333() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35221&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568943778")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 暴怒野兽 (略有磨损)");
                                handleDataForBuff(response, 90, 0.08);
                                connect334();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect334();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 守护者 (崭新出厂)
    private void connect334() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35212&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569069988")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 守护者 (崭新出厂)");
                                handleDataForBuff(response, 40, 0.03);
                                connect335();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect335();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 次时代 (崭新出厂)
    private void connect335() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35190&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569155833")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 次时代 (崭新出厂)");
                                handleDataForBuff(response, 75, 0.01);
                                connect336();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect336();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 女火神之炽焰 (略有磨损)
    private void connect336() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35187&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569294510")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 女火神之炽焰 (略有磨损)");
                                handleDataForBuff(response, 145, 0.08);
                                connect336_1();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect336_1();
                            }
                        });
            }
        });

    }
    //M4A1 消音型 | 女火神之炽焰 (崭新出厂)
    private void connect336_1() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35185&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551795193477")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 女火神之炽焰 (崭新出厂)");
                                handleDataForBuff(response, M4A1_NHSZCY_ZX);
                                connect339();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect339();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 毁灭者 2000 (崭新出厂)
    private void connect337() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35197&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569555722")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 毁灭者 2000 (崭新出厂)");
                                handleDataForBuff(response, 60, 0.02);
                                connect338();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect338();
                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 原子合金 (崭新出厂)
    private void connect338() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35160&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569833149")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 原子合金 (崭新出厂)");
                                handleDataForBuff(response, 60, 0.01);
                                connect339();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect339();

                            }
                        });
            }
        });

    }

    //M4A1 消音型 | 赤红新星 (崭新出厂)
    private void connect339() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35216&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569939640")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A1 消音型 | 赤红新星 (崭新出厂)");
                                handleDataForBuff(response, M4A1_CHXX_ZX);
                                connect1038();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1038();
                            }
                        });
            }
        });

    }

    //SG 553 | 次时代 (崭新出厂)
    private void connect340() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36458&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570124283")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "SG 553 | 次时代 (崭新出厂)");
                                handleDataForBuff(response, 75, 0.02);
                                connect344();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect344();
                            }
                        });
            }
        });

    }

    //SG 553 | 次时代 (略有磨损)
    private void connect341() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36460&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570245437")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "SG 553 | 次时代 (略有磨损)");
                                handleDataForBuff(response, 38, 0.08);
                                connect343();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect343();
                            }
                        });
            }
        });

    }

    //SG 553 | 豹灯蛾 (崭新出厂)
    private void connect342() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36487&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570387623")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "SG 553 | 豹灯蛾 (崭新出厂)");
                                handleDataForBuff(response, 40, 0.02);
                                connect343();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect343();
                            }
                        });
            }
        });

    }

    //SSG 08 | 炎龙之焰 (崭新出厂)
    private void connect343() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36552&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570573301")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "SSG 08 | 炎龙之焰 (崭新出厂)");
                                handleDataForBuff(response, 105, 0.02);
                                connect345();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect345();
                            }
                        });
            }
        });

    }

    //AUG | 变色龙 (崭新出厂)
    private void connect344() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34001&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570687418")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 变色龙 (崭新出厂)");
                                handleDataForBuff(response, 40, 0.01);
                                connect345();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect345();
                            }
                        });
            }
        });

    }

    //AUG | 湖怪鸟 (崭新出厂)
    private void connect345() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45245&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570798702")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 湖怪鸟 (崭新出厂)");
                                handleDataForBuff(response, 65, 0.01);
                                connect347();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect347();
                            }
                        });
            }
        });

    }

    //AUG | 席德.米德 (崭新出厂)
    private void connect346() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34049&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570871320")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 席德.米德 (崭新出厂)");
                                handleDataForBuff(response, 95, 0.01);
                                connect347();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect347();
                            }
                        });
            }
        });

    }

    //AUG | 燕群 (崭新出厂)
    private void connect347() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34027&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570959377")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 燕群 (崭新出厂)");
                                handleDataForBuff(response, AUG_YQ_ZX);
                                connect1038();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1038();
                            }
                        });
            }
        });

    }

    // M4A4 | 皇帝 (崭新出厂)
    private void connect1038() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769584&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777911913")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 皇帝 (崭新出厂)");
                                handleDataForBuff(response, M4A4_HD_ZX);
                                connect1039();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1039();
                            }
                        });
            }
        });
    }
    // M4A4 | 皇帝 (略有磨损)
    private void connect1039() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769583&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777882284")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 皇帝 (略有磨损)");
                                handleDataForBuff(response, M4A4_HD_LM);
                                connect1040();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1040();
                            }
                        });
            }
        });
    }
    // M4A4 | 皇帝 (久经沙场)
    private void connect1040() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769572&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777848346")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4 | 皇帝 (久经沙场)");
                                handleDataForBuff(response, M4A4_HD_JJ);
                                connect1041();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1041();
                            }
                        });
            }
        });
    }
    // M4A4（StatTrak™） | 皇帝 (久经沙场)
    private void connect1041() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769569&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777813622")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4（StatTrak™） | 皇帝 (久经沙场)");
                                handleDataForBuff(response, M4A4_HD_JJ_ST);
                                connect1042();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1042();
                            }
                        });
            }
        });
    }
    // M4A4（StatTrak™） | 皇帝 (略有磨损)
    private void connect1042() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769573&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777541541")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "M4A4（StatTrak™） | 皇帝 (略有磨损)");
                                handleDataForBuff(response, M4A4_HD_LM_ST);
                                connect1045();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1045();
                            }
                        });
            }
        });
    }
    // 沙漠之鹰 | 轻轨 (崭新出厂)
    private void connect1043() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769171&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777503981")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰 | 轻轨 (崭新出厂)");
                                handleDataForBuff(response, SMZY_QG_ZX);
                                connect1045();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1045();
                            }
                        });
            }
        });
    }
    // 沙漠之鹰（StatTrak™） | 轻轨 (崭新出厂)
    private void connect1044() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769422&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1555777477918")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "沙漠之鹰（StatTrak™） | 轻轨 (崭新出厂)");
                                handleDataForBuff(response, 150, 0.01);
                                connect1045();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1045();
                            }
                        });
            }
        });
    }

    // AWP | 树蝰 (崭新出厂)
    private void connect1045() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769191&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034525813")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP | 树蝰 (崭新出厂)");
                                handleDataForBuff(response, AWP_SK_ZX);
//                                connect1048();
                                mService.startScan2();
//                                mService.buffKnifes.connect3200();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                mService.startScan2();
//                                mService.buffKnifes.connect3200();
                            }
                        });
            }
        });
    }
    // AWP（StatTrak™） | 树蝰 (崭新出厂)
    private void connect1046() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769475&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034501470")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP（StatTrak™） | 树蝰 (崭新出厂)");
                                handleDataForBuff(response, 500, 0.02);
                                connect1047();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1047();
                            }
                        });
            }
        });
    }
    // AUG | 动量 (崭新出厂)
    private void connect1047() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769483&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034456705")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 动量 (崭新出厂)");
                                handleDataForBuff(response, AUG_DL_ZX);
                                connect1048();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1048();
                            }
                        });
            }
        });
    }
    // AUG | 动量 (略有磨损)
    private void connect1048() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769269&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034427103")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 动量 (略有磨损)");
                                handleDataForBuff(response, AUG_DL_LM);
                                connect1049();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1049();
                            }
                        });
            }
        });
    }
    // AUG | 动量 (久经沙场)
    private void connect1049() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769137&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034398274")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG | 动量 (久经沙场)");
                                handleDataForBuff(response, AUG_DL_JJ);
//                                mService.buffKnifes.connect3200();
                                mService.startScan2();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
//                                mService.buffKnifes.connect3200();
                                mService.startScan2();
                            }
                        });
            }
        });
    }
    // AUG（StatTrak™） | 动量 (久经沙场)
    private void connect1050() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769258&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034371113")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG（StatTrak™） | 动量 (久经沙场)");
                                handleDataForBuff(response, 100, 0.18);
                                connect1051();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1051();
                            }
                        });
            }
        });
    }
    // AUG（StatTrak™） | 动量 (略有磨损)
    private void connect1051() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769469&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034350669")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AUG（StatTrak™） | 动量 (略有磨损)");
                                handleDataForBuff(response, 310, 0.09);
                                connect1052();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                connect1052();
                            }
                        });
            }
        });
    }

    // AWP（StatTrak™） | 树蝰 (略有磨损)
    private void connect1052() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769273&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034286761")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP（StatTrak™） | 树蝰 (略有磨损)");
                                handleDataForBuff(response, 310, 0.08);
                                mService.buffKnifes.connect3200();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                mService.buffKnifes.connect3200();
                            }
                        });
            }
        });
    }
    //  AWP（StatTrak™） | 树蝰 (久经沙场)
    private void connect1053() {
        mService.post(new Runnable() {
            @Override
            public void run() {
                OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769175&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1556034249839\n" +
                        "Request Method:GET")
                        .execute(new JsonCallback<Buff>(Buff.class) {
                            @Override
                            public void onSuccess(Response<Buff> response) {
                                fillBuff(response, "AWP（StatTrak™） | 树蝰 (久经沙场)");
                                handleDataForBuff(response, 150, 0.17);
                                mService.buffKnifes.connect3200();
                            }

                            @Override
                            public void onError(Response<Buff> response) {
                                mService.buffKnifes.connect3200();
                            }
                        });
            }
        });
    }





}