package com.sdwfcf.exiaobang.fragment.listDetaile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.fragment.BaseFragment;

/**
 *   订单正在接收中、。。。。。。
 */

public class Receiving extends BaseFragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_receiving,null);
        return view;
    }

}
