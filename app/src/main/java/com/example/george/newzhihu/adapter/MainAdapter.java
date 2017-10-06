package com.example.george.newzhihu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.george.newzhihu.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by george on 2017/10/6.
 */

public class MainAdapter extends FragmentPagerAdapter {
    private final ArrayList<BaseFragment> baseFragments;
    String[] names = {"首页","想法","通知","我的"};
    public MainAdapter(ArrayList<BaseFragment> baseFragments, FragmentManager fm) {
        super(fm);
        this.baseFragments = baseFragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }

    @Override
    public Fragment getItem(int position) {
        return baseFragments.get(position);
    }

    @Override
    public int getCount() {
        return baseFragments.size();
    }
}
