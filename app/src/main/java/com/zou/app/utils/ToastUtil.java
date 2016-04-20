package com.zou.app.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast工具类
 * Created by zousuqi on 16/4/16.
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
