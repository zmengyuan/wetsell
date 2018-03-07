package com.zmy.wechatsell.utils;

import java.util.Random;

/**
 * 时间+随机数
 * 生成唯一主键
 */
public class KeyUtil {
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
