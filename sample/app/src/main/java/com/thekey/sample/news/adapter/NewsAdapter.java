package com.thekey.sample.news.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.thekey.sample.R;
import com.thekey.sample.news.model.News;
import com.thekey.toolslib.adapter.RecyclerAdapter;
import com.thekey.toolslib.adapter.RecyclerAdapterHelper;

import java.util.List;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class NewsAdapter extends RecyclerAdapter<News.TngouBean> {

    public NewsAdapter(Context context, @Nullable List<News.TngouBean> data, @NonNull int... layoutResIds) {
        super(context, data, layoutResIds);
    }

    @Override
    protected void convert(RecyclerAdapterHelper helper, News.TngouBean item) {
        helper.setText(R.id.tv_news_title,item.getTitle());
        if (item.getImg().equals("/top/default.jpg")){
            helper.setImageResource(R.id.image,R.mipmap.img_4);
        }else {
            helper.setImageUrl(R.id.image,"http://tnfs.tngou.net/image"+item.getImg());
        }
    }
}
