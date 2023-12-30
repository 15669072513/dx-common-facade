package com.dx.facade.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Objects;

/**
 * @author jackpost
 * @datetime 2023-12-24
 * @desc TODO
 */
public class TimeStampUtil {
    public static Long format(Long time) {
        int length = Long.toString(time).length();
        if(length != 13) {
            return time;
        } else {
            try{
                Date date = new Date(time);
                time = Long.valueOf(DateUtils.dateToStringYMR(date));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return time;
        }
    }
}
