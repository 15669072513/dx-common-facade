package com.dx.facade.enums;

import io.swagger.models.auth.In;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum DepositOrderStatus {

    待付款(0, "待付款", 2),
    待确认(1, "待确认", 2),
    处理中(2, "处理中", 2),
    成功(3, "成功", 3),
    失败(4, "失败", 4),
    已取消(5, "已取消", 4),
    未知(-1, "未知", -1);

    public Integer code;
    public String desc;
    public Integer clientCode;

    DepositOrderStatus(Integer code, String desc, Integer clientCode) {
        this.code = code;
        this.desc = desc;
        this.clientCode = clientCode;
    }

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public Integer clientCode() {
        return this.clientCode;
    }

    static Map<Integer, DepositOrderStatus> code2DepositOrderStatus = new HashMap<>();

    static {
        for (DepositOrderStatus value : DepositOrderStatus.values()) {
            code2DepositOrderStatus.put(value.code, value);
        }
    }

    public static DepositOrderStatus byCode(Integer code) {
        DepositOrderStatus orderStatus = code2DepositOrderStatus.get(code);
        return Objects.nonNull(orderStatus) ? orderStatus : DepositOrderStatus.未知;
    }

    public static String getDesc(Integer code) {
        return byCode(code).desc;
    }

    public static String getClientDesc(Integer code) {
        return DepositOrderAppStatus.byCode(
                DepositOrderStatus.byCode(code).clientCode()).desc;
    }
}
