package com.thekey.toolslib.utils.direct;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class DirectManager {

    /**
     * startActivity
     *
     * @param clazz
     */
    public static void directTo(Context context, Class<?> clazz) {
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);
    }

    /**
     * startActivity with bundle
     *
     * @param clazz
     * @param bundle
     */
    public static void directTo(Context context,Class<?> clazz, Bundle bundle) {
        Intent intent = new Intent(context, clazz);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
    }

    /**
     * startActivity then finish
     *
     * @param clazz
     */
    public static void directToThenKill(Context context,Class<?> clazz) {
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);
        ((Activity)context).finish();
    }

    /**
     * startActivity with bundle then finish
     *
     * @param clazz
     * @param bundle
     */
    public static void directToThenKill(Context context,Class<?> clazz, Bundle bundle) {
        Intent intent = new Intent(context, clazz);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
        ((Activity)context).finish();
    }

}
