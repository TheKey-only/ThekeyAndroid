package com.thekey.toolslib.utils.dialog;

import android.app.Dialog;
import android.content.Context;

import com.thekey.toolslib.R;

/**
 * Created by thekey on 16/6/10.
 * author：ZhengZheng
 * corporation：上海旌云信息技术有限公司
 * mail:zhengzheng@jingyuonline.com
 */
public abstract class BaseDialog extends Dialog {

    public BaseDialog(Context context) {
        super(context, R.style.DialogStyle);
        initView();
        addListener();
        initData();
    }

    protected abstract void initData();

    protected abstract void addListener();

    protected abstract void initView();

}
