package com.example.mysample.utils;

import android.util.Log;

/**
 * 日志相关管理类
 */
public class LogUtils {
    private LogUtils() {
        throw new UnsupportedOperationException("the class cannot be instantiated");
    }

    public static boolean isDebug = true; //控制是否能打印log
    private static final String TAG = "--------------->"; //default tag

    //设置默认tag的函数
    public static void i(String msg)
    {
        if(isDebug)
            Log.i(TAG,msg);
    }
    public static void d(String msg)
    {
        if(isDebug)
            Log.d(TAG,msg);
    }
    public static void e(String msg)
    {
        if(isDebug)
            Log.e(TAG,msg);
    }
    public static void v(String msg)
    {
        if(isDebug)
            Log.v(TAG,msg);
    }

    //可传入自定义tag的函数
    public static void i(String tag,String msg)
    {
        if(isDebug)
            Log.i(tag,msg);
    }
    public static void d(String tag,String msg)
    {
        if(isDebug)
            Log.d(tag,msg);
    }
    public static void e(String tag,String msg)
    {
        if(isDebug)
            Log.e(tag,msg);
    }
    public static void v(String tag,String msg)
    {
        if(isDebug)
            Log.v(tag,msg);
    }

}
