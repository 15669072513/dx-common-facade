package com.dx.facade.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;

/**
 * @author orbit
 * @datetime 2023-10-24 17:37
 * @desc 银行卡虚拟币账号脱敏公共方法
 */
public class UserAccountHiddenUtil {

    /**
     * @param source    原账号信息
     * @return  脱敏后的信息
     */
    public static String hide(String source) {
        if(StringUtils.isBlank(source) || source.length() < 8) {
            return source;
        }
            String start = source.substring(0,4);
            String end = source.substring(source.length()-4,source.length());
            int starCount = source.length() - 8;
            //最多4个星星
            starCount = (starCount >= 4 ? 4 : starCount);
            StringBuilder star = new StringBuilder();
            for (int i = 0; i < starCount; i++){
                star.append("*");
            }
            return start + star + end;
    }

    public static String hideIp(String source){
        if(StringUtils.isBlank(source) || source.length() < 4) {
            return source;
        }
        String start = source.substring(0,2);
        String end = source.substring(source.length()-2,source.length());
        int starCount = source.length() - 4;
        starCount = (starCount >= 4 ? 4 : starCount);
        StringBuilder star = new StringBuilder();

        for (int i = 0; i < starCount; i++){
            star.append("*");
        }
        return start + star + end;
    }
}