package com.dx.facade.report.constant;

import com.google.common.collect.Lists;
public enum PayoutStatusNewEnum {
    //未结算
    NO_SETTLEMENT(0, "未结算"),
    //已结算
    SETTLEMENT(1, "已结算"),
    //待发放
    WAIT_GRANT(2, "待发放"),
    //已发放
    GRANT(3, "已发放"),
    //已过期
    EXPIRED(4, "已过期"),
    //无返佣
    NO_COMMISSION(5, "无返佣"),
    //已取消
    CANCEL(6, "已取消");


    public final Integer code;
    public final String desc;

    PayoutStatusNewEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static PayoutStatusNewEnum getType(Integer code) {
        PayoutStatusNewEnum[] var1 = values();
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            PayoutStatusNewEnum type = var1[var3];
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    /**
     * 返佣显示-》01，2统一显示为待发放
     * @param code
     * @return
     */
    public static String getTypeByShowDesc(Integer code) {
        PayoutStatusNewEnum[] var1 = values();
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            PayoutStatusNewEnum type = var1[var3];
            if(Lists.newArrayList(0,1,2).contains(type.code)){
                return NO_SETTLEMENT.desc;
            }

            if (type.code.equals(code)) {
                return type.desc;
            }
        }
        return null;
    }

}