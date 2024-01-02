package com.dx.facade.report.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 字符串格式化工具
 */

public class StrFormatUtil {
    /**
     *  字符串格式化时间格式
     * @param str
     * @param formFormat 原格式
     * @param targetFormat  目标格式
     * @return
     */
    public static String formatDateStr(String str,String formFormat,String targetFormat){
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(formFormat);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(targetFormat);
        // 解析字符串为 LocalDate 对象
        LocalDate localDate = LocalDate.parse(str, inputFormatter);
        // 将 LocalDate 对象格式化为指定格式的字符串
        return localDate.format(outputFormatter);
    }
}
