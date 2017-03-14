package com.sdwfcf.exiaobang.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名称：rssnews
 * <p>
 * 类描述：Sp的工具类，用来简洁Sp的代码量
 * <p>
 * 创建人：shaofei
 * <p>
 * 创建时间：2017/2/27 12:56
 * <p>
 * 个人邮箱：pyfysf@163.com
 *
 * @version 1.0
 */

public class SpUtils {
    private static SharedPreferences sp = null;

    /**
     * 添加字符串
     *
     * @param context 上下文环境
     * @param key     字符串唯一标识key
     * @param value   需要添加的字符串内容
     */
    public static void putString(Context context, String key, String value) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }

        sp.edit().putString(key, value).commit();
    }

    /**
     * 获取Sp中的字符串
     *
     * @param context  上下文环境
     * @param key      字符串的唯一标识key
     * @param defValue 默认值--如果找不到就返回该默认值
     * @return 如果有获取其内容返回，如果没有返回默认值
     */
    public static String getString(Context context, String key, String defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        return sp.getString(key, defValue);
    }

    /**
     * 添加整数
     *
     * @param context 上下文环境
     * @param key     整数唯一标识key
     * @param value   需要添加的数字内容
     */
    public static void putInt(Context context, String key, int value) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }

        sp.edit().putInt(key, value).commit();
    }

    /**
     * 获取Sp中的数字
     *
     * @param context  上下文环境
     * @param key      数字的唯一标识key
     * @param defValue 默认值--如果找不到就返回该默认值
     * @return 如果有获取其内容返回，如果没有返回默认值
     */
    public static int getInt(Context context, String key, int defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        return sp.getInt(key, defValue);
    }

    /**
     * 添加boolean值
     *
     * @param context 上下文环境
     * @param key     Boolean唯一标识key
     * @param value   需要添加的true/false
     */
    public static void putBoolean(Context context, String key, boolean value) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }

        sp.edit().putBoolean(key, value).commit();
    }

    /**
     * 获取Sp中的Boolean
     *
     * @param context  上下文环境
     * @param key      Boolean的唯一标识key
     * @param defValue 默认值--如果找不到就返回该默认值
     * @return 如果有获取其内容返回，如果没有返回默认值
     */
    public static boolean getBoolean(Context context, String key, boolean defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key, defValue);
    }
	
	/**
     * 移除一个key
     *
     * @param context 上下文环境
     * @param key     Boolean的唯一标识key
     */
    public static void remove(Context context, String key) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        sp.edit().remove(key).commit();
    }
}
