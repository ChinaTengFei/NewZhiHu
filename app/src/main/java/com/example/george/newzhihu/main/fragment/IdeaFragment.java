package com.example.george.newzhihu.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.george.newzhihu.base.BaseFragment;

/**
 * Created by george on 2017/10/6.
 */

public class IdeaFragment extends BaseFragment{

    public static IdeaFragment newInstance() {
        
        Bundle args = new Bundle();
        
        IdeaFragment fragment = new IdeaFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText(this.getClass().getSimpleName());
        return textView;
    }
}
