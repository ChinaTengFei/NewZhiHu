package com.example.george.newzhihu.main.index.dynamic;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.george.newzhihu.R;

import java.util.List;

/**
 * Created by george on 2017/10/7.
 */

public class DynamicAdapter extends BaseQuickAdapter<String,BaseViewHolder> {
    public DynamicAdapter(@LayoutRes int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    public DynamicAdapter(@Nullable List<String> data) {
        super(data);
    }

    public DynamicAdapter(@LayoutRes int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_title,item);
    }
}
