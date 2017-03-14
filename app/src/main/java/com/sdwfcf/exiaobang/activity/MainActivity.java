package com.sdwfcf.exiaobang.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.fragment.BaseFragment;
import com.sdwfcf.exiaobang.fragment.impl.DetaileListFragment;
import com.sdwfcf.exiaobang.fragment.impl.MessageFragment;
import com.sdwfcf.exiaobang.fragment.impl.MineFragment;
import com.sdwfcf.exiaobang.fragment.impl.SquareFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FrameLayout fl_center_content;
    private ArrayList<BaseFragment> mCenterFragmentLists;
    private FragmentManager mFm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }

    private void initView() {
        initBottomBtn();
        initCencer();
    }

    private void initCencer() {
        fl_center_content = (FrameLayout) findViewById(R.id.fl_center_content);
        //添加中部的Fragment
        mCenterFragmentLists = new ArrayList<>();
        mCenterFragmentLists.add(new SquareFragment());
        mCenterFragmentLists.add(new DetaileListFragment());
        mCenterFragmentLists.add(new MessageFragment());
        mCenterFragmentLists.add(new MineFragment());
        mFm = getSupportFragmentManager();
        mFm.beginTransaction().replace(R.id.fl_center_content, new SquareFragment()).commit();

    }

    private void initBottomBtn() {
        BottomNavigationBar bnb_bottom_navigation_bar = (BottomNavigationBar) findViewById(R.id.bnb_bottom_navigation_bar);
        bnb_bottom_navigation_bar
                .addItem(new BottomNavigationItem(R.drawable.ic_home_white_24dp, "广场"))
                .addItem(new BottomNavigationItem(R.drawable.ic_book_white_24dp, "清单"))
                .addItem(new BottomNavigationItem(R.drawable.ic_tv_white_24dp, "消息"))
                .addItem(new BottomNavigationItem(R.drawable.ic_videogame_asset_black_48dp, "我的"))
                .initialise();
        bnb_bottom_navigation_bar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                mFm.beginTransaction().replace(R.id.fl_center_content, mCenterFragmentLists.get(position)).commit();
            }

            @Override
            public void onTabUnselected(int position) {
            }

            @Override
            public void onTabReselected(int position) {
            }
        });
    }
}
