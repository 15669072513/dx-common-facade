package com.dx.facade.enums;

public enum DepositOrderClientStatus4Show {
    处理中(0, "处理中"),
    成功(1, "成功"),
    失败(2, "失败");

    public Integer code;
    public String desc;

    private DepositOrderClientStatus4Show(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public static String getDesc(Integer code) {
        DepositOrderClientStatus4Show[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            DepositOrderClientStatus4Show status = var1[var3];
            if (status.code.intValue() == code.intValue()) {
                return status.desc;
            }
        }
        return null;
    }
}
