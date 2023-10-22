package com.dx.facade.enums;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 信用盘PC/APP端会员提现订单的状态枚举
 */
public enum PcAppWithdrawOrderStatusEnum {
    //1处理中，2审核通过，3审核拒绝
    处理中(1, "处理中"),
    审核通过(2, "审核通过"),
    审核拒绝(3, "审核拒绝"),
    ;
    private Integer code;
    private String desc;

    PcAppWithdrawOrderStatusEnum(Integer code, String des) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static PcAppWithdrawOrderStatusEnum getType(Integer code) {
        for (PcAppWithdrawOrderStatusEnum withdrawStatus : values()) {
            if (withdrawStatus.code.equals(code)) {
                return withdrawStatus;
            }
        }
        return null;
    }


    /**
     * 根据服务端提现订单状态，转换为pc/app端客户端订单状态
     * @param dbOrderStatus
     * @return
     */
    public static Integer getClientOrderStatusByDbOrderStatus(int dbOrderStatus) {
        if (dbOrderStatus == WithdrawOrderStatus.一审拒绝.code()
                || dbOrderStatus == WithdrawOrderStatus.二审拒绝.code()
                || dbOrderStatus == WithdrawOrderStatus.三审拒绝.code()
                || dbOrderStatus == WithdrawOrderStatus.出款失败.code()
                || dbOrderStatus == WithdrawOrderStatus.出款取消.code()) {
            return 审核拒绝.code();
        }
        if (dbOrderStatus == WithdrawOrderStatus.已出款.code()) {
            return 审核通过.code();
        }
        return 处理中.code();
    }
}
