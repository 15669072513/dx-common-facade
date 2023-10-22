package com.dx.facade.enums;

public enum WithdrawOrderStatus {
    待一审(1, "待一审", 0),
    一审审核(2, "一审审核", 0),
    待二审(3, "待二审", 0),
    二审审核(4, "二审审核", 0),
    待三审(5, "待三审", 0),
    三审审核(6, "三审审核", 0),
    待出款(7, "待出款", 0),
    一审拒绝(8, "一审拒绝", 2),
    二审拒绝(9, "二审拒绝", 2),
    三审拒绝(10, "三审拒绝", 2),
    已出款(11, "出款成功", 1),
    出款取消(12, "出款取消", 2),
    出款失败(13, "出款失败", 2),
    //待出款，点击确认后是出款中
    出款中(14, "出款中",0),
    ;
    private Integer code;
    private String desc;
    public Integer clientCode;

    WithdrawOrderStatus(Integer code, String desc, Integer clientCode) {
        this.code = code;
        this.desc = desc;
        this.clientCode = clientCode;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public Integer clientCode() {
        return clientCode;
    }

    public static WithdrawOrderStatus getType(Integer code) {
        for (WithdrawOrderStatus withdrawStatus : values()) {
            if (withdrawStatus.code.equals(code)) {
                return withdrawStatus;
            }
        }
        return null;
    }
}
