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

public class IndexFragment extends BaseFragment{
    public static IndexFragment newInstance() {
        
        Bundle args = new Bundle();
        
        IndexFragment fragment = new IndexFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText(this.getClass().getSimpleName());
        return textView;
    }
}
