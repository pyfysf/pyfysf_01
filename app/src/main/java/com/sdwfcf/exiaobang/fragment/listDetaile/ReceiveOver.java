package com.sdwfcf.exiaobang.fragment.listDetaile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.fragment.BaseFragment;

/**
 *    此页面为已接收完成清单的页面
 */

public class ReceiveOver extends BaseFragment {

    private View view;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_receive_over,null);
        return view;
    }
}
