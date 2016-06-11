package com.thekey.sample.news.presenter;

import com.thekey.sample.news.model.News;
import com.thekey.toolslib.mvp.presentation.presenters.BasePresenter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public interface NewsPr extends BasePresenter {

        interface view {
                void newsData(List<News.TngouBean> data);
        }

         void getNews(HashMap<String, String> params);

}
