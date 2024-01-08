package com.dx.facade.message.enums;

public enum NoticeTypeEnum {
    NOTICE(1), //系统通知
    MESSAGE(2), // 站内信
    ANNOUNCE(3), // 公告
    BAR(4), // 代理中心、代理后台通知栏

    @Deprecated  ACTIVITY(2),
    @Deprecated BONUS(4),
    ;

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
