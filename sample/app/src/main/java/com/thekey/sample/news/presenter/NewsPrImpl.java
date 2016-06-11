package com.thekey.sample.news.presenter;

import com.google.gson.Gson;
import com.thekey.sample.news.model.News;
import com.thekey.sample.news.interactor.NewsIt;
import com.thekey.sample.news.interactor.NewsItImpl;
import com.thekey.toolslib.mvp.domain.executor.Executor;
import com.thekey.toolslib.mvp.domain.executor.MainThread;
import com.thekey.toolslib.mvp.domain.executor.impl.ThreadExecutor;
import com.thekey.toolslib.mvp.presentation.presenters.AbstractPresenter;
import com.thekey.toolslib.mvp.threading.MainThreadImpl;

import java.util.HashMap;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class NewsPrImpl extends AbstractPresenter implements NewsPr,NewsIt.callback{

    private view view;
    private Gson gson;

    public NewsPrImpl(Executor executor, MainThread mainThread, NewsPr.view view) {
        super(executor, mainThread);
        this.view = view;
        gson = new Gson();
    }

    @Override
    public void httpcallback(String result) {
        News news = gson.fromJson(result,News.class);
        view.newsData(news.getTngou());
    }

    @Override
    public void getNews(HashMap<String, String> params) {
        NewsIt newsIt = new NewsItImpl(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(),this);
        newsIt.execute(params);
    }

}
