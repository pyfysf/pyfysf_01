package com.sdwfcf.exiaobang.utils;

import java.util.UUID;

/**
 * 返回一个不重复的UUID适合做数据库的主键
 * Created by shaofei on 2017/3/13.
 */

public class UUIDUtil {
    /**
     * 返回一个不重复的字符串
     *
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
