package com.frank.csgo.price;


import java.util.HashMap;

import static com.frank.csgo.price.KnifeName.*;

public class Knife {

    public static HashMap<Object,Object[]> KNIFE_DATA = new HashMap<>();

    // 折叠刀（★） | 深红之网 (略有磨损)
    public static double[] ZDD_SHZW_LM = {1850, 0.12, 1400};
    public static String[] ZDD_SHZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42713&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551061110945"};
    public static Object[] ZDD_SHZW_LM_MAP = {N_ZDD_SHZW_LM,ZDD_SHZW_LM_URL,ZDD_SHZW_LM};
    static {KNIFE_DATA.put(ZDD_SHZW_LM_MAP[0],ZDD_SHZW_LM_MAP);}

    // 折叠刀（★） | 深红之网 (久经沙场)
    public static double[] ZDD_SHZW_JJ = {790, 0.25, 650};
    public static String[] ZDD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42712&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551061367817"};
    public static Object[] ZDD_SHZW_JJMAP = {N_ZDD_SHZW_JJ,ZDD_SHZW_JJ_URL,ZDD_SHZW_JJ};
    static {KNIFE_DATA.put(ZDD_SHZW_JJMAP[0],ZDD_SHZW_JJMAP);}

    // 折叠刀（★） | 致命紫罗兰 (略有磨损)
    public static double[] ZDD_ZMZLL_LM = {};
    public static String[] ZDD_ZMZLL_LM_URL = {};
    public static Object[] ZDD_ZMZLL_LM_MAP = {N_ZDD_ZMZLL_LM,ZDD_ZMZLL_LM_URL,ZDD_ZMZLL_LM};
    static {KNIFE_DATA.put(ZDD_ZMZLL_LM_MAP[0],ZDD_ZMZLL_LM_MAP);}

    // 折叠刀（★） | 传说 (崭新出厂)
    public static double[] ZDD_CS_ZX = {2100, 0.03, 1500};
    public static String[] ZDD_CS_ZX_URL = {""};
    public static Object[] ZDD_CS_ZX_MAP = {N_ZDD_CS_ZX,ZDD_CS_ZX_URL,ZDD_CS_ZX};
    static {KNIFE_DATA.put(ZDD_CS_ZX_MAP[0],ZDD_CS_ZX_MAP);}

    // 折叠刀（★） | 传说 (久经沙场)
    public static double[] ZDD_CS_JJ = {1000, 0.19, 850};
    public static String[] ZDD_CS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42738&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551061756758"};
    public static Object[] ZDD_CS_JJ_MAP = {N_ZDD_CS_JJ,ZDD_CS_JJ_URL,ZDD_CS_JJ};
    static {KNIFE_DATA.put(ZDD_CS_JJ_MAP[0],ZDD_CS_JJ_MAP);}

    //   折叠刀（★） | 自动化 (略有磨损)
    public static double[] ZDD_ZDH_LM = {1020, 0.071, 800};
    public static String[] ZDD_ZDH_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42686&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062070434"};
    public static Object[] ZDD_ZDH_LM_MAP = {N_ZDD_ZDH_LM,ZDD_ZDH_LM_URL,ZDD_ZDH_LM};
    static {KNIFE_DATA.put(ZDD_ZDH_LM_MAP[0],ZDD_ZDH_LM_MAP);}

    //   折叠刀（★） | 自动化 (久经沙场)
    public static double[] ZDD_ZDH_JJ = {740, 0.17, 600};
    public static String[] ZDD_ZDH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42685&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062111330"};
    public static Object[] ZDD_ZDH_JJ_MAP = {N_ZDD_ZDH_JJ,ZDD_ZDH_JJ_URL,ZDD_ZDH_JJ};
    static {KNIFE_DATA.put(ZDD_ZDH_JJ_MAP[0],ZDD_ZDH_JJ_MAP);}

    //   折叠刀（★） | 虎牙 (崭新出厂)
    public static double[] ZDD_HY_ZX = {980, 0.005, 800};
    public static String[] ZDD_HY_ZX_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42768&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062480681"};
    public static Object[] ZDD_HY_ZX_MAP = {N_ZDD_HY_ZX,ZDD_HY_ZX_URL,ZDD_HY_ZX};
    static {KNIFE_DATA.put(ZDD_HY_ZX_MAP[0],ZDD_HY_ZX_MAP);}

    //   刺刀（★） | 传说 (久经沙场)
    public static double[] CD_CS_JJ = {1650, 0.23, 1400};
    public static String[] CD_CS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42406&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062594118"};
    public static Object[] CD_CS_JJ_MAP = {N_CD_CS_JJ,CD_CS_JJ_URL,CD_CS_JJ};
    static {KNIFE_DATA.put(CD_CS_JJ_MAP[0],CD_CS_JJ_MAP);}

    //   刺刀（★） | 自动化 (久经沙场)
    public static double[] CD_ZDH_JJ = {1780, 0.16, 1400};
    public static String[] CD_ZDH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42352&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1551062754150"};
    public static Object[] CD_ZDH_JJ_MAP = {N_CD_ZDH_JJ,CD_ZDH_JJ_URL,CD_ZDH_JJ};
    static {KNIFE_DATA.put(CD_ZDH_JJ_MAP[0],CD_ZDH_JJ_MAP);}

    //   刺刀（★） | 自动化 (略有磨损)
    public static double[] CD_ZDH_LM = {2100, 0.078, 1700};
    public static String[] CD_ZDH_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42353&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554886698933"};
    public static Object[] CD_ZDH_LM_MAP = {N_CD_ZDH_LM,CD_ZDH_LM_URL,CD_ZDH_LM};
    static {KNIFE_DATA.put(CD_ZDH_LM_MAP[0],CD_ZDH_LM_MAP);}

    //   刺刀（★） | 深红之网 (略有磨损)
    public static double[] CD_SHZW_LM = {1800, 0.12, 1300};
    public static String[] CD_SHZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42382&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554886956228"};
    public static Object[] CD_SHZW_LM_MAP = {N_CD_SHZW_LM,CD_SHZW_LM_URL,CD_SHZW_LM};
    static {KNIFE_DATA.put(CD_SHZW_LM_MAP[0],CD_SHZW_LM_MAP);}

    //   刺刀（★） | 深红之网 (久经沙场)
    public static double[] CD_SHZW_JJ = {900, 0.20, 750};
    public static String[] CD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42381&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887089740"};
    public static Object[] CD_SHZW_JJ_MAP = {N_CD_SHZW_JJ,CD_SHZW_JJ_URL,CD_SHZW_JJ};
    static {KNIFE_DATA.put(CD_SHZW_JJ_MAP[0],CD_SHZW_JJ_MAP);}

    //   刺刀（★） | 多普勒 (崭新出厂)
    public static double[] CD_DPL_ZX = {1400, 0.01, 1200};
    public static String[] CD_DPL_ZX_URL = {""};
    public static Object[] CD_DPL_ZX_MAP = {N_ZDD_SHZW_JJ,CD_DPL_ZX_URL,CD_DPL_ZX};
    static {KNIFE_DATA.put(CD_DPL_ZX_MAP[0],CD_DPL_ZX_MAP);}

    //   刺刀（★） | 虎牙 (崭新出厂)
    public static double[] CD_HY_ZX = {1500, 0.005, 1200};
    public static String[] CD_HY_ZX_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42434&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887393940"};
    public static Object[] CD_HY_ZX_MAP = {N_CD_HY_ZX,CD_HY_ZX_URL,CD_HY_ZX};
    static {KNIFE_DATA.put(CD_HY_ZX_MAP[0],CD_HY_ZX_MAP);}

    //    M9 刺刀（★） | 虎牙 (崭新出厂)
    public static double[] M9_HY_ZX = {1720, 0.006, 1450};
    public static String[] M9_HY_ZX_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43136&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887562915"};
    public static Object[] M9_HY_ZX_MAP = {N_M9_HY_ZX,M9_HY_ZX_URL,M9_HY_ZX};
    static {KNIFE_DATA.put(M9_HY_ZX_MAP[0],M9_HY_ZX_MAP);}

    //   M9 刺刀（★） | 自动化 (久经沙场)
    public static double[] M9_ZDH_JJ = {2000, 0.17, 1600};
    public static String[] M9_ZDH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43055&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887726414"};
    public static Object[] M9_ZDH_JJ_MAP = {N_M9_ZDH_JJ,M9_ZDH_JJ_URL,M9_ZDH_JJ};
    static {KNIFE_DATA.put(M9_ZDH_JJ_MAP[0],M9_ZDH_JJ_MAP);}

    //   M9 刺刀（★） | 多普勒 (崭新出厂)
    public static double[] M9_DPL_ZX = {1600, 0.01, 1500};
    public static String[] M9_DPL_ZX_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43055&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887726414"};
    public static Object[] M9_DPL_ZX_MAP = {N_M9_DPL_ZX,M9_DPL_ZX_URL,M9_DPL_ZX};
    static {KNIFE_DATA.put(M9_DPL_ZX_MAP[0],M9_DPL_ZX_MAP);}

    //   M9 刺刀（★） | 传说 (久经沙场)
    public static double[] M9_CS_JJ = {2150, 0.25, 1900};
    public static String[] M9_CS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43107&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554887901126"};
    public static Object[] M9_CS_JJ_MAP = {N_M9_CS_JJ,M9_CS_JJ_URL,M9_CS_JJ};
    static {KNIFE_DATA.put(M9_CS_JJ_MAP[0],M9_CS_JJ_MAP);}

    //   M9 刺刀（★） | 深红之网 (略有磨损)
    public static double[] M9_SHZW_LM = {3800, 0.12, 3000};
    public static String[] M9_SHZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43084&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888007063"};
    public static Object[] M9_SHZW_LM_MAP = {N_M9_SHZW_LM,M9_SHZW_LM_URL,M9_SHZW_LM};
    static {KNIFE_DATA.put(M9_SHZW_LM_MAP[0],M9_SHZW_LM_MAP);}

    //   M9 刺刀（★） | 深红之网 (久经沙场)
    public static double[] M9_SHZW_JJ = {1300, 0.30, 1000};
    public static String[] M9_SHZW_JJ_URL ={"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43083&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888258479"};
    public static Object[] M9_SHZW_JJ_MAP = {N_M9_SHZW_JJ,M9_SHZW_JJ_URL,M9_SHZW_JJ};
    static {KNIFE_DATA.put(M9_SHZW_JJ_MAP[0],M9_SHZW_JJ_MAP);}

    //   M9 刺刀（★） | 北方森林 (久经沙场)
    public static double[] M9_BFSL_JJ = {660, 0.16, 500};
    public static String[] M9_BFSL_JJ_URL = {""};
    public static Object[] M9_BFSL_JJ_MAP = {N_M9_BFSL_JJ,M9_BFSL_JJ_URL,M9_BFSL_JJ};
    static {KNIFE_DATA.put(M9_BFSL_JJ_MAP[0],M9_BFSL_JJ_MAP);}

    //   蝴蝶刀（★）
    public static double[] HDD_WTZ= {2260, 0.10, 1500};
    public static String[] HDD_WTZ_URL= {""};
    public static Object[] HDD_WTZ_MAP = {N_HDD_WTZ,HDD_WTZ_URL,HDD_WTZ};
    static {KNIFE_DATA.put(HDD_WTZ_MAP[0],HDD_WTZ_MAP);}

    //   蝴蝶刀（★） | 深红之网 (久经沙场)
    public static double[] HDD_SHZW_JJ = {1850, 0.25, 1500};
    public static String[] HDD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42547&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888415762"};
    public static Object[] HDD_SHZW_JJ_MAP = {N_HDD_SHZW_JJ,HDD_SHZW_JJ_URL,HDD_SHZW_JJ};
    static {KNIFE_DATA.put(HDD_SHZW_JJ_MAP[0],HDD_SHZW_JJ_MAP);}

    //   蝴蝶刀（★） | 北方森林 (略有磨损)
    public static double[] HDD_BFSL_LM = {1500, 0.09, 1150};
    public static String[] HDD_BFSL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42539&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888538319"};
    public static Object[] HDD_BFSL_LM_MAP = {N_HDD_BFSL_LM,HDD_BFSL_LM_URL,HDD_BFSL_LM};
    static {KNIFE_DATA.put(HDD_BFSL_LM_MAP[0],HDD_BFSL_LM_MAP);}

    //   蝴蝶刀（★） | 北方森林 (久经沙场)
    public static double[] HDD_BFSL_JJ = {930, 0.20, 800};
    public static String[] HDD_BFSL_JJ_URL = {""};
    public static Object[] HDD_BFSL_JJ_MAP = {N_HDD_BFSL_JJ,HDD_BFSL_JJ_URL,HDD_BFSL_JJ};
    static {KNIFE_DATA.put(HDD_BFSL_JJ_MAP[0],HDD_BFSL_JJ_MAP);}

    //   蝴蝶刀（★） | 森林DDPAT (略有磨损)
    public static double[] HDD_SLD_LM = {1200, 0.09, 920};
    public static String[] HDD_SLD_LM_URL = {""};
    public static Object[] HDD_SLD_LM_MAP = {N_HDD_SLD_LM,HDD_SLD_LM_URL,HDD_SLD_LM};
    static {KNIFE_DATA.put(HDD_SLD_LM_MAP[0],HDD_SLD_LM_MAP);}

    //爪子刀 无涂装
    public static double[] ZZD_WTZ = {1650, 0.09, 1400};
    public static String[] ZZD_WTZ_URL = {""};
    public static Object[] ZZD_WTZ_MAP = {N_ZZD_WTZ,ZZD_WTZ_URL,ZZD_WTZ};
    static {KNIFE_DATA.put(ZZD_WTZ_MAP[0],ZZD_WTZ_MAP);}

    //爪子刀（★） | 自动化 (久经沙场)
    public static double[] ZZD_ZDH_JJ = {2500, 0.20, 2200};
    public static String[] ZZD_ZDH_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42964&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888716058"};
    public static Object[] ZZD_ZDH_JJ_MAP = {N_ZZD_ZDH_JJ,ZZD_ZDH_JJ_URL,ZZD_ZDH_JJ};
    static {KNIFE_DATA.put(ZZD_ZDH_JJ_MAP[0],ZZD_ZDH_JJ_MAP);}

    //爪子刀（★） | 虎牙 (崭新出厂)
    public static double[] ZZD_HY_ZX = {2700, 0.005, 2200};
    public static String[] ZZD_HY_ZX_URL = {""};
    public static Object[] ZZD_HY_ZX_MAP = {N_ZZD_HY_ZX,ZZD_HY_ZX_URL,ZZD_HY_ZX};
    static {KNIFE_DATA.put(ZZD_HY_ZX_MAP[0],ZZD_HY_ZX_MAP);}

    //爪子刀（★） | 传说 (久经沙场)
    public static double[] ZZD_CS_JJ = {2050, 0.21, 1800};
    public static String[] ZZD_CS_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42964&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888716058"};
    public static Object[] ZZD_CS_JJ_MAP = {N_ZZD_CS_JJ,ZZD_CS_JJ_URL,ZZD_CS_JJ};
    static {KNIFE_DATA.put(ZZD_CS_JJ_MAP[0],ZZD_CS_JJ_MAP);}

    //爪子刀（★） | 深红之网 (久经沙场)
    public static double[] ZZD_SHZW_JJ = {1700, 0.22, 1450};
    public static String[] ZZD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42990&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554888998839"};
    public static Object[] ZZD_SHZW_JJ_MAP = {N_ZZD_SHZW_JJ,ZZD_SHZW_JJ_URL,ZZD_SHZW_JJ};
    static {KNIFE_DATA.put(ZZD_SHZW_JJ_MAP[0],ZZD_SHZW_JJ_MAP);}

    //爪子刀（★） | 森林 DDPAT (略有磨损)
    public static double[] ZZD_SLD_LM = {1100, 0.08, 900};
    public static String[] ZZD_SLD_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43004&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889133184"};
    public static Object[] ZZD_SLD_LM_MAP = {N_ZZD_SLD_LM,ZZD_SLD_LM_URL,ZZD_SLD_LM};
    static {KNIFE_DATA.put(ZZD_SLD_LM_MAP[0],ZZD_SLD_LM_MAP);}

    //爪子刀（★） | 森林 DDPAT (久经沙场)
    public static double[] ZZD_SLD_JJ = {900, 0.16, 600};
    public static String[] ZZD_SLD_JJ_URL = {""};
    public static Object[] ZZD_SLD_JJ_MAP = {N_ZZD_SLD_JJ,ZZD_SLD_JJ_URL,ZZD_SLD_JJ};
    static {KNIFE_DATA.put(ZZD_SLD_JJ_MAP[0],ZZD_SLD_JJ_MAP);}

    //爪子刀（★） | 北方森林 (略有磨损)
    public static double[] ZZD_BFSL_LM = {1100, 0.08, 900};
    public static String[] ZZD_BFSL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42978&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889247843"};
    public static Object[] ZZD_BFSL_LM_MAP = {N_ZZD_BFSL_LM,ZZD_BFSL_LM_URL,ZZD_BFSL_LM};
    static {KNIFE_DATA.put(ZZD_BFSL_LM_MAP[0],ZZD_BFSL_LM_MAP);}

    //爪子刀（★） | 北方森林 (久经沙场)
    public static double[] ZZD_BFSL_JJ = {860, 0.17, 750};
    public static String[] ZZD_BFSL_JJ_URL = {""};
    public static Object[] ZZD_BFSL_JJ_MAP = {N_ZZD_BFSL_JJ,ZZD_BFSL_JJ_URL,ZZD_BFSL_JJ};
    static {KNIFE_DATA.put(ZZD_BFSL_JJ_MAP[0],ZZD_BFSL_JJ_MAP);}

    //猎杀者匕首（★）
    public static double[] LSZ_WTZ = {550, 0.16, 500};
    public static String[] LSZ_WTZ_URL = {""};
    public static Object[] LSZ_WTZ_URL_MAP = {N_LSZ_WTZ,LSZ_WTZ_URL,LSZ_WTZ};
    static {KNIFE_DATA.put(LSZ_WTZ_URL_MAP[0],LSZ_WTZ_URL_MAP);}

    //猎杀者匕首（★） | 渐变大理石 (崭新出厂)
    public static double[] LSZ_JBDLS_ZX = {1050, 0.01, 950};
    public static String[] LSZ_JBDLS_ZX_URL = {""};
    public static Object[] LSZ_JBDLS_ZX_MAP = {N_LSZ_JBDLS_ZX,LSZ_JBDLS_ZX_URL,LSZ_JBDLS_ZX};
    static {KNIFE_DATA.put(LSZ_JBDLS_ZX_MAP[0],LSZ_JBDLS_ZX_MAP);}

    //猎杀者匕首（★） | 多普勒 (崭新出厂)
    public static double[] LSZ_DPL_ZX= {1050, 0.01, 800};
    public static String[] LSZ_DPL_ZX_URL= {""};
    public static Object[] LSZ_DPL_ZX_MAP = {N_ZDD_SHZW_JJ,LSZ_DPL_ZX_URL,LSZ_DPL_ZX};
    static {KNIFE_DATA.put(LSZ_DPL_ZX_MAP[0],LSZ_DPL_ZX_MAP);}

    //猎杀者匕首（★） | 深红之网 (略有磨损)
    public static double[] LSZ_SHZW_LM = {1300, 0.11, 850};
    public static String[] LSZ_SHZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42910&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889348366"};
    public static Object[] LSZ_SHZW_LM_MAP = {N_LSZ_SHZW_LM,LSZ_SHZW_LM_URL,LSZ_SHZW_LM};
    static {KNIFE_DATA.put(LSZ_SHZW_LM_MAP[0],LSZ_SHZW_LM_MAP);}

    //猎杀者匕首（★） | 深红之网 (久经沙场)
    public static double[] LSZ_SHZW_JJ = {720, 0.18, 500};
    public static String[] LSZ_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42909&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889412405"};
    public static Object[] LSZ_SHZW_JJ_MAP = {N_LSZ_SHZW_JJ,LSZ_SHZW_JJ_URL,LSZ_SHZW_JJ};
    static {KNIFE_DATA.put(LSZ_SHZW_JJ_MAP[0],LSZ_SHZW_JJ_MAP);}

    //猎杀者匕首（★） | 渐变之色 (崭新出厂)
    public static double[] LSZ_JBZS_ZX = {620, 0.01, 500};
    public static String[] LSZ_JBZS_ZX_URL = {""};
    public static Object[] LSZ_JBZS_ZX_MAP = {N_LSZ_JBZS_ZX,LSZ_JBZS_ZX_URL,LSZ_JBZS_ZX};
    static {KNIFE_DATA.put(LSZ_JBZS_ZX_MAP[0],LSZ_JBZS_ZX_MAP);}

    //猎杀者匕首（★） | 虎牙 (崭新出厂)
    public static double[] LSZ_HY_ZX = {820, 0.004, 740};
    public static String[] LSZ_HY_ZX_URL = {""};
    public static Object[] LSZ_HY_ZX_MAP = {N_LSZ_HY_ZX,LSZ_HY_ZX_URL,LSZ_HY_ZX};
    static {KNIFE_DATA.put(LSZ_HY_ZX_MAP[0],LSZ_HY_ZX_MAP);}

    //熊刀（★）
    public static double[] XD_WTZ = {1300, 0.10, 1050};
    public static String[] XD_WTZ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759460&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889773265"};
    public static Object[] XD_WTZ_MAP = {N_XD_WTZ,XD_WTZ_URL,XD_WTZ};
    static {KNIFE_DATA.put(XD_WTZ_MAP[0],XD_WTZ_MAP);}

    //熊刀（★） | 深红之网 (久经沙场)
    public static double[] XD_SHZW_JJ = {1600, 0.22, 1300};
    public static String[] XD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759405&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889684277"};
    public static Object[] XD_SHZW_JJ_MAP = {N_XD_SHZW_JJ,XD_SHZW_JJ_URL,XD_SHZW_JJ};
    static {KNIFE_DATA.put(XD_SHZW_JJ_MAP[0],XD_SHZW_JJ_MAP);}

    //短剑（★） | 深红之网 (略有磨损)
    public static double[] DJ_SHZW_LM = {1750, 0.10, 1400};
    public static String[] DJ_SHZW_LM_URL = {"0"};
    public static Object[] DJ_SHZW_LM_MAP = {N_DJ_SHZW_LM,DJ_SHZW_LM_URL,DJ_SHZW_LM};
    static {KNIFE_DATA.put(DJ_SHZW_LM_MAP[0],DJ_SHZW_LM_MAP);}

    //短剑（★） | 深红之网 (久经沙场)
    public static double[] DJ_SHZW_JJ = {900, 0.21, 740};
    public static String[] DJ_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=759454&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554889919282"};
    public static Object[] DJ_SHZW_JJ_MAP = {N_DJ_SHZW_JJ,DJ_SHZW_JJ_URL,DJ_SHZW_JJ};
    static {KNIFE_DATA.put(DJ_SHZW_JJ_MAP[0],DJ_SHZW_JJ_MAP);}

    //锯齿爪刀（★）
    public static double[] JCZD_WTZ= {1600, 0.10, 1300};
    public static String[] JCZD_WTZ_URL= {""};
    public static Object[] JCZD_WTZ_MAP = {N_JCZD_WTZ,JCZD_WTZ_URL,JCZD_WTZ};
    static {KNIFE_DATA.put(JCZD_WTZ_MAP[0],JCZD_WTZ_MAP);}

    //锯齿爪刀（★）|深红之网 (久经沙场)
    public static double[] JCZD_SHZW_JJ = {1220, 0.24, 1050};
    public static String[] JCZD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=SHZWgo&goods_id=759327&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1554890113928"};
    public static Object[] JCZD_SHZW_JJ_MAP = {N_JCZD_SHZW_JJ,JCZD_SHZW_JJ_URL,JCZD_SHZW_JJ};
    static {KNIFE_DATA.put(JCZD_SHZW_JJ_MAP[0],JCZD_SHZW_JJ_MAP);}

    //锯齿爪刀（★） | 致命紫罗兰 (略有磨损)
    public static double[] JCZD_ZMZLL_LM= {1500, 0.11, 1250};
    public static String[] JCZD_ZMZLL_LM_URL= {""};
    public static Object[] JCZD_ZMZLL_LM_MAP = {N_JCZD_ZMZLL_LM,JCZD_ZMZLL_LM_URL,JCZD_ZMZLL_LM};
    static {KNIFE_DATA.put(JCZD_ZMZLL_LM_MAP[0],JCZD_ZMZLL_LM_MAP);}
    
    //锯齿爪刀（★） | 致命紫罗兰 (久经沙场)
    public static double[] JCZD_ZMZLL_JJ= {1000, 0.19, 800};
    public static String[] JCZD_ZMZLL_JJ_URL= {""};
    public static Object[] JCZD_ZMZLL_JJ_MAP = {N_JCZD_ZMZLL_JJ,JCZD_ZMZLL_JJ_URL,JCZD_ZMZLL_JJ};
    static {KNIFE_DATA.put(JCZD_ZMZLL_JJ_MAP[0],JCZD_ZMZLL_JJ_MAP);}

    //蝴蝶刀（★） | 致命紫罗兰 (久经沙场)
    public static double[] HDD_ZMZLL_JJ = {1420, 0.25, 1150};
    public static String[] HDD_ZMZLL_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42590&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641890129"};
    public static Object[] HDD_ZMZLL_JJ_MAP = {N_HDD_ZMZLL_JJ,HDD_ZMZLL_JJ_URL,HDD_ZMZLL_JJ};
    static {KNIFE_DATA.put(HDD_ZMZLL_JJ_MAP[0],HDD_ZMZLL_JJ_MAP);}

    //刺刀（★） | 致命紫罗兰 (略有磨损)
    public static double[] CD_ZMZLL_LM = {990, 0.10, 800};
    public static String[] CD_ZMZLL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42439&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641943624"};
    public static Object[] CD_ZMZLL_LM_MAP = {N_CD_ZMZLL_LM,CD_ZMZLL_LM_URL,CD_ZMZLL_LM};
    static {KNIFE_DATA.put(CD_ZMZLL_LM_MAP[0],CD_ZMZLL_LM_MAP);}

    //M9刺刀（★） | 致命紫罗兰 (久经沙场)
    public static double[] M9_ZMZLL_JJ = {800, 0.22, 650};
    public static String[] M9_ZMZLL_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43139&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641968399"};
    public static Object[] M9_ZMZLL_JJ_MAP = {N_M9_ZMZLL_JJ,M9_ZMZLL_JJ_URL,M9_ZMZLL_JJ};
    static {KNIFE_DATA.put(M9_ZMZLL_JJ_MAP[0],M9_ZMZLL_JJ_MAP);}

    //爪子刀（★） | 致命紫罗兰 (久经沙场)
    public static double[] ZZD_ZMZLL_JJ = {1350, 0.17, 1100};
    public static String[] ZZD_ZMZLL_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43045&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559642010093"};
    public static Object[] ZZD_ZMZLL_JJ_MAP = {N_ZZD_ZMZLL_JJ,ZZD_ZMZLL_JJ_URL,ZZD_ZMZLL_JJ};
    static {KNIFE_DATA.put(ZZD_ZMZLL_JJ_MAP[0],ZZD_ZMZLL_JJ_MAP);}

    //爪子刀（★） | 致命紫罗兰 (略有磨损)
    public static double[] ZZD_ZMZLL_LM = {1900, 0.11, 1500};
    public static String[] ZZD_ZMZLL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43046&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559641997385"};
    public static Object[] ZZD_ZMZLL_LM_MAP = {N_ZZD_ZMZLL_LM,ZZD_ZMZLL_LM_URL,ZZD_ZMZLL_LM};
    static {KNIFE_DATA.put(ZZD_ZMZLL_LM_MAP[0],ZZD_ZMZLL_LM_MAP);}

    //熊刀（★） | 致命紫罗兰 (久经沙场)
    public static double[] XD_ZMZLL_JJ = {890, 0.21, 780};
    public static String[] XD_ZMZLL_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=769504&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559642034251"};
    public static Object[] XD_ZMZLL_JJ_MAP = {N_XD_ZMZLL_JJ,XD_ZMZLL_JJ_URL,XD_ZMZLL_JJ};
    static {KNIFE_DATA.put(XD_ZMZLL_JJ_MAP[0],ZDD_SHZW_LM_MAP);}

    //猎杀者匕首（★） | 致命紫罗兰 (略有磨损)
    public static double[] LSZ_ZMZLL_LM = {600, 0.09, 500};
    public static String[] LSZ_ZMZLL_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42954&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1559642054243"};
    public static Object[] LSZ_ZMZLL_LM_MAP = {N_LSZ_ZMZLL_LM,LSZ_ZMZLL_LM_URL,LSZ_ZMZLL_LM};
    static {KNIFE_DATA.put(LSZ_ZMZLL_LM_MAP[0],LSZ_ZMZLL_LM_MAP);}

    //   蝴蝶刀（★） | 噩梦之夜 (略有磨损)
    public static double[] HDD_EMZY_LM = {1900, 0.11, 1550};
    public static String[] HDD_EMZY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42567&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560439176245"};
    public static Object[] HDD_EMZY_LM_MAP = {N_HDD_EMZY_LM,HDD_EMZY_LM_URL,HDD_EMZY_LM};
    static {KNIFE_DATA.put(HDD_EMZY_LM_MAP[0],HDD_EMZY_LM_MAP);}

    //   蝴蝶刀（★） | 噩梦之夜 (久经沙场)
    public static double[] HDD_EMZY_JJ = {1250, 0.21, 980};
    public static String[] HDD_EMZY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42566&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560439071937"};
    public static Object[] HDD_EMZY_JJ_MAP = {N_HDD_EMZY_JJ,HDD_EMZY_JJ_URL,HDD_EMZY_JJ};
    static {KNIFE_DATA.put(HDD_EMZY_JJ_MAP[0],HDD_EMZY_JJ_MAP);}

    //M9刺刀（★） | 噩梦之夜 (略有磨损)
    public static double[] M9_EMZY_LM = {1100, 0.10, 900};
    public static String[] M9_EMZY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43115&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560439610681"};
    public static Object[] M9_EMZY_LM_MAP = {N_M9_EMZY_LM,M9_EMZY_LM_URL,M9_EMZY_LM};
    static {KNIFE_DATA.put(M9_EMZY_LM_MAP[0],M9_EMZY_LM_MAP);}

    //M9刺刀（★） | 噩梦之夜 (久经沙场)
    public static double[] M9_EMZY_JJ = {870, 0.20, 700};
    public static String[] M9_EMZY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43114&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560439300753"};
    public static Object[] M9_EMZY_JJ_MAP = {N_M9_EMZY_JJ,M9_EMZY_JJ_URL,M9_EMZY_JJ};
    static {KNIFE_DATA.put(M9_EMZY_JJ_MAP[0],M9_EMZY_JJ_MAP);}

    //爪子刀（★） | 噩梦之夜 (久经沙场)
    public static double[] ZZD_EMZY_JJ = {1100, 0.1, 900};
    public static String[] ZZD_EMZY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43020&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560439811842"};
    public static Object[] ZZD_EMZY_JJ_MAP = {N_ZZD_EMZY_JJ,ZZD_EMZY_JJ_URL,ZZD_EMZY_JJ};
    static {KNIFE_DATA.put(ZZD_EMZY_JJ_MAP[0],ZZD_EMZY_JJ_MAP);}

    //爪子刀（★） | 噩梦之夜 (略有磨损)
    public static double[] ZZD_EMZY_LM = {1500, 0.09, 1200};
    public static String[] ZZD_EMZY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=43021&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560439956609"};
    public static Object[] ZZD_EMZY_LM_MAP = {N_ZZD_EMZY_LM,ZZD_EMZY_LM_URL,ZZD_EMZY_LM};
    static {KNIFE_DATA.put(ZZD_EMZY_LM_MAP[0],ZZD_EMZY_LM_MAP);}

    //刺刀（★） | 噩梦之夜 (略有磨损)
    public static double[] CD_EMZY_LM = {950, 0.09, 500};
    public static String[] CD_EMZY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42413&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560440675325"};
    public static Object[] CD_EMZY_LM_MAP = {N_CD_EMZY_LM,CD_EMZY_LM_URL,CD_EMZY_LM};
    static {KNIFE_DATA.put(CD_EMZY_LM_MAP[0],CD_EMZY_LM_MAP);}

    //刺刀（★） | 噩梦之夜 (久经沙场)
    public static double[] CD_EMZY_JJ = {680, 0.16, 450};
    public static String[] CD_EMZY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42412&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560440731025"};
    public static Object[] CD_EMZY_JJ_MAP = {N_CD_EMZY_JJ,CD_EMZY_JJ_URL,CD_EMZY_JJ};
    static {KNIFE_DATA.put(CD_EMZY_JJ_MAP[0],CD_EMZY_JJ_MAP);}

    //猎杀者匕首（★） | 噩梦之夜 (略有磨损)
    public static double[] LSZ_EMZY_LM = {700, 0.09, 500};
    public static String[] LSZ_EMZY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42930&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560441153794"};
    public static Object[] LSZ_EMZY_LM_MAP = {N_LSZ_EMZY_LM,LSZ_EMZY_LM_URL,LSZ_EMZY_LM};
    static {KNIFE_DATA.put(LSZ_EMZY_LM_MAP[0],LSZ_EMZY_LM_MAP);}

    //猎杀者匕首（★） | 噩梦之夜 (久经沙场)
    public static double[] LSZ_EMZY_JJ = {450, 0.16, 350};
    public static String[] LSZ_EMZY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42929&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560441140080"};
    public static Object[] LSZ_EMZY_JJ_MAP = {N_LSZ_EMZY_JJ,LSZ_EMZY_JJ_URL,LSZ_EMZY_JJ};
    static {KNIFE_DATA.put(LSZ_EMZY_JJ_MAP[0],LSZ_EMZY_JJ_MAP);}

    //折叠刀（★） | 噩梦之夜 (略有磨损)
    public static double[] ZDD_EMZY_LM = {860, 0.09, 600};
    public static String[] ZDD_EMZY_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42746&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560441614082"};
    public static Object[] ZDD_EMZY_LM_MAP = {N_ZDD_EMZY_LM,ZDD_EMZY_LM_URL,ZDD_EMZY_LM};
    static {KNIFE_DATA.put(ZDD_EMZY_LM_MAP[0],ZDD_EMZY_LM_MAP);}

    //折叠刀（★） | 噩梦之夜 (久经沙场)
    public static double[] ZDD_EMZY_JJ = {470, 0.17, 400};
    public static String[] ZDD_EMZY_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42745&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560441660097"};
    public static Object[] ZDD_EMZY_JJ_MAP = {N_ZDD_EMZY_JJ,ZDD_EMZY_JJ_URL,ZDD_EMZY_JJ};
    static {KNIFE_DATA.put(ZDD_EMZY_JJ_MAP[0],ZDD_EMZY_JJ_MAP);}

    //弯刀（★） | 深红之网 (略有磨损)
    public static double[] WD_SHZW_LM = {530, 0.17, 400};
    public static String[] WD_SHZW_LM_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42745&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560441660097"};
    public static Object[] WD_SHZW_LM_MAP = {N_ZDD_EMZY_JJ,ZDD_EMZY_JJ_URL,ZDD_EMZY_JJ};
    static {KNIFE_DATA.put(ZDD_EMZY_JJ_MAP[0],ZDD_EMZY_JJ_MAP);}

    //弯刀（★） | 深红之网 (久经沙场)
    public static double[] WD_SHZW_JJ = {530, 0.17, 400};
    public static String[] WD_SHZW_JJ_URL = {"https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=42745&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1560441660097"};
    public static Object[] WD_SHZW_JJ_MAP = {N_ZDD_EMZY_JJ,ZDD_EMZY_JJ_URL,ZDD_EMZY_JJ};
    static {KNIFE_DATA.put(ZDD_EMZY_JJ_MAP[0],ZDD_EMZY_JJ_MAP);}
}
