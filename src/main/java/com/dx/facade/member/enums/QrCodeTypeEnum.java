package com.dx.facade.member.enums;

public enum QrCodeTypeEnum {

    /**
     * 二维码类型
     */
    USER_LOGIN(1, "用户登入码"),
    USER_TABLE(2, "用户登入牌桌码"),
    DX_TABLE(3, "牌桌码/注册邀请"),
    ;

    private final Integer code;
    private final String desc;

    QrCodeTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static QrCodeTypeEnum getType(Integer code) {
        for (QrCodeTypeEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
