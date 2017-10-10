package com.example.george.newzhihu.main.index.dynamic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.newzhihu.R;
import com.example.george.newzhihu.base.BaseFragment;

import java.util.Arrays;

import butterknife.BindView;

/**
 * Created by george on 2017/10/7.
 */


public class DynamicFragment<DynamicModel,M> extends BaseFragment {

    @BindView(R.id.rv_dynamic)
    RecyclerView rvDynamic;

    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }

    @Override
    protected int initView() {
        return R.layout.fragment_dynamic;
    }

    @Override
    protected void setView() {
        rvDynamic.setLayoutManager(new LinearLayoutManager(mContext));
        String[] itemTitles = {"如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为","如何看待高中生性行为"};
        rvDynamic.setAdapter(new DynamicAdapter(R.layout.item_dynamic, Arrays.asList(itemTitles)));
    }

    public static DynamicFragment newInstance() {
        Bundle args = new Bundle();
        DynamicFragment fragment = new DynamicFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
