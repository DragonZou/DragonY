package com.zou.app.utils;

import java.util.UUID;

/**
 * @Description: 随机UUID生成
 * @Author: 邹苏启
 * @Since: 16/4/21 下午10:07
 */
public class UUIDGenerator {

    /**
     * 随机生成的UUID
     *
     * @return 随机生成的UUID
     */
    public static String create() {
        String s = UUID.randomUUID().toString();
        return s.replaceAll("-", "");
    }

    /**
     * 随机生成的UUID
     *
     * @param number 随机数
     * @return 随机生成的UUID
     */
    public static String[] create(int number) {
        if (number < 1) {
            return null;
        }
        String[] ss = new String[number];
        for (int i = 0; i < number; i++) {
            ss[i] = create();
        }
        return ss;
    }
}
