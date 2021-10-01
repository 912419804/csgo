package com.frank.csgo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.frank.csgo.bean.goods.BuffGoods;
import com.frank.csgo.bean.goods.DataBean;
import com.frank.csgo.bean.goods.ItemsBean;
import com.frank.csgo.https.JsonCallback;
import com.frank.csgo.service.BuffService;
import com.frank.csgo.service.C5Service;
import com.frank.csgo.service.IgxeService;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private Intent igxeService;
    private Intent c5Service;
    private Intent buffService;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(BuildConfig.APP_NAME);
        tabs = findViewById(R.id.tabs);
        if (BuildConfig.APP_NAME.equals(Constant._IGC5)){
            fragments.add(new IgxeFragment());
            fragments.add(new C5Fragment());
            tabs.addTab(tabs.newTab().setText("IGXE"));
            tabs.addTab(tabs.newTab().setText("C5"));
        }else if (BuildConfig.APP_NAME.equals(Constant._BUFF)){
            fragments.add(new BuffFragment());
            tabs.addTab(tabs.newTab().setText("BUFF"));
        }else {
            fragments.add(new IgxeFragment());
            fragments.add(new C5Fragment());
            fragments.add(new BuffFragment());
            tabs.addTab(tabs.newTab().setText("IGXE"));
            tabs.addTab(tabs.newTab().setText("C5"));
            tabs.addTab(tabs.newTab().setText("BUFF"));
        }

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            String type = Constant.TYPE == 1 ? "铃声" : "振动";
            String buff = "普通模式";
            String open = "开启Buff";
            if (Constant.TYPE == 1) {
                type = "铃声+振动";
            }
            if (Constant.TYPE == 2) {
                type = "铃声";
            }
            if (Constant.TYPE == 3) {
                type = "振动";
            }
            if(Constant.BUFF==1){
                buff =  "快速模式";
            }
            AlertDialog dialog = new AlertDialog.Builder(this).setItems(
                    new String[]{"开始服务", "结束服务", type,buff,open,"测试"}, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which) {
                        case 0:
                            igxeService = new Intent(MainActivity.this, IgxeService.class);
                            startService(igxeService);
//                            c5Service = new Intent(MainActivity.this, C5Service.class);
//                            startService(c5Service);
                            break;
                        case 1:
                            Toast.makeText(MainActivity.this, "结束服务", Toast.LENGTH_SHORT).show();
                            if (c5Service != null) {
                                stopService(c5Service);
                                for (int i = 0; i < fragments.size(); i++) {
                                    if (i == 0) {
                                        ((IgxeFragment) fragments.get(i)).clear();
                                    }
                                    if (i == 1) {
                                        ((C5Fragment) fragments.get(i)).clear();
                                    }
                                    if (i == 2) {
                                        ((BuffFragment) fragments.get(i)).clear();
                                    }
                                }
                            }
                            break;
                        case 2:
                            if (Constant.TYPE == 1) {
                                Constant.TYPE = 2;
                                Toast.makeText(MainActivity.this, "切换模式为：铃声", Toast.LENGTH_SHORT).show();
                            } else if (Constant.TYPE == 2) {
                                Constant.TYPE = 3;
                                Toast.makeText(MainActivity.this, "切换模式为：振动", Toast.LENGTH_SHORT).show();
                            } else if (Constant.TYPE == 3) {
                                Constant.TYPE = 1;
                                Toast.makeText(MainActivity.this, "切换模式为：铃声+振动", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case 3:
                            if (Constant.BUFF == 0) {
                                Constant.BUFF = 1;
                                Toast.makeText(MainActivity.this, "快速模式", Toast.LENGTH_SHORT).show();
                            } else if (Constant.BUFF ==1 ) {
                                Constant.BUFF = 0;
                                Toast.makeText(MainActivity.this, "普通模式", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case 4:
                                Toast.makeText(MainActivity.this, "开启buff", Toast.LENGTH_SHORT).show();
                                buffService = new Intent(MainActivity.this, BuffService.class);
                                startService(buffService);
                            break;
                        case 5:
                            test();
                            break;
                        default:
                            break;
                    }
                }
            }).create();
            dialog.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void test() {
        OkGo.<BuffGoods>get("https://buff.163.com/api/market/goods?game=csgo&page_num=1&quality=unusual&_=1560132460790")
                .headers("Cookie","csrf_token=00142429c353e41954254fdfc25f52c3a4eb3d12; game=csgo; _ga=GA1.2.1799402828.1560132451; _gid=GA1.2.367471503.1560132451; NTES_YD_SESS=AejiGnj9sfjHiKuhefXCD1e5J_FsifB2TpTK1o3v1PrzBlf2BpU6Vjpf3CTxK34J.0SxJUISIWZ_OrlHLRLvXSFSbmQgqRC3mhY0t4qd1sljwXTuKHWnfly5L365nSWJuSzAA433GgvUjAK7pJ_ECIKqeVMinfrKHUr6owex_waUX7B4YGeZ6sC.EM2_ExtYtBM.1OI5dk61N99HFYKMCJTLfZ_0Y_0aVUccGlDwo79zC; S_INFO=1560132554|0|3&80##|15933602464; P_INFO=15933602464|1560132554|0|netease_buff|00&99|heb&1560132417&netease_buff#heb&130100#10#0#0|&0|null|15933602464; session=1-9ixAY4eYeElxPVpyJ3rFTPS6dVdh3tVlR6JeHXiA41Xl2046279845")
                .execute(new JsonCallback<BuffGoods>(BuffGoods.class) {
                    @Override
                    public void onSuccess(Response<BuffGoods> response) {
                        DataBean data = response.body().getData();
                        List<ItemsBean> items = data.getItems();
                        for (ItemsBean item : items) {
                            Log.d(item.getGame(),item.getName());
                        }
                    }

                    @Override
                    public void onError(Response<BuffGoods> response) {
                    }
                });
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            if (BuildConfig.APP_NAME.equals(Constant._IGC5)){
                return 2;
            }else if(BuildConfig.APP_NAME.equals(Constant._BUFF)){
                return 1;
            }
            return 3;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent home = new Intent(Intent.ACTION_MAIN);
            home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            home.addCategory(Intent.CATEGORY_HOME);
            startActivity(home);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}