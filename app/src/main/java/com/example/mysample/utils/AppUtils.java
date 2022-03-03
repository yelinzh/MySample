package com.example.mysample.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * 跟App相关的辅助类
 */
public class AppUtils {

    private AppUtils() {
        throw new UnsupportedOperationException("the class cannot be instantiated");
    }

    /**
     * 获取应用程序名称
     * @param context
     * @return 当前应用名称
     */
    public static String getAppName(Context context)
    {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            int labelRes = packageInfo.applicationInfo.labelRes;
            return context.getResources().getString(labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取应用程序版本信息号
     * @param context
     * @return 当前应用的版本名称
     */
    public static String getAppVersionName(Context context)
    {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
