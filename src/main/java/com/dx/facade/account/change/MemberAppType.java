package com.dx.facade.account.change;

import com.dx.exception.BizException;

public enum MemberAppType implements IAppType {
    deposit(1, "存款"),
    withdraw(2, "取款"),
    transfer(3, "转账"),
    rebate(4, "返水"),
    activity(5, "活动优惠"),
    reward(6, "会员福利"),
    other(7, "其他"),
    deposit_discount(8, "存款优惠"),
    ;

    private Integer code;
    private String desc;

    MemberAppType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static MemberAppType getType(Integer code) throws BizException {
        for (MemberAppType appMemberChangeType : values()) {
            if (appMemberChangeType.code.equals(code)) {
                return appMemberChangeType;
            }
        }
        throw new BizException("没有这个MemberAppType");
    }
}