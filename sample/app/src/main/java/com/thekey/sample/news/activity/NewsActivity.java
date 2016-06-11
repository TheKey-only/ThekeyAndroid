package com.thekey.sample.news.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thekey.sample.R;
import com.thekey.sample.news.adapter.NewsAdapter;
import com.thekey.sample.news.model.News;
import com.thekey.sample.news.presenter.NewsPr;
import com.thekey.sample.news.presenter.NewsPrImpl;
import com.thekey.toolslib.base.BaseActivity;
import com.thekey.toolslib.mvp.domain.executor.impl.ThreadExecutor;
import com.thekey.toolslib.mvp.threading.MainThreadImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class NewsActivity extends BaseActivity implements NewsPr.view {

    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;

    private NewsAdapter newsAdapter;
    private List<News.TngouBean> datas;
    private HashMap<String,String> params;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_edit;
    }

    @Override
    protected void init() {
        datas = new ArrayList<>();
        params = new HashMap<>();
        params.put("page", "1");
        params.put("rows", "10");
        NewsPr newsPr = new NewsPrImpl(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), NewsActivity.this);
        newsPr.getNews(params);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        newsAdapter = new NewsAdapter(this, datas, R.layout.item_news);
        recyclerview.setAdapter(newsAdapter);
    }

    @Override
    public void newsData(List<News.TngouBean> data) {
        datas.addAll(data);
        newsAdapter.addAll(datas);
    }

}
