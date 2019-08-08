package com.frank.csgo;

import java.util.HashMap;

public class Constant {
    public static final String C5_WEAPON = "c5_weapon";
    public static String IGXE_WEAPON = "igxe_weapon";
    public static String BUFF_WEAPON = "buff_weapon";
    public static String STOP = "stop";
    public static String START = "start";

    public static String ZXCC = "崭新出厂";
    public static String LVMS = "略有磨损";
    public static String JJSC = "久经沙场";
    public static String PSBK = "破损不堪";
    public static String ZHLL = "战痕累累";


    public static HashMap<String,Integer> STICKERS = new HashMap<>(3);
    {
        STICKERS.put("全息",1);
        STICKERS.put("闪亮",2);
        STICKERS.put("金色",3);
    }

    public static int TYPE = 1;
    public static int BUFF = 0;
    public static int OPEN = 1;
    public static int LAST = 0;

}