package com.dx.facade.message.enums;

public enum NoticeTypeEnum {
    NOTICE(1), ACTIVITY(2), ANNOUNCE(3), BONUS(4);

    private int value;

    NoticeTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
