package com.yumingchuan.recyclerviewgridlayoutmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TestBean> totalData;
    private RecyclerViewAdapterBoard recyclerViewAdapterBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalData = new ArrayList<TestBean>();

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return recyclerViewAdapterBoard.getItemViewType(position) == 0 ? 3 : recyclerViewAdapterBoard.getItemViewType(position) == 1 ? 1 : 3;
            }
        });
        mRecyclerView.setLayoutManager(layoutManager);

        TestBean titleBean = new TestBean();
        titleBean.name = "星标文集标题   哈哈";
        titleBean.type = 0;
        totalData.add(titleBean);

        for (int i = 0; i < 6; i++) {
            TestBean tempBean = new TestBean();
            tempBean.name = "星标文集内容   " + i;
            tempBean.type = 1;
            totalData.add(tempBean);
        }

        TestBean contentBean = new TestBean();
        contentBean.name = "普通文集标题   呵呵";
        contentBean.type = 0;
        totalData.add(contentBean);

        for (int i = 0; i < 20; i++) {
            TestBean tempBean = new TestBean();
            tempBean.name = "普通文集内容   " + i;
            tempBean.type = 2;
            totalData.add(tempBean);
        }

        recyclerViewAdapterBoard = new RecyclerViewAdapterBoard(totalData);
        mRecyclerView.setAdapter(recyclerViewAdapterBoard);
    }

    public class TestBean {
        public String name;
        public int type;
    }


}
