package com.sdwfcf.exiaobang.fragment.impl;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.adapter.FragmentAdapter;
import com.sdwfcf.exiaobang.fragment.BaseFragment;
import com.sdwfcf.exiaobang.fragment.listDetaile.SendOver;
import com.sdwfcf.exiaobang.fragment.listDetaile.Sending;
import com.sdwfcf.exiaobang.fragment.listDetaile.WiteSending;

import java.util.ArrayList;
import java.util.List;

/**
 * 清单页面的主页面
 */

public class DetaileSendListFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener {

    private View view;
    private ViewPager vp_detail_list_send;
    private List<Fragment> fragments = new ArrayList<>();
    private TabLayout tab_detail_list_send;
    private FragmentAdapter adapter;
    private RadioButton btn_receive_list, btn_send_list;
    private SwipeRefreshLayout swipeRefreshLayout;
    private String TAG;
    private RadioGroup rg_detail_list;
    private Toolbar tb_tool_bar;
    private DetaileReceiveListFragment detaileReceiveListFragment;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_send_detail_list, null);
        tab_detail_list_send = (TabLayout) view.findViewById(R.id.tab_detail_list_send);
        vp_detail_list_send = (ViewPager) view.findViewById(R.id.vp_detail_list_send);
        rg_detail_list = (RadioGroup) view.findViewById(R.id.rg_detail_send_list);
        tb_tool_bar = (Toolbar) view.findViewById(R.id.tb_tool_bar);
        btn_receive_list = (RadioButton) view.findViewById(R.id.btn_receive_list);
        btn_send_list = (RadioButton) view.findViewById(R.id.btn_send_list);
        rg_detail_list.setOnCheckedChangeListener(this);
       initView();
        return view;
    }

    private void initView() {
        List<String> titles = new ArrayList<>();
        titles.add("进行中");
        titles.add("待确认");
        titles.add("已结算");
        for (int i = 0; i < titles.size(); i++) {
            tab_detail_list_send.addTab(tab_detail_list_send.newTab().setText(titles.get(i)));
        }


        fragments.add(new Sending());
        fragments.add(new WiteSending());
        fragments.add(new SendOver());

        adapter = new FragmentAdapter(getActivity().getSupportFragmentManager(),fragments,titles);

        //为Viewpager设置适配器
        vp_detail_list_send.setAdapter(adapter);
        //将TabLayout和ViewPager关联起来。
        tab_detail_list_send.setupWithViewPager(vp_detail_list_send);
        //给TabLayout设置适配器
        tab_detail_list_send.setTabsFromPagerAdapter(adapter);


    }



    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();
        Log.e(TAG,"有点击事件发生========");
        switch (i){

            case R.id.btn_receive_list:
                Log.e(TAG,"接单按钮被选中哈哈哈哈");
                Log.e(TAG,"接单按钮被选中哈哈哈哈");
                detaileReceiveListFragment = new DetaileReceiveListFragment();
                transaction.replace(R.id.fl_center_content, detaileReceiveListFragment).commit();

                break;
            case R.id.btn_send_list:

                Log.e(TAG,"发单按钮被选中哈哈哈哈");


                break;
        }
    }
}
