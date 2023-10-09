package com.dx.facade.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @author orbit
 * @datetime 2023-10-09 16:43
 * @desc TODO
 */
public class WindControlUtil {
    public static String format(String windControlInfo) {
        if(StringUtils.isBlank(windControlInfo)) return "";
        if(Objects.equals("-", windControlInfo)) return "";
        return windControlInfo;
    }
}
