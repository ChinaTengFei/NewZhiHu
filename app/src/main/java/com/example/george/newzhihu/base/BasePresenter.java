package com.example.george.newzhihu.base;

/**
 * Created by george on 2017/10/6.
 */

public abstract class BasePresenter<M,V>{
    private V mBaseView;
    private M mBaseModel;

    protected void attachViewWithModel( V baseView,M baseModel){
        this.mBaseView = baseView;
        this.mBaseModel = baseModel;
    }

    protected V getView(){
        return mBaseView;
    }
}
