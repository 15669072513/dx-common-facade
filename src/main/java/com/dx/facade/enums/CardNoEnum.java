package com.dx.facade.enums;

import java.util.Objects;

/**
 * CardNoEnum
 * 牌号枚举
 */
public enum CardNoEnum {
    方片A(0, "方片A"), // 方片1
    梅花A(1, "梅花A"), // 梅花1
    红桃A(2, "红桃A"), // 红桃1
    黑桃A(3, "黑桃A"), // 黑桃1
    方片2(4, "方片2"), // 方片2
    梅花2(5, "梅花2"), // 梅花2
    红桃2(6, "红桃2"), // 红桃2
    黑桃2(7, "黑桃2"), // 黑桃2
    方片3(8, "方片3"), // 方片3
    梅花3(9, "梅花3"), // 梅花3
    红桃3(10, "红桃3"), // 红桃3
    黑桃3(11, "黑桃3"), // 黑桃3
    方片4(12, "方片4"), // 方片4
    梅花4(13, "梅花4"), // 梅花4
    红桃4(14, "红桃4"), // 红桃4
    黑桃4(15, "黑桃4"), // 黑桃4
    方片5(16, "方片5"), // 方片5
    梅花5(17, "梅花5"), // 梅花5
    红桃5(18, "红桃5"), // 红桃5
    黑桃5(19, "黑桃5"), // 黑桃5
    方片6(20, "方片6"), // 方片6
    梅花6(21, "梅花6"), // 梅花6
    红桃6(22, "红桃6"), // 红桃6
    黑桃6(23, "黑桃6"), // 黑桃6
    方片7(24, "方片7"), // 方片7
    梅花7(25, "梅花7"), // 梅花7
    红桃7(26, "红桃7"), // 红桃7
    黑桃7(27, "黑桃7"), // 黑桃7
    方片8(28, "方片8"), // 方片8
    梅花8(29, "梅花8"), // 梅花8
    红桃8(30, "红桃8"), // 红桃8
    黑桃8(31, "黑桃8"), // 黑桃8
    方片9(32, "方片9"), // 方片9
    梅花9(33, "梅花9"), // 梅花9
    红桃9(34, "红桃9"), // 红桃9
    黑桃9(35, "黑桃9"), // 黑桃9
    方片T(36, "方片T"), // 方片10
    梅花T(37, "梅花T"), // 梅花10
    红桃T(38, "红桃T"), // 红桃10
    黑桃T(39, "黑桃T"), // 黑桃10
    方片J(40, "方片J"), // 方片J
    梅花J(41, "梅花J"), // 梅花J
    红桃J(42, "红桃J"), // 红桃J
    黑桃J(43, "黑桃J"), // 黑桃J
    方片Q(44, "方片Q"), // 方片Q
    梅花Q(45, "梅花Q"), // 梅花Q
    红桃Q(46, "红桃Q"), // 红桃Q
    黑桃Q(47, "黑桃Q"), // 黑桃Q
    方片K(48, "方片K"), // 方片K
    梅花K(49, "梅花K"), // 梅花K
    红桃K(50, "红桃K"), // 红桃K
    黑桃K(51, "黑桃K"), // 黑桃K
    ;

    private Integer code;
    private String desc;

    CardNoEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


    public static String getDesc(Integer code) {
        CardNoEnum anEnum = getType(code);
        return Objects.nonNull(anEnum) ? anEnum.desc : "";
    }

    public static CardNoEnum getType(Integer code) {
        CardNoEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CardNoEnum anEnum = var1[var3];
            if (anEnum.code.equals(code)) {
                return anEnum;
            }
        }
        return null;
    }
}
