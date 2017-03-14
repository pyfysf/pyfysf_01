package com.sdwfcf.exiaobang.fragment.listDetaile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.fragment.BaseFragment;

/**
 *    接单页面订单等待确认页面
 */

public class WiteSending extends BaseFragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_wite_send,null);
        return view;
    }

}
