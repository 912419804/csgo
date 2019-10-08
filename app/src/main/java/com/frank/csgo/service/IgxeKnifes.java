package com.frank.csgo.service;

import com.frank.csgo.bean.Igxe;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Knife.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/15 15:32
 * 类说明：
 */
public class IgxeKnifes extends IgxeCheck{


    public IgxeKnifes(IgxeService service) {
        super(service);
    }

    // 折叠刀（★） | 深红之网 (略有磨损)
    public void connect1200() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/17644")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZDD_SHZW_LM);
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
                        handleDataIgxe(response, ZDD_SHZW_JJ);
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
                        handleDataIgxe(response, 750, 0.09, 600);
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
                        handleDataIgxe(response, ZDD_CS_ZX);
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
                        handleDataIgxe(response, ZDD_CS_JJ);
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
                        handleDataIgxe(response, ZDD_ZDH_LM);
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
                        handleDataIgxe(response, ZDD_ZDH_JJ);
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
                        handleDataIgxe(response, ZDD_HY_ZX);
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
                        handleDataIgxe(response, CD_CS_JJ);
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
                        handleDataIgxe(response, CD_ZDH_JJ);
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
                        handleDataIgxe(response, CD_ZDH_LM);
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
                        handleDataIgxe(response, CD_SHZW_LM);
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
                        handleDataIgxe(response, CD_SHZW_JJ);
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
                        handleDataIgxe(response, CD_DPL_ZX,true);
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
                        handleDataIgxe(response, CD_HY_ZX);
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
                        handleDataIgxe(response, M9_HY_ZX);
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
                        handleDataIgxe(response, M9_ZDH_JJ);
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
                        handleDataIgxe(response, M9_DPL_ZX,true);
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
                        handleDataIgxe(response, M9_CS_JJ);
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
                        handleDataIgxe(response, M9_SHZW_LM);
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
                        handleDataIgxe(response, M9_SHZW_JJ);
                        handleDataIgxe(response, M9_SHZW_JJ_2);
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
                        handleDataIgxe(response, M9_BFSL_JJ);
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
                        handleDataIgxe(response, HDD_WTZ);
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
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9632")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, HDD_SHZW_JJ);
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
                        handleDataIgxe(response, HDD_BFSL_LM);
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
                        handleDataIgxe(response, HDD_BFSL_JJ);
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
                        handleDataIgxe(response, HDD_EMZY_LM);
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
                        handleDataIgxe(response, HDD_EMZY_JJ);
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
                        handleDataIgxe(response, HDD_SLD_LM);
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
                        handleDataIgxe(response, ZZD_WTZ);
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
                        handleDataIgxe(response, ZZD_ZDH_JJ);
                        connect1243();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1243();
                    }
                });
    }

    //爪子刀（★） | 虎牙 (崭新出厂)
    private void connect1242() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4003")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZZD_HY_ZX);
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
                        handleDataIgxe(response, ZZD_CS_JJ);
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
                        handleDataIgxe(response, ZZD_SHZW_JJ);
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
                        handleDataIgxe(response, ZZD_SLD_LM);
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
                        handleDataIgxe(response, ZZD_SLD_JJ);
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
                        handleDataIgxe(response, ZZD_BFSL_LM);
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
                        handleDataIgxe(response, ZZD_BFSL_JJ);
                        connect1253();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1253();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变大理石 (崭新出厂)
    private void connect1250() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571592")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, LSZ_JBDLS_ZX);
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
                        handleDataIgxe(response, LSZ_DPL_ZX,true);
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
                        handleDataIgxe(response, LSZ_DPL_ZX,true);
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
                        handleDataIgxe(response, LSZ_SHZW_LM);
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
                        handleDataIgxe(response, LSZ_SHZW_JJ);
                        connect1260();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1260();
                    }
                });
    }

    //猎杀者匕首（★） | 渐变之色 (崭新出厂)
    private void connect1255() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15680")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, LSZ_JBZS_ZX);
                        connect1257();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1257();
                    }
                });
    }

    //猎杀者匕首（★） | 虎牙 (渐变之色)
    private void connect1256() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571718")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, LSZ_HY_ZX);
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
                        handleDataIgxe(response, LSZ_WTZ);
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
                        handleDataIgxe(response, XD_SHZW_JJ);
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
                        handleDataIgxe(response, XD_WTZ);
                        connect1292();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        super.onError(response);
                        connect1292();
                    }
                });
    }

    //鲍伊猎刀（★） | 多普勒 (崭新出厂)
//    private void connect1271() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571703")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 1000, 0.01, 900);
//                        connect1272();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1272();
//                    }
//                });
//    }
//
//    //鲍伊猎刀（★） | 深红之网 (略有磨损)
//    private void connect1272() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/103983")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 1300, 0.10, 1050);
//                        connect1273();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1273();
//                    }
//                });
//    }
//
//    //鲍伊猎刀（★） | 深红之网 (久经沙场)
//    private void connect1273() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/121349")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 770, 0.19, 600);
//                        connect1277();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1277();
//                    }
//                });
//    }
//
//    //鲍伊猎刀（★） | 虎牙 (崭新出厂)
//    private void connect1274() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571701")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 880, 0.01, 800);
//                        connect1277();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1277();
//                    }
//                });
//    }
//
//    //弯刀（★） | 多普勒 (崭新出厂)
//    private void connect1275() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571789")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 900, 0.01, 800);
//                        connect1276();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1276();
//                    }
//                });
//    }
//
//    //弯刀（★） | 渐变大理石 (崭新出厂)
//    private void connect1276() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571713")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 900, 0.01, 800);
//                        connect1277();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1277();
//                    }
//                });
//    }
//
//    //弯刀（★） | 虎牙 (崭新出厂)
//    private void connect1277() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571834")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 730, 0.003, 610);
//                        connect1280();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1280();
//                    }
//                });
//    }
//
//    //弯刀（★） | 深红之网 (略有磨损)
//    private void connect1278() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15690")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 800, 0.11, 600);
//                        connect1279();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1279();
//                    }
//                });
//    }
//
//    //弯刀（★） | 深红之网 (久经沙场)
//    private void connect1279() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/9530")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 520, 0.17, 400);
//                        connect1280();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1280();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 自动化 (略有磨损)
//    private void connect1280() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555287")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 750, 0.08, 600);
//                        connect1281();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1281();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 自动化 (久经沙场)
//    private void connect1281() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555629")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 620, 0.17, 500);
//                        connect1283();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1283();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 伽玛多普勒 (崭新出厂)
//    private void connect1282() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555181")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 620, 0.01, 500);
//                        connect1283();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1283();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 虎牙 (崭新出厂)
//    private void connect1283() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7188")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 500, 0.003, 400);
//                        connect1285();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1285();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 传说 (崭新出厂)
//    private void connect1284() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555624")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 1200, 0.02, 1020);
//                        connect1286();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1286();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 传说 (略有磨损)
//    private void connect1285() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555630")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 830, 0.08, 760);
//                        connect1286();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1286();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 传说 (久经沙场)
//    private void connect1286() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/555751")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 600, 0.17, 500);
//                        connect1287();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1287();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 深红之网 (略有磨损)
//    private void connect1287() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15688")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 550, 0.09, 450);
//                        connect1288();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1288();
//                    }
//                });
//    }
//
//    //穿肠刀（★） | 深红之网 (久经沙场)
//    private void connect1288() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/19646")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 400, 0.17, 300);
//                        connect1289();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1289();
//                    }
//                });
//    }
//
//    //暗影双匕（★） | 渐变之色 (崭新出厂)
//    private void connect1289() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11396")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 605, 0.01, 500);
//                        connect1292();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1292();
//                    }
//                });
//    }
//
//    //暗影双匕（★） | 多普勒 (崭新出厂)
//    private void connect1290() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571915")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 610, 0.01, 500);
//                        connect1291();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1291();
//                    }
//                });
//    }
//
//    //暗影双匕（★） | 虎牙 (崭新出厂)
//    private void connect1291() {
//        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571833")
//                .execute(new JsonCallback<Igxe>(Igxe.class) {
//                    @Override
//                    public void onSuccess(Response<Igxe> response) {
//                        handleDataIgxe(response, 550, 0.01, 500);
//                        connect1292();
//                    }
//
//                    @Override
//                    public void onError(Response<Igxe> response) {
//                        super.onError(response);
//                        connect1292();
//                    }
//                });
//    }

    //短剑（★） | 深红之网 (略有磨损)
    private void connect1292() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/615830")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, DJ_SHZW_LM);
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
                        handleDataIgxe(response, DJ_SHZW_JJ);
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
                        handleDataIgxe(response, JCZD_WTZ);
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
                        handleDataIgxe(response, JCZD_SHZW_JJ);
                        connect1296();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1296();
                        super.onError(response);
                    }
                });
    }
    //蝴蝶刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1296() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/571795")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, HDD_ZMZLL_JJ);
                        connect1297();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1297();
                        super.onError(response);
                    }
                });
    }
    //刺刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1297() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/93154")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, CD_ZMZLL_LM);
                        connect1298();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1298();
                        super.onError(response);
                    }
                });
    }
    //M9刺刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1298() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15094")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M9_ZMZLL_JJ);
                        connect1299();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1299();
                        super.onError(response);
                    }
                });
    }
    //爪子刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1299() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15402")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZZD_ZMZLL_JJ);
                        connect1300();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1300();
                        super.onError(response);
                    }
                });
    }
    //爪子刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1300() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/3794")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZZD_ZMZLL_LM);
                        connect1301();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1301();
                        super.onError(response);
                    }
                });
    }
    //熊刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1301() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/627089")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XD_ZMZLL_JJ);
                        connect1302();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1302();
                        super.onError(response);
                    }
                });
    }
    //猎杀者匕首（★） | 致命紫罗兰 (略有磨损)
    private void connect1302() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/573210")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, LSZ_ZMZLL_LM);
                        connect1303();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1303();
                        super.onError(response);
                    }
                });
    }



    //   蝴蝶刀（★） | 噩梦之夜 (略有磨损)
    private void connect1303() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/17636")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, HDD_EMZY_LM);
                        connect1304();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1304();
                        super.onError(response);
                    }
                });
    }

    //   蝴蝶刀（★） | 噩梦之夜 (久经沙场)
    private void connect1304() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/5566")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, HDD_EMZY_JJ);
                        connect1305();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1305();
                        super.onError(response);
                    }
                });
    }

    //M9刺刀（★） | 噩梦之夜 (略有磨损)
    private void connect1305() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11760")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M9_EMZY_LM);
                        connect1306();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1306();
                        super.onError(response);
                    }
                });
    }
    //M9刺刀（★） | 噩梦之夜 (久经沙场)
    private void connect1306() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/6149")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, M9_EMZY_JJ);
                        connect1307();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1307();
                        super.onError(response);
                    }
                });
    }

    //爪子刀（★） | 噩梦之夜 (久经沙场)
    private void connect1307() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/11420")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZZD_EMZY_JJ);
                        connect1308();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1308();
                        super.onError(response);
                    }
                });
    }

    //爪子刀（★） | 噩梦之夜 (略有磨损)
    private void connect1308() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/21361")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZZD_EMZY_LM);
                        connect1309();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1309();
                        super.onError(response);
                    }
                });
    }

    //刺刀（★） | 噩梦之夜 (略有磨损)
    private void connect1309() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/36274")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, CD_EMZY_LM);
                        connect1310();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1310();
                        super.onError(response);
                    }
                });
    }

    //刺刀（★） | 噩梦之夜 (久经沙场)
    private void connect1310() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/7290")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, CD_EMZY_JJ);
                        connect1311();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1311();
                        super.onError(response);
                    }
                });
    }

    //猎杀者匕首（★） | 噩梦之夜 (略有磨损)
    private void connect1311() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/124234")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, LSZ_EMZY_LM);
                        connect1312();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1312();
                        super.onError(response);
                    }
                });
    }

    //猎杀者匕首（★） | 噩梦之夜 (久经沙场)
    private void connect1312() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/76391")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, LSZ_EMZY_JJ);
                        connect1313();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1313();
                        super.onError(response);
                    }
                });
    }

    //折叠刀（★） | 噩梦之夜 (略有磨损)
    private void connect1313() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/4803")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZDD_EMZY_LM);
                        connect1314();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1314();
                        super.onError(response);
                    }
                });
    }

    //折叠刀（★） | 噩梦之夜 (久经沙场)
    private void connect1314() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/15118")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZDD_EMZY_JJ);
                        connect1315();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1315();
                        super.onError(response);
                    }
                });
    }
    //锯齿爪刀（★） | 致命紫罗兰 (略有磨损)
    private void connect1315() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/629858")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JCZD_ZMZLL_LM);
                        connect1316();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        mService.startScan();
                        connect1316();
                    }
                });
    }
    //锯齿爪刀（★） | 致命紫罗兰 (久经沙场)
    private void connect1316() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/621817")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JCZD_ZMZLL_JJ);
                        mService.startScan();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        mService.startScan();
                        super.onError(response);
                    }
                });
    }


}