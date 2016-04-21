package com.zou.app.utils;

import android.content.Context;
import android.util.Log;

/**
 * @Description: Log工具类
 * @Author: 邹苏启
 * @Since: 16/4/21 下午9:54
 */
public class LOG {

    private static final String TAG = "LOG";
    public static boolean DEBUG = true;

    public static void i(String msg) {
        if (DEBUG) {
            Log.i(TAG, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }
}
