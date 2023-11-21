package com.dx.facade.report.enums;

import com.google.common.collect.Lists;

/**
 * 代理返佣发放状态枚举
 * 0-未结算 1=已结算（数据不会在进行统计变动） 2-待发放  3-已发放 ,4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消)
 */
public  enum CommissionPayoutStatusEnum {


    UNSETTLED(0, "未结算"),
    //已结算
    SETTLED(1, "已结算"),
    //待发放
    UNAUDITED(2, "待发放"),
    //已发放
    ISSUED(3, "已发放"),
    //已过期
    EXPIRED(4, "已过期"),
    //无返佣
    NO_COMMISSION(5, "无返佣"),
    //已取消
    CANCELLED(6, "已取消");


    public Integer code;
    public String desc;

    CommissionPayoutStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CommissionPayoutStatusEnum getType(Integer code) {
        CommissionPayoutStatusEnum[] var1 = values();
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            CommissionPayoutStatusEnum type = var1[var3];
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static CommissionPayoutStatusEnum getTypeShow(Integer code) {
        if(Lists.newArrayList(0,1,2).contains(code)){
            return UNAUDITED;
        }
        CommissionPayoutStatusEnum[] var1 = values();
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            CommissionPayoutStatusEnum type = var1[var3];
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }
}