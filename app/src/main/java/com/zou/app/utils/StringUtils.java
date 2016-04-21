package com.zou.app.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @Description: 字符串 工具类
 * @Author: 邹苏启
 * @Since: 16/4/21 下午10:25
 */
public class StringUtils {

    private final static Pattern emailer = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");

    /**
     * 判断给定字符串是否空白串。 空白串是指由空格、制表符、回车符、换行符组成的字符串 若输入字符串为null或空字符串，返回true
     *
     * @param input
     * @return boolean
     */
    public static boolean isEmpty(String input) {
        if (input == null || "".equals(input)) return true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断给定字符串是否空白串。 空白串是指由空格、制表符、回车符、换行符组成的字符串 若输入字符串为null或空字符串
     *
     * @param input
     * @return
     */
    public static boolean isNotEmpty(String input) {
        if (isEmpty(input)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断是不是一个合法的电子邮件地址
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        if (email == null || email.trim().length() == 0) return false;
        return emailer.matcher(email).matches();
    }

    /**
     * 字符串转整数
     *
     * @param value
     * @param defValue
     * @return
     */
    public static int toInt(String value, int defValue) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
        }
        return defValue;
    }


    /**
     * 字符串转整数
     *
     * @param value
     * @return 转换异常返回 0
     */
    public static long toLong(String value) {
        try {
            return Long.parseLong(value);
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 字符串转浮点数
     *
     * @param value
     * @return 转换异常返回 0
     */
    public static float toFloat(String value) {
        try {
            return Float.parseFloat(value);
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 字符串转浮点数
     *
     * @param value
     * @return 转换异常返回 0
     */
    public static double toDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 字符串转布尔值
     *
     * @param b
     * @return 转换异常返回 false
     */
    public static boolean toBool(String b) {
        try {
            return Boolean.parseBoolean(b);
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * 将一个InputStream流转换成字符串
     *
     * @param is
     * @return
     */
    public static String toConvertString(InputStream is) {
        StringBuffer res = new StringBuffer();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader read = new BufferedReader(isr);
        try {
            String line;
            line = read.readLine();
            while (line != null) {
                res.append(line);
                line = read.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != isr) {
                    isr.close();
                    isr.close();
                }
                if (null != read) {
                    read.close();
                    read = null;
                }
                if (null != is) {
                    is.close();
                    is = null;
                }
            } catch (IOException e) {
            }
        }
        return res.toString();
    }
}
