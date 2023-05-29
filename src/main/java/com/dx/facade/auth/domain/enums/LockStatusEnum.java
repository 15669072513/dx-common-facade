package com.dx.facade.auth.domain.enums;

/**
 * 锁定状态
 */
public enum LockStatusEnum {
    UN_LOCK(0),
    LOCK(1);

    private int lockStatus;

    LockStatusEnum(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    public int getLockStatus() {
        return lockStatus;
    }
}
