package com.sdwfcf.exiaobang.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.fragment.impl.DetaileReceiveListFragment;
import com.sdwfcf.exiaobang.fragment.impl.SquareFragment;
public class MainActivity extends AppCompatActivity {


    private FragmentManager fm = getSupportFragmentManager();
    private DetaileReceiveListFragment detaileReceiveListFragment;
    private SquareFragment squareFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
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
                // 开启Fragment事务
                FragmentTransaction transaction = fm.beginTransaction();
                switch (position) {
                    case 0:
                        squareFragment = new  SquareFragment();
                        transaction.replace(R.id.fl_center_content, squareFragment);
                        break;
                    case 1:
                        detaileReceiveListFragment = new DetaileReceiveListFragment();
                        transaction.replace(R.id.fl_center_content, detaileReceiveListFragment);
                        break;
                    case 2:
//
                        break;

                    case 3:
//                        fragment_set = new fragment_set();
//                        transaction.replace(R.id.fl_content, fragment_set);
                        break;
                }
                transaction.commit();

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
