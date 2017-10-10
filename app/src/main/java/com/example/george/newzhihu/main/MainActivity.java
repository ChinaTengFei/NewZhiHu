package com.example.george.newzhihu.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.george.newzhihu.R;
import com.example.george.newzhihu.adapter.MainAdapter;
import com.example.george.newzhihu.base.BaseActivity;
import com.example.george.newzhihu.base.BaseFragment;
import com.example.george.newzhihu.main.fragment.IdeaFragment;
import com.example.george.newzhihu.main.fragment.IndexFragment;
import com.example.george.newzhihu.main.fragment.MineFragment;
import com.example.george.newzhihu.main.fragment.NoticeFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<MainContract.IndexPresenter, MainContract.IndexModel> {

    @BindView(R.id.tl_title_layout)
    public TabLayout tlTitleLayout;

    @BindView(R.id.vp_main)
    public ViewPager vpMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ArrayList<BaseFragment> baseFragments = new ArrayList<BaseFragment>() {
            {
                add(IndexFragment.newInstance());
                add(IdeaFragment.newInstance());
                add(NoticeFragment.newInstance());
                add(MineFragment.newInstance());
            }
        };
        String[] names = {"首页","想法","通知","我的"};
        vpMain.setAdapter(new MainAdapter(baseFragments,names,getSupportFragmentManager()));
        tlTitleLayout.setupWithViewPager(vpMain);
    }
}
