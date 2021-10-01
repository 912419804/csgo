package com.frank.csgo.service;

import android.text.TextUtils;

import com.frank.csgo.Constant;
import com.frank.csgo.bean.Igxe;
import com.frank.csgo.https.JsonCallback;
import com.frank.csgo.utils.ThreadUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;

public class IgxePicker extends IgxeCheck {
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


    public static ArrayList<String> IP_MSD = new ArrayList<>();//磨损度

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

        IP_MSD.add(Constant.ZXCC);
        IP_MSD.add(Constant.LYMS);
        IP_MSD.add(Constant.JJSC);
        IP_MSD.add(Constant.PSBK);
        IP_MSD.add(Constant.ZHLL);

    }

    public static ArrayList<String>[] WEAPONS = new ArrayList[]{IP_BS, IP_ST, IP_BQ, IP_SQ, IP_CFQ, IP_XDQ};

    public static URL IGXE_URL;

    static {
        try {
            IGXE_URL = new URL("https://www.igxe.cn/csgo/730?is_buying=0&is_stattrak%5B%5D=0&is_stattrak%5B%5D=0&sort=3&ctg_id=0&type_id=0&page_no=2&page_size=20&rarity_id=0&exterior_id=0&quality_id=0&capsule_id=0&is_suit=0&_t=1632921435062");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                Document doc = Jsoup.parse(IGXE_URL, 3000);
                Elements dataList = doc.getElementsByClass("dataList");
                Elements aaa = dataList.get(0).getElementsByTag("a");
                int x = 0;
                for (Element a : aaa) {
                    if (x == 10) return;
                    String href = a.attr("href");
                    //获取名称
                    String name = a.getElementsByClass("name").get(0).attr("title");
                    String xjd = checkNewOld(IP_MSD, name);//获取磨损度
                    if (TextUtils.isEmpty(xjd)) {
                        continue;
                    }//没有磨损度就舍弃
                    Element eee = a.getElementsByClass("price").get(0);
                    double price = Double.valueOf(eee.child(1).html() + eee.child(2).html());
                    if (price<6)continue;//低价过滤
                    int sort = check(name);//检查类别
                    if (sort > 0) {
                        int index = href.lastIndexOf("/");
                        //获取id
                        String id = href.substring(index + 1);

                        getWeapon(xjd, sort, id, price);
                    }
                    x++;
                }

            } catch (Exception e) {

            }
        }
    };
    public IgxePicker(IgxeService service) {
        super(service);
    }

    public void start() {
        ThreadUtils.THREAD.execute(runnable);
    }

    public int check(String name) {
        for (int i = 0; i < WEAPONS.length; i++) {
            int sort = checkSort(WEAPONS[i], name, i + 1);
            if (sort > 0) {
                return sort;
            }
        }
        return -1;
    }

    public int checkSort(ArrayList<String> list, String name, int sort) {
        for (String bs : list) {
            if (name.contains(bs)) {
                return sort;
            }
        }
        return -1;
    }

    public String checkNewOld(ArrayList<String> list, String name) {
        for (String bs : list) {
            if (name.contains(bs)) {
                return bs;
            }
        }
        return "";
    }

    public void getWeapon(String xdj, int sort, String id, double price) {
        switch (sort) {
            case IP_BS_SORT://匕首
                getDataBs(xdj, id, price);
                break;
            case IP_ST_SORT://手套
                getDataSt(xdj, id, price);
                break;
            case IP_BQ_SORT://步枪
                getDataBq(xdj, id, price);
                break;
            case IP_SQ_SORT://手枪
                getDataSq(xdj, id, price);
                break;
            case IP_CFQ_SORT://冲锋枪
                getDataCfq(xdj, id, price);
                break;
            case IP_XDQ_SORT://霰弹枪 重武器
                getDataXdq(xdj, id, price);
                break;
        }
    }

    //匕首
    public void getDataBs(String xjd, String id, double price) {
        switch (xjd) {
            case Constant.ZXCC:
                break;
            case Constant.LYMS:
                getData(id, 0.09);
                break;
            case Constant.JJSC:
                if (price < 1000) {
                    getData(id, 0.16);
                } else {
                    getData(id, 0.27);
                }
                break;
            case Constant.PSBK:
                break;
            case Constant.ZHLL:
                break;
        }
    }

    //手套
    public void getDataSt(String xjd, String id, double price) {
        switch (xjd) {
            case Constant.ZXCC:
                break;
            case Constant.LYMS:
                getData(id, 0.09);
                break;
            case Constant.JJSC:
                if (price < 1000) {
                    getData(id, 0.17);
                } else {
                    getData(id, 0.27);
                }
                break;
            case Constant.PSBK:
                getData(id, 0.46);
                break;
            case Constant.ZHLL:
                getData(id, 0.39);
                break;
        }
    }

    //步枪
    public void getDataBq(String xjd, String id, double price) {
        switch (xjd) {
            case Constant.ZXCC:
                if (price < 1000) {
                    getData(id, 0.02);
                } else {
                    getData(id, 0.04);
                }
                break;
            case Constant.LYMS:
                if (price < 100) {
                    getData(id, 0.08);
                }else {
                    getData(id, 0.09);
                }
                
                break;
            case Constant.JJSC:
                if (price < 1000) {
                    getData(id, 0.16);
                } else {
                    getData(id, 0.24);
                }
                break;
            case Constant.PSBK:
                getData(id, 0.39);
                break;
            case Constant.ZHLL:
                break;
        }
    }

    //手枪
    public void getDataSq(String xjd, String id, double price) {
        switch (xjd) {
            case Constant.ZXCC:
                if (price < 1000) {
                    getData(id, 0.02);
                } else {
                    getData(id, 0.03);
                }
                break;
            case Constant.LYMS:
                getData(id, 0.09);
                break;
            case Constant.JJSC:
                if (price < 1000) {
                    getData(id, 0.16);
                } else {
                    getData(id, 0.24);
                }
                break;
            case Constant.PSBK:
                break;
            case Constant.ZHLL:
                break;
        }
    }

    //冲锋枪
    public void getDataCfq(String xjd, String id, double price) {
        switch (xjd) {
            case Constant.ZXCC:
                if (price < 1000) {
                    getData(id, 0.01);
                } else {
                    getData(id, 0.02);
                }
                break;
            case Constant.LYMS:
                getData(id, 0.08);
                break;
            case Constant.JJSC:
                getData(id, 0.16);
                break;
            case Constant.PSBK:
                break;
            case Constant.ZHLL:
                break;
        }
    }

    //霰弹枪 重武器
    public void getDataXdq(String xjd, String id, double price) {
        switch (xjd) {
            case Constant.ZXCC:
                if (price < 1000) {
                    getData(id, 0.01);
                } else {
                    getData(id, 0.02);
                }
                break;
            case Constant.LYMS:
                getData(id, 0.08);
                break;
            case Constant.JJSC:
                getData(id, 0.16);
                break;
            case Constant.PSBK:
                break;
            case Constant.ZHLL:
                break;
        }
    }

    public void getData(String id, double ms) {
        OkGo.<Igxe>get("https://www.igxe.cn/product/trade/730/" + id)
                .execute(new JsonBc<Igxe>(Igxe.class, ms));
    }

    class JsonBc<T> extends JsonCallback<T> {
        double ms = 0;

        public JsonBc(Type type, double ms) {
            super(type);
            this.ms = ms;
        }

        public JsonBc(Class clazz, double ms,int tag) {
            super(clazz);
            this.ms = ms;
        }

        @Override
        public void onSuccess(Response response) {
            handleDataIgxe(response, this.ms);
        }

        @Override
        public void onError(Response<T> response) {
            super.onError(response);
        }
    }
}
