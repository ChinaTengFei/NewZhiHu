package com.example.george.newzhihu.main.index;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.george.newzhihu.base.BaseFragment;

/**
 * Created by george on 2017/10/7.
 */

public class UnearthFragment extends BaseFragment {

    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText(this.getClass().getSimpleName());
        return textView;
    }
    public static UnearthFragment newInstance() {
        
        Bundle args = new Bundle();
        
        UnearthFragment fragment = new UnearthFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
