package com.frank.csgo.service;

import android.content.Intent;
import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.Buff;
import com.frank.csgo.bean.BuffWeapon;
import com.frank.csgo.https.JsonCallback;
import com.frank.csgo.utils.TimeUtil;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/20 14:58
 * 类说明：
 */
public class BuffGuns {

    private CatchService mService;

    public BuffGuns(CatchService service) {
        this.mService = service;
    }

    private void handleDataForBuff(Response<Buff> response, int p, double w) {
        try {
            List<BuffWeapon> weapons = response.body().getData().getItems();
            ArrayList<BuffWeapon> list = new ArrayList<>();
            for (BuffWeapon weapon : weapons) {
                String unit_price = weapon.getPrice();
                double price = Double.valueOf(unit_price);
                if (price < p) {
                    weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                    String exterior_wear = weapon.getAsset_info().getPaintwear();
                    if (!TextUtils.isEmpty(exterior_wear)) {
                        Double wear = Double.valueOf(exterior_wear);
                        if (wear < w) {
                            list.add(weapon);
                        }
                    }
                }
            }
            if (!list.isEmpty()) {
                Intent intent = new Intent(Constant.BUFF_WEAPON);
                intent.putExtra(Constant.BUFF_WEAPON, list);
                mService.sendBroadcast(intent);
            }
        }catch (Exception e){

        }

    }

    private void handleDataForBuff2(Response<Buff> response, int p, double w, int minMoney) {
        List<BuffWeapon> weapons = response.body().getData().getItems();
        ArrayList<BuffWeapon> list = new ArrayList<>();
        for (BuffWeapon weapon : weapons) {
            String unit_price = weapon.getPrice();
            double price = Double.valueOf(unit_price);
            if (price < p) {
                weapon.setTime(TimeUtil.timeString(System.currentTimeMillis()));
                String exterior_wear = weapon.getAsset_info().getPaintwear();
                if (!TextUtils.isEmpty(exterior_wear)) {
                    Double wear = Double.valueOf(exterior_wear);
                    if (wear < w) {
                        list.add(weapon);
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            Intent intent = new Intent(Constant.BUFF_WEAPON);
            intent.putExtra(Constant.BUFF_WEAPON, list);
            mService.sendBroadcast(intent);
        }
    }

    private void fillBuff(Response<Buff> response, String name, String exterior) {
        Buff buff = response.body();
        List<BuffWeapon> items = buff.getData().getItems();
        for (BuffWeapon item : items) {
            item.setTags_exterior(exterior);
            item.setName(name);
        }
    }

    //火灵（崭新出厂）
    public void connect201() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35914&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543411868124")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P2000 | 火灵 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 45, 0.03);
                        connect202();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect202();
                    }
                });
    }

    //USP 消音版 | 次时代 (崭新出厂)
    private void connect202() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42166&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543454332986")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 次时代 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 25, 0.01);
                        connect204();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect204();
                    }
                });
    }

    private void connect203() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42166&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543454332986")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 次时代 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 25, 0.01);
                        connect204();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect204();
                    }
                });
    }

    //USP 消音版 | 枪响人亡 (崭新出厂)
    private void connect204() {
        OkGo.<Buff>get("https://buff.163.com/market/item_detail?appid=730&game=csgo&classid=1312321419&instanceid=480085569&assetid=14928331584&contextid=2&_=1543454585575")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 枪响人亡 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 420, 0.03);
                        connect205();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect205();
                    }
                });
    }

    //USP 消音版 | 枪响人亡 (略有磨损)
    private void connect205() {
        OkGo.<Buff>get("https://buff.163.com/market/item_detail?appid=730&game=csgo&classid=1312321419&instanceid=480085569&assetid=14928331584&contextid=2&_=1543454585575")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 枪响人亡 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 215, 0.10);
                        connect206();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect206();
                    }
                });
    }

    //USP 消音版 | 枪响人亡 (久经沙场)
    private void connect206() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42182&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543454816828")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 枪响人亡 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 160, 0.17);
                        connect207();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect207();
                    }
                });
    }

    //USP 消音版 | 黑色魅影 (崭新出厂)
    private void connect207() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42191&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543455069431")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 黑色魅影 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 270, 0.03);
                        connect208();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect208();
                    }
                });
    }

    //USP 消音版 | 黑色魅影 (略有磨损)
    private void connect208() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42193&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543456376846")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 黑色魅影 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 160, 0.08);
                        connect209();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect209();
                    }
                });
    }

    //USP 消音版 | 黑色魅影 (久经沙场)
    private void connect209() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42192&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543456903616")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 黑色魅影 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 105, 0.17);
                        connect211();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect211();
                    }
                });
    }

    //USP 消音版 | 黑色魅影 (久经沙场)
    private void connect210() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42192&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543456903616")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 黑色魅影 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 90, 0.17);
                        connect211();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect211();
                    }
                });
    }

    //USP 消音版 | 脑洞大开 (崭新出厂)
    private void connect211() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45369&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457130726")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 脑洞大开 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 115, 0.02);
                        connect212();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect212();
                    }
                });
    }

    //USP 消音版 | 脑洞大开 (略有磨损)
    private void connect212() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45371&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457306693")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 脑洞大开 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 56, 0.08);
                        connect213();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect213();
                    }
                });
    }

    //USP 消音版 | 不锈钢 (崭新出厂)
    private void connect213() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42229&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457511281")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 不锈钢 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 55, 0.01);
                        connect214();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect214();
                    }
                });
    }

    //USP 消音版 | 猎户 (崭新出厂)
    private void connect214() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42201&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543457789142")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 猎户 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 70, 0.03);
                        connect215();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect215();
                    }
                });
    }

    //USP 消音版 | 蓝图 (崭新出厂)
    private void connect215() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42153&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543458328635")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 蓝图 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 45, 0.01);
                        connect217();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect217();
                    }
                });
    }

    //USP 消音版 | 蓝图 (崭新出厂)
    private void connect216() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42153&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543458328635")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "USP 消音版 | 蓝图 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 35, 0.01);
                        connect217();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect217();
                    }
                });
    }

    //格洛克 18 型 | 水灵 (崭新出厂)
    private void connect217() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35072&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543458768570")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "格洛克 18 型 | 水灵 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 48, 0.03);
                        connect218();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect218();
                    }
                });
    }

    //格洛克 18 型 | 荒野反叛 (崭新出厂)
    private void connect218() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35067&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460061670")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "格洛克 18 型 | 荒野反叛 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 65, 0.02);
                        connect219();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect219();
                    }
                });
    }

    //格洛克 18 型 | 暮光星系 (崭新出厂)
    private void connect219() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35063&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460281254")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "格洛克 18 型 | 暮光星系 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 80, 0.02);
                        connect221();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect221();
                    }
                });
    }

    //格洛克 18 型 | 暮光星系 (崭新出厂)
    private void connect220() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35063&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460281254")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "格洛克 18 型 | 暮光星系 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 65, 0.03);
                        connect221();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect221();
                    }
                });
    }

    //格洛克 18 型 | 核子反应 (崭新出厂)
    private void connect221() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35046&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460427097")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "格洛克 18 型 | 核子反应 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 35, 0.03);
                        connect222();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect222();
                    }
                });
    }

    //格洛克 18 型 | Nuclear Garden (崭新出厂)
    private void connect222() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=762185&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460579683")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "格洛克 18 型 | Nuclear Garden (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 85, 0.02);
                        connect223();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect223();
                    }
                });
    }

    //P250 | 生化短吻鳄 (崭新出厂)
    private void connect223() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36077&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460863761")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P250 | 生化短吻鳄 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 95, 0.02);
                        connect224();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect224();
                    }
                });
    }

    //P250 | 生化短吻鳄 (略有磨损)
    private void connect224() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36079&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543460963028")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P250 | 生化短吻鳄 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 55, 0.08);
                        connect225();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect225();
                    }
                });
    }

    //P250 | 二西莫夫 (略有磨损)
    private void connect225() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35986&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461080142")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P250 | 二西莫夫 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 100, 0.11);
                        connect226();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect226();
                    }
                });
    }

    //P250 | 二西莫夫 (久经沙场)
    private void connect226() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35985&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461213725")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P250 | 二西莫夫 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 25, 0.17);
                        connect227();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect227();
                    }
                });
    }

    //P250 | 银装素裹 (略有磨损)
    private void connect227() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36102&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461418178")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P250 | 银装素裹 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 35, 0.11);
                        connect228();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect228();
                    }
                });
    }

    //P250 | 暗潮 (崭新出厂)
    private void connect228() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36091&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461600295")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "P250 | 暗潮 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 39, 0.01);
                        connect229();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect229();
                    }
                });
    }

    //FN57 | 暴怒野兽 (崭新出厂)
    private void connect229() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34743&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543461949263")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "FN57 | 暴怒野兽 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 300, 0.03);
                        connect230();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect230();
                    }
                });
    }

    //FN57 | 暴怒野兽 (略有磨损)
    private void connect230() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34745&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543462039139")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "FN57 | 暴怒野兽 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 140, 0.10);
                        connect231();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect231();
                    }
                });
    }

    //FN57 | 暴怒野兽 (久经沙场)
    private void connect231() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34744&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543462149710")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "FN57 | 暴怒野兽 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 85, 0.20);
                        connect232();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect232();
                    }
                });
    }

    //FN57 | 耍猴把戏 (略有磨损)
    private void connect232() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34757&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474164592")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "FN57 | 耍猴把戏 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 45, 0.11);
                        connect233();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect233();
                    }
                });
    }

    //FCZ75 自动手枪 | 相柳 (崭新出厂)
    private void connect233() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34359&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474549446")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "CZ75 自动手枪 | 相柳 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 30, 0.02);
                        connect234();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect234();
                    }
                });
    }

    //CZ75 自动手枪 | 黄夹克 (崭新出厂)
    private void connect234() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34364&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474688036")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "CZ75 自动手枪 | 黄夹克 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 50, 0.01);
                        connect235();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect235();
                    }
                });
    }

    //Tec-9 | 燃料喷射器 (崭新出厂)
    private void connect235() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=41992&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543474804200")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "Tec-9 | 燃料喷射器 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 35, 0.02);
                        connect236();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect236();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (崭新出厂)
    private void connect236() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759243&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475040856")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 红色代号 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 310, 0.03);
                        connect237();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect237();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (略有磨损)
    private void connect237() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759245&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475211688")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 红色代号 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 172, 0.080);
                        connect238();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect238();
                    }
                });
    }

    //沙漠之鹰 | 红色代号 (久经沙场)
    private void connect238() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759244&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475318621")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 红色代号 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 100, 0.17);
                        connect239();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect239();
                    }
                });
    }

    //沙漠之鹰 | 炽烈之炎 (崭新出厂)
    private void connect239() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34389&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475470973")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 炽烈之炎 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 600, 0.01);
                        connect240();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect240();
                    }
                });
    }

    //沙漠之鹰 | 大佬龙 (崭新出厂)
    private void connect240() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34431&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475586496")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 大佬龙 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 85, 0.02);
                        connect242();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect242();
                    }
                });
    }

    //沙漠之鹰 | 大佬龙 (略有磨损)
    private void connect241() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34433&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475710609")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 大佬龙 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 45, 0.071);
                        connect242();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect242();
                    }
                });
    }

    //沙沙漠之鹰 | 飞行员 (崭新出厂)
    private void connect242() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34461&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543475939163")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 飞行员 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 256, 0.02);
                        connect243();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect243();
                    }
                });
    }

    //沙沙漠之鹰 | 飞行员 (略有磨损)
    private void connect243() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34463&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543476147565")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 飞行员 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 150, 0.08);
                        connect245();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect245();
                    }
                });
    }

    //沙漠之鹰 | 飞行员 (略有磨损)
    private void connect244() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34463&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543476147565")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "沙漠之鹰 | 飞行员 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 150, 0.08);
                        connect245();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect245();
                    }
                });
    }

    //加利尔 AR | 地狱看门犬 (崭新出厂)
    private void connect245() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34902&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477324839")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "加利尔 AR | 地狱看门犬 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 75, 0.02);
                        connect246();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect246();
                    }
                });
    }

    //加利尔 AR | ~甜甜的~ (崭新出厂)
    private void connect246() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34963&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477464971")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "加利尔 AR | ~甜甜的~ (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 65, 0.01);
                        connect247();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect247();
                    }
                });
    }

    //加利尔 AR | 「经济」克鲁尔 (略有磨损)
    private void connect247() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34916&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477672911")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "加利尔 AR | 「经济」克鲁尔 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 55, 0.09);
                        connect248();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect248();
                    }
                });
    }

    //加利尔 AR | 「经济」克鲁尔 (久经沙场)
    private void connect248() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34915&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477829307")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "加利尔 AR | 「经济」克鲁尔 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 15, 0.17);
                        connect249();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect249();
                    }
                });
    }

    //AWP | 二西莫夫 (久经沙场)
    private void connect249() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34066&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543477983488")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 二西莫夫 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 250, 0.25);
                        connect250();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect250();
                    }
                });
    }

    //AWP | 死神 (崭新出厂)
    private void connect250() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45247&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479183613")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 死神 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 65, 0.02);
                        connect252();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect252();
                    }
                });
    }

    //AWP | 死神 (崭新出厂)
    private void connect251() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45247&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479556659")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 死神 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 60, 0.02);
                        connect252();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect252();
                    }
                });
    }

    //AWP | 暴怒野兽 (崭新出厂)
    private void connect252() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34095&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479632564")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 暴怒野兽 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 280, 0.03);
                        connect253();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect253();
                    }
                });
    }

    //AWP | 暴怒野兽 (略有磨损)
    private void connect253() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34097&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479770945")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 暴怒野兽 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 180, 0.08);
                        connect255();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect255();
                    }
                });
    }

    //AWP | 暴怒野兽 (久经沙场)
    private void connect254() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34096&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543479870551")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 暴怒野兽 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 125, 0.17);
                        connect255();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect255();
                    }
                });
    }

    //AWP | 浮生如梦 (崭新出厂)
    private void connect255() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34088&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480354611")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 浮生如梦 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 50, 0.02);
                        connect256();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect256();
                    }
                });
    }

    //AWP | 鬼退治 (崭新出厂)
    private void connect256() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34108&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480466460")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 鬼退治 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 355, 0.03);
                        connect257();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect257();
                    }
                });
    }

    //AWP | 鬼退治 (略有磨损)
    private void connect257() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34110&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480535184")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 鬼退治 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 280, 0.09);
                        connect258();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect258();
                    }
                });
    }

    //AWP | 鬼退治 (久经沙场)
    private void connect258() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34109&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480608246")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 鬼退治 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 200, 0.17);
                        connect260();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect260();
                    }
                });
    }

    //AWP | 鬼退治 (久经沙场)
    private void connect259() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34109&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480608246")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 鬼退治 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 180, 0.17);
                        connect260();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect260();
                    }
                });
    }

    //AWP | 电子蜂巢 (崭新出厂)
    private void connect260() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34078&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543480737879")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 电子蜂巢 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 75, 0.02);
                        connect261();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect261();
                    }
                });
    }

    //AWP | 巨龙传说 (崭新出厂)
    private void connect261() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=44060&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481004692")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 巨龙传说 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 10000, 0.035);
                        connect263();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect263();
                    }
                });
    }

    //AWP | 巨龙传说 (崭新出厂)
    private void connect262() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=44060&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481004692")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AWP | 巨龙传说 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 9300, 0.04);
                        connect263();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect263();
                    }
                });
    }

    //AK-47 | 火神 (崭新出厂)
    private void connect263() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33974&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481445591")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 火神 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 510, 0.02);
                        connect264();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect264();
                    }
                });
    }

    //AK-47 | 火神 (略有磨损)
    private void connect264() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33976&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543481571960")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 火神 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 270, 0.08);
                        connect265();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect265();
                    }
                });
    }

    //AK-47 | 火神 (久经沙场)
    private void connect265() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33975&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543482929338")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 火神 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 165, 0.17);
                        connect266();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect266();
                    }
                });
    }

    //AK-47 | 霓虹革命 (崭新出厂)
    private void connect266() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33935&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543483083123")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 霓虹革命 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 245, 0.02);
                        connect267();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect267();
                    }
                });
    }

    //AK-47 | 霓虹革命 (略有磨损)
    private void connect267() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33937&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543483283552")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 霓虹革命 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 155, 0.08);
                        connect268();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect268();
                    }
                });
    }

    //AK-47 | 皇后 (崭新出厂)
    public void connect268() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33969&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543483449650")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 皇后 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 600, 0.04);
//                        connect269();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
//                        connect269();
                    }
                });
    }

    //AK-47 | 皇后 (略有磨损)
    private void connect269() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33971&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543545419527")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 皇后 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 300, 0.09);
                        connect270();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect270();
                    }
                });
    }

    //AK-47 | 皇后 (久经沙场)
    private void connect270() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33970&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543545564032")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 皇后 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 210, 0.22);
                        connect271();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect271();
                    }
                });
    }

    //AK-47 | 燃料喷射器 (崭新出厂)
    public void connect271() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33910&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546134659")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 燃料喷射器 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 500, 0.04);
//                        connect272();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
//                        connect272();
                    }
                });
    }

    //AK-47 | 燃料喷射器 (略有磨损)
    private void connect272() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33912&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546244620")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 燃料喷射器 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 270, 0.09);
                        connect273();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect273();
                    }
                });
    }

    //AK-47 | 燃料喷射器 (久经沙场)
    private void connect273() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33911&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546332653")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 燃料喷射器 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 185, 0.22);
                        connect274();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect274();
                    }
                });
    }

    //AK-47 | 深海复仇 (崭新出厂)
    private void connect274() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33859&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546576633")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 深海复仇 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 215, 0.03);
                        connect275();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect275();
                    }
                });
    }

    //AK-47 | 深海复仇 (略有磨损)
    private void connect275() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33861&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546652958")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 深海复仇 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 160, 0.08);
                        connect276();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect276();
                    }
                });
    }

    //AK-47 | 血腥运动 (崭新出厂)
    public void connect276() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33868&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546743907")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 血腥运动 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 280, 0.03);
//                        connect278();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
//                        connect278();
                    }
                });
    }

    //AK-47 | 血腥运动 (略有磨损)
    private void connect277() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33870&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543546991926")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 血腥运动 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 210, 0.08);
                        connect278();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect278();
                    }
                });
    }

    //AK-47 | 前线迷雾 (崭新出厂)
    private void connect278() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33905&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543547429327")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 前线迷雾 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 200, 0.03);
                        connect279();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect279();
                    }
                });
    }

    //AK-47 | 前线迷雾 (略有磨损)
    private void connect279() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33907&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543547577596")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 前线迷雾 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 100, 0.08);
                        connect280();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect280();
                    }
                });
    }

    //AK-47 | 表面淬火 (崭新出厂)
    private void connect280() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33881&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543547983188")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 表面淬火 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 320, 0.02);
                        connect281();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect281();
                    }
                });
    }

    //AK-47 | 表面淬火 (略有磨损)
    private void connect281() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33883&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548073573")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 表面淬火 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 210, 0.08);
                        connect282();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect282();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (崭新出厂)
    public void connect282() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759363&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548232525")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 霓虹骑士 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 510, 0.03);
//                        connect283();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
//                        connect283();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (略有磨损)
    private void connect283() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759234&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548319962")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 霓虹骑士 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 300, 0.09);
                        connect284();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect284();
                    }
                });
    }

    //AK-47 | 霓虹骑士 (久经沙场)
    private void connect284() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759341&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548423057")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 霓虹骑士 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 190, 0.20);
                        connect285();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect285();
                    }
                });
    }

    //AK-47 | 混沌点阵 (崭新出厂)
    private void connect285() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33945&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548568689")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 混沌点阵 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 190, 0.03);
                        connect286();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect286();
                    }
                });
    }

    //AK-47 | 混沌点阵 (略有磨损)
    private void connect286() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33947&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543548924345")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 混沌点阵 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 130, 0.08);
                        connect287();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect287();
                    }
                });
    }

    //AK-47 | Safety Net (崭新出厂)
    private void connect287() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=762172&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543549729645")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | Safety Net (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 90, 0.01);
                        connect288();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect288();
                    }
                });
    }

    //AK-47 | 轨道 Mk01 (崭新出厂)
    private void connect288() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33940&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543559027631")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 轨道 Mk01 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 70, 0.02);
                        connect289();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect289();
                    }
                });
    }

    //AK-47 | 水栽竹 (久经沙场)
    private void connect289() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33916&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543559328914")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 水栽竹 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 310, 0.20);
                        connect289_1();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect289_1();
                    }
                });
    }
    //AK-47 | 水栽竹 (略有磨损)
    private void connect289_1() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33917&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551800287883")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 水栽竹 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 580, 0.08);
                        connect289_2();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect289_2();
                    }
                });
    }
    //AK-47 | 水栽竹 (崭新出厂)
    private void connect289_2() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33915&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551800377431")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AK-47 | 水栽竹 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 800, 0.04);
                        connect290();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect290();
                    }
                });
    }

    //法玛斯 | 防滚架 (崭新出厂)
    private void connect290() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34670&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560178466")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "法玛斯 | 防滚架 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 123, 0.01);
                        connect291();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect291();
                    }
                });
    }

    //法玛斯 | 防滚架 (略有磨损)
    private void connect291() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34672&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560336622")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "法玛斯 | 防滚架 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 35, 0.08);
                        connect292();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect292();
                    }
                });
    }

    //法玛斯 | 机械工业 (崭新出厂)
    private void connect292() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34656&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560450205")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "法玛斯 | 机械工业 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 29, 0.02);
                        connect293();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect293();
                    }
                });
    }

    //M4A4 | 龙王 (崭新出厂)
    private void connect293() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35353&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560639899")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 龙王 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 95, 0.03);
                        connect295();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect295();
                    }
                });
    }

    //M4A4 | 龙王 (略有磨损)
    private void connect294() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35355&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543560755035")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 龙王 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 56, 0.08);
                        connect295();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect295();
                    }
                });
    }

    //M4A4 | 杀意大名 (崭新出厂)
    private void connect295() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35286&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561039641")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 杀意大名 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 32, 0.01);
                        connect297();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect297();
                    }
                });
    }

    //M4A4 | 杀意大名 (崭新出厂)
    private void connect296() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35286&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561039641")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 杀意大名 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 30, 0.03);
                        connect297();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect297();
                    }
                });
    }

    //M4A4 | 黑色魅影 (略有磨损)
    private void connect297() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45385&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561971452")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 黑色魅影 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 400, 0.09);
                        connect298();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect298();
                    }
                });
    }

    //M4A4 | 黑色魅影 (久经沙场)
    private void connect298() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45385&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543561971452")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 黑色魅影 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 185, 0.24);
                        connect299();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect299();
                    }
                });
    }

    //M4A4 | 二西莫夫 (久经沙场)
    private void connect299() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35253&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562226052")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 二西莫夫 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 350, 0.26);
                        connect300();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect300();
                    }
                });
    }

    //M4A4 | 二西莫夫 (破损不堪)
    private void connect300() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35254&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562381309")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 二西莫夫 (破损不堪)", Constant.PSBK);
                        handleDataForBuff(response, 250, 0.39);
                        connect301();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect301();
                    }
                });
    }

    //M4A4 | 二西莫夫 (战痕累累)
    private void connect301() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35252&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562500561")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 二西莫夫 (战痕累累)", Constant.ZHLL);
                        handleDataForBuff(response, 150, 0.46);
                        connect302();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect302();
                    }
                });
    }

    //M4A4（StatTrak™） | 二西莫夫 (战痕累累)
    private void connect302() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=38843&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562568149")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4（StatTrak™） | 二西莫夫 (战痕累累)", Constant.ZHLL);
                        handleDataForBuff(response, 410, 0.46);
                        connect303();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect303();
                    }
                });
    }

    //M4A4 | X 光 (崭新出厂)
    private void connect303() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35345&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543562812410")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | X 光 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 65, 0.01);
                        connect304();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect304();
                    }
                });
    }

    //M4A4 | 皇家圣骑士 (略有磨损)
    private void connect304() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35328&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563005412")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 皇家圣骑士 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 140, 0.09);
                        connect305();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect305();
                    }
                });
    }

    //M4A4 | 皇家圣骑士 (久经沙场)
    private void connect305() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35327&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563106073")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 皇家圣骑士 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 55, 0.17);
                        connect306();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect306();
                    }
                });
    }

    //M4A4 | 死寂空间 (崭新出厂)
    private void connect306() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35281&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563282154")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 死寂空间 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 165, 0.03);
                        connect307();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect307();
                    }
                });
    }

    //M4A4 | 死寂空间 (略有磨损)
    private void connect307() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35283&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543563902110")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 死寂空间 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 80, 0.09);
                        connect308();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect308();
                    }
                });
    }

    //M4A4 | 喧嚣杀戮 (崭新出厂)
    private void connect308() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35261&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564075953")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 喧嚣杀戮 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 172, 0.03);
                        connect309();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect309();
                    }
                });
    }

    //M4A4 | 喧嚣杀戮 (略有磨损)
    private void connect309() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35263&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564253193")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 喧嚣杀戮 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 100, 0.09);
                        connect310();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect310();
                    }
                });
    }

    //M4A4 | 喧嚣杀戮 (久经沙场)
    private void connect310() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35263&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564253193")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 喧嚣杀戮 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 74, 0.17);
                        connect311();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect311();
                    }
                });
    }

    //M4A4 | 弹雨 (崭新出厂)
    private void connect311() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35256&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564386488")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 弹雨 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 125, 0.03);
                        connect313();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect313();
                    }
                });
    }

    //M4A4 | 弹雨 (略有磨损)
    private void connect312() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35258&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564469264")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 弹雨 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 60, 0.08);
                    }

                    @Override
                    public void onError(Response<Buff> response) {

                    }
                });
    }

    //M4A4 | 弹雨 (略有磨损)
    private void connect313() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35258&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564469264")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 弹雨 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 58, 0.08);
                        connect314();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect314();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (崭新出厂)
    private void connect314() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35300&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564569337")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 地狱烈焰 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 140, 0.03);
                        connect315();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect315();
                    }
                });
    }

    //M4A4 | 地狱烈焰 (略有磨损)
    private void connect315() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35302&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564630936")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 地狱烈焰 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 88, 0.09);
                        connect316();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect316();
                    }
                });
    }

    //M4A4 | 战场之星 (崭新出厂)
    private void connect316() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35331&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564738791")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 战场之星 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 70, 0.03);
                        connect317();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect317();
                    }
                });
    }

    //M4A4 | 都市 DDPAT (崭新出厂)
    private void connect317() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35341&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564893530")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 都市 DDPAT (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 25, 0.03);
                        connect318();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect318();
                    }
                });
    }

    //M4A4 | 狮鹫 (崭新出厂)
    private void connect318() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35295&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543564979058")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 狮鹫 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 42, 0.03);
                        connect319();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect319();
                    }
                });
    }

    //M4A4 | 辐射危机 (略有磨损)
    private void connect319() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35323&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543565131445")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 辐射危机 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 155, 0.11);
                        connect320();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect320();
                    }
                });
    }

    //M4A4 | 辐射危机 (久经沙场)
    private void connect320() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35322&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543565231394")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 辐射危机 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 47, 0.20);
                        connect321();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect321();
                    }
                });
    }

    //M4A4 | 星级 (崭新出厂)
    private void connect321() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35348&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566083122")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 星级 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 85, 0.03);
                        connect322();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect322();
                    }
                });
    }

    //M4A4 | 星级 (略有磨损)
    private void connect322() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35350&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566182437")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 星级 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 30, 0.08);
                        connect323();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect323();
                    }
                });
    }

    //M4A4 | 破晓 (崭新出厂)
    private void connect323() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35266&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566259983")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A4 | 破晓 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 110, 0.03);
                        connect324();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect324();
                    }
                });
    }

    //M4A1 消音型 | 闪回 (崭新出厂)
    private void connect324() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35202&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566476459")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 闪回 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 15, 0.01);
                        connect325();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect325();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (崭新出厂)
    private void connect325() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759260&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566672108")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 梦魇 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 110, 0.01);
                        connect326();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect326();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (略有磨损)
    private void connect326() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759261&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566747749")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 梦魇 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 50, 0.08);
                        connect327();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect327();
                    }
                });
    }

    //M4A1 消音型 | 梦魇 (久经沙场)
    private void connect327() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759220&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566842068")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 梦魇 (久经沙场)", Constant.JJSC);
                        handleDataForBuff(response, 24, 0.17);
                        connect328();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect328();
                    }
                });
    }

    //M4A1 消音型 | 金蛇缠绕 (崭新出厂)
    private void connect328() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35207&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543566954644")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 金蛇缠绕 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 180, 0.02);
                        connect329();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect329();
                    }
                });
    }

    //M4A1 消音型 | 金蛇缠绕 (略有磨损)
    private void connect329() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35209&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568535166")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 金蛇缠绕 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 79, 0.08);
                        connect330();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect330();
                    }
                });
    }

    //M4A1 消音型 | 机械工业 (崭新出厂)
    private void connect330() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35238&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568629163")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 机械工业 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 120, 0.03);
                        connect331();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect331();
                    }
                });
    }

    //M4A1 消音型 | 机械工业 (略有磨损)
    private void connect331() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35240&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568712731")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 机械工业 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 62, 0.08);
                        connect332();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect332();
                    }
                });
    }

    //M4A1 消音型 | 暴怒野兽 (崭新出厂)
    private void connect332() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35219&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568836031")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 暴怒野兽 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 220, 0.01);
                        connect333();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect333();
                    }
                });
    }

    //M4A1 消音型 | 暴怒野兽 (略有磨损)
    private void connect333() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35221&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543568943778")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 暴怒野兽 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 75, 0.09);
                        connect334();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect334();
                    }
                });
    }

    //M4A1 消音型 | 守护者 (崭新出厂)
    private void connect334() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35212&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569069988")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 守护者 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 35, 0.03);
                        connect335();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect335();
                    }
                });
    }

    //M4A1 消音型 | 次时代 (崭新出厂)
    private void connect335() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35190&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569155833")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 次时代 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 55, 0.02);
                        connect336();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect336();
                    }
                });
    }

    //M4A1 消音型 | 女火神之炽焰 (略有磨损)
    private void connect336() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35187&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569294510")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 女火神之炽焰 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 105, 0.09);
                        connect336_1();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect336_1();
                    }
                });
    }
    //M4A1 消音型 | 女火神之炽焰 (崭新出厂)
    private void connect336_1() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35185&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551795193477")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 女火神之炽焰 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 320, 0.01);
                        connect337();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect337();
                    }
                });
    }

    //M4A1 消音型 | 毁灭者 2000 (崭新出厂)
    private void connect337() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35197&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569555722")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 毁灭者 2000 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 55, 0.02);
                        connect338();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect338();
                    }
                });
    }

    //M4A1 消音型 | 原子合金 (崭新出厂)
    private void connect338() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35160&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569833149")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 原子合金 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 50, 0.02);
                        connect339();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect339();

                    }
                });
    }

    //M4A1 消音型 | 赤红新星 (崭新出厂)
    private void connect339() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=35216&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543569939640")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "M4A1 消音型 | 赤红新星 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 280, 0.01);
                        connect340();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect340();
                    }
                });
    }

    //SG 553 | 次时代 (崭新出厂)
    private void connect340() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36458&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570124283")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "SG 553 | 次时代 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 75, 0.02);
                        connect341();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect341();
                    }
                });
    }

    //SG 553 | 次时代 (略有磨损)
    private void connect341() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36460&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570245437")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "SG 553 | 次时代 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 38, 0.09);
                        connect342();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect342();
                    }
                });
    }

    //SG 553 | 豹灯蛾 (崭新出厂)
    private void connect342() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36487&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570387623")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "SG 553 | 豹灯蛾 (崭新出厂)", Constant.LVMS);
                        handleDataForBuff(response, 40, 0.02);
                        connect343();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect343();
                    }
                });
    }

    //SSG 08 | 炎龙之焰 (崭新出厂)
    private void connect343() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=36552&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570573301")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "SSG 08 | 炎龙之焰 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 105, 0.02);
                        connect344();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect344();
                    }
                });
    }

    //AUG | 变色龙 (崭新出厂)
    private void connect344() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34001&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570687418")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AUG | 变色龙 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 40, 0.01);
                        connect345();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect345();
                    }
                });
    }

    //AUG | 湖怪鸟 (崭新出厂)
    private void connect345() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45245&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570798702")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AUG | 湖怪鸟 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 65, 0.01);
                        connect346();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect346();
                    }
                });
    }

    //AUG | 席德.米德 (崭新出厂)
    private void connect346() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34049&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570871320")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AUG | 席德.米德 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 95, 0.02);
                        connect347();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect347();
                    }
                });
    }

    //AUG | 燕群 (崭新出厂)
    private void connect347() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34027&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543570959377")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AUG | 燕群 (崭新出厂)", Constant.ZXCC);
                        handleDataForBuff(response, 135, 0.03);
                        connect348();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect348();
                    }
                });
    }

    //AUG | 燕群 (略有磨损)
    private void connect348() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=34029&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543571039414")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AUG | 燕群 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 50, 0.08);
                        connect349();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        connect349();
                    }
                });
    }

    //AUG | 孟加拉猛虎 (略有磨损)
    private void connect349() {
        OkGo.<Buff>get("https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33998&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1543571239234")
                .execute(new JsonCallback<Buff>(Buff.class) {
                    @Override
                    public void onSuccess(Response<Buff> response) {
                        fillBuff(response, "AUG | 孟加拉猛虎 (略有磨损)", Constant.LVMS);
                        handleDataForBuff(response, 60, 0.08);
                        mService.buffKnifes.connect3200();
                    }

                    @Override
                    public void onError(Response<Buff> response) {
                        mService.buffKnifes.connect3200();
                    }
                });
    }


}