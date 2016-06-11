package com.thekey.toolslib.utils.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by thekey on 16/6/11.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public class T {

        private T()
        {
        /* cannot be instantiated */
            throw new UnsupportedOperationException("cannot be instantiated");
        }

        public static boolean isShow = true;

        /**
         * 短时间显示Toast
         *
         * @param context
         * @param message
         */
        public static void showShort(Context context, CharSequence message)
        {
            if (isShow)
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }

        /**
         * 短时间显示Toast
         *
         * @param context
         * @param message
         */
        public static void showShort(Context context, String message)
        {
            if (isShow)
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }

}
