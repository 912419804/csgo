package com.frank.csgo.service;

import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Gun.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/14 14:16
 * 类说明：
 */
public class C5Guns extends C5Check{


    public C5Guns(C5Service service) {
        super(service);
    }

    //awp 二西莫夫 久经
    public void connect() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22554&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096743807232799998")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_EXMF_JJ);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22720&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096744132892718146")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_EXMF_JJ);
                        connect4();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        super.onError(response);
//                        connect4();
                    }
                });
    }


    //AK-47 | 血腥运动 (崭新出厂)
    private void connect4() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553370749&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096797893293251240")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_XXYD_ZX);
                        connect13();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect13();
                    }
                });
    }


    //    "折叠刀（★） | 渐变大理石 (崭新出厂)
    private void connect6() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/7798?page_no=1&cur_page=1&sort_rule=0&buy_method=0&status_locked=0&product_id=7798&is_sticker=0&gem_attribute_id=&gem_id=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 1000, 0.01, 900);
                        connect13();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect13();
                    }
                });
    }


    //   折叠刀（★）
//    private void connect9() {
//        OkGo.<C5>get("https://www.C5.cn/product/trade/730/3817")
//                .execute(new JsonCallback<C5>(C5.class) {
//                    @Override
//                    public void onSuccess(Response<C5> response) {
//                        handleDataC5(response, 400);
//                        connect13();
//                    }
//
//                    @Override
//                    public void onError(Response<C5> response) {
//                        connect13();
//                    }
//                });
//    }


    //   M4A4 | 喧嚣杀戮 (崭新出厂)
    private void connect13() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=295893123&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096798339012401778")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_XXSL_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22934&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096798698527906134")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_LW_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=27150&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096799349234450956")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_RLPSQ_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=27166&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096799538885461330")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_RLPSQ_ZX);
                        connect16();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect16();
                    }
                });
    }

    //   AK-47 | 表面淬火 (略有磨损)
    private void connect16() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22538&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096800077434597665")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_BMCH_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22787&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096802442905245505")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SMZY_CLZY_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24633&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096802813246859343")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_EXMF_JJ_ST);
                        connect20();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect20();
                    }
                });
    }

    //   AWP（StatTrak™） | 二西莫夫 (破损不堪)
    private void connect19() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/49366")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 380, 0.38, 320);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24379&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096803361275853603")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_QXRW_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=26032&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096803510831795916")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_QXRW_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24339&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096803931773635927")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HX_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22548&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096804101372613874")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_HX_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553427239&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096804343875067730")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_GTZ_ZX);
                        connect32();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect32();
                    }
                });
    }

    //   AWP | 暴怒野兽 (久经沙场)
    private void connect30() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4337")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 120, 0.16, 100);
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
                        handleDataC5(response, 190, 0.08, 130);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24262&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096804621487246537")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_BNYS_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=23705&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096804818628599472")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_BNYS_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24433&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096804953374568092")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_BNYS_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25009&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096805212976082965")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_BMCH_ZX);
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
                        handleDataC5(response, 145, 0.16, 120);
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
                        handleDataC5(response, 2100, 0.01, 1900);
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
                        handleDataC5(response, 750, 0.22, 600);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553465828&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096805477863981787")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_SS_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22508&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096805705361093780")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_B_LM);
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
                        handleDataC5(response, 165, 0.08, 130);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553370742&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096806066653363750")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_LH_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22560&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096806301023558080")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_LH_ZX);
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
                        handleDataC5(response, 100, 0.08, 70);
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
                        handleDataC5(response, 70, 0.16, 40);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24796&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096806598194649493")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_EXMF_PS);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22561&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096806759525283353")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_EXMF_ZH);
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
                        handleDataC5(response, 1900, 0.01, 1800);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553466028&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096807017369668839")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_NDDK_ZX);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }

    // USP 消音版 | 枪响人亡 (久经沙场)
    private void connect50() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3010758&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_QXRW_JJ);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | 枪响人亡 (破损不堪)
    private void connect51() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/3874")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 108, 0.39, 95);
                        connect52();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect52();
                    }
                });
    }

    // "USP 消音版 | 脑洞大开 (略有磨损)
    private void connect52() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445946&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 55, 0.08, 45);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }

    // "USP 消音版 | Cortex (久经沙场)
    private void connect53() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610667")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 35, 0.16, 25);
                        connect55();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect55();
                    }
                });
    }


    // "USP 消音版 | 不锈钢 (崭新出厂)
    private void connect55() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=23977&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096807223763699513")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_BXG_ZX);
                        connect56();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect56();
                    }
                });
    }

    //USP 消音版 | 次时代 (崭新出厂)
    private void connect56() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=293069649&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096807450553388392")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_CSD_ZX);
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
                        handleDataC5(response, 84, 0.01, 65);
                        connect59();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect59();
                    }
                });
    }


    //USP 消音版 | 蓝图 (崭新出厂)
    private void connect59() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553429651&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096807698772731038")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_LT_ZX);
                        connect60();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect60();
                    }
                });
    }

    //P90 | 二西莫夫 (崭新出厂)
    private void connect60() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22558&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096808054026557150")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P90_EXMF_ZX);
                        connect61();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect61();
                    }
                });
    }

    //P90 | 二西莫夫 (略有磨损)
    private void connect61() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=23837&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096808227167360583")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P90_EXMF_LM);
                        connect62();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect62();
                    }
                });
    }

    //UMP-45 | 炽烈之炎 (崭新出厂)
    private void connect62() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25002&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096808463241910330")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, UMP_CLZY_ZX);
                        connect63();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect63();
                    }
                });
    }

    //法玛斯 | 防滚架 (崭新出厂)
    private void connect63() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=217516856&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096808658689976264")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, FMS_FGJ_ZX);
                        connect64();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect64();
                    }
                });
    }

    //加利尔 AR | 地狱看门犬 (崭新出厂)
    private void connect64() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25293&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096808940486472293")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JLE_DYKMQ_ZX);
                        connect65();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect65();
                    }
                });
    }

    //加利尔 AR | 喧闹骷髅 (破损不堪)
    private void connect65() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22788&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096809238784098077")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JLE_XNKL_PS);
                        connect66();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect66();
                    }
                });
    }

    //加利尔 AR | ~甜甜的~ (崭新出厂)
    private void connect66() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553426873&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096809537331107702")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JLE_TTD_ZX);
                        connect67();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect67();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (崭新出厂)
    private void connect67() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553427241&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096809749091710586")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_DYLY_ZX);
                        connect74();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect74();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (略有磨损)
    private void connect68() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553395866&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 90, 0.08, 75);
                        connect70();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect70();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (久经沙场)
    private void connect69() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/580400")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 60, 0.16, 45);
                        connect71();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect71();
                    }
                });
    }

    //M4A4 | 沙漠精英 (崭新出厂)
    private void connect70() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3025223&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 45, 0.01, 30);
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
                        handleDataC5(response, 50, 0.073, 40);
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
                        handleDataC5(response, 40, 0.16, 30);
                        connect73();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect73();
                    }
                });
    }

    //M4A4 | 狮鹫 (崭新出厂)
    private void connect73() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3025886&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 40, 0.01, 30);
                        connect74();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect74();
                    }
                });
    }

    //M4A4 | 皇家圣骑士 (略有磨损)
    private void connect74() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=26666&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096809939472603812")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HJSQS_LM);
                        connect76();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect76();
                    }
                });
    }

    //M4A4 | X光 (略有磨损)
    private void connect75() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/19475")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 45, 0.08, 35);
                        connect76();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect76();
                    }
                });
    }

    //M4A4 | X光 (崭新出厂)
    private void connect76() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22565&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096810169086537489")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_XG_ZX);
                        connect77();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect77();
                    }
                });
    }

    //M4A4 |死寂空间 (崭新出厂)
    private void connect77() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=5094472&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096810402137729889")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_SJKJ_ZX);
                        connect81();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |死寂空间 (略有磨损)
    private void connect78() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2996384&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 85, 0.075, 60);
                        connect81();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |死寂空间 (久经沙场)
    private void connect79() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555149")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 58, 0.16, 45);
                        connect81();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect81();
                    }
                });
    }

    //M4A4 |黑色魅影 (崭新出厂)
    private void connect81() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553465900&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096813785406103777")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HSMY_ZX);
                        connect86();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect82();
                    }
                });
    }

    //M4A4 |黑色魅影 (略有磨损)
    private void connect82() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445825&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HSMY_LM);
                        connect86();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect86();
                    }
                });
    }

    //M4A4 |黑色魅影 (战痕累累)
    private void connect83() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/610665")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 95, 0.46, 70);
                        connect84();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect84();
                    }
                });
    }

    //M4A4 |弹雨 (久经沙场)
    private void connect84() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/10076")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 36, 0.16, 25);
                        connect85();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect85();
                    }
                });
    }

    //M4A4 |弹雨 (略有磨损)
    private void connect85() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/8443")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 57, 0.08, 45);
                        connect86();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect86();
                    }
                });
    }

    //M4A4 |弹雨 (崭新出厂)
    private void connect86() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25698&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096814167523977733")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_DY_ZX);
                        connect87();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect87();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (崭新出厂)
    private void connect87() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553468129&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096814380127488270")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_MY_ZX);
                        connect90();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect90();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (略有磨损)
    private void connect88() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453341&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 55, 0.08, 35);
                        connect89();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect89();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 久经)
    private void connect89() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453642&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 25, 0.16, 18);
                        connect90();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect90();
                    }
                });
    }

    //M4A1 消音版 | 伊卡洛斯殒落 (崭新出厂)
    private void connect90() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24476&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096814598243874194")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_YKLSYL_ZX);
                        connect91();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect91();
                    }
                });
    }

    //M4A1 消音版 | 破碎铅秋 (崭新出厂)
    private void connect91() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553455054&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096814877147402969")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_PSQQ_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=2918699&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096815569947379222")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_NHSZCY_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=3531008&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096815745883817503")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_NHSZCY_LM);
                        connect94();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect94();
                    }
                });
    }

    //M4A1 消音版 | 女火神之炽焰 (久经沙场)
    private void connect93() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3022886&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 70, 0.16, 50);
                        connect94();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect94();
                    }
                });
    }

    //M4A1 消音版 | 赤红新星 (崭新出厂)
    private void connect94() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24693&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096815949614636524")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_CHXX_ZX);
                        connect95();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect95();
                    }
                });
    }

    //M4A1 消音版 | 毁灭者2000 (崭新出厂)
    private void connect95() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553370879&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096816153892991935")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_HMZ_ZX);
                        connect96();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect96();
                    }
                });
    }

    //M4A1 消音版 | 机型工业 (崭新出厂)
    private void connect96() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=28628306&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096816459195855360")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_JXGY_ZX);
                        connect98();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect98();
                    }
                });
    }

    //M4A1 消音版 | 机型工业 (略有磨损)
    private void connect97() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=92241231&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_JXGY_LM);
                        connect98();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect98();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (崭新出厂)
    private void connect98() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25885&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096816761619663192")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_JSCR_ZX);
                        connect99();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect99();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (略有磨损)
    private void connect99() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=23556&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096816931438236514")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_JSCR_LM);
                        connect101();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect101();
                    }
                });
    }

    //M4A1 消音版 | 金蛇缠绕 (久经沙场)
    private void connect100() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4253")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 45, 0.16, 32);
                        connect101();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect101();
                    }
                });
    }

    //M4A1 消音版 | 次时代 (崭新出厂)
    private void connect101() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24282&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096817452749437356")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A1_CSD_ZX);
                        connect103();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect103();
                    }
                });
    }

    //M4A1 消音版 | 守护者 (崭新出厂)
    private void connect102() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2915205&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 50, 0.01, 30);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25036&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096817823748161468")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_JLCS_ZX);
                        connect103_1();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect103_1();
                    }
                });
    }

    //AWP | 巨龙传说 (略有磨损)
    private void connect103_1() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=27434&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096817967579452654")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_JLCS_LM);
                        connect103_2();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect103_2();
                    }
                });
    }
    //AWP | 巨龙传说 (久经沙场)
    private void connect103_2() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24483&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096818114905027109")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_JLCS_JJ);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553454763&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096818758773125484")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HH_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553454936&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096819187738564360")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HH_JJ);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553454872&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096819301292182897")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HH_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553468213&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096819584577617199")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_NHQS_ZX);
                        connect110();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect110();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (略有磨损)
    private void connect108() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553453354&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_NHQS_LM);
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
                        handleDataC5(response, AK47_NHQS_JJ);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=87809662&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096820065982391735")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_NHGM_ZX);
                        connect112();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect112();
                    }
                });
    }

//    //AK-47 | 霓虹革命 (略有磨损)
//    private void connect111() {
//        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555892")
//                .execute(new JsonCallback<C5>(C5.class) {
//                    @Override
//                    public void onSuccess(Response<C5> response) {
//                        handleDataC5(response, 140, 0.075, 110);
//                        connect112();
//                    }
//
//                    @Override
//                    public void onError(Response<C5> response) {
//                        connect112();
//                    }
//                });
//    }

    //沙漠之鹰 | 红色代号 (崭新出厂)
    private void connect112() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553468201&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096820290055258498")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SMZY_HSDH_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553468217&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096820429665099487")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SMZY_HSDH_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24721&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096820729088930961")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_SHFC_ZX);
                        connect116();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect116();
                    }
                });
    }

    //AK-47 | 深海复仇 (略有磨损)
    private void connect115() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2640101&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 140, 0.080, 115);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=26422&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096820932399105278")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_SZZ_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=26570&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096821094813975068")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_SZZ_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24283&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096821210436953812")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_SZZ_JJ);
                        connect120();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect120();
                    }
                });
    }

//    //AK-47 | 安全网格 (崭新出厂)
//    private void connect119() {
//        OkGo.<C5>get("https://www.C5.cn/product/trade/730/616501")
//                .execute(new JsonCallback<C5>(C5.class) {
//                    @Override
//                    public void onSuccess(Response<C5> response) {
//                        handleDataC5(response, 95, 0.010, 70);
//                        connect120();
//                    }
//
//                    @Override
//                    public void onError(Response<C5> response) {
//                        connect120();
//                    }
//                });
//    }

    //AK-47 | 二西莫夫 (久经沙场)
    private void connect120() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480459&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096821543107418543")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_EXMF_JJ);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480506&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096821708263549715")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_EXMF_LM);
                        connect123();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect123();
                    }
                });
    }

//    //AK-47 | 二西莫夫 (久经沙场)
//    private void connect122() {
//        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618577")
//                .execute(new JsonCallback<C5>(C5.class) {
//                    @Override
//                    public void onSuccess(Response<C5> response) {
//                        handleDataC5(response, 400, 0.17, 320);
//                        connect123();
//                    }
//
//                    @Override
//                    public void onError(Response<C5> response) {
//                        connect123();
//                    }
//                });
//    }

    //M4A4 | 镁元素 (崭新出厂)
    private void connect123() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480498&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096821940185098083")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_MYS_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480462&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096822151712427254")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SMZY_JXGY_ZX);
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
                        handleDataC5(response, 55, 0.071, 40);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480505&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096822333494569017")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MP5_LGT_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=1228744&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096822626523716703")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P250_EXMF_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480460&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096822883205925783")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_HSMY_ZX);
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
                        handleDataC5(response, 430, 0.08, 380);
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
                        handleDataC5(response, 330, 0.17, 290);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22980&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096823103822906667")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HYFP_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=10908373&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096823245831087310")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GLK_HYFP_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24485&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096823467326276476")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HS_JJ);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25615&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096823734215286129")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HS_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=26883&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096824061951577149")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_EXMF_JJ_ST);
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
                        handleDataC5(response, 750, 0.39, 690);
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
                        handleDataC5(response, 380, 0.46, 320);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25910&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096824344474069582")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_PX_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553455826&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096824579644882972")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P250_SHDWE_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22523&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096824826574946052")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P250_YZSG_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553479395&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096825091721587717")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SG553_YSLL_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553479726&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096825179775808085")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SG553_YSLL_JJ);
                        connect160();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect160();
                    }
                });
    }


    //USP 消音版（StatTrak™） | 脑洞大开 (崭新出厂)
    private void connect160() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553466358&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096825409868485193")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_NDDK_ZX_ST);
                        connect162();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect162();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 脑洞大开 (略有磨损)
    private void connect161() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445942&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 220, 0.09, 160);
                        connect162();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect162();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 次时代(崭新出厂)
    private void connect162() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=334739957&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096825754357174393")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_CSD_ZX_ST);
                        connect163();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect163();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 不锈钢(略有磨损)
    private void connect163() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24846&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096826116774898341")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_BXG_LM_ST);
                        connect166();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect166();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 不锈钢(崭新出厂)
    private void connect164() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=195129503&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 270, 0.02, 200);
                        connect165();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect165();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 蓝图(崭新出厂)
    private void connect165() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402641&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 280, 0.02, 190);
                        connect166();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect166();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 闪回(崭新出厂)
    private void connect166() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480473&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096826364197899187")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_SH_ZX_ST);
                        connect167();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect167();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(崭新出厂)
    private void connect167() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553412856&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096826705072077017")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_HSMY_ZX_ST);
                        connect168();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect168();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(略有磨损)
    private void connect168() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553414252&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096826831815796545")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_HSMY_LM_ST);
                        connect169();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect169();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 黑色魅影(久经沙场)
    private void connect169() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553418052&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096826958442563491")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_HSMY_JJ_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24460&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096827180927925933")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_QXRW_LM_ST);
                        connect171();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect171();
                    }
                });
    }

    //USP 消音版（StatTrak™） | 力矩(崭新出厂)
    private void connect171() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=23350&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096827435704698760")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, USP_LJ_ZX_ST);
                        connect172();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect172();
                    }
                });
    }

    //格洛克18（StatTrak™） | 水灵(崭新出厂)
    private void connect172() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22522&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096827744323393270")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GLK_SL_ZX_ST);
                        connect174_1();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect174_1();
                    }
                });
    }

    //P250（StatTrak™） | 生化短尾鳄(崭新出厂)
    private void connect173() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553426866&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 420, 0.03, 340);
                        connect178();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect178();
                    }
                });
    }

    //P250（StatTrak™） | 生化短尾鳄(略有磨损)
    private void connect174() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/606203")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 220, 0.08, 160);
                        connect175();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect175();
                    }
                });
    }
    //P250（StatTrak™） | 生化短尾鳄(久经沙场)
    private void connect174_1() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553457137&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096828078922789316")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P250_SHDWE_JJ_ST);
                        connect175();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect175();
                    }
                });
    }

    //P250（StatTrak™） | 二西莫夫(略有磨损)
    private void connect175() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=38946446&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096828445447347167")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P250_EXMF_LM_ST);
                        connect176();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect176();
                    }
                });
    }

    //P250（StatTrak™） | 二西莫夫(久经沙场)
    private void connect176() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=2616565&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096828579667598472")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, P250_EXMF_JJ_ST);
                        connect196();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect196();
                    }
                });
    }

    //P250（StatTrak™） | 超新星(崭新出厂)
    private void connect177() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/6441")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 30, 0.015, 15);
                        connect178();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect178();
                    }
                });
    }

    //P250（StatTrak™） | 元素轮廓(崭新出厂)
    private void connect178() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=7567702&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 30, 0.003, 15);
                        connect179();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect179();
                    }
                });
    }

    //CZ75（StatTrak™） | 经济(崭新出厂)
    private void connect179() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553458264&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 82, 0.01, 50);
                        connect180();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect180();
                    }
                });
    }

    //CZ75（StatTrak™） | 战术高手(崭新出厂)
    private void connect180() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553424082&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 45, 0.01, 30);
                        connect181();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect181();
                    }
                });
    }

    //CZ75（StatTrak™） | 猛虎(崭新出厂)
    private void connect181() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=219848481&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 50, 0.01, 30);
                        connect182();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect182();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 机械工业(崭新出厂)
    private void connect182() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553460806&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 350, 0.02, 180);
                        connect189();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect189();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 机械工业(略有磨损)
    private void connect183() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618663")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 220, 0.08, 200);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 指挥(略有磨损)
    private void connect184() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/559259")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 60, 0.09, 45);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 大佬龙(崭新出厂)
    private void connect185() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/188881")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 380, 0.02, 300);
                        connect186();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect186();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 红色代号(略有磨损)
    private void connect186() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553457995&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 500, 0.09, 400);
                        connect189();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect189();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 红色代号(久经沙场)
    private void connect187() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/615407")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 350, 0.16, 230);
                        connect188();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect188();
                    }
                });
    }

    //沙漠之鹰（StatTrak™） | 阴谋者(崭新出厂)
    private void connect188() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/7720")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 120, 0.02, 100);
                        connect189();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect189();
                    }
                });
    }

    //P90（StatTrak™） | 二西莫夫 (略有磨损)
    private void connect189() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2920119&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 240, 0.08, 190);
                        connect191();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect191();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (崭新出厂)
    private void connect190() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553399058&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 680, 0.03, 460);
                        connect191();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect191();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (略有磨损)
    private void connect191() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=488344775&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 310, 0.08, 240);
                        connect196();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect196();
                    }
                });
    }

    //M4A4（StatTrak™） | 喧嚣杀戮 (久经沙场)
    private void connect192() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/565880")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 230, 0.18, 200);
                        connect193();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect193();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (崭新出厂)
    private void connect193() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555182")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 530, 0.03, 450);
                        connect194();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect194();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (略有磨损)
    private void connect194() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555296")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 270, 0.09, 220);
                        connect195();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect195();
                    }
                });
    }

    //M4A4（StatTrak™） | 死寂空间 (久经沙场)
    private void connect195() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/555325")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 180, 0.17, 140);
                        connect196();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect196();
                    }
                });
    }

    //M4A4（StatTrak™） | 黑色魅影 (久经沙场)
    private void connect196() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553466063&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096828925952498333")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HSMY_JJ_ST);
                        connect197();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect197();
                    }
                });
    }

    //M4A4（StatTrak™） | 镁元素 (崭新出厂)
    private void connect197() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553480603&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096829197791789417")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_MYS_ZX_ST);
                        connect199();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect199();
                    }
                });
    }

    //M4A4（StatTrak™） | 镁元素 (略有磨损)
    private void connect198() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/618655")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 50, 0.08, 30);
                        connect199();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect199();
                    }
                });
    }

    //M4A4（StatTrak™） | 龙王 (崭新出厂)
    private void connect199() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25398&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096829465022521992")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_LW_ZX_ST);
                        connect1000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1000();
                    }
                });
    }

    //M4A4（StatTrak™） | 杀意大名 (崭新出厂)
    private void connect1000() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=25961&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096829701504176177")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_SYDM_ZX_ST);
                        connect1009();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1009();
                    }
                });
    }

    //M4A4（StatTrak™） | 狮鹫 (崭新出厂)
    private void connect1001() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=221545531&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 150, 0.01, 100);
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
                        handleDataC5(response, 2000, 0.04, 1750);
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
                        handleDataC5(response, 950, 0.09, 800);
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
                        handleDataC5(response, 630, 0.17, 550);
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
                        handleDataC5(response, 1900, 0.03, 1600);
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
                        handleDataC5(response, 1000, 0.09, 800);
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
                        handleDataC5(response, 500, 0.17, 380);
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
                        handleDataC5(response, 1600, 0.04, 1350);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553468429&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096829953238635085")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_NHQS_LM_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553468128&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096830094611175562")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_NHQS_JJ_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=3012038&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096830412165968721")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_RLPSQ_LM_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=27242&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096830527413017595")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_RLPSQ_JJ_ST);
                        connect1016();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1016();
                    }
                });
    }

    // AK-47（StatTrak™） | 深海复仇 (崭新出厂)
    private void connect1013() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380464&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 750, 0.02, 600);
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
                        handleDataC5(response, 450, 0.09, 360);
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
                        handleDataC5(response, 280, 0.17, 220);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553417070&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096830784136909739")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_XXYD_ZX_ST);
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
                        handleDataC5(response, 650, 0.08, 550);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=24726&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096831178997009773")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_XXYD_LM_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22780&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096831306874924580")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_XXYD_JJ_ST);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (崭新出厂)
    private void connect1020() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=2915212&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_HDDZ_ZX_ST);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (略有磨损)
    private void connect1021() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=497117284&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 370, 0.08, 290);
                        connect1025();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1025();
                    }
                });
    }

    // AK-47（StatTrak™） | 混沌点阵 (久经沙场)
    private void connect1022() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=3023211&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 220, 0.19, 180);
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
                        handleDataC5(response, 220, 0.02, 150);
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
                        handleDataC5(response, 200, 0.03, 140);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22532&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096831640564179352")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_JYZZ_ZX_ST);
                        connect1038();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1038();
                    }
                });
    }

    // AK-47（StatTrak™） | 精英之作 (略有磨损)
    private void connect1026() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/4553")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 60, 0.08, 45);
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
                        handleDataC5(response, 80, 0.17, 45);
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
                        handleDataC5(response, 180, 0.08, 130);
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
                        handleDataC5(response, 1000, 0.01, 800);
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
                        handleDataC5(response, 270, 0.08, 200);
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
                        handleDataC5(response, 140, 0.18, 100);
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
                        handleDataC5(response, 280, 0.08, 200);
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
                        handleDataC5(response, 500, 0.02, 350);
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
                        handleDataC5(response, 400, 0.08, 320);
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
                        handleDataC5(response, 220, 0.17, 150);
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
                        handleDataC5(response, 330, 0.02, 220);
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
                        handleDataC5(response, 90, 0.18, 60);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482639&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096831918106239785")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HD_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482576&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096832060691633108")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HD_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482575&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096832159306429583")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, M4A4_HD_JJ);
                        connect1043();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1043();
                    }
                });
    }
    // M4A4（StatTrak™） | 皇帝 (久经沙场)
    private void connect1041() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464890&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 610, 0.25, 500);
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
                        handleDataC5(response, 1700, 0.08, 1500);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482444&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096832602214539337")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SMZY_QG_ZX);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482670&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096832462346384286")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, SMZY_QG_ZX_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482610&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096832827754954913")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_SK_ZX);
                        connect1048();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1048();
                    }
                });
    }
    // AWP（StatTrak™） | 树蝰 (崭新出厂)
    private void connect1046() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464893&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 500, 0.02, 400);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482660&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096833263825269590")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AUG_DL_ZX);
                        connect1057();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1057();
                    }
                });
    }
    // AUG | 动量 (略有磨损)
    private void connect1048() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482463&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&containSticker=&reqId=16299051265419648625")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AUG_DL_LM);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482608&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&containSticker=&reqId=16299052946441677027")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AUG_DL_JJ);
                        connect1057();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1057();
                    }
                });
    }

    // FN57 | 怒氓 (久经沙场)
    public void connect1057() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482612&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096833702532670101")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, FN57_NM_JJ);
                        connect1058();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1058();
                    }
                });
    }
    // FN57 | 怒氓 (崭新出厂)
    public void connect1058() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553482468&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096833874863971008")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, FN57_NM_ZX);
                        connect1077();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1077();
                    }
                });
    }


    // AUG（StatTrak™） | 动量 (久经沙场)
    private void connect1050() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464825&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 100, 0.18, 60);
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
                        handleDataC5(response, 310, 0.09, 250);
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
                        handleDataC5(response, 310, 0.08, 190);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect2000();
                    }
                });
    }
    //  AWP（StatTrak™） | 树蝰 (久经沙场)
    private void connect1053() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553464914&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, 150, 0.17, 100);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect2000();
                    }
                });
    }

    // AWP | 野火 (崭新出厂)
    public void connect1077() {
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=553485855&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096834091918327078")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AWP_YH_ZX);
                        connect2000();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect2000();
                    }
                });
    }
    // AK-47（StatTrak™） | 复古浪潮 (崭新出厂)
    public void connect1078() {
        OkGo.<C5>get("https://www.c5game.com/api/product/list?item_id=553487641&delivery=0&bargain=0&sticker_ids%5B%5D=0&sticker_ids%5B%5D=0&sticker_ids%5B%5D=0&sticker_ids%5B%5D=0&price_order=0&wear_order=0&paint=&page=1")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, AK47_FGLC_ZX_ST);
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
        OkGo.<C5>get("https://www.c5game.com/gw/steamtrade/sga/sell/v1/list?itemId=22575&delivery=0&bargain=0&levelName=&slotStickerIds=&sort=0&paintSeed=&page=1&reqId=16096834328949401710")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GLK_HPG_ZX);
                        mService.c5Knifes.connect1200();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        mService.c5Knifes.connect1200();
                    }
                });
    }
}