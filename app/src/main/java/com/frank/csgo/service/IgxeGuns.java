package com.frank.csgo.service;

import com.frank.csgo.bean.Igxe;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Gun.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/14 14:16
 * 类说明：
 */
public class IgxeGuns extends IgxeCheck{


    public IgxeGuns(IgxeService service) {
        super(service);
    }

    //awp 二西莫夫 久经
    public void connect() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3760")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_EXMF_JJ);
                        connect2();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect2();
                    }
                });
    }

    //    M4A4 | 二西莫夫 久经
    private void connect2() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4534")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_EXMF_JJ);
                        connect4();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect4();
                    }
                });
    }


    //AK-47 | 血腥运动 (崭新出厂)
    private void connect4() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571618?page_no=1&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=571618&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_XXYD_ZX);
                        connect13();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect13();
                    }
                });
    }




    //   M4A4 | 喧嚣杀戮 (崭新出厂)
    private void connect13() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565686")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_XXSL_ZX);
                        connect14();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect14();
                    }
                });
    }

    //   M4A4 | 龙王 (崭新出厂)
    private void connect14() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3804")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_LW_ZX);
                        connect15();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect15();
                    }
                });
    }

    //   AK-47 | 燃料喷射器 (略有磨损)
    private void connect15() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/48930")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_RLPSQ_LM);
                        connect15_1();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect15_1();
                    }
                });
    }

    //   AK-47 | 燃料喷射器 (崭新出厂)
    private void connect15_1() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/95716")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_RLPSQ_ZX);
                        connect17();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect17();
                    }
                });
    }

    //   AK-47 | 表面淬火 (略有磨损)
    private void connect16() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6437?page_no=1&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=6437&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 210, 0.08, 150);
                        connect17();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect17();
                    }
                });
    }

    //   沙漠之鹰 | 炽烈之炎 (崭新出厂)
    private void connect17() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4191?page_no=1&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=4191&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SMZY_CLZY_ZX);
                        connect18();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect18();
                    }
                });
    }

    //   AWP（StatTrak™） | 二西莫夫 (久经沙场)
    private void connect18() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8923?page_no=2&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=8923&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_EXMF_JJ_ST);
                        connect20();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect20();
                    }
                });
    }

    //   AWP（StatTrak™） | 二西莫夫 (破损不堪)
    private void connect19() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/49366")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 380, 0.38, 320);
                        connect20();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect21();
                    }
                });
    }

    //   USP 消音版 | 枪响人亡 (略有磨损)
    private void connect20() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5535")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_QXRW_LM);
                        connect21();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect21();
                    }
                });
    }

    //   USP 消音版 | 枪响人亡 (崭新出厂)
    private void connect21() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5287")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_QXRW_ZX);
                        connect27();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect27();
                    }
                });
    }


    //   AK-47 | 红线 (略有磨损)
    private void connect27() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3887")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HX_LM);
                        connect28();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect28();
                    }
                });
    }

    //   AWP | 红线 (略有磨损)
    private void connect28() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3889")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_HX_LM);
                        connect29();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect29();
                    }
                });
    }

    //   AWP | 鬼退治 (崭新出厂)
    private void connect29() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580391")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_GTZ_ZX);
                        connect32();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect32();
                    }
                });
    }

    //   AWP | 暴怒野兽 (久经沙场)
    private void connect30() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4337")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 120, 0.16, 90);
                        connect31();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect31();
                    }
                });
    }

    //   AWP | 暴怒野兽 (略有磨损)
    private void connect31() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4160")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 175, 0.08, 130);
                        connect32();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect32();
                    }
                });
    }

    //   AWP | 暴怒野兽 (崭新出厂)
    private void connect32() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7089")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_BNYS_ZX);
                        connect33();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect33();
                    }
                });
    }

    //  M4A1 消音版 | 暴怒野兽 (略有磨损)
    private void connect33() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5507")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_BNYS_LM);
                        connect34();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect34();
                    }
                });
    }

    //  M4A1 消音版 | 暴怒野兽 (崭新出厂)
    private void connect34() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11824")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_BNYS_ZX);
                        connect35();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect35();
                    }
                });
    }

    //  AK-47 | 表面淬火 (崭新出厂)
    private void connect35() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9292")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_BMCH_ZX);
                        connect39();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect39();
                    }
                });
    }

    //  AK-47 | 表面淬火 (久经沙场)
    private void connect36() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4346")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 145, 0.16, 120);
                        connect39();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect39();
                    }
                });
    }

    //  蝴蝶刀（★） | 虎牙 (崭新出厂)
    private void connect37() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571637")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 2100, 0.01, 1900);
                        connect38();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect38();
                    }
                });
    }

    //  驾驶手套（★） | 月色织物 (久经沙场)
    private void connect38() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566281")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 750, 0.25, 620);
                        connect39();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect39();
                    }
                });
    }

    //  AWP | Mortis (崭新出厂) 死神
    private void connect39() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610631")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_SS_ZX);
                        connect40();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect40();
                    }
                });
    }

    //  AWP | *嘣* (略有磨损)
    private void connect40() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4097")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_B_LM);
                        connect42();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect42();
                    }
                });
    }

    //  USP 消音版 | 黑色魅影 (略有磨损)
    private void connect41() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571584")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 165, 0.08, 130);
                        connect42();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect42();
                    }
                });
    }

    // USP 消音版 | 黑色魅影 (崭新出厂)
    private void connect42() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571489")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_HSMY_ZX);
                        connect43();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect43();
                    }
                });
    }

    // USP 消音版 | 猎户 (崭新出厂)
    private void connect43() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3991")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_LH_ZX);
                        connect46();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect46();
                    }
                });
    }

    // M4A4 | 喧嚣杀戮 (略有磨损)
    private void connect44() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565672")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 100, 0.08, 70);
                        connect45();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect45();
                    }
                });
    }

    // M4A4 | 喧嚣杀戮 (久经沙场)
    private void connect45() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565717")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 70, 0.16, 40);
                        connect46();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect46();
                    }
                });
    }

    // M4A4 | 二西莫夫 (破损不堪)
    private void connect46() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4904")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_EXMF_PS);
                        connect47();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect47();
                    }
                });
    }

    // M4A4 | 二西莫夫 (战痕累累)
    private void connect47() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3974")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_EXMF_ZH);
                        connect49();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect49();
                    }
                });
    }

    // 爪子刀（★） | 虎牙 (崭新出厂)
    private void connect48() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4003")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1900, 0.01, 1800);
                        connect49();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect49();
                    }
                });
    }

    // USP 消音版 | 脑洞大开 (崭新出厂)
    private void connect49() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610726")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_NDDK_ZX);
                        connect50();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect50();
                    }
                });
    }

    // USP 消音版 | 枪响人亡 (久经沙场)
    private void connect50() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6758")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_QXRW_JJ);
                        connect55();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | 枪响人亡 (破损不堪)
    private void connect51() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3874")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 108, 0.39, 95);
                        connect52();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect52();
                    }
                });
    }

    // "USP 消音版 | 脑洞大开 (略有磨损)
    private void connect52() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610635")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 55, 0.08, 45);
                        connect55();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | Cortex (久经沙场)
    private void connect53() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610667")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 35, 0.16, 25);
                        connect55();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect55();
                    }
                });
    }


    // "USP 消音版 | 不锈钢 (崭新出厂)
    private void connect55() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4159")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_BXG_ZX);
                        connect56();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect56();
                    }
                });
    }

    //USP 消音版 | 次时代 (崭新出厂)
    private void connect56() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565440")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_CSD_ZX);
                        connect59();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect59();
                    }
                });
    }

    //USP 消音版 | 公路杀手 (崭新出厂)"
    private void connect57() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4313")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 84, 0.01, 65);
                        connect59();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect59();
                    }
                });
    }


    //USP 消音版 | 蓝图 (崭新出厂)
    private void connect59() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580409")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_LT_ZX);
                        connect60();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect60();
                    }
                });
    }

    //P90 | 二西莫夫 (崭新出厂)
    private void connect60() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4358")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P90_EXMF_ZX);
                        connect61();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect61();
                    }
                });
    }

    //P90 | 二西莫夫 (略有磨损)
    private void connect61() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3819")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P90_EXMF_LM);
                        connect62();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect62();
                    }
                });
    }

    //UMP-45 | 炽烈之炎 (崭新出厂)
    private void connect62() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3960")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, UMP_CLZY_ZX);
                        connect63();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect63();
                    }
                });
    }

    //法玛斯 | 防滚架 (崭新出厂)
    private void connect63() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/558529")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, FMS_FGJ_ZX);
                        connect64();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect64();
                    }
                });
    }

    //加利尔 AR | 地狱看门犬 (崭新出厂)
    private void connect64() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5679")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JLE_DYKMQ_ZX);
                        connect65();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect65();
                    }
                });
    }

    //加利尔 AR | 喧闹骷髅 (破损不堪)
    private void connect65() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6584")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JLE_XNKL_PS);
                        connect66();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect66();
                    }
                });
    }

    //加利尔 AR | ~甜甜的~ (崭新出厂)
    private void connect66() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580686")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JLE_TTD_ZX);
                        connect67();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect67();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (崭新出厂)
    private void connect67() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580303")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_DYLY_ZX);
                        connect74();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect74();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (略有磨损)
    private void connect68() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580630")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 90, 0.08, 60);
                        connect70();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect70();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (久经沙场)
    private void connect69() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580400")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 60, 0.16, 45);
                        connect70();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect70();
                    }
                });
    }

    //M4A4 | 沙漠精英 (崭新",
    private void connect70() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5378")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 45, 0.01, 40);
                        connect73();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect73();
                    }
                });
    }

    //M4A4 | 龙王 (略磨",
    private void connect71() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3734")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 50, 0.073, 40);
                        connect73();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect73();
                    }
                });
    }

    //M4A4 | 龙王 (久经",
    private void connect72() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6107")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 40, 0.16, 30);
                        connect74();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect74();
                    }
                });
    }

    //M4A4 | 狮鹫 (崭新",
    private void connect73() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/16831")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 40, 0.01, 30);
                        connect74();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect74();
                    }
                });
    }

    //M4A4 | 皇家圣骑士 (略有磨损)
    private void connect74() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9102")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HJSQS_LM);
                        connect76();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect76();
                    }
                });
    }

    //M4A4 | X光 (略有磨损)
    private void connect75() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/19475")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 45, 0.08, 35);
                        connect76();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect76();
                    }
                });
    }

    //M4A4 | X光 (崭新出厂)
    private void connect76() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4173")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_XG_ZX);
                        connect77();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect77();
                    }
                });
    }

    //M4A4 |死寂空间 (崭新出厂)
    private void connect77() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555129")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_SJKJ_ZX);
                        connect81();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |死寂空间 (略有磨损)
    private void connect78() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555157")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 85, 0.075, 60);
                        connect81();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |死寂空间 (久经沙场)
    private void connect79() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555149")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 58, 0.16, 45);
                        connect81();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect81();
                    }
                });
    }


    //M4A4 |黑色魅影 (久经沙场)
    private void connect81() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610655")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HSMY_JJ);
                        connect82();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect82();
                    }
                });
    }

    //M4A4 |黑色魅影 (略有磨损)
    private void connect82() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610628")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HSMY_LM);
                        connect86();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect86();
                    }
                });
    }

    //M4A4 |黑色魅影 (战痕累累)
    private void connect83() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610665")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 95, 0.46, 70);
                        connect84();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect84();
                    }
                });
    }

    //M4A4 |弹雨 (久经沙场)
    private void connect84() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/10076")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 36, 0.16, 25);
                        connect85();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect85();
                    }
                });
    }

    //M4A4 |弹雨 (略有磨损)
    private void connect85() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8443")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 57, 0.08, 45);
                        connect86();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect86();
                    }
                });
    }

    //M4A4 |弹雨 (崭新出厂)
    private void connect86() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7947")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_DY_ZX);
                        connect87();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect87();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (崭新出厂)
    private void connect87() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613858")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_MY_ZX);
                        connect90();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect90();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (略有磨损)
    private void connect88() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613939")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 55, 0.08, 35);
                        connect90();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect90();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 久经)
    private void connect89() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613886")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 25, 0.16, 18);
                        connect90();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect90();
                    }
                });
    }

    //M4A1 消音版 | 伊卡洛斯殒落 (崭新出厂)
    private void connect90() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4559")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_YKLSYL_ZX);
                        connect91();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect91();
                    }
                });
    }

    //M4A1 消音版 | 破碎千秋 (崭新出厂)
    private void connect91() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605295")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_PSQQ_ZX);
                        connect92_1();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect92_1();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (崭新出厂)
    private void connect92_1() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/458002")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_NHSZCY_ZX);
                        connect92();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect92();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (略有磨损)
    private void connect92() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/448689")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_NHSZCY_LM);
                        connect94();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect94();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (久经沙场)
    private void connect93() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/483598")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 70, 0.16, 50);
                        connect94();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect94();
                    }
                });
    }

    //M4A1 消音版 | 赤红新星 (崭新出厂)
    private void connect94() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4464")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_CHXX_ZX);
                        connect95();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect95();
                    }
                });
    }

    //M4A1 消音版 | 毁灭者2000 (崭新出厂)
    private void connect95() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571649")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_HMZ_ZX);
                        connect96();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect96();
                    }
                });
    }

    //M4A1 消音版 | 机型工业 (崭新出厂)
    private void connect96() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555163")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response,M4A1_JXGY_ZX );
                        connect97();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect97();
                    }
                });
    }

    //M4A1 消音版 | 机型工业 (略有磨损)
    private void connect97() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555150")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_JXGY_LM);
                        connect98();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect98();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (崭新出厂)
    private void connect98() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3806")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_JSCR_ZX);
                        connect99();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect99();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (略有磨损)
    private void connect99() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4125")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_JSCR_LM);
                        connect101();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect101();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (久经沙场)
    private void connect100() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4253")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 45, 0.16, 32);
                        connect101();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect101();
                    }
                });
    }

    //M4A1 消音版 | 次时代 (崭新出厂)
    private void connect101() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4212")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A1_CSD_ZX);
                        connect103();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect103();
                    }
                });
    }

    //M4A1 消音版 | 守护者 (崭新出厂)
    private void connect102() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3843")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 50, 0.01, 30);
                        connect103();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect103();
                    }
                });
    }

    //AWP | 巨龙传说 (崭新出厂)
    private void connect103() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3955")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_JLCS_ZX);
                        connect103_1();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect103_1();
                    }
                });
    }
    //AWP | 巨龙传说 (略有磨损)
    private void connect103_1() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8088")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_JLCS_LM);
                        connect103_2();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect103_2();
                    }
                });
    }
    //AWP | 巨龙传说 (久经沙场)
    private void connect103_2() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/22781")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_JLCS_JJ);
                        connect104();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect104();
                    }
                });
    }

    //AK-47 | 皇后 (略有磨损)
    private void connect104() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605269")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HH_LM);
                        connect105();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect105();
                    }
                });
    }

    //AK-47 | 皇后 (久经沙场)
    private void connect105() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605293")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HH_JJ);
                        connect106();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect106();
                    }
                });
    }

    //AK-47 | 皇后 (崭新出厂)
    private void connect106() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605338")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HH_ZX);
                        connect107();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect107();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (崭新出厂)
    private void connect107() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613857")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_NHQS_ZX);
                        connect108();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect108();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (略有磨损)
    private void connect108() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613905")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_NHQS_LM);
                        connect109();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect109();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (久经沙场)
    private void connect109() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613903")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_NHQS_JJ);
                        connect110();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect110();
                    }
                });
    }

    //AK-47 | 霓虹革命 (崭新出厂)
    private void connect110() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/556028")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_NHGM_ZX);
                        connect112();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect112();
                    }
                });
    }

    //AK-47 | 霓虹革命 (略有磨损)
    private void connect111() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555892")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 140, 0.075, 110);
                        connect112();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect112();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (崭新出厂)
    private void connect112() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614016")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SMZY_HSDH_ZX);
                        connect113();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect113();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (略有磨损)
    private void connect113() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613906")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SMZY_HSDH_LM);
                        connect114();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect114();
                    }
                });
    }

    //AK-47 | 深海复仇 (崭新出厂)
    private void connect114() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3761")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_SHFC_ZX);
                        connect116();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect116();
                    }
                });
    }

    //AK-47 | 深海复仇 (略有磨损)
    private void connect115() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4544")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 150, 0.08, 115);
                        connect116();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect116();
                    }
                });
    }

    //AK-47 | 水栽竹 (崭新出厂)
    private void connect116() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/25744")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_SZZ_ZX);
                        connect117();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect117();
                    }
                });
    }

    //AK-47 | 水栽竹 (略有磨损)
    private void connect117() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6461")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_SZZ_LM);
                        connect118();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect118();
                    }
                });
    }

    //AK-47 | 水栽竹 (久经沙场)
    private void connect118() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7036")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_SZZ_JJ);
                        connect120();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect120();
                    }
                });
    }

    //AK-47 | 安全网格 (崭新出厂)
    private void connect119() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/616501")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 95, 0.010, 70);
                        connect120();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect120();
                    }
                });
    }

    //AK-47 | 二西莫夫 (久经沙场)
    private void connect120() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618577")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_EXMF_JJ);
                        connect121();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect121();
                    }
                });
    }

    //AK-47 | 二西莫夫 (略有磨损)
    private void connect121() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618615")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_EXMF_LM);
                        connect123();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect123();
                    }
                });
    }

    //AK-47 | 二西莫夫 (久经沙场)
    private void connect122() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618577")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 400, 0.17, 320);
                        connect123();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect123();
                    }
                });
    }

    //M4A4 | 镁元素 (崭新出厂)
    private void connect123() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618616")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_MYS_ZX);
                        connect124();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect124();
                    }
                });
    }

    //沙漠之鹰 | 机械工业 (崭新出厂)
    private void connect124() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618576")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SMZY_JXGY_ZX);
                        connect126();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect126();
                    }
                });
    }

    //沙漠之鹰 | 机械工业 (略有磨损)
    private void connect125() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618619")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 55, 0.071, 40);
                        connect126();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect126();
                    }
                });
    }

    //MP5 | 磷光体(崭新出厂)
    private void connect126() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618629")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MP5_LGT_ZX);
                        connect127();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect127();
                    }
                });
    }

    //P250 | 二西莫夫(略有磨损)
    private void connect127() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/457305")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P250_EXMF_LM);
                        connect128();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect128();
                    }
                });
    }

    //AWP | 黑色魅影（崭新出厂）
    private void connect128() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618578")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_HSMY_ZX);
                        connect131();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect131();
                    }
                });
    }

    //AWP | 黑色魅影（略有磨损）
    private void connect129() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618614")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 430, 0.08, 380);
                        connect130();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect130();
                    }
                });
    }

    //AWP | 黑色魅影（久经沙场）
    private void connect130() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618654")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 330, 0.17, 290);
                        connect131();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect131();
                    }
                });
    }

    //    AK47 | 荒野反叛（略有磨损）
    private void connect131() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/10220")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HYFP_LM);
                        connect132();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect132();
                    }
                });
    }

    //    格洛克18 | 荒野反叛（崭新出厂）
    private void connect132() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555142")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GLK_HYFP_ZX);
                        connect133();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect133();
                    }
                });
    }

    //    AK-47 | 火蛇 (久经沙场)
    private void connect133() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/19087")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HS_JJ);
                        connect134();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect134();
                    }
                });
    }

    //    AK-47 | 火蛇 (略有磨损)
    private void connect134() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5279")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HS_LM);
                        connect135();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect135();
                    }
                });
    }

    // M4A4（StatTrak™） | 二西莫夫 (久经沙场)
    private void connect135() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11759")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_EXMF_JJ_ST);
                        connect138();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect138();
                    }
                });
    }

    // M4A4（StatTrak™） | 二西莫夫 (破损不堪）
    private void connect136() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11759")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 750, 0.39, 690);
                        connect137();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect137();
                    }
                });
    }

    // M4A4（StatTrak™） | 二西莫夫 (战痕累累）
    private void connect137() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/55831")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 380, 0.46, 320);
                        connect138();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect138();
                    }
                });
    }

    // M4A4 | 咆哮 (略有磨损)
    private void connect138() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/12264")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response,M4A4_PX_LM);
                        connect154();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect154();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (久经沙场)
    private void connect139() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566738")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1700, 0.20, 1400);
                        connect142();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect142();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (略有磨损)
    private void connect140() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566434")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 3700, 0.09, 1400);
                        connect141();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect141();
                    }
                });
    }

    // 驾驶手套（★） | 月色织物 (略有磨损)
    private void connect141() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566867")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1700, 0.09, 1400);
                        connect142();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect142();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (略有磨损)
    private void connect142() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566494")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 2000, 0.09, 1500);
                        connect147();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect147();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (久经沙场)
    private void connect143() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566238")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 900, 0.20, 800);
                        connect144();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect144();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (略有磨损)
    private void connect144() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566238")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1300, 0.09, 1100);
                        connect145();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect145();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (久经沙场)
    private void connect145() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566321")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 800, 0.20, 700);
                        connect146();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect146();
                    }
                });
    }

    // 驾驶手套（★） | 王蛇 (久经沙场)
    private void connect146() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566321")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1350, 0.20, 1150);
                        connect147();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect147();
                    }
                });
    }

    // 驾驶手套（★） | 护卫 (略有磨损)
    private void connect147() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566248")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 700, 0.09, 600);
                        connect148();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect148();
                    }
                });
    }

    // 裹手（★） | 森林色调 (久经沙场)
    private void connect148() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610880")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 700, 0.20, 600);
                        connect149();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect149();
                    }
                });
    }

    // 裹手（★） | 套印 (久经沙场)
    private void connect149() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611006")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1600, 0.20, 1300);
                        connect150();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect150();
                    }
                });
    }

    // 裹手（★） | 屠夫 (略有磨损)
    private void connect150() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566659")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 2300, 0.09, 2000);
                        connect151();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect151();
                    }
                });
    }

    // 裹手（★） | 屠夫 (久经沙场)
    private void connect151() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566204")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1300, 0.20, 1100);
                        connect152();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect152();
                    }
                });
    }

    // 裹手（★） | 恶土 (久经沙场)
    private void connect152() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566719")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 850, 0.20, 750);
                        connect153();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect153();
                    }
                });
    }

    // 裹手（★） | 恶土 (略有磨损)
    private void connect153() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566901")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1400, 0.09, 1200);
                        connect154();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect154();
                    }
                });
    }

    // P250 | 生化短吻鳄 (崭新出厂)
    private void connect154() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605465")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P250_SHDWE_ZX);
                        connect155();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect155();
                    }
                });
    }

    // P250 | 银装素裹 (略有磨损)
    private void connect155() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8086")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P250_YZSG_LM);
                        connect156();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect156();
                    }
                });
    }

    // SG 553 | 意式拉力 (略有磨损)
    private void connect156() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/616439")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SG553_YSLL_LM);
                        connect157();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect157();
                    }
                });
    }

    // SG 553 | 意式拉力 (久经沙场)
    private void connect157() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/616742")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SG553_YSLL_JJ);
                        connect160();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect160();
                    }
                });
    }

    //计数器
    //USP 消音版（StatTrak™） | 疯狂蔓延 (略有磨损)
    private void connect158() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8106")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 200, 0.10, 140);
                        connect159();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect159();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 疯狂蔓延 (久经沙场)
    private void connect159() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/16993")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 100, 0.19, 60);
                        connect160();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect160();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 脑洞大开 (崭新出厂)
    private void connect160() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610895")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_NDDK_ZX_ST);
                        connect162();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect162();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 脑洞大开 (略有磨损)
    private void connect161() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610706")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 220, 0.09, 160);
                        connect162();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect162();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 次时代(崭新出厂)
    private void connect162() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565638")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_CSD_ZX_ST);
                        connect163();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect163();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 不锈钢(略有磨损)
    private void connect163() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6118")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_BXG_LM_ST);
                        connect166();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect166();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 不锈钢(崭新出厂)
    private void connect164() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11696")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 270, 0.02, 200);
                        connect165();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect165();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 蓝图(崭新出厂)
    private void connect165() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/580967")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 270, 0.02, 190);
                        connect166();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect166();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 闪回(崭新出厂)
    private void connect166() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618592")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 45, 0.01, 30);
                        connect167();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect167();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(崭新出厂)
    private void connect167() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571617")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_HSMY_ZX_ST);
                        connect168();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect168();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(略有磨损)
    private void connect168() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571635")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_HSMY_LM_ST);
                        connect169();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect169();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(久经沙场)
    private void connect169() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571992")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_HSMY_JJ_ST);
                        connect170();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect170();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 枪响人亡(久经沙场)
    private void connect170() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/23605")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_QXRW_JJ_ST);
                        connect171();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect171();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 力矩(崭新出厂)
    private void connect171() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5839")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, USP_LJ_ZX_ST);
                        connect172();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect172();
                    }
                });
    }

    //格洛克18（StatTrak™） | 水灵(崭新出厂)
    private void connect172() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4847")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GLK_SL_ZX_ST);
                        connect174_1();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect174_1();
                    }
                });
    }

    //P250（StatTrak™） | 生化短尾鳄(崭新出厂)
    private void connect173() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605652")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 420, 0.03, 350);
                        connect174();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect174();
                    }
                });
    }

    //P250（StatTrak™） | 生化短尾鳄(略有磨损)
    private void connect174() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/606203")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 220, 0.08, 160);
                        connect175();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect175();
                    }
                });
    }
    //P250（StatTrak™） | 生化短尾鳄(久经沙场)
    private void connect174_1() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605635")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P250_SHDWE_JJ_ST);
                        connect175();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect175();
                    }
                });
    }

    //P250（StatTrak™） | 二西莫夫(略有磨损)
    private void connect175() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/554032")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P250_EXMF_LM_ST);
                        connect176();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect176();
                    }
                });
    }

    //P250（StatTrak™） | 二西莫夫(久经沙场)
    private void connect176() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/445663")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, P250_EXMF_JJ_ST);
                        connect196();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect196();
                    }
                });
    }

    //P250（StatTrak™） | 超新星(崭新出厂)
    private void connect177() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6441")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 30, 0.015, 15);
                        connect178();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect178();
                    }
                });
    }

    //P250（StatTrak™） | 元素轮廓(崭新出厂)
    private void connect178() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6276")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 25, 0.003, 15);
                        connect179();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect179();
                    }
                });
    }

    //CZ75（StatTrak™） | 经济(崭新出厂)
    private void connect179() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614082")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 82, 0.01, 50);
                        connect180();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect180();
                    }
                });
    }

    //CZ75（StatTrak™） | 战术高手(崭新出厂)
    private void connect180() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605709")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 45, 0.01, 30);
                        connect181();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect181();
                    }
                });
    }

    //CZ75（StatTrak™） | 猛虎(崭新出厂)
    private void connect181() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4196")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 50, 0.01, 30);
                        connect182();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect182();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 机械工业(崭新出厂)
    private void connect182() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618657")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 350, 0.02, 180);
                        connect189();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect189();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 机械工业(略有磨损)
    private void connect183() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618663")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 210, 0.08, 190);
                        connect184();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect184();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 指挥(略有磨损)
    private void connect184() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/559259")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 60, 0.08, 40);
                        connect186();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 大佬龙(崭新出厂)
    private void connect185() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/188881")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 380, 0.02, 300);
                        connect186();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 红色代号(略有磨损)
    private void connect186() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614983")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 500, 0.09, 400);
                        connect187();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect187();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 红色代号(久经沙场)
    private void connect187() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615407")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 350, 0.16, 230);
                        connect189();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect189();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 阴谋者(崭新出厂)
    private void connect188() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7720")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 120, 0.02, 100);
                        connect189();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect189();
                    }
                });
    }

    //P90（StatTrak™） | 二西莫夫 (略有磨损)
    private void connect189() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7280")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 240, 0.08, 190);
                        connect191();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect191();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (崭新出厂)
    private void connect190() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566249")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 680, 0.03, 460);
                        connect191();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect191();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (略有磨损)
    private void connect191() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565805")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 310, 0.08, 240);
                        connect196();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect196();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (久经沙场)
    private void connect192() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/565880")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 230, 0.18, 200);
                        connect193();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect193();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (崭新出厂)
    private void connect193() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555182")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 530, 0.03, 450);
                        connect194();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect194();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (略有磨损)
    private void connect194() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555296")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 270, 0.09, 220);
                        connect195();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect195();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (久经沙场)
    private void connect195() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555325")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 180, 0.17, 140);
                        connect196();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect196();
                    }
                });
    }

    //M4A4（StatTrak™） | 黑色魅影 (久经沙场)
    private void connect196() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610802")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HSMY_JJ_ST);
                        connect197();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect197();
                    }
                });
    }

    //M4A4（StatTrak™） | 镁元素 (崭新出厂)
    private void connect197() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618842")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_MYS_ZX_ST);
                        connect199();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect199();
                    }
                });
    }

    //M4A4（StatTrak™） | 镁元素 (略有磨损)
    private void connect198() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618655")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 50, 0.08, 30);
                        connect199();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect199();
                    }
                });
    }

    //M4A4（StatTrak™） | 龙王 (崭新出厂)
    private void connect199() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7062")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_LW_ZX_ST);
                        connect1000();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1000();
                    }
                });
    }

    //M4A4（StatTrak™） | 杀意大名 (崭新出厂)
    private void connect1000() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4145")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_SYDM_ZX_ST);
                        connect1009();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1009();
                    }
                });
    }

    //M4A4（StatTrak™） | 狮鹫 (崭新出厂)
    private void connect1001() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4448")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 150, 0.01, 100);
                        connect1002();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1002();
                    }
                });
    }

    //AK-47（StatTrak™） | 皇后 (崭新出厂)
    private void connect1002() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/606104")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 2000, 0.04, 1750);
                        connect1009();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1009();
                    }
                });
    }

    //AK-47（StatTrak™） | 皇后 (略有磨损)
    private void connect1003() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605626")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 950, 0.09, 800);
                        connect1004();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1004();
                    }
                });
    }

    // AK-47（StatTrak™） | 皇后 (久经沙场)
    private void connect1004() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/605837")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 630, 0.17, 550);
                        connect1005();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1005();
                    }
                });
    }

    // AK-47（StatTrak™） | 火神 (崭新出厂)
    private void connect1005() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/13257")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1900, 0.03, 1600);
                        connect1006();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1006();
                    }
                });
    }

    // AK-47（StatTrak™） | 火神 (略有磨损)
    private void connect1006() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8087")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1000, 0.08, 800);
                        connect1007();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1007();
                    }
                });
    }

    // AK-47（StatTrak™） | 火神 (久经沙场)
    private void connect1007() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9438")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 500, 0.17, 380);
                        connect1008();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1008();
                    }
                });
    }

    // AK-47（StatTrak™） | 霓虹骑士 (崭新出厂)
    private void connect1008() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/613999")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1600, 0.04, 1350);
                        connect1010();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1010();
                    }
                });
    }

    // AK-47（StatTrak™） | 霓虹骑士 (略有磨损)
    private void connect1009() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614073")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_NHQS_LM_ST);
                        connect1010();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1010();
                    }
                });
    }

    // AK-47（StatTrak™） | 霓虹骑士 (久经沙场)
    private void connect1010() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614074")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_NHQS_JJ_ST);
                        connect1011();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1011();
                    }
                });
    }

    // AK-47（StatTrak™） | 燃料喷射器 (略有磨损)
    private void connect1011() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/176631")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_RLPSQ_LM_ST);
                        connect1012();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1012();
                    }
                });
    }

    // AK-47（StatTrak™） | 燃料喷射器 (久经沙场)
    private void connect1012() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/145552")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_RLPSQ_JJ_ST);
                        connect1016();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1016();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (崭新出厂)
    private void connect1013() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/95746")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 750, 0.02, 600);
                        connect1014();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1014();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (略有磨损)
    private void connect1014() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9842")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 450, 0.09, 360);
                        connect1015();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1015();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (久经沙场)
    private void connect1015() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6938")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 280, 0.17, 220);
                        connect1016();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1016();
                    }
                });
    }

    // AK-47（StatTrak™） | 血腥运动 (崭新出厂)
    private void connect1016() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571688")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_XXYD_ZX_ST);
                        connect1018();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1018();
                    }
                });
    }

    // AK-47（StatTrak™） | 血腥运动 (略有磨损)
    private void connect1017() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571781")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 650, 0.08, 550);
                        connect1018();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1018();
                    }
                });
    }

    // AK-47（StatTrak™） | 红线 (略有磨损)
    private void connect1018() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3878")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_XXYD_LM_ST);
                        connect1019();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1019();
                    }
                });
    }

    // AK-47（StatTrak™） | 红线 (久经沙场)
    private void connect1019() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4126")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_XXYD_JJ_ST);
                        connect1020();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1020();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (崭新出厂)
    private void connect1020() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/16566")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_HDDZ_ZX_ST);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (略有磨损)
    private void connect1021() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/86546")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 370, 0.08, 290);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (久经沙场)
    private void connect1022() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/8108")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 200, 0.17, 170);
                        connect1023();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1023();
                    }
                });
    }

    // AK-47（StatTrak™） | 轨道 (崭新出厂)
    private void connect1023() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/581110")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 220, 0.02, 150);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 卡特尔 (崭新出厂)
    private void connect1024() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/13052")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 200, 0.03, 140);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 精英之作 (崭新出厂)
    private void connect1025() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4795")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AK47_JYZZ_ZX_ST);
                        connect1038();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1038();
                    }
                });
    }

    // AK-47（StatTrak™） | 精英之作 (略有磨损)
    private void connect1026() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4553")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 60, 0.08, 45);
                        connect1028();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1028();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 梦魇  (久经沙场)
    private void connect1027() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614347")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 70, 0.17, 45);
                        connect1028();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1028();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 梦魇  (略有磨损)
    private void connect1028() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/614085")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 180, 0.08, 130);
                        connect1032();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1032();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 暴怒野兽  (崭新出厂)
    private void connect1029() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3769")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1000, 0.03, 800);
                        connect1030();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1030();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 暴怒野兽  (略有磨损)
    private void connect1030() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3879")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 270, 0.08, 200);
                        connect1031();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1031();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 暴怒野兽  (久经沙场)
    private void connect1031() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4339")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 140, 0.18, 100);
                        connect1032();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1032();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 机械工业  (略有磨损)
    private void connect1032() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555705")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 280, 0.08, 200);
                        connect1034();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1034();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 梦魇  (崭新出厂)
    private void connect1033() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615118")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 500, 0.02, 350);
                        connect1034();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1034();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 女火神之炽焰  (略有磨损)
    private void connect1034() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/496444")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 420, 0.08, 320);
                        connect1035();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1035();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 女火神之炽焰  (久经沙场)
    private void connect1035() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/503324")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 220, 0.17, 160);
                        connect1036();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1036();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 次时代 (崭新出厂)
    private void connect1036() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5038")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 330, 0.02, 220);
                        connect1038();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1038();
                    }
                });
    }

    // M4A1 消音型（StatTrak™） | 次时代 (久经沙场)
    private void connect1037() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6347")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 90, 0.18, 60);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect2000();
                    }
                });
    }
    // M4A4 | 皇帝 (崭新出厂)
    private void connect1038() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621651")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HD_ZX);
                        connect1039();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1039();
                    }
                });
    }
    // M4A4 | 皇帝 (略有磨损)
    private void connect1039() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621540")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HD_LM);
                        connect1040();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1040();
                    }
                });
    }
    // M4A4 | 皇帝 (久经沙场)
    private void connect1040() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621533")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_HD_JJ);
                        connect1043();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1043();
                    }
                });
    }
    // M4A4（StatTrak™） | 皇帝 (久经沙场)
    private void connect1041() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621719")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 610, 0.25, 500);
                        connect1042();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1042();
                    }
                });
    }
    // M4A4（StatTrak™） | 皇帝 (略有磨损)
    private void connect1042() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621560")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 1700, 0.08, 1500);
                        connect1043();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1043();
                    }
                });
    }
    // 沙漠之鹰 | 轻轨 (崭新出厂)
    private void connect1043() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621537")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SMZY_QG_ZX);
                        connect1044();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1044();
                    }
                });
    }
    // 沙漠之鹰（StatTrak™） | 轻轨 (崭新出厂)
    private void connect1044() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621694")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, SMZY_QG_ZX_ST);
                        connect1045();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1045();
                    }
                });
    }
    // AWP | 树蝰 (崭新出厂)
    private void connect1045() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621572")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AWP_SK_ZX);
                        connect1047();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1047();
                    }
                });
    }
    // AWP（StatTrak™） | 树蝰 (崭新出厂)
    private void connect1046() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621675")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 500, 0.02, 400);
                        connect1047();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1047();
                    }
                });
    }
    // AUG | 动量 (崭新出厂)
    private void connect1047() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621659")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AUG_DL_ZX);
                        connect1048();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1048();
                    }
                });
    }
    // AUG | 动量 (略有磨损)
    private void connect1048() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621653")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AUG_DL_LM);
                        connect1049();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1049();
                    }
                });
    }
    // AUG | 动量 (久经沙场)
    private void connect1049() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621563")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, AUG_DL_JJ);
                        connect1054();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1054();
                    }
                });
    }
    // AUG（StatTrak™） | 动量 (久经沙场)
    private void connect1050() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621576")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 100, 0.18, 60);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect2000();
                    }
                });
    }
    // AUG（StatTrak™） | 动量 (略有磨损)
    private void connect1051() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621577")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 310, 0.09, 250);
                        connect1052();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1052();
                    }
                });
    }
    // AWP（StatTrak™） | 树蝰 (略有磨损)
    private void connect1052() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621575")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 310, 0.08, 190);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect2000();
                    }
                });
    }
    //  AWP（StatTrak™） | 树蝰 (久经沙场)
    private void connect1053() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621636")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, 150, 0.17, 100);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect2000();
                    }
                });
    }
    //  UMP-45 | 动量 (崭新出厂)
    private void connect1054() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/618621")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, UMP_DL_ZX);
                        connect1055();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1055();
                    }
                });
    }
    //  加利尔 AR | 「经济」克鲁尔 (久经沙场)
    private void connect1055() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4012")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JLE_JJ_JJ);
                        connect1056();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1056();
                    }
                });
    }
    //  M4A4 | 杀意大名 (崭新出厂)
    private void connect1056() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4927")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M4A4_SYDM_ZX);
                        connect1057();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1057();
                    }
                });
    }

    // FN57 | 怒氓 (久经沙场)
    public void connect1057() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621565")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, FN57_NM_JJ);
                        connect1058();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1058();
                    }
                });
    }
    // FN57 | 怒氓 (崭新出厂)
    public void connect1058() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621648")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, FN57_NM_ZX);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect2000();
                    }
                });
    }
    // 格洛克 18 型 | 红苹果 (崭新出厂)
    public void connect2000() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4419")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GLK_HPG_ZX);
                        mService.igxeGloves.connect1100();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        mService.igxeGloves.connect1100();
                    }
                });
    }
}