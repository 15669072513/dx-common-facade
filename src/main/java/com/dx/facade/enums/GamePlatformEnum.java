package com.dx.facade.enums;

/**
 * 图片类型枚举：1.人工加额，2-人工减额，3-取款审核
 */
public enum GamePlatformEnum {
    ZK_PLATFORM(1, "中控"),
    PROXY_PLATFORM(2,"代理"),
    ;
    private Integer code;
    private String desc;

    GamePlatformEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }



    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
