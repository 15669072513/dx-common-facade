package com.dx.facade.enums;

public enum DepositOrderStatus {
    待付款(0, "待处理", "处理中"),
    成功(1, "成功", "成功"),
    失败(2, "失败", "失败"),
    已关闭(3, "已关闭", "失败");

    public Integer code;
    public String desc;
    public String clientDesc;

    private DepositOrderStatus(Integer code, String desc, String clientDesc) {
        this.code = code;
        this.desc = desc;
        this.clientDesc = clientDesc;
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

    public String getClientDesc() {
        return this.clientDesc;
    }

    public String clientDesc() {
        return this.clientDesc;
    }

    public static String getDesc(Integer code) {
        DepositOrderStatus[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            DepositOrderStatus status = var1[var3];
            if (status.code.intValue() == code.intValue()) {
                return status.desc;
            }
        }
        return null;
    }

    public static String getClientDesc(Integer code) {
        DepositOrderStatus[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            DepositOrderStatus status = var1[var3];
            if (status.code.intValue() == code.intValue()) {
                return status.clientDesc;
            }
        }

        return null;
    }
}
