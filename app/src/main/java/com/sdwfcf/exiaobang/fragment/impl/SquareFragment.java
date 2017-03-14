package com.sdwfcf.exiaobang.fragment.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.adapter.ListsTaskAdapter;
import com.sdwfcf.exiaobang.application.EXiaoBangApplication;
import com.sdwfcf.exiaobang.domain.TaskInfo;
import com.sdwfcf.exiaobang.fragment.BaseFragment;
import com.sdwfcf.exiaobang.utils.UUIDUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaofei on 2017/3/13.
 */

public class SquareFragment extends BaseFragment {

    private RecyclerView mRv_lists_tasks;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_square, null);

        mRv_lists_tasks = (RecyclerView) view.findViewById(R.id.rv_lists_tasks);
        Toolbar tb_tool_bar = (Toolbar) view.findViewById(R.id.tb_tool_bar);

        LinearLayoutManager llm = new LinearLayoutManager(EXiaoBangApplication.getEXiaoBangApp());
        mRv_lists_tasks.setLayoutManager(llm);

        getDataFromNet();

        return view;
    }

    public void getDataFromNet() {
        //暂时模拟数据
        List<TaskInfo> taskInfoLists = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            /*
            String t_id, int t_type, String t_createDate,
                    String t_stopDate, String t_titleContent,double t_money,
            String t_detailedContent, String t_imageUrl,int t_state){
             */
            TaskInfo taskInfo = new TaskInfo(UUIDUtil.uuid(), 0, "2017-3-13 12:26:17", "2017-3-13 12:40:23",
                    "给我买一份炸鸡腿饭" + i, 10.5, "加个鸡蛋，加个烤肠" + i, "", TaskInfo.TASK_STATE_FREE);
            taskInfoLists.add(taskInfo);
        }
        //设置数据适配器
        mRv_lists_tasks.setAdapter(new ListsTaskAdapter(taskInfoLists));
    }
}
