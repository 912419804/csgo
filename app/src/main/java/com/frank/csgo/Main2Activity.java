package com.frank.csgo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.frank.csgo.service.BuffService;
import com.frank.csgo.service.C5Service;
import com.frank.csgo.service.IgxeService;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private Intent igxeService;
    private Intent c5Service;
    private Intent buffService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragments.add(new IgxeFragment());
        fragments.add(new C5Fragment());
        fragments.add(new BuffFragment());
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
            AlertDialog dialog = new AlertDialog.Builder(this).setItems(new String[]{"开始服务", "结束服务", type,buff}, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which) {
                        case 0:
                            igxeService = new Intent(Main2Activity.this, IgxeService.class);
                            startService(igxeService);
                            c5Service = new Intent(Main2Activity.this, C5Service.class);
                            startService(c5Service);
                            buffService = new Intent(Main2Activity.this, BuffService.class);
                            startService(buffService);
                            break;
                        case 1:
                            Toast.makeText(Main2Activity.this, "结束服务", Toast.LENGTH_SHORT).show();
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
                                Toast.makeText(Main2Activity.this, "切换模式为：铃声", Toast.LENGTH_SHORT).show();
                            } else if (Constant.TYPE == 2) {
                                Constant.TYPE = 3;
                                Toast.makeText(Main2Activity.this, "切换模式为：振动", Toast.LENGTH_SHORT).show();
                            } else if (Constant.TYPE == 3) {
                                Constant.TYPE = 1;
                                Toast.makeText(Main2Activity.this, "切换模式为：铃声+振动", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case 3:
                            if (Constant.BUFF == 0) {
                                Constant.BUFF = 1;
                                Toast.makeText(Main2Activity.this, "快速模式", Toast.LENGTH_SHORT).show();
                            } else if (Constant.BUFF ==1 ) {
                                Constant.BUFF = 0;
                                Toast.makeText(Main2Activity.this, "普通模式", Toast.LENGTH_SHORT).show();
                            }
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
            return 3;
        }
    }
}