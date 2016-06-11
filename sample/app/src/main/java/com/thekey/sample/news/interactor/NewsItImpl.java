package com.thekey.sample.news.interactor;

import com.thekey.toolslib.mvp.domain.executor.Executor;
import com.thekey.toolslib.mvp.domain.executor.MainThread;
import com.thekey.toolslib.mvp.domain.interactors.AbstractInteractor;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.HashMap;

import okhttp3.Call;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class NewsItImpl extends AbstractInteractor implements NewsIt {

    private NewsIt.callback callback;

    public NewsItImpl(Executor threadExecutor, MainThread mainThread, NewsIt.callback callback) {
        super(threadExecutor, mainThread);
        this.callback = callback;
    }

    @Override
    public void run(HashMap<String, String> params) {
            String url = "http://www.tngou.net/api/top/list";
            OkHttpUtils
                    .get()
                    .url(url)
                    .params(params)
                    .build()
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            callback.httpcallback(null);
                        }

                        @Override
                        public void onResponse(String response, int id) {
                            if (callback != null)
                                callback.httpcallback(response);
                        }

                    });
    }
}
