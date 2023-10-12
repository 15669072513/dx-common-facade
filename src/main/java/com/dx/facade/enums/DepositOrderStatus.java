package com.dx.facade.enums;

import io.swagger.models.auth.In;

import java.util.HashMap;
import java.util.Map;

public enum DepositOrderStatus {
    待付款(0, "待付款", "待付款"),
    待确认(1, "待确认", "待确认"),
    处理中(2, "处理中", "处理中"),
    成功(3, "成功", "成功"),
    失败(4, "失败", "失败"),
    已取消(5, "已取消", "已取消");

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

    static Map<Integer, DepositOrderStatus> code2DepositOrderStatus = new HashMap<>();
    static {
        for (DepositOrderStatus value : DepositOrderStatus.values()) {
            code2DepositOrderStatus.put(value.code, value);
        }
    }
    public static DepositOrderStatus byCode(Integer code){
        return code2DepositOrderStatus.get(code);
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
