package com.thekey.toolslib.utils.log;

import android.util.Log;

import com.thekey.toolslib.constant.BuildConfig;


/**
 * Created by thekey on 16/6/9.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class LogUtil {

    public static void i(String data) {
        if (!BuildConfig.DEBUG) {
            return;
        }
        Log.i("TAG",data);
    }

    public static void i(String tag, String data) {
        if (!BuildConfig.DEBUG) {
            return;
        }
        Log.i(tag, data);
    }

    public static void d(String data) {
        if (!BuildConfig.DEBUG) {
            return;
        }
        Log.d("TAG", data);
    }

    public static void d(String tag, String data) {
        if (!BuildConfig.DEBUG) {
            return;
        }
        Log.d(tag, data);
    }

}
