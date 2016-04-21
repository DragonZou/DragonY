package com.zou.app.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @Description: 日期工具类
 * @Author: 邹苏启
 * @Since: 16/4/21 下午10:59
 */
public class DateUtils {


    /**
     * 获取当天时间 格式yyyy-MM-dd
     *
     * @return
     */
    public static String getCurrentDateFormat() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String date = df.format(calendar.getTime());
        return date;
    }

    /**
     * 获取当前时间 格式HH:mm
     *
     * @return
     */
    public static String getCurrentTimeFormat() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String date = df.format(calendar.getTime());
        return date;
    }

    /**
     * 获取当前日期与时间 格式yyyy-MM-dd HH:mm
     *
     * @return
     */
    public static String getCurrentDatetimeFormat() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        String date = df.format(calendar.getTime());
        return date;
    }

    /**
     * 日期格式化 yyyy-MM-dd
     *
     * @param time     日期
     * @param template 当前传入日期的格式, 如：20150907 格式为：yyyyMMdd
     * @return
     */
    public static String formatDate(String time, String template) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(template, Locale.getDefault());
            Date date = sdf.parse(time);

            SimpleDateFormat sdfhm = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            return sdfhm.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 时间格式化 HHmm
     *
     * @param time
     * @param template 当前传入时间的格式, 如：201509072359 格式为：yyyyMMddHHmm
     * @return
     */
    public static String formatTime(String time, String template) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(template, Locale.getDefault());
            Date date = sdf.parse(time);

            SimpleDateFormat sdfhm = new SimpleDateFormat("HH:mm", Locale.getDefault());
            return sdfhm.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 日期时间格式化 yyyy-MM-dd HH:mm
     *
     * @param time
     * @param template 当前传入日期时间的格式, 如：201509072359 格式为：yyyyMMddHHmm
     * @return
     */
    public static String formatDatetime(String time, String template) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(template, Locale.getDefault());
            Date date = sdf.parse(time);

            SimpleDateFormat sdfhm = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
            return sdfhm.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "";
    }
}