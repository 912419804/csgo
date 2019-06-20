package com.frank.csgo.service;

import com.frank.csgo.bean.C5;
import com.frank.csgo.bean.C5;
import com.frank.csgo.https.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;
import static com.frank.csgo.price.Glove.*;


/**
 * @author 作者 hasee
 * @createTime 创建时间： 2019/2/14 14:16
 * 类说明：
 */
public class C5Gloves extends C5Check{

    public C5Gloves(C5Service service) {
        super(service);
    }
    // 血猎手套（★） | 焦炭 (略有磨损)
    public void connect1100() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553391349&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_JT_LM);
                        connect1101();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1101();
                    }
                });
    }

    // 血猎手套（★） | 焦炭 (久经沙场)
    private void connect1101() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380561&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_JT_JJ);
                        connect1102();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1102();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (略有磨损)
    private void connect1102() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553404048&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_SY_LM);
                        connect1103();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1103();
                    }
                });
    }

    // 血猎手套（★） | 蛇咬 (久经沙场)
    private void connect1103() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380786&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_SY_JJ);
                        connect1104();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1104();
                    }
                });
    }

    // 血猎手套（★） | 染铜 (略有磨损)
    private void connect1104() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553392871&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_RT_LM);
                        connect1105();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1105();
                    }
                });
    }

    // 血猎手套（★） | 染铜 (久经沙场)
    private void connect1105() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381094&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_RT_JJ);
                        connect1106();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1106();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (略有磨损)
    private void connect1106() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553379525&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_YJD_LM);
                        connect1107();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1107();
                    }
                });
    }

    // 血猎手套（★） | 游击队 (久经沙场)
    private void connect1107() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=529369193&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_YJD_JJ);
                        connect1108();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1108();
                    }
                });
    }

    // 驾驶手套（★） | 深红织物 (久经沙场)
    private void connect1108() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381164&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_SHZW_JJ);
                        connect1109();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1109();
                    }
                });
    }

    // 驾驶手套（★） | 紫蓝格子 (久经沙场)
    private void connect1109() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446784&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_LZGZ_JJ);
                        connect1110();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1110();
                    }
                });
    }

    // 驾驶手套（★） | 王蛇 (久经沙场)
    private void connect1110() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446249&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_WS_JJ);
                        connect1111();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1111();
                    }
                });
    }

    // 驾驶手套（★） | 月色织物 (略有磨损)
    private void connect1111() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401455&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_YSZW_LM);
                        connect1112();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1112();
                    }
                });
    }

    //  驾驶手套（★） | 月色织物 (久经沙场)
    private void connect1112() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553383483&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, XL_YSZW_JJ);
                        connect1113();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1113();
                    }
                });
    }

    //  驾驶手套（★） | 超越 (略有磨损)
    private void connect1113() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553447258&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JS_CY_LM);
                        connect1114();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1114();
                    }
                });
    }

    //  驾驶手套（★） | 超越 (久经沙场)
    private void connect1114() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446584&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JS_CY_JJ);
                        connect1115();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1115();
                    }
                });
    }

    //  驾驶手套（★） | 菱背蛇纹 (略有磨损)
    private void connect1115() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402412&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JS_LBSW_LM);
                        connect1116();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1116();
                    }
                });
    }

    //  驾驶手套（★） | 护卫 (略有磨损)
    private void connect1116() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=325679735&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JS_HW_LM);
                        connect1117();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1117();
                    }
                });
    }

    //  驾驶手套（★） | 墨绿色调(略有磨损)
    private void connect1117() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446583&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JS_MLSD_LM);
                        connect1118();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1118();
                    }
                });
    }

    //  裹手（★） | 钴蓝骷髅 (久经沙场)
    private void connect1118() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446629&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_GLKL_JJ);
                        connect1119();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1119();
                    }
                });
    }

    //  裹手（★） | 屠夫 (略有磨损)
    private void connect1119() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402166&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_TF_LM);
                        connect1120();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1120();
                    }
                });
    }

    //  裹手（★） | 屠夫 (久经沙场)
    private void connect1120() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401394&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_TF_JJ);
                        connect1121();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1121();
                    }
                });
    }

    //  裹手（★） | 恶土 (略有磨损)
    private void connect1121() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553390271&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_ET_LM);
                        connect1122();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1122();
                    }
                });
    }

    //  裹手（★） | 恶土 (久经沙场)
    private void connect1122() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553401795&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_ET_JJ);
                        connect1123();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1123();
                    }
                });
    }

    //  裹手（★） | 皮革 (略有磨损)
    private void connect1123() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553397160&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_PG_LM);
                        connect1124();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1124();
                    }
                });
    }

    //  裹手（★） | 皮革 (久经沙场)
    private void connect1124() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=503511490&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_PG_JJ);
                        connect1125();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1125();
                    }
                });
    }

    //  裹手（★） | 森林色调 (略有磨损)
    private void connect1125() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446557&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_SLSD_LM);
                        connect1126();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1126();
                    }
                });
    }

    //  裹手（★） | 森林色调 (久经沙场)
    private void connect1126() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446363&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_SLSD_JJ);
                        connect1127();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1127();
                    }
                });
    }

    //  裹手（★） | 云杉DDPAT(略有磨损)
    private void connect1127() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553379531&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_YS_LM);
                        connect1128();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1128();
                    }
                });
    }

    //  摩托手套（★） | 薄荷 (久经沙场)
    private void connect1128() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553391476&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_BH_JJ);
                        connect1129();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1129();
                    }
                });
    }

    //  摩托手套（★） | 清凉薄荷 (略有磨损)
    private void connect1129() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553390569&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_QLBH_LM);
                        connect1130();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1130();
                    }
                });
    }

    //  摩托手套（★） | 清凉薄荷 (久经沙场)
    private void connect1130() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381913&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_QLBH_JJ);
                        connect1131();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1131();
                    }
                });
    }

    //  摩托手套（★） | *嘣！* (略有磨损)
    private void connect1131() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553382356&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_B_LM);
                        connect1132();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1132();
                    }
                });
    }

    //  摩托手套（★） | *嘣！* (久经沙场)
    private void connect1132() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380291&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_B_JJ);
                        connect1133();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1133();
                    }
                });
    }

    //  摩托手套（★） | 嘭！ (久经沙场)
    private void connect1133() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446505&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_P_LM);
                        connect1134();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1134();
                    }
                });
    }

    //  摩托手套（★） | 交运 (略有磨损)
    private void connect1134() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446760&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_JY_LM);
                        connect1135();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1135();
                    }
                });
    }

    //  摩托手套（★） | 交运 (久经沙场)
    private void connect1135() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446278&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_JY_JJ);
                        connect1136();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1136();
                    }
                });
    }

    //  摩托手套（★） | 多边形 (久经沙场)
    private void connect1136() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445898&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_DBX_JJ);
                        connect1137();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1137();
                    }
                });
    }

    //  摩托手套（★） | 玳瑁 (久经沙场)
    private void connect1137() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446598&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_DM_JJ);
                        connect1138();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1138();
                    }
                });
    }

    //  摩托手套（★） | 日蚀 (略有磨损)
    private void connect1138() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553402777&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_RS_LM);
                        connect1139();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1139();
                    }
                });
    }

    //  摩托手套（★） | 日蚀 (久经沙场)
    private void connect1139() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380487&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, MT_RS_JJ);
                        connect1140();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1140();
                    }
                });
    }
    //  专业手套（★） | 深红和服 (久经沙场)
    private void connect1140() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553381074&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SHHF_JJ);
                        connect1141();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1141();
                    }
                });
    }
    //  专业手套（★） | 深红之网 (略有磨损)
    private void connect1141() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553448127&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SHZW_LM);
                        connect1142();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1142();
                    }
                });
    }
    //  专业手套（★） | 深红之网 (久经沙场)
    private void connect1142() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446851&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SHZW_JJ);
                        connect1143();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1143();
                    }
                });
    }
    //  专业手套（★） | 大腕 (略有磨损)
    private void connect1143() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446050&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_DW_LM);
                        connect1144();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1144();
                    }
                });
    }
    //  专业手套（★） | 大腕 (久经沙场)
    private void connect1144() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446071&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_DW_JJ);
                        connect1145();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1145();
                    }
                });
    }
    //  专业手套（★） | 元勋 (略有磨损)
    private void connect1145() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553394969&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_YX_LM);
                        connect1146();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1146();
                    }
                });
    }
    //  专业手套（★） | 元勋 (久经沙场)
    private void connect1146() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=501540030&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_YX_JJ);
                        connect1147();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1147();
                    }
                });
    }
    //  专业手套（★） | 渐变之色 (久经沙场)
    private void connect1147() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446680&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_JBZS_JJ);
                        connect1149();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1149();
                    }
                });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1148() {
        OkGo.<C5>get("https://www.C5.cn/product/trade/730/566199")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_CLZW_JJ);
                        connect1149();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1149();
                    }
                });
    }
    //  专业手套（★） | 翠绿之网 (久经沙场)
    private void connect1149() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380463&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_CLZW_JJ);
                        connect1150();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1150();
                    }
                });
    }
    //  专业手套（★） | 狩鹿(略有磨损)
    private void connect1150() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446816&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SL_LM);
                        connect1151();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1151();
                    }
                });
    }
    //  专业手套（★） | 狩鹿(久经沙场)
    private void connect1151() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446556&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SL_JJ);
                        connect1152();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1152();
                    }
                });
    }
    //  专业手套（★） | 森林 DDPAT (略有磨损)
    private void connect1152() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553396165&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SLD_LM);
                        connect1153();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1153();
                    }
                });
    }
    //  专业手套（★） | 森林 DDPAT (久经沙场)
    private void connect1153() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553380209&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, ZY_SLD_JJ);
                        connect1154();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1154();
                    }
                });
    }
    //  运动手套（★） | 潘多拉之盒(久经沙场)
    private void connect1154() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=496333498&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_PDLZH_JJ);
                        connect1155();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1155();
                    }
                });
    }
    //  运动手套（★） | 迈阿密风云(久经沙场)
    private void connect1155() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445829&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_MAMFY_JJ);
                        connect1156();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1156();
                    }
                });
    }
    //  运动手套（★） | 超导体(久经沙场)
    private void connect1156() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553392507&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_CDT_JJ);
                        connect1157();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1157();
                    }
                });
    }
    //  运动手套（★） | 树篱迷宫(久经沙场)
    private void connect1157() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=529677218&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_SLMG_JJ);
                        connect1158();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1158();
                    }
                });
    }
    //  运动手套（★） | 双栖(久经沙场)
    private void connect1158() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446498&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_SX_JJ);
                        connect1159();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1159();
                    }
                });
    }
    //  运动手套（★） | 欧米伽(久经沙场)
    private void connect1159() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446431&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_OMJ_JJ);
                        connect1160();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1160();
                    }
                });
    }
    // 九头蛇手套（★） | 表面淬火(略有磨损)
    private void connect1160() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553447331&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_BMCH_LM);
                        connect1161();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1161();
                    }
                });
    }
    // 九头蛇手套（★） | 表面淬火(久经沙场)
    private void connect1161() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446561&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_BMCH_JJ);
                        connect1162();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1162();
                    }
                });
    }
    // 九头蛇手套（★） | 翡翠色调(略有磨损)
    private void connect1162() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446648&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_FCSD_LM);
                        connect1163();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1163();
                    }
                });
    }
    // 九头蛇手套（★） | 翡翠色调(久经沙场)
    private void connect1163() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446372&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_FCSD_JJ);
                        connect1164();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1164();
                    }
                });
    }
    // 九头蛇手套（★） | 响尾蛇(略有磨损)
    private void connect1164() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446123&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_XWS_LM);
                        connect1165();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1165();
                    }
                });
    }
    // 九头蛇手套（★） | 响尾蛇(久经沙场)
    private void connect1165() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446295&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_XWS_JJ);
                        connect1166();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1166();
                    }
                });
    }
    // 九头蛇手套（★） | 红树林(略有磨损)
    private void connect1166() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446701&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, JTS_HSL_LM);
                        connect1167();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1167();
                    }
                });
    }

    // 裹手（★） | 套印(久经沙场)
    private void connect1167() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553446121&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, GS_TY_JJ);
                        connect1168();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1168();
                    }
                });
    }

    // 运动手套（★） | 青铜形态 (久经沙场)
    private void connect1168() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553445944&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_QTXT_JJ);
                        connect1169();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1169();
                    }
                });
    }
    // 运动手套（★） | 干旱 (略有磨损)
    private void connect1169() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=553389065&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_GH_LM);
                        connect1170();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        connect1170();
                    }
                });
    }
    // 运动手套（★） | 干旱 (久经沙场)
    private void connect1170() {
        OkGo.<C5>get("https://www.c5game.com/api/product/sale.json?id=514711683&page=1&flag=&sort=&worn=&delivery=")
                .execute(new JsonCallback<C5>(C5.class) {
                    @Override
                    public void onSuccess(Response<C5> response) {
                        handleDataC5(response, YD_GH_JJ);
                        mService.startScan();
                    }

                    @Override
                    public void onError(Response<C5> response) {
                        mService.startScan();
                    }
                });
    }
}