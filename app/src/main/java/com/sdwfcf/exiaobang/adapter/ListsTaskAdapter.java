package com.sdwfcf.exiaobang.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.sdwfcf.exiaobang.R;
import com.sdwfcf.exiaobang.application.EXiaoBangApplication;
import com.sdwfcf.exiaobang.domain.TaskInfo;

import java.util.List;


/**
 * Created by shaofei on 2017/3/13.
 */

public class ListsTaskAdapter extends RecyclerView.Adapter {

    private final List<TaskInfo> mTaskInfoLists;

    public ListsTaskAdapter(List<TaskInfo> taskInfoLists) {
        this.mTaskInfoLists = taskInfoLists;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = View.inflate(EXiaoBangApplication.getEXiaoBangApp(), R.layout.item_task_list, null);
        TaskInfoViewHolder taskInfoViewHolder = new TaskInfoViewHolder(itemView);
        return taskInfoViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mTaskInfoLists.size();
    }


    /**
     * viewHolder
     */
    private static class TaskInfoViewHolder extends RecyclerView.ViewHolder {

        public TaskInfoViewHolder(View itemView) {
            super(itemView);
        }
    }

}
