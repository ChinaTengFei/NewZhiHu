package com.example.george.newzhihu.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by george on 2017/10/6.
 */

public abstract class BaseFragment<P extends BasePresenter,M> extends Fragment {
    Unbinder unbinder;
    protected Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Nullable
    @Override
    public final View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = initView(inflater, container, savedInstanceState);
        if (inflate == null) {
            int layoutId = initView();
            inflate= inflater.inflate(layoutId, null);
        }
        unbinder = ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setView();
    }

    protected void setView() {

    }

    protected abstract View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    protected int initView(){
        return 0;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
