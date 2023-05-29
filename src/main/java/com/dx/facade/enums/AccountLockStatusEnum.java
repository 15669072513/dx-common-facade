package com.dx.facade.enums;


import com.dx.enums.I18nEnum;

/**
 * @author agan
 * account-server 国际化错误码枚举
 */
public enum AccountLockStatusEnum {

    LOCK(1),
    UNLOCK(0);

    private Integer code;

    AccountLockStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
