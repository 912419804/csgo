package com.frank.csgo.service;

import android.text.TextUtils;
import com.frank.csgo.bean.Buff;
import com.frank.csgo.bean.goods.BuffGoods;
import com.frank.csgo.bean.goods.DataBean;
import com.frank.csgo.bean.goods.ItemsBean;
import com.frank.csgo.https.JsonCallback;
import com.frank.csgo.price.BuffMap;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;


public class BuffLast extends BuffCheck {
    public BuffLast(BuffService mService) {
        super(mService);
    }

    public void scann() {
        try {
            OkGo.<BuffGoods>get("https://buff.163.com/api/market/goods?game=csgo&page_num=1&quality=unusual&_=1560132460790")
                    .headers("Cookie","csrf_token=00142429c353e41954254fdfc25f52c3a4eb3d12; game=csgo; _ga=GA1.2.1799402828.1560132451; _gid=GA1.2.367471503.1560132451; NTES_YD_SESS=AejiGnj9sfjHiKuhefXCD1e5J_FsifB2TpTK1o3v1PrzBlf2BpU6Vjpf3CTxK34J.0SxJUISIWZ_OrlHLRLvXSFSbmQgqRC3mhY0t4qd1sljwXTuKHWnfly5L365nSWJuSzAA433GgvUjAK7pJ_ECIKqeVMinfrKHUr6owex_waUX7B4YGeZ6sC.EM2_ExtYtBM.1OI5dk61N99HFYKMCJTLfZ_0Y_0aVUccGlDwo79zC; S_INFO=1560132554|0|3&80##|15933602464; P_INFO=15933602464|1560132554|0|netease_buff|00&99|heb&1560132417&netease_buff#heb&130100#10#0#0|&0|null|15933602464; session=1-9ixAY4eYeElxPVpyJ3rFTPS6dVdh3tVlR6JeHXiA41Xl2046279845")
                    .execute(new JsonCallback<BuffGoods>(BuffGoods.class) {
                        @Override
                        public void onSuccess(Response<BuffGoods> response) {
                            BuffGoods body = response.body();
                            DataBean data = body.getData();
                            List<ItemsBean> items = data.getItems();
                            if (items != null && !items.isEmpty()){
                                handleList(items);
                            }
                        }

                        @Override
                        public void onError(Response<BuffGoods> response) {
                        }
                    });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void handleList(List<ItemsBean> list){
        ArrayList<Object[]> goods = new ArrayList<>();
        for (ItemsBean bean : list) {
            Object[] objs = BuffMap.DATA.get(bean.getName());
            if (objs != null){
                goods.add(objs);
            }
        }
//        public static Object[] XL_LZGZ_JJ_MAP = {N_XL_LZGZ_JJ,XL_LZGZ_JJ_URL,XL_LZGZ_JJ};
        if (!goods.isEmpty()){
            for (final Object[] good : goods) {
                final String name = (String) good[0];//名称
                String[] urls = (String[]) good[1];//地址
                final double[] price = (double[]) good[2];//价格
                final String url = urls[0];
                if (TextUtils.isEmpty(url)) return;
                mService.post(new Runnable() {
                    @Override
                    public void run() {
                        OkGo.<Buff>get(url)
                                .execute(new JsonCallback<Buff>(Buff.class) {
                                    @Override
                                    public void onSuccess(Response<Buff> response) {
                                        fillBuff(response, name);
                                        handleDataForBuff(response, price);
                                    }

                                    @Override
                                    public void onError(Response<Buff> response) {

                                    }
                                });
                    }
                });
            }
        }
    }
}
