package com.example.ggsddu1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.ggsddu1.adapter.ListViewAdapter;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;
import java.util.List;

;

/**
 * Created by Administrator on 2017/11/1.
 */

public class PullToRefreshTestActivity extends Activity{

    private PullToRefreshListView mListView;
    private List<String> mDatas;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pulltorefresh_activity);
        mDatas = new ArrayList<>();
        for(int i=0;i<100;i++){
            mDatas.add("好好学习"+i);
        }
        mListView = (PullToRefreshListView) findViewById(R.id.expand_list);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,mDatas);
        mListView.setAdapter(listViewAdapter);
    }
}
