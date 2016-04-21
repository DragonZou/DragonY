package com.zou.app.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @Description: Toast工具类
 * @Author: 邹苏启
 * @Since: 16/4/21 下午8:14
 */
public class ToastUtil {

    private static Toast toast;

    public static void show(Context c,int msg){
        if(toast == null){
            toast = Toast.makeText(c,msg,Toast.LENGTH_LONG);
        }else {
            toast.setText(msg);
        }

        toast.show();
    }

    public static void show(Context c,CharSequence msg){
        if(toast == null){
            toast = Toast.makeText(c,msg,Toast.LENGTH_LONG);
        }else {
            toast.setText(msg);
        }

        toast.show();
    }

}
