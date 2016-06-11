package com.thekey.sample.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thekey.sample.R;
import com.thekey.toolslib.base.BaseActivity;
import com.thekey.toolslib.view.recyclerview.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

public class MainActivity extends BaseActivity {

    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;

    private List<Feature> features ;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        //功能模块
        features = new ArrayList<>();
        Feature feature = new Feature("新闻/列表",R.mipmap.icon_list);
        Feature feature2 = new Feature("本地/存取",R.mipmap.see);
        features.add(feature);
        features.add(feature2);
        recyclerview.setLayoutManager(new GridLayoutManager(this,2));
        recyclerview.addItemDecoration(new DividerGridItemDecoration(this));
        mainAdapter = new MainAdapter(this,features,R.layout.item_main_grid);
        recyclerview.setAdapter(mainAdapter);
    }

}
