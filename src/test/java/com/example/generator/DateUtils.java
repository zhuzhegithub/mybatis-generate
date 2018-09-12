package com.example.generator;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author zhuzhe
 * @date 2018/3/26 10:43
 */
public class DateUtils {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM");

    static Calendar cal = Calendar.getInstance();

    /**
     * 获取当前周的起始时间（周一） yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String getCurrentMonday(){
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String weekHand = simpleDateFormat.format(cal.getTime());
        return weekHand + " 00:00:00";
    }

    /**
     * 获取当前周的结束时间（周日） yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String getCurrentSunday(){
        cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
        String weekLast = simpleDateFormat.format(cal.getTime());
        return weekLast + " 24:00:00";
    }

    /**
     * 获取当前月的起始时间  yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String getCurrentMonthStart(){
        String format = simpleDateFormat2.format(cal.getTime());
        return format + "-01 00:00:00";
    }

    /**
     * 获取当前月的结束时间  yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String getCurrentMonthEnd(){
        int MaxDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        String format = simpleDateFormat2.format(cal.getTime());
        return format + "-" + MaxDay + " 24:00:00";
    }

    /**
     * 获取当前年的开始时间  yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String getCurrentYearStart(){
        return cal.get(cal.YEAR) + "-01-01 00:00:00";
    }

    /**
     * 获取当前年的结束时间  yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String getCurrentYearEnd(){
        return cal.get(cal.YEAR) + "-12-31 24:00:00";
    }


}
