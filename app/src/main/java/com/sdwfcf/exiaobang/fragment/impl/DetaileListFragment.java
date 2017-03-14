package com.sdwfcf.exiaobang.fragment.impl;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sdwfcf.exiaobang.application.EXiaoBangApplication;
import com.sdwfcf.exiaobang.fragment.BaseFragment;

/**
 * Created by shaofei on 2017/3/13.
 */

public class DetaileListFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(EXiaoBangApplication.getEXiaoBangApp());
        tv.setText("我是清单详情页面");
        tv.setTextColor(Color.BLACK);


        return tv;
    }
}