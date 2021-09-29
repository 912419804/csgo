package com.frank.csgo.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.ArrayList;

public class IgxePicker {
    public static ArrayList<String> IP_BS = new ArrayList<>();//匕首
    public static ArrayList<String> IP_ST = new ArrayList<>();//手套
    public static ArrayList<String> IP_BQ = new ArrayList<>();//步枪
    public static ArrayList<String> IP_SQ = new ArrayList<>();//手枪
    public static ArrayList<String> IP_CFQ = new ArrayList<>();//微型冲锋枪
    public static ArrayList<String> IP_XDQ = new ArrayList<>();//霰弹枪

    public static final int IP_BS_SORT = 1;//匕首
    public static final int IP_ST_SORT = 2;//手套
    public static final int IP_BQ_SORT = 3;//步枪
    public static final int IP_SQ_SORT = 4;//手枪
    public static final int IP_CFQ_SORT = 5;//微型冲锋枪
    public static final int IP_XDQ_SORT = 6;//霰弹枪
    static {
        IP_BS.add("刀");
        IP_BS.add("匕首");
        IP_BS.add("短剑");

        IP_ST.add("手套");
        IP_ST.add("裹手");

        IP_BQ.add("M4A");
        IP_BQ.add("AK-47");
        IP_BQ.add("AWP");
        IP_BQ.add("AUG");
        IP_BQ.add("法玛斯");
        IP_BQ.add("加利尔");
        IP_BQ.add("SG");
        IP_BQ.add("SCAR");
        IP_BQ.add("G3S");

        IP_SQ.add("沙漠之鹰");
        IP_SQ.add("USP");
        IP_SQ.add("P250");
        IP_SQ.add("P2000");
        IP_SQ.add("格洛克");
        IP_SQ.add("FN57");
        IP_SQ.add("CZ75");

        IP_SQ.add("Tec-9");
        IP_SQ.add("R8");
        IP_SQ.add("双持贝瑞塔");

        IP_CFQ.add("MAC");
        IP_CFQ.add("MP");
        IP_CFQ.add("PP");
        IP_CFQ.add("P90P");

        IP_XDQ.add("新星");
        IP_XDQ.add("XM");
        IP_XDQ.add("MAG");
        IP_XDQ.add("截短");
        IP_XDQ.add("M249");
        IP_XDQ.add("内格夫");

    }
    public static ArrayList<String>[] WEAPONS = new ArrayList[]{IP_BS,IP_ST,IP_BQ,IP_SQ,IP_CFQ,IP_XDQ};

    public void start(){
        try {
            URL url = new URL("https://www.igxe.cn/csgo/730?is_buying=0&is_stattrak%5B%5D=0&is_stattrak%5B%5D=0&sort=3&ctg_id=0&type_id=0&page_no=2&page_size=20&rarity_id=0&exterior_id=0&quality_id=0&capsule_id=0&is_suit=0&_t=1632921435062");
            Document doc = Jsoup.parse(url, 3000);
            Elements dataList = doc.getElementsByClass("dataList");
            Elements aaa = dataList.get(0).getElementsByTag("a");
            for(Element a : aaa){
                String href = a.attr("href");
                //获取名称
                String name = a.getElementsByClass("name").get(0).attr("title");
                int sort = check(name);
                if (sort>0){
                    int index = href.lastIndexOf("/");
                    //获取id
                    String id = href.substring(index+1);
                    switch (sort){
                        case IP_BS_SORT:
                            break;
                        case IP_ST_SORT:
                            break;
                        case IP_BQ_SORT:
                            break;
                        case IP_SQ_SORT:
                            break;
                        case IP_CFQ_SORT:
                            break;
                        case IP_XDQ_SORT:
                            break;
                    }
                }
            }

        }catch (Exception e){

        }
    }
    public int  check(String name){
        for (int i = 0; i < WEAPONS.length; i++) {
            int sort = checkStr(WEAPONS[i],name,i+1);
            if(sort>0){
                return sort;
            }
        }
        return -1;
    }
    public int checkStr(ArrayList<String>list,String name,int sort){
        for (String bs : list) {
            if(name.contains(bs)){
                return sort;
            }
        }
        return -1;
    }
    public void getWeapon(int sort,String id){

    }
}
