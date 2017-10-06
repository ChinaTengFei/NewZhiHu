package com.example.george.newzhihu.main;

import com.example.george.newzhihu.base.BaseModel;
import com.example.george.newzhihu.base.BasePresenter;
import com.example.george.newzhihu.base.BaseView;

/**
 * Created by george on 2017/10/6.
 */

public interface MainContract {
    public interface IndexView extends BaseView{}
    public interface IndexModel extends BaseModel{}
    public class IndexPresenter extends BasePresenter<MainContract.IndexModel,IndexView>{}
}
