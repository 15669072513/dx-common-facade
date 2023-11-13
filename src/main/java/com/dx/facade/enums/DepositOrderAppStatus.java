package com.dx.facade.enums;

import org.springframework.util.CollectionUtils;

import java.util.*;

public enum DepositOrderAppStatus {

    待处理(2, "待处理", Arrays.asList(DepositOrderStatus.待付款, DepositOrderStatus.待确认, DepositOrderStatus.处理中)),
    成功(3, "成功", Arrays.asList(DepositOrderStatus.成功)),
    失败(4, "失败", Arrays.asList(DepositOrderStatus.失败)),
    已取消(5, "已取消", Arrays.asList(DepositOrderStatus.已取消)),
    未知(-1, "未知", Collections.emptyList());

    public Integer code;
    public String desc;
    public List<DepositOrderStatus> orderStatuses;

    DepositOrderAppStatus(Integer code, String desc, List<DepositOrderStatus> orderStatuses) {
        this.code = code;
        this.desc = desc;
        this.orderStatuses = orderStatuses;
    }

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    static Map<Integer, DepositOrderAppStatus> code2DepositOrderStatus = new HashMap<>();

    static {
        for (DepositOrderAppStatus value : DepositOrderAppStatus.values()) {
            code2DepositOrderStatus.put(value.code, value);
        }
    }

    public static DepositOrderAppStatus byCode(Integer code) {
        DepositOrderAppStatus depositOrderAppStatus = code2DepositOrderStatus.get(code);
        return Objects.nonNull(depositOrderAppStatus) ? depositOrderAppStatus : DepositOrderAppStatus.未知;
    }

    public static String getDesc(Integer code) {
        return DepositOrderAppStatus.byCode(code).desc;
    }

    public static String clientDesc(Integer code) {
        return DepositOrderAppStatus.byCode(DepositOrderStatus.byCode(code).clientCode()).desc;
    }

}
