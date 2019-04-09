package com.frank.csgo.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.frank.csgo.bean.IgxeWeapon;

import java.util.List;

public class WeaponAdapter extends BaseQuickAdapter<IgxeWeapon, BaseViewHolder> {
    public WeaponAdapter(int layoutResId, @Nullable List<IgxeWeapon> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, IgxeWeapon item) {

    }
}
