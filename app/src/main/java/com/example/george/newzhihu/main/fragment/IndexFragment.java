package com.example.george.newzhihu.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.newzhihu.R;
import com.example.george.newzhihu.adapter.MainAdapter;
import com.example.george.newzhihu.base.BaseFragment;
import com.example.george.newzhihu.main.index.dynamic.DynamicFragment;
import com.example.george.newzhihu.main.index.PopularFragment;
import com.example.george.newzhihu.main.index.UnearthFragment;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by george on 2017/10/6.
 */

public class IndexFragment extends BaseFragment {
    @Nullable
    @BindView(R.id.tl_layout)
    TabLayout tlLayout;
    @BindView(R.id.vp_index)
    ViewPager vpIndex;

    public static IndexFragment newInstance() {

        Bundle args = new Bundle();

        IndexFragment fragment = new IndexFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setView() {
        ArrayList<BaseFragment> baseFragments = new ArrayList<BaseFragment>(){
            {
                add(DynamicFragment.newInstance());
                add(PopularFragment.newInstance());
                add(UnearthFragment.newInstance());
            }
        };
        String[] names = {"动态","热门","发现"};
        vpIndex.setAdapter(new MainAdapter(baseFragments,names,getFragmentManager()));
        tlLayout.setupWithViewPager(vpIndex);
    }

    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }

    @Override
    protected int initView() {
        return R.layout.fragment_index;
    }

}
