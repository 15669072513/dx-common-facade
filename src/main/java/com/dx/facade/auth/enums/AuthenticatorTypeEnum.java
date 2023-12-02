package com.dx.facade.auth.enums;

import lombok.Getter;

/**
 * @author tilt
 * @date 2023/12/02 11:42
 */
@Getter
public enum AuthenticatorTypeEnum {
    /**
     *
     */
    GOOGLE(1, "谷歌验证码"),
    /**
     *
     */
    @Deprecated
    PIC(2, "图片验证码"),
    /**
     *
     */
    SEAMOON(3, "海月验证"),
    ;

    AuthenticatorTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    private final Integer code;
    private final String value;

}
