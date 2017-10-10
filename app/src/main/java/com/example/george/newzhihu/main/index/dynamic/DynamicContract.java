package com.example.george.newzhihu.main.index.dynamic;

import com.example.george.newzhihu.base.BaseModel;
import com.example.george.newzhihu.base.BasePresenter;
import com.example.george.newzhihu.base.BaseView;

/**
 * Created by george on 2017/10/7.
 */

public class DynamicContract {
    public class DynamicView implements BaseView{

    }
    public interface DynamicModel extends BaseModel{

    }
    public class DynamicPresenter extends BasePresenter<DynamicContract.DynamicModel,DynamicView>{

    }
}
