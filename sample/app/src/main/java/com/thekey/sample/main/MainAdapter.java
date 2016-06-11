package com.thekey.sample.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.thekey.sample.R;
import com.thekey.sample.news.activity.NewsActivity;
import com.thekey.toolslib.adapter.RecyclerAdapter;
import com.thekey.toolslib.adapter.RecyclerAdapterHelper;
import com.thekey.toolslib.utils.direct.DirectManager;

import java.util.List;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class MainAdapter extends RecyclerAdapter<Feature>{


    public MainAdapter(Context context, @NonNull int... layoutResIds) {
        super(context, layoutResIds);
    }

    public MainAdapter(Context context, @Nullable List<Feature> data, @NonNull int... layoutResIds) {
        super(context, data, layoutResIds);
    }

    @Override
    protected void convert(RecyclerAdapterHelper helper, Feature item) {
        helper.setImageResource(R.id.iv_logo,item.getLogo());
        helper.setText(R.id.tv_name,item.getName());
        helper.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DirectManager.directTo(context,NewsActivity.class);
            }
        });
    }
}
