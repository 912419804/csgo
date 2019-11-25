package com.frank.csgo.price;


import java.util.HashMap;
import static com.frank.csgo.price.GloveName.*;

public class Glove {

    public static HashMap<Object,Object[]> GLOVE_DATA = new HashMap<>();

    // 血猎手套（★） | 焦炭 (略有磨损)
    public static double[] XL_JT_LM = {1900, 0.10,1450};
    public static String[] XL_JT_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42452&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554954162295"};
    public static Object[] XL_JT_LM_MAP = {N_XL_JT_LM,XL_JT_LM_URL,XL_JT_LM};
    static {GLOVE_DATA.put(XL_JT_LM_MAP[0],XL_JT_LM_MAP);}

    // 血猎手套（★） | 焦炭 (久经沙场)
    public static double[] XL_JT_JJ = {850, 0.21, 700};
    public static String[] XL_JT_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42451&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554954189139"};
    public static Object[] XL_JT_JJ_MAP = {N_XL_JT_JJ,XL_JT_JJ_URL,XL_JT_JJ};
    static {GLOVE_DATA.put(XL_JT_JJ_MAP[0],XL_JT_JJ_MAP);}

    // 血猎手套（★） | 蛇咬 (略有磨损)
    public static double[] XL_SY_LM = {1800, 0.11, 1500};
    public static String[] XL_SY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42459&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554955219035"};
    public static Object[] XL_SY_LM_MAP = {N_XL_SY_LM,XL_SY_LM_URL,XL_SY_LM};
    static {GLOVE_DATA.put(XL_SY_LM_MAP[0],XL_SY_LM_MAP);}

    // 血猎手套（★） | 蛇咬 (久经沙场)
    public static double[] XL_SY_JJ = {810, 0.21, 700};
    public static String[] XL_SY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42458&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554963091066"};
    public static Object[] XL_SY_JJ_MAP = {N_XL_SY_JJ,XL_SY_JJ_URL,XL_SY_JJ};
    static {GLOVE_DATA.put(XL_SY_JJ_MAP[0],XL_SY_JJ_MAP);}

    // 血猎手套（★） | 染铜 (略有磨损)
    public static double[] XL_RT_LM = {1300, 0.09, 1000};
    public static String[] XL_RT_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42448&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554964002854"};
    public static Object[] XL_RT_LM_MAP = {N_XL_RT_LM,XL_RT_LM_URL,XL_RT_LM};
    static {GLOVE_DATA.put(XL_RT_LM_MAP[0],XL_RT_LM_MAP);}

    // 血猎手套（★） | 染铜 (久经沙场)
    public static double[] XL_RT_JJ = {700, 0.18, 600};
    public static String[] XL_RT_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42447&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554964331519"};
    public static Object[] XL_RT_JJ_MAP = {N_XL_RT_JJ,XL_RT_JJ_URL,XL_RT_JJ};
    static {GLOVE_DATA.put(XL_RT_JJ_MAP[0],XL_RT_JJ_MAP);}

    // 血猎手套（★） | 游击队 (略有磨损)
    public static double[] XL_YJD_LM = {1300, 0.09, 1000};
    public static String[] XL_YJD_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42456&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554967238015"};
    public static Object[] XL_YJD_LM_MAP = {N_XL_YJD_LM,XL_YJD_LM_URL,XL_YJD_LM};
    static {GLOVE_DATA.put(XL_YJD_LM_MAP[0],XL_YJD_LM_MAP);}

    // 血猎手套（★） | 游击队 (久经沙场)
    public static double[] XL_YJD_JJ = {730, 0.21, 600};
    public static String[] XL_YJD_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42455&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554968008907"};
    public static Object[] XL_YJD_JJ_MAP = {N_XL_YJD_JJ,XL_YJD_JJ_URL,XL_YJD_JJ};
    static {GLOVE_DATA.put(XL_YJD_JJ_MAP[0],XL_YJD_JJ_MAP);}

    // 驾驶手套（★） | 深红织物 (略有磨损)
    public static double[] XL_SHZW_LM = {4300, 0.115, 3300};
    public static String[] XL_SHZW_LM_URL = {"0"};
    public static Object[] XL_SHZW_LM_MAP = {N_XL_SHZW_LM,XL_SHZW_LM_URL,XL_SHZW_LM};
    static {GLOVE_DATA.put(XL_SHZW_LM_MAP[0],XL_SHZW_LM_MAP);}

    // 驾驶手套（★） | 深红织物 (久经沙场)
    public static double[] XL_SHZW_JJ = {1720, 0.27, 1500};
    public static String[] XL_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42602&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554968980127"};
    public static Object[] XL_SHZW_JJ_MAP = {N_XL_SHZW_JJ,XL_SHZW_JJ_URL,XL_SHZW_JJ};
    static {GLOVE_DATA.put(XL_SHZW_JJ_MAP[0],XL_SHZW_JJ_MAP);}

    // 驾驶手套（★） | 紫蓝格子 (略有磨损)
    public static double[] XL_LZGZ_LM = {4400, 0.123, 3100};
    public static String[] XL_LZGZ_LM_URL = {"0"};
    public static Object[] XL_LZGZ_LM_MAP = {N_XL_LZGZ_LM,XL_LZGZ_LM_URL,XL_LZGZ_LM};
    static {GLOVE_DATA.put(XL_LZGZ_LM_MAP[0],XL_LZGZ_LM_MAP);}

    // 驾驶手套（★） | 紫蓝格子 (久经沙场)
    public static double[] XL_LZGZ_JJ = {1750, 0.26, 1400};
    public static String[] XL_LZGZ_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45549&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969156076"};
    public static Object[] XL_LZGZ_JJ_MAP = {N_XL_LZGZ_JJ,XL_LZGZ_JJ_URL,XL_LZGZ_JJ};
    static {GLOVE_DATA.put(XL_LZGZ_JJ_MAP[0],XL_LZGZ_JJ_MAP);}

    // 驾驶手套（★） | 王蛇 (略有磨损)
    public static double[] XL_WS_LM = {4400, 0.12, 4000};
    public static String[] XL_WS_LM_URL = {"0"};
    public static int[]    XL_WS_LM_MB = {108,354,891,945,986};
    public static Object[] XL_WS_LM_MAP = {N_XL_WS_LM,XL_WS_LM_URL,XL_WS_LM,XL_WS_LM_MB};
    static {GLOVE_DATA.put(XL_WS_LM_MAP[0],XL_WS_LM_MAP);}

    // 驾驶手套（★） | 王蛇 (久经沙场)
    public static double[] XL_WS_JJ = {1900, 0.25, 1600};
    public static String[] XL_WS_JJ_URL =  {"0"};
    public static int[]    XL_WS_JJ_MB = {108,354,891,945,986};
    public static Object[] XL_WS_JJ_MAP = {N_XL_WS_JJ,XL_WS_JJ_URL,XL_WS_JJ};
    static {GLOVE_DATA.put(XL_WS_JJ_MAP[0],XL_WS_JJ_MAP);}

    // 驾驶手套（★） | 月色织物 (略有磨损)
    public static double[] XL_YSZW_LM = {1440, 0.10, 1200};
    public static String[] XL_YSZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42612&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969582539"};
    public static Object[] XL_YSZW_LM_MAP = {N_XL_YSZW_LM,XL_YSZW_LM_URL,XL_YSZW_LM};
    static {GLOVE_DATA.put(XL_YSZW_LM_MAP[0],XL_YSZW_LM_MAP);}

    //  驾驶手套（★） | 月色织物 (久经沙场)
    public static double[] XL_YSZW_JJ = {650, 0.22, 500};
    public static String[] XL_YSZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42611&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969741663"};
    public static Object[] XL_YSZW_JJ_MAP = {N_XL_YSZW_JJ,XL_YSZW_JJ_URL,XL_YSZW_JJ};
    static {GLOVE_DATA.put(XL_YSZW_JJ_MAP[0],XL_YSZW_JJ_MAP);}

    //  驾驶手套（★） | 超越 (略有磨损)
    public static double[] JS_CY_LM = {1730, 0.10, 1320};
    public static String[] JS_CY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45533&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969918026"};
    public static Object[] JS_CY_LM_MAP = {N_JS_CY_LM,JS_CY_LM_URL,JS_CY_LM};
    static {GLOVE_DATA.put(JS_CY_LM_MAP[0],JS_CY_LM_MAP);}

    //  驾驶手套（★） | 超越 (久经沙场)
    public static double[] JS_CY_JJ = {680, 0.21, 600};
    public static String[] JS_CY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45492&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554969980079"};
    public static Object[] JS_CY_JJ_MAP = {N_JS_CY_JJ,JS_CY_JJ_URL,JS_CY_JJ};
    static {GLOVE_DATA.put(JS_CY_JJ_MAP[0],JS_CY_JJ_MAP);}

    //  驾驶手套（★） | 菱背蛇纹 (略有磨损)
    public static double[] JS_LBSW_LM = {1100, 0.09, 800};
    public static String[] JS_LBSW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42608&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970478588"};
    public static Object[] JS_LBSW_LM_MAP = {N_JS_LBSW_LM,JS_LBSW_LM_URL,JS_LBSW_LM};
    static {GLOVE_DATA.put(JS_LBSW_LM_MAP[0],JS_LBSW_LM_MAP);}

    //  驾驶手套（★） | 护卫 (略有磨损)
    public static double[] JS_HW_LM = {850, 0.08, 500};
    public static String[] JS_HW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42599&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970616830"};
    public static Object[] JS_HW_LM_MAP = {N_JS_HW_LM,JS_HW_LM_URL,JS_HW_LM};
    static {GLOVE_DATA.put(JS_HW_LM_MAP[0],JS_HW_LM_MAP);}

    //  驾驶手套（★） | 墨绿色调(略有磨损)
    public static double[] JS_MLSD_LM = {700, 0.08, 450};
    public static String[] JS_MLSD_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45551&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970727376"};
    public static Object[] JS_MLSD_LM_MAP = {N_JS_MLSD_LM,JS_MLSD_LM_URL,JS_MLSD_LM};
    static {GLOVE_DATA.put(JS_MLSD_LM_MAP[0],JS_MLSD_LM_MAP);}

    //  裹手（★） | 钴蓝骷髅 (久经沙场)
    public static double[] GS_GLKL_JJ = {2700, 0.26, 2200};
    public static String[] GS_GLKL_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45471&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970803831"};
    public static Object[] GS_GLKL_JJ_MAP = {N_GS_GLKL_JJ,GS_GLKL_JJ_URL, GS_GLKL_JJ};
    static {GLOVE_DATA.put(GS_GLKL_JJ_MAP[0],GS_GLKL_JJ_MAP);}

    //  裹手（★） | 屠夫 (略有磨损)
    public static double[] GS_TF_LM = {3000, 0.115, 2500};
    public static String[] GS_TF_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42884&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554970914561"};
    public static Object[] GS_TF_LM_MAP = {N_GS_TF_LM,GS_TF_LM_URL, GS_TF_LM};
    static {GLOVE_DATA.put(GS_TF_LM_MAP[0],GS_TF_LM_MAP);}

    //  裹手（★） | 屠夫 (久经沙场)
    public static double[] GS_TF_JJ = {1550, 0.24, 1250};
    public static String[] GS_TF_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42883&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971128994"};
    public static Object[] GS_TF_JJ_MAP = {N_GS_TF_JJ,GS_TF_JJ_URL, GS_TF_JJ};
    static {GLOVE_DATA.put(GS_TF_JJ_MAP[0],GS_TF_JJ_MAP);}

    //  裹手（★） | 恶土 (略有磨损)
    public static double[] GS_ET_LM = {1600, 0.10, 1300};
    public static String[] GS_ET_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42876&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971191720"};
    public static Object[] GS_ET_LM_MAP = {N_GS_ET_LM,GS_ET_LM_URL, GS_ET_LM};
    static {GLOVE_DATA.put(GS_ET_LM_MAP[0],GS_ET_LM_MAP);}

    //  裹手（★） | 恶土 (久经沙场)
    public static double[] GS_ET_JJ = {899, 0.23, 780};
    public static String[] GS_ET_JJ_URL = {"0"};
    public static Object[] GS_ET_JJ_MAP = {N_GS_ET_JJ,GS_ET_JJ_URL, GS_ET_JJ};
    static {GLOVE_DATA.put(GS_ET_JJ_MAP[0],GS_ET_JJ_MAP);}

    //  裹手（★） | 皮革 (略有磨损)
    public static double[] GS_PG_LM = {1500, 0.10, 1200};
    public static String[] GS_PG_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42880&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971410718"};
    public static Object[] GS_PG_LM_MAP = {N_GS_PG_LM,GS_PG_LM_URL, GS_PG_LM};
    static {GLOVE_DATA.put(GS_PG_LM_MAP[0],GS_PG_LM_MAP);}

    //  裹手（★） | 皮革 (久经沙场)
    public static double[] GS_PG_JJ = {900, 0.20, 700};
    public static String[] GS_PG_JJ_URL = {"0"};
    public static Object[] GS_PG_JJ_MAP = {N_GS_PG_JJ,GS_PG_JJ_URL, GS_PG_JJ};
    static {GLOVE_DATA.put(GS_PG_JJ_MAP[0],GS_PG_JJ_MAP);}

    //  裹手（★） | 森林色调 (略有磨损)
    public static double[] GS_SLSD_LM = {1150, 0.10, 900};
    public static String[] GS_SLSD_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45506&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971920868"};
    public static Object[] GS_SLSD_LM_MAP = {N_GS_SLSD_LM,GS_SLSD_LM_URL, GS_SLSD_LM};
    static {GLOVE_DATA.put(GS_SLSD_LM_MAP[0],GS_SLSD_LM_MAP);}

    //  裹手（★） | 森林色调 (久经沙场)
    public static double[] GS_SLSD_JJ = {750, 0.19, 600};
    public static String[] GS_SLSD_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45450&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554971989125"};
    public static Object[] GS_SLSD_JJ_MAP = {N_GS_SLSD_JJ,GS_SLSD_JJ_URL, GS_SLSD_JJ};
    static {GLOVE_DATA.put(GS_SLSD_JJ_MAP[0],GS_SLSD_JJ_MAP);}

    //  裹手（★） | 云杉DDPAT (略有磨损)
    public static double[] GS_YS_LM = {980, 0.09, 800};
    public static String[] GS_YS_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42889&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972053819"};
    public static Object[] GS_YS_LM_MAP = {N_GS_YS_LM,GS_YS_LM_URL, GS_YS_LM};
    static {GLOVE_DATA.put(GS_YS_LM_MAP[0],GS_YS_LM_MAP);}

    //  裹手（★） | 云杉DDPAT (久经沙场)
    public static double[] GS_YS_JJ = {890, 0.16, 700};
    public static String[] GS_YS_JJ_URL = {"0"};
    public static Object[] GS_YS_JJ_MAP = {N_GS_YS_JJ,GS_YS_JJ_URL, GS_YS_JJ};
    static {GLOVE_DATA.put(GS_YS_JJ_MAP[0],GS_YS_JJ_MAP);}

    //  摩托手套（★） | 薄荷 (久经沙场)
    public static double[] GS_BH_JJ = {3600, 0.32, 3000};
    public static String[] GS_BH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43159&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972194963"};
    public static Object[] GS_BH_JJ_MAP = {N_GS_BH_JJ,GS_BH_JJ_URL, GS_BH_JJ};
    static {GLOVE_DATA.put(GS_BH_JJ_MAP[0],GS_BH_JJ_MAP);}

    //  摩托手套（★） | 清凉薄荷 (略有磨损)
    public static double[] MT_QLBH_LM = {3600, 0.11, 3000};
    public static String[] MT_QLBH_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43152&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972524257"};
    public static Object[] MT_QLBH_LM_MAP = {N_MT_QLBH_LM,MT_QLBH_LM_URL, MT_QLBH_LM};
    static {GLOVE_DATA.put(MT_QLBH_LM_MAP[0],MT_QLBH_LM_MAP);}

    //  摩托手套（★） | 清凉薄荷 (久经沙场)
    public static double[] MT_QLBH_JJ = {1600, 0.29, 1300};
    public static String[] MT_QLBH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43151&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554972733525"};
    public static Object[] MT_QLBH_JJ_MAP = {N_MT_QLBH_JJ,MT_QLBH_JJ_URL, MT_QLBH_JJ};
    static {GLOVE_DATA.put(MT_QLBH_JJ_MAP[0],MT_QLBH_JJ_MAP);}

    //  摩托手套（★） | *嘣！* (略有磨损)
    public static double[] MT_B_LM = {2550, 0.11, 2050};
    public static String[] MT_B_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43148&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973056441"};
    public static Object[] MT_B_LM_MAP = {N_MT_B_LM,MT_B_LM_URL, MT_B_LM};
    static {GLOVE_DATA.put(MT_B_LM_MAP[0],MT_B_LM_MAP);}

    //  摩托手套（★） | *嘣！* (久经沙场)
    public static double[] MT_B_JJ = {1150, 0.30, 950};
    public static String[] MT_B_JJ_URL ={"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43147&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973267137"};
    public static Object[] MT_B_JJ_MAP = {N_MT_B_JJ,MT_B_JJ_URL, MT_B_JJ};
    static {GLOVE_DATA.put(MT_B_JJ_MAP[0],MT_B_JJ_MAP);}

    //  摩托手套（★） | 嘭！ (久经沙场)
    public static double[] MT_P_LM = {2200, 0.30, 1800};
    public static String[] MT_P_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45432&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973333338"};
    public static Object[] MT_P_LM_MAP = {N_MT_P_LM,MT_P_LM_URL, MT_P_LM};
    static {GLOVE_DATA.put(MT_P_LM_MAP[0],MT_P_LM_MAP);}

    //  摩托手套（★） | 交运 (略有磨损)
    public static double[] MT_JY_LM = {1100, 0.12, 900};
    public static String[] MT_JY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45493&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973453800"};
    public static Object[] MT_JY_LM_MAP = {N_MT_JY_LM,MT_JY_LM_URL, MT_JY_LM};
    static {GLOVE_DATA.put(MT_JY_LM_MAP[0],MT_JY_LM_MAP);}

    //  摩托手套（★） | 交运 (久经沙场)
    public static double[] MT_JY_JJ = {600, 0.20, 500};
    public static String[] MT_JY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858"};
    public static Object[] MT_JY_JJ_MAP = {N_MT_JY_JJ,MT_JY_JJ_URL, MT_JY_JJ};
    static {GLOVE_DATA.put(MT_JY_JJ_MAP[0],MT_JY_JJ_MAP);}

    //  摩托手套（★） | 多边形 (久经沙场)
    public static double[] MT_DBX_JJ = {1480, 0.25, 1200};
    public static String[] MT_DBX_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45473&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975231755"};
    public static Object[] MT_DBX_JJ_MAP = {N_MT_DBX_JJ,MT_DBX_JJ_URL, MT_DBX_JJ};
    static {GLOVE_DATA.put(MT_DBX_JJ_MAP[0],MT_DBX_JJ_MAP);}

    //  摩托手套（★） | 玳瑁 (久经沙场)
    public static double[] MT_DM_JJ = {1350, 0.28, 1100};
    public static String[] MT_DM_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45488&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975287147"};
    public static Object[] MT_DM_JJ_MAP = {N_MT_DM_JJ,MT_DM_JJ_URL, MT_DM_JJ};
    static {GLOVE_DATA.put(MT_DM_JJ_MAP[0],MT_DM_JJ_MAP);}

    //  摩托手套（★） | 日蚀 (略有磨损)
    public static double[] MT_RS_LM = {1900, 0.11, 1400};
    public static String[] MT_RS_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43156&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975370979"};
    public static Object[] MT_RS_LM_MAP = {N_MT_RS_LM,MT_RS_LM_URL, MT_RS_LM};
    static {GLOVE_DATA.put(MT_RS_LM_MAP[0],MT_RS_LM_MAP);}

    //  摩托手套（★） | 日蚀 (久经沙场)
    public static double[] MT_RS_JJ = {920, 0.25, 750};
    public static String[] MT_RS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43155&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975418874"};
    public static Object[] MT_RS_JJ_MAP = {N_MT_RS_JJ,MT_RS_JJ_URL, MT_RS_JJ};
    static {GLOVE_DATA.put(MT_RS_JJ_MAP[0],MT_RS_JJ_MAP);}

    //  专业手套（★） | 深红和服 (久经沙场)
    public static double[] ZY_SHHF_JJ= {3300, 0.22, 2800};
    public static String[] ZY_SHHF_JJ_URL= {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43233&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975545829"};
    public static Object[] ZY_SHHF_JJ_MAP = {N_ZY_SHHF_JJ,ZY_SHHF_JJ_URL, ZY_SHHF_JJ};
    static {GLOVE_DATA.put(ZY_SHHF_JJ_MAP[0],ZY_SHHF_JJ_MAP);}

    //  专业手套（★） | 深红之网 (略有磨损)
    public static double[] ZY_SHZW_LM = {3600, 0.11, 3100};
    public static String[] ZY_SHZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=422853&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975679756"};
    public static Object[] ZY_SHZW_LM_MAP = {N_ZY_SHZW_LM,ZY_SHZW_LM_URL, ZY_SHZW_LM};
    static {GLOVE_DATA.put(ZY_SHZW_LM_MAP[0],ZY_SHZW_LM_MAP);}

    //  专业手套（★） | 深红之网 (久经沙场)
    public static double[] ZY_SHZW_JJ = {1500, 0.26, 1200};
    public static String[] ZY_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45412&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975733233"};
    public static Object[] ZY_SHZW_JJ_MAP = {N_ZY_SHZW_JJ,ZY_SHZW_JJ_URL, ZY_SHZW_JJ};
    static {GLOVE_DATA.put(ZY_SHZW_JJ_MAP[0],ZY_SHZW_JJ_MAP);}

    //  专业手套（★） | 大腕 (略有磨损)
    public static double[] ZY_DW_LM = {2700, 0.10, 2200};
    public static String[] ZY_DW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45606&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975801052"};
    public static Object[] ZY_DW_LM_MAP = {N_ZY_DW_LM,ZY_DW_LM_URL, ZY_DW_LM};
    static {GLOVE_DATA.put(ZY_DW_LM_MAP[0],ZY_DW_LM_MAP);}

    //  专业手套（★） | 大腕 (久经沙场)
    public static double[] ZY_DW_JJ = {1350, 0.25, 1050};
    public static String[] ZY_DW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45376&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975861228"};
    public static Object[] ZY_DW_JJ_MAP = {N_ZY_DW_JJ,ZY_DW_JJ_URL, ZY_DW_JJ};
    static {GLOVE_DATA.put(ZY_DW_JJ_MAP[0],ZY_DW_JJ_MAP);}

    //  专业手套（★） | 元勋 (略有磨损)
    public static double[] ZY_YX_LM = {3000, 0.10, 2500};
    public static String[] ZY_YX_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43247&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975925016"};
    public static Object[] ZY_YX_LM_MAP = {N_ZY_YX_LM,ZY_YX_LM_URL, ZY_YX_LM};
    static {GLOVE_DATA.put(ZY_YX_LM_MAP[0],ZY_YX_LM_MAP);}

    //  专业手套（★） | 元勋 (久经沙场)
    public static double[] ZY_YX_JJ = {1320, 0.25, 1000};
    public static String[] ZY_YX_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43246&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554975968513"};
    public static Object[] ZY_YX_JJ_MAP = {N_ZY_YX_JJ,ZY_YX_JJ_URL, ZY_YX_JJ};
    static {GLOVE_DATA.put(ZY_YX_JJ_MAP[0],ZY_YX_JJ_MAP);}

    //  专业手套（★） | 渐变之色 (久经沙场)
    public static double[] ZY_JBZS_JJ = {2100, 0.25, 1750};
    public static String[] ZY_JBZS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45508&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976006928"};
    public static Object[] ZY_JBZS_JJ_MAP = {N_ZY_JBZS_JJ,ZY_JBZS_JJ_URL, ZY_JBZS_JJ};
    static {GLOVE_DATA.put(ZY_JBZS_JJ_MAP[0],ZY_JBZS_JJ_MAP);}

    //  专业手套（★） | 翠绿之网 (久经沙场)
    public static double[] ZY_CLZW_JJ = {1900, 0.25, 1500};
    public static String[] ZY_CLZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43237&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976048425"};
    public static Object[] ZY_CLZW_JJ_MAP = {N_ZY_CLZW_JJ,ZY_CLZW_JJ_URL, ZY_CLZW_JJ};
    static {GLOVE_DATA.put(ZY_CLZW_JJ_MAP[0],ZY_CLZW_JJ_MAP);}

    //  专业手套（★） | 狩鹿(略有磨损)
    public static double[] ZY_SL_LM = {1100, 0.09, 600};
    public static String[] ZY_SL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45565&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976119916"};
    public static Object[] ZY_SL_LM_MAP = {N_ZY_SL_LM,ZY_SL_LM_URL, ZY_SL_LM};
    static {GLOVE_DATA.put(ZY_SL_LM_MAP[0],ZY_SL_LM_MAP);}

    //  专业手套（★） | 狩鹿(久经沙场)
    public static double[] ZY_SL_JJ = {600, 0.16, 400};
    public static String[] ZY_SL_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858"};
    public static Object[] ZY_SL_JJ_MAP = {N_ZY_SL_JJ,ZY_SL_JJ_URL, ZY_SL_JJ};
    static {GLOVE_DATA.put(ZY_SL_JJ_MAP[0],ZY_SL_JJ_MAP);}

    //  专业手套（★） | 森林 DDPAT (略有磨损)
    public static double[] ZY_SLD_LM = {1000, 0.08, 750};
    public static String[] ZY_SLD_LM_URL ={"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43243&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976180417"};
    public static Object[] ZY_SLD_LM_MAP = {N_ZY_SLD_LM,ZY_SLD_LM_URL, ZY_SLD_LM};
    static {GLOVE_DATA.put(ZY_SLD_LM_MAP[0],ZY_SLD_LM_MAP);}

    //  专业手套（★） | 森林 DDPAT (久经沙场)
    public static double[] ZY_SLD_JJ = {520, 0.17, 400};
    public static String[] ZY_SLD_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45411&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554973505858"};
    public static Object[] ZY_SLD_JJ_MAP = {N_ZY_SLD_JJ,ZY_SLD_JJ_URL, ZY_SLD_JJ};
    static {GLOVE_DATA.put(ZY_SLD_JJ_MAP[0],ZY_SLD_JJ_MAP);}

    //  运动手套（★） | 潘多拉之盒(久经沙场)
    public static double[] YD_PDLZH_JJ = {6700, 0.31, 6000};
    public static String[] YD_PDLZH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43259&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976240458"};
    public static Object[] YD_PDLZH_JJ_MAP = {N_YD_PDLZH_JJ,YD_PDLZH_JJ_URL, YD_PDLZH_JJ};
    static {GLOVE_DATA.put(YD_PDLZH_JJ_MAP[0],YD_PDLZH_JJ_MAP);}

    //  运动手套（★） | 迈阿密风云(久经沙场)
    public static double[] YD_MAMFY_JJ = {5400, 0.29, 4600};
    public static String[] YD_MAMFY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45582&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976379943"};
    public static Object[] YD_MAMFY_JJ_MAP = {N_YD_MAMFY_JJ,YD_MAMFY_JJ_URL, YD_MAMFY_JJ};
    static {GLOVE_DATA.put(YD_MAMFY_JJ_MAP[0],YD_MAMFY_JJ_MAP);}

    //  运动手套（★） | 超导体 (久经沙场)
    public static double[] YD_CDT_JJ = {3500, 0.29, 3050};
    public static String[] YD_CDT_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43262&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976864300"};
    public static Object[] YD_CDT_JJ_MAP = {N_YD_CDT_JJ,YD_CDT_JJ_URL, YD_CDT_JJ};
    static {GLOVE_DATA.put(YD_CDT_JJ_MAP[0],YD_CDT_JJ_MAP);}

    //  运动手套（★） | 树篱迷宫 (久经沙场)
    public static double[] YD_SLMG_JJ = {2900, 0.30, 2500};
    public static String[] YD_SLMG_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43255&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976911891"};
    public static Object[] YD_SLMG_JJ_MAP = {N_YD_SLMG_JJ,YD_SLMG_JJ_URL, YD_SLMG_JJ};
    static {GLOVE_DATA.put(YD_SLMG_JJ_MAP[0],YD_SLMG_JJ_MAP);}

    //  运动手套（★） | 双栖(久经沙场)
    public static double[] YD_SX_JJ = {2600, 0.26, 2200};
    public static String[] YD_SX_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45451&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554976963839"};
    public static Object[] YD_SX_JJ_MAP = {N_YD_SX_JJ,YD_SX_JJ_URL, YD_SX_JJ};
    static {GLOVE_DATA.put(YD_SX_JJ_MAP[0],YD_SX_JJ_MAP);}

    //  运动手套（★） | 欧米伽(久经沙场)
    public static double[] YD_OMJ_JJ = {2150, 0.26, 1900};
    public static String[] YD_OMJ_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45509&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977093242"};
    public static Object[] YD_OMJ_JJ_MAP = {N_YD_OMJ_JJ,YD_OMJ_JJ_URL, YD_OMJ_JJ};
    static {GLOVE_DATA.put(YD_OMJ_JJ_MAP[0],YD_OMJ_JJ_MAP);}

    //  运动手套（★） | 青铜形态 (久经沙场)
    public static double[] YD_QTXT_JJ = {1100, 0.20, 900};
    public static String[] YD_QTXT_JJ_URL = {"0"};
    public static Object[] YD_QTXT_JJ_MAP = {N_YD_QTXT_JJ,YD_QTXT_JJ_URL, YD_QTXT_JJ};
    static {GLOVE_DATA.put(YD_QTXT_JJ_MAP[0],YD_QTXT_JJ_MAP);}

    //  运动手套（★） | 干旱 (略有磨损)
    public static double[] YD_GH_LM = {2800, 0.10, 2400};
    public static String[] YD_GH_LM_URL = {"0"};
    public static Object[] YD_GH_LM_MAP = {N_YD_GH_LM,YD_GH_LM_URL, YD_GH_LM};
    static {GLOVE_DATA.put(YD_GH_LM_MAP[0],YD_GH_LM_MAP);}

    //  运动手套（★） | 干旱 (久经沙场)
    public static double[] YD_GH_JJ = {1440, 0.25, 1200};
    public static String[] YD_GH_JJ_URL = {"0"};
    public static Object[] YD_GH_JJ_MAP = {N_YD_GH_JJ,YD_GH_JJ_URL, YD_GH_JJ};
    static {GLOVE_DATA.put(YD_GH_JJ_MAP[0],YD_GH_JJ_MAP);}

    // 九头蛇手套（★） | 表面淬火(略有磨损)
    public static double[] JTS_BMCH_LM = {1550, 0.09, 1200};
    public static String[] JTS_BMCH_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45556&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977150918"};
    public static Object[] JTS_BMCH_LM_MAP = {N_JTS_BMCH_LM,JTS_BMCH_LM_URL, JTS_BMCH_LM};
    static {GLOVE_DATA.put(JTS_BMCH_LM_MAP[0],JTS_BMCH_LM_MAP);}

    // 九头蛇手套（★） | 表面淬火(久经沙场)
    public static double[] JTS_BMCH_JJ = {800, 0.20, 680};
    public static String[] JTS_BMCH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45431&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977202481"};
    public static Object[] JTS_BMCH_JJ_MAP = {N_JTS_BMCH_JJ,JTS_BMCH_JJ_URL, JTS_BMCH_JJ};
    static {GLOVE_DATA.put(JTS_BMCH_JJ_MAP[0],JTS_BMCH_JJ_MAP);}

    // 九头蛇手套（★） | 翡翠色调(略有磨损)
    public static double[] JTS_FCSD_LM = {1500, 0.10, 1000};
    public static String[] JTS_FCSD_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45579&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977262000"};
    public static Object[] JTS_FCSD_LM_MAP = {N_JTS_FCSD_LM,JTS_FCSD_LM_URL, JTS_FCSD_LM};
    static {GLOVE_DATA.put(JTS_FCSD_LM_MAP[0],JTS_FCSD_LM_MAP);}

    // 九头蛇手套（★） | 翡翠色调(久经沙场)
    public static double[] JTS_FCSD_JJ = {690, 0.19, 600};
    public static String[] JTS_FCSD_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45558&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977309970"};
    public static Object[] JTS_FCSD_JJ_MAP = {N_JTS_FCSD_JJ,JTS_FCSD_JJ_URL, JTS_FCSD_JJ};
    static {GLOVE_DATA.put(JTS_FCSD_JJ_MAP[0],JTS_FCSD_JJ_MAP);}

    // 九头蛇手套（★） | 响尾蛇(略有磨损)
    public static double[] JTS_XWS_LM = {800, 0.10, 600};
    public static String[] JTS_XWS_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45472&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977351879"};
    public static Object[] JTS_XWS_LM_MAP = {N_JTS_XWS_LM,JTS_XWS_LM_URL, JTS_XWS_LM};
    static {GLOVE_DATA.put(JTS_XWS_LM_MAP[0],JTS_XWS_LM_MAP);}

    // 九头蛇手套（★） | 响尾蛇(久经沙场)
    public static double[] JTS_XWS_JJ = {550, 0.16, 400};
    public static String[] JTS_XWS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45410&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977393624"};
    public static Object[] JTS_XWS_JJ_MAP = {N_JTS_XWS_JJ,JTS_XWS_JJ_URL, JTS_XWS_JJ};
    static {GLOVE_DATA.put(JTS_XWS_JJ_MAP[0],JTS_XWS_JJ_MAP);}

    //九头蛇手套（★） | 红树林(略有磨损)
    public static double[] JTS_HSL_LM = {750, 0.09, 600};
    public static String[] JTS_HSL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45512&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554977448300"};
    public static Object[] JTS_HSL_LM_MAP = {N_JTS_HSL_LM,JTS_HSL_LM_URL, JTS_HSL_LM};
    static {GLOVE_DATA.put(JTS_HSL_LM_MAP[0],JTS_HSL_LM_MAP);}

    //裹手（★） | 套印(久经沙场)
    public static double[] GS_TY_JJ = {1800, 0.25, 1450};
    public static String[] GS_TY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=45578&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560438864957"};
    public static Object[] GS_TY_JJ_MAP = {N_GS_TY_JJ,GS_TY_JJ_URL, GS_TY_JJ};
    static {GLOVE_DATA.put(GS_TY_JJ_MAP[0],GS_TY_JJ_MAP);}
}
