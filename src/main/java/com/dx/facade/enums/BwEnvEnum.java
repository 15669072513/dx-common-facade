package com.dx.facade.enums;

import java.util.Arrays;

/**
 * 环境枚举
 */
public enum BwEnvEnum {

    /**
     * 定义了不同环境
     */
    DEV(1,"dev"),
    TEST(2,"test"),
    PRE(3,"prerelease"),
    PROD(4,"prod"),
    ;

    /**
     * 环境对应的id号
     */
    private final Integer id;

    /**
     * 环境对应的名称
     */
    private final String name;

    BwEnvEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static BwEnvEnum getByName(String name) {
        return Arrays.stream(values()).filter(item -> item.name.equals(name)).findAny().orElse(null);
    }

}