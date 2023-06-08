package com.dx.facade.enums;

/**
 * 游戏锁定状态枚举
 * 
 * @author bicycle
 * member-service 国际化错误码枚举
 */
public enum GameLockStatusEnum {

    LOCK(1),
    UNLOCK(0);

    private Integer code;

    GameLockStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
