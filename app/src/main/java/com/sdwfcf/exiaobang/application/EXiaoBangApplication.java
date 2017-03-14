package com.sdwfcf.exiaobang.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by shaofei on 2017/3/13.
 */

public class EXiaoBangApplication extends Application {
    /**
     * 全局应用的上下文环境
     */
    private static Context mEXiaoBangApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mEXiaoBangApp = this;
    }

    /**获取上下文环境
     * @return
     */
    public static Context getEXiaoBangApp() {
        if (mEXiaoBangApp == null) {
            mEXiaoBangApp = new EXiaoBangApplication();
        }
        return mEXiaoBangApp;
    }

}
