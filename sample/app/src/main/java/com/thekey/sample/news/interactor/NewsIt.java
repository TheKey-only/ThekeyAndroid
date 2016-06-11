package com.thekey.sample.news.interactor;

import com.thekey.toolslib.mvp.domain.interactors.Interactor;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public interface NewsIt extends Interactor {

    interface callback{
        void httpcallback(String result);
    }

}
