
package com.sdwfcf.exiaobang.utils;


import android.text.TextUtils;
import android.widget.Toast;

import com.sdwfcf.exiaobang.application.EXiaoBangApplication;

/**
 * Toast的工具类
 */
public class ToastUtil {

    /**
     * 弹出吐司
     *
     * @param message
     */
    public static void showToast(String message) {
        if (!TextUtils.isEmpty(message)) {
            Toast.makeText(EXiaoBangApplication.getEXiaoBangApp(), message, Toast.LENGTH_SHORT).show();
        }
    }

}
