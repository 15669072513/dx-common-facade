package com.dx.facade.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Objects;

/**
 * @author max
 * 实践操作工具类
 */
@Slf4j
public class DateUtils {

    public static final DateTimeFormatter PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter PATTERN_YMR = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter PATTERN_YM = DateTimeFormatter.ofPattern("yyyyMM");
    public static final DateTimeFormatter PATTERN_YMR2 = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static final DateTimeFormatter PATTERN_YMR3 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final DateTimeFormatter yyyyMMdd_ = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

    public static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static Integer getRoundNoDate(String roundNo) {
        int year = Integer.parseInt("20" + roundNo.substring(4, 6));
        int monthValue = Integer.parseInt(roundNo.substring(6, 7), 16);
        int dayOfMonth = Integer.parseInt(roundNo.substring(7, 9));
        return Integer.valueOf(String.format("%s%02d%02d", year, monthValue, dayOfMonth));
    }

    public static String getDateNum(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return PATTERN_YMR3.format(localDateTime);
    }

    public static Integer getDateInt(LocalDate localDate) {
        return Integer.valueOf(localDate.format(PATTERN_YMR2));
    }

    /**
     * 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static String longYMRHMS(long time) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        return PATTERN.format(localDateTime);
    }

    /**
     * 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static String longToYMR(long time) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        return PATTERN_YMR.format(localDateTime);
    }


    /**
     * String 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static String stringToYMR(String time) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(time)), ZoneId.systemDefault());
        return PATTERN_YMR.format(localDateTime);
    }

    /**
     * String 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static String stringToYM(String time) {
        LocalDateTime LocalTime = LocalDateTime.parse(time, df);
        return PATTERN_YM.format(LocalTime);
    }

    /**
     * String 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static LocalDateTime stringToYMHHMMSS(String time) {
        return LocalDateTime.parse(time, df);
    }

    /**
     * 获取月份
     * 入参 yyyyMM
     * 反参 月份
     */
    public static int getMonthByYM(String yyyyMM) {
        LocalDate LocalTime = LocalDate.parse(yyyyMM + "01", PATTERN_YMR2);
        return LocalTime.getMonth().getValue();
    }

    /**
     * String 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static String stringToYMRHMS(String time) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(time)), ZoneId.systemDefault());
        return PATTERN.format(localDateTime);
    }

    /**
     * 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static LocalDate longToLocalDate(long time) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault()).toLocalDate();
    }


    /**
     * date 转为 yyyy-MM-dd HH:mm:ss
     */
    public static String dateToString(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return PATTERN.format(localDateTime);
    }

    /**
     * Date 转 LocalDate
     */
    public static LocalDate dateToLocalDate(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime intToLocalDateTime(int date, String time) {
        String localDateStr = PATTERN_YMR.format(PATTERN_YMR2.parse(String.valueOf(date))) + time;//转为 yyyy-MM-dd HH:mm:ss
        return LocalDateTime.parse(localDateStr, PATTERN);
    }

    /**
     * 时间戳转为 yyyy-MM-dd HH:mm:ss
     */
    public static LocalDateTime longToLocalDateTime(long time) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
    }

    /**
     * LocalDateTime 转 字符串
     */
    public static String localDateTimeToString(LocalDateTime time, DateTimeFormatter df) {
        return df.format(time);
    }

    public static String localDateToString(LocalDate date, DateTimeFormatter df) {
        return df.format(date);
    }

    /**
     * date 转为 yyyyMMdd
     */
    public static String dateToStringYMR(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return PATTERN_YMR2.format(localDateTime);
    }

    public static Date stringToDate(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(time);
        return date;
    }

    /**
     * date 转为 yyyyMMdd
     */
    public static String localDateToStringYMR(LocalDate localDate) {
        if (Objects.isNull(localDate)) {
            return null;
        }
//        log.info("localDateToStringYMR 请求参数：{}", JacksonUtil.writeValue(localDate));
        Date date = localDateToDate(localDate);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return PATTERN_YMR.format(localDateTime);
    }

    public static Date localDateToDate(LocalDate localDate) {
//        log.info("localDateToDate 请求参数：{}", JacksonUtil.writeValue(localDate));
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }

    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
//        log.info("localDateToDate 请求参数：{}", JacksonUtil.writeValue(localDateTime));
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        return Date.from(zdt.toInstant());
    }


    public static long localDateTimeToLong(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return 0;
        }
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return instant.toEpochMilli();
    }


    public static String dateOfPattern(LocalDateTime dateTime) {
        if (Objects.isNull(dateTime)) {
            return null;
        }
        return dateTime.format(PATTERN);
    }

    /**
     * 计算两个日期相差的秒数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static int calLastedTime(Date startDate, Date endDate) {
        long a = endDate.getTime();
        long b = startDate.getTime();
        int c = (int) ((a - b) / 1000);
        return c;
    }

    public static boolean  isInThisWeek(LocalDateTime dateTime) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = dateTime.toLocalDate();

        LocalDate startTime = now.with(DayOfWeek.MONDAY);
        LocalDate endTime = now.with(DayOfWeek.SUNDAY);
        boolean after = localDate.isAfter(startTime) || startTime.equals(localDate);
        boolean before = localDate.isBefore(endTime) || endTime.equals(localDate);

        return after&&before;
    }
    public static boolean  isInThisMonth(LocalDateTime dateTime) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = dateTime.toLocalDate();

        LocalDate startTime = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate endTime = now.with(TemporalAdjusters.lastDayOfMonth());
        boolean after = localDate.isAfter(startTime) || startTime.equals(localDate);
        boolean before = localDate.isBefore(endTime) || endTime.equals(localDate);

        return after&&before;
    }

    public static String getHHmm(Long time) {
        return DateTimeFormatter.ofPattern("HH:mm").format(DateUtils.longToLocalDateTime(time));
    }
    public static String getYYYYmmddHHmmss(Long time) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(DateUtils.longToLocalDateTime(time));
    }
    public static String formatInyyyyMMddHHmmss(LocalDateTime localDateTime) {
        return localDateTime.format(PATTERN);
    }

    public static String formatyyyyMMdd_(LocalDateTime localDateTime) {
        return localDateTime.format(yyyyMMdd_);
    }
}
