package com.yumingchuan.recyclerviewgridlayoutmanager;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by love on 2015/8/28.
 */
public class RecyclerViewAdapterBoard extends RecyclerView.Adapter<ViewHolder> {
    private List<MainActivity.TestBean> list;
    private View view;

    public RecyclerViewAdapterBoard(List<MainActivity.TestBean> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).type;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new ViewHolder_Title(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent, false));
        } else if (viewType == 1) {
            return new ViewHolder_Content_Star(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_2, parent, false));
        } else {
            return new ViewHolder_Content_Common(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_3, parent, false));
        }
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        switch (getItemViewType(position)) {
            case 0:
                ((ViewHolder_Title) holder).tv.setText(list.get(position).name);
                break;
            case 1:
                ((ViewHolder_Content_Star) holder).tv.setText(list.get(position).name);
                break;
            case 2:
                ((ViewHolder_Content_Common) holder).tv.setText(list.get(position).name);
                break;
        }

    }


    private class ViewHolder_Title extends RecyclerView.ViewHolder {
        public TextView tv;// 标题
        private final View mView;

        public ViewHolder_Title(View itemView) {
            super(itemView);
            mView = itemView;
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }


    private class ViewHolder_Content_Star extends RecyclerView.ViewHolder {
        public TextView tv;// 标题
        private final View mView;

        public ViewHolder_Content_Star(View itemView) {
            super(itemView);
            mView = itemView;
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }

    private class ViewHolder_Content_Common extends RecyclerView.ViewHolder {
        public TextView tv;// 标题
        private final View mView;

        public ViewHolder_Content_Common(View itemView) {
            super(itemView);
            mView = itemView;
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }


}
