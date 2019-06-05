package com.frank.csgo.service;

import com.frank.csgo.bean.Igxe;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import static com.frank.csgo.price.Glove.*;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/14 14:16
 * 类说明：
 */
public class IgxeGloves extends IgxeCheck{


    public IgxeGloves(IgxeService service) {
        super(service);
    }
    // 血猎手套（★） | 焦炭 (略有磨损)
    public void connect1100() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566344")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_JT_LM);
                        connect1101();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1101();
                    }
                });
    }

    // 血猎手套（★） | 焦炭 (久经沙场)
    private void connect1101() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566200")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_JT_JJ);
                        connect1102();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1102();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (略有磨损)
    private void connect1102() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566494")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_SY_LM);
                        connect1103();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1103();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (久经沙场)
    private void connect1103() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566238")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_SY_JJ);
                        connect1104();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1104();
                    }
                });
    }

    // 血猎手套（★） | 染铜 (略有磨损)
    private void connect1104() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566196")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_RT_LM);
                        connect1105();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1105();
                    }
                });
    }

    // 血猎手套（★） | 染铜 (久经沙场)
    private void connect1105() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566198")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_RT_JJ);
                        connect1106();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1106();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (略有磨损)
    private void connect1106() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566537")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_YJD_LM);
                        connect1107();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1107();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (久经沙场)
    private void connect1107() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566321")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_YJD_JJ);
                        connect1108();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1108();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (久经沙场)
    private void connect1108() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566738")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_SHZW_JJ);
                        connect1109();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1109();
                    }
                });
    }

    // 驾驶手套（★） | 紫蓝格子 (久经沙场)
    private void connect1109() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610814")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_LZGZ_JJ);
                        connect1110();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1110();
                    }
                });
    }

    // 驾驶手套（★） | 王蛇 (久经沙场)
    private void connect1110() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610793")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_WS_JJ);
                        connect1111();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1111();
                    }
                });
    }

    // 驾驶手套（★） | 月色织物 (略有磨损)
    private void connect1111() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566867")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_YSZW_LM);
                        connect1112();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1112();
                    }
                });
    }

    //  驾驶手套（★） | 月色织物 (久经沙场)
    private void connect1112() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566281")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, XL_YSZW_JJ);
                        connect1113();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1113();
                    }
                });
    }

    //  驾驶手套（★） | 超越 (略有磨损)
    private void connect1113() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611072")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JS_CY_LM);
                        connect1114();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1114();
                    }
                });
    }

    //  驾驶手套（★） | 超越 (久经沙场)
    private void connect1114() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610739")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JS_CY_JJ);
                        connect1115();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1115();
                    }
                });
    }

    //  驾驶手套（★） | 菱背蛇纹 (略有磨损)
    private void connect1115() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566888")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JS_LBSW_LM);
                        connect1116();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1116();
                    }
                });
    }

    //  驾驶手套（★） | 护卫 (略有磨损)
    private void connect1116() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566248")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JS_HW_LM);
                        connect1117();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1117();
                    }
                });
    }

    //  驾驶手套（★） | 墨绿色调(略有磨损)
    private void connect1117() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611060")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JS_MLSD_LM);
                        connect1118();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1118();
                    }
                });
    }

    //  裹手（★） | 钴蓝骷髅 (久经沙场)
    private void connect1118() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610978")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_GLKL_LM);
                        connect1119();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1119();
                    }
                });
    }

    //  裹手（★） | 屠夫 (略有磨损)
    private void connect1119() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566659")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_TF_LM);
                        connect1120();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1120();
                    }
                });
    }

    //  裹手（★） | 屠夫 (久经沙场)
    private void connect1120() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566204")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_TF_JJ);
                        connect1121();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1121();
                    }
                });
    }

    //  裹手（★） | 恶土 (略有磨损)
    private void connect1121() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566901")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_ET_LM);
                        connect1122();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1122();
                    }
                });
    }

    //  裹手（★） | 恶土 (久经沙场)
    private void connect1122() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566719")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_ET_JJ);
                        connect1123();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1123();
                    }
                });
    }

    //  裹手（★） | 皮革 (略有磨损)
    private void connect1123() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566454")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_PG_LM);
                        connect1124();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1124();
                    }
                });
    }

    //  裹手（★） | 皮革 (久经沙场)
    private void connect1124() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566413")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_PG_JJ);
                        connect1125();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1125();
                    }
                });
    }

    //  裹手（★） | 森林色调 (略有磨损)
    private void connect1125() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611023")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_SLSD_LM);
                        connect1126();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1126();
                    }
                });
    }

    //  裹手（★） | 森林色调 (久经沙场)
    private void connect1126() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610880")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_SLSD_JJ);
                        connect1127();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1127();
                    }
                });
    }

    //  裹手（★） | 云杉DDPAT(略有磨损)
    private void connect1127() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566353")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_YS_LM);
                        connect1128();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1128();
                    }
                });
    }

    //  摩托手套（★） | 薄荷 (久经沙场)
    private void connect1128() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566816")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, GS_BH_JJ);
                        connect1129();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1129();
                    }
                });
    }

    //  摩托手套（★） | 清凉薄荷 (略有磨损)
    private void connect1129() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566211")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_QLBH_LM);
                        connect1130();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1130();
                    }
                });
    }

    //  摩托手套（★） | 清凉薄荷 (久经沙场)
    private void connect1130() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566205")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_QLBH_JJ);
                        connect1131();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1131();
                    }
                });
    }

    //  摩托手套（★） | *嘣！* (略有磨损)
    private void connect1131() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566396")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_B_LM);
                        connect1132();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1132();
                    }
                });
    }

    //  摩托手套（★） | *嘣！* (久经沙场)
    private void connect1132() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566443")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_B_JJ);
                        connect1133();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1133();
                    }
                });
    }

    //  摩托手套（★） | 嘭！ (久经沙场)
    private void connect1133() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610808")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_P_LM);
                        connect1134();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1134();
                    }
                });
    }

    //  摩托手套（★） | 交运 (略有磨损)
    private void connect1134() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610851")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_JY_LM);
                        connect1135();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1135();
                    }
                });
    }

    //  摩托手套（★） | 交运 (久经沙场)
    private void connect1135() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610756")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_JY_JJ);
                        connect1136();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1136();
                    }
                });
    }

    //  摩托手套（★） | 多边形 (久经沙场)
    private void connect1136() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610874")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_DBX_JJ);
                        connect1137();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1137();
                    }
                });
    }

    //  摩托手套（★） | 玳瑁 (久经沙场)
    private void connect1137() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610678")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_DM_JJ);
                        connect1138();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1138();
                    }
                });
    }

    //  摩托手套（★） | 日蚀 (略有磨损)
    private void connect1138() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/567372")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_RS_LM);
                        connect1139();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1139();
                    }
                });
    }

    //  摩托手套（★） | 日蚀 (久经沙场)
    private void connect1139() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566440")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, MT_RS_JJ);
                        connect1140();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1140();
                    }
                });
    }
    //  专业手套（★） | 深红和服 (久经沙场)
    private void connect1140() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566569")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SHHF_JJ);
                        connect1141();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1141();
                    }
                });
    }
    //  专业手套（★） | 深红之网 (略有磨损)
    private void connect1141() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611164")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SHZW_LM);
                        connect1142();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1142();
                    }
                });
    }
    //  专业手套（★） | 深红之网 (久经沙场)
    private void connect1142() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610767")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SHZW_JJ);
                        connect1143();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1143();
                    }
                });
    }
    //  专业手套（★） | 大腕 (略有磨损)
    private void connect1143() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610677")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_DW_LM);
                        connect1144();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1144();
                    }
                });
    }
    //  专业手套（★） | 大腕 (久经沙场)
    private void connect1144() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610681")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_DW_JJ);
                        connect1145();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1145();
                    }
                });
    }
    //  专业手套（★） | 元勋 (略有磨损)
    private void connect1145() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566939")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_YX_LM);
                        connect1146();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1146();
                    }
                });
    }
    //  专业手套（★） | 元勋 (久经沙场)
    private void connect1146() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566193")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_YX_JJ);
                        connect1147();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1147();
                    }
                });
    }
    //  专业手套（★） | 渐变之色 (久经沙场)
    private void connect1147() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610971")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_JBZS_JJ);
                        connect1148();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1148();
                    }
                });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1148() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566199")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_CLZW_JJ);
                        connect1150();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1150();
                    }
                });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1149() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566199")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_CLZW_JJ);
                        connect1150();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1150();
                    }
                });
    }
    //  专业手套（★） | 狩鹿(略有磨损)
    private void connect1150() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611171")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SL_LM);
                        connect1151();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1151();
                    }
                });
    }
    //  专业手套（★） | 狩鹿(久经沙场)
    private void connect1151() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610905")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SL_JJ);
                        connect1152();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1152();
                    }
                });
    }
    //  专业手套（★） | 森林 DDPAT (略有磨损)
    private void connect1152() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566884")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SLD_LM);
                        connect1153();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1153();
                    }
                });
    }
    //  专业手套（★） | 森林 DDPAT (久经沙场)
    private void connect1153() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566307")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, ZY_SLD_JJ);
                        connect1154();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1154();
                    }
                });
    }
    //  运动手套（★） | 潘多拉之盒(久经沙场)
    private void connect1154() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566416")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, YD_PDLZH_JJ);
                        connect1155();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1155();
                    }
                });
    }
    //  运动手套（★） | 迈阿密风云(久经沙场)
    private void connect1155() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610629")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, YD_MAMFY_JJ);
                        connect1156();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1156();
                    }
                });
    }
    //  运动手套（★） | 超导体(久经沙场)
    private void connect1156() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566289")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, YD_CDT_JJ);
                        connect1157();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1157();
                    }
                });
    }
    //  运动手套（★） | 树篱迷宫(久经沙场)
    private void connect1157() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/566210")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, YD_SLMG_JJ);
                        connect1158();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1158();
                    }
                });
    }
    //  运动手套（★） | 双栖(久经沙场)
    private void connect1158() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610901")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, YD_SX_JJ);
                        connect1159();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1159();
                    }
                });
    }
    //  运动手套（★） | 欧米伽(久经沙场)
    private void connect1159() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610813")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, YD_OMJ_JJ);
                        connect1160();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1160();
                    }
                });
    }
    // 九头蛇手套（★） | 表面淬火(略有磨损)
    private void connect1160() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/611004")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_BMCH_LM);
                        connect1161();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1161();
                    }
                });
    }
    // 九头蛇手套（★） | 表面淬火(久经沙场)
    private void connect1161() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610860")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_BMCH_JJ);
                        connect1162();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1162();
                    }
                });
    }
    // 九头蛇手套（★） | 翡翠色调(略有磨损)
    private void connect1162() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610899")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_FCSD_LM);
                        connect1163();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1163();
                    }
                });
    }
    // 九头蛇手套（★） | 翡翠色调(久经沙场)
    private void connect1163() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610688")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_FCSD_JJ);
                        connect1164();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1164();
                    }
                });
    }
    // 九头蛇手套（★） | 响尾蛇(略有磨损)
    private void connect1164() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610732")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_XWS_LM);
                        connect1165();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1165();
                    }
                });
    }
    // 九头蛇手套（★） | 响尾蛇(久经沙场)
    private void connect1165() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610828")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_XWS_JJ);
                        connect1166();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        connect1166();
                    }
                });
    }
    // 九头蛇手套（★） | 红树林(略有磨损)
    private void connect1166() {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/610881")
                .execute(new JsonCallback<Igxe>(Igxe.class) {
                    @Override
                    public void onSuccess(Response<Igxe> response) {
                        handleDataIgxe(response, JTS_HSL_LM);
                        mService.igxeKnifes.connect1200();
                    }

                    @Override
                    public void onError(Response<Igxe> response) {
                        mService.igxeKnifes.connect1200();
                    }
                });
    }
}