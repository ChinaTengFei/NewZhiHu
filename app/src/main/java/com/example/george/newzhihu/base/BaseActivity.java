package com.example.george.newzhihu.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.george.newzhihu.tool.RefUtils;

/**
 * Created by george on 2017/10/6.
 */

public class BaseActivity<P extends BasePresenter,M extends BaseModel>  extends AppCompatActivity {

    private P mBasePresenter;
    private M mBaseModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBasePresenter = RefUtils.getT(this,0);
        mBaseModel = RefUtils.getT(this,1);
        mBasePresenter.attachViewWithModel(mBaseModel,this);
    }

    protected P getPresenter(){
        return ((P) mBasePresenter);
    }
}
