package com.dx.facade.report.constant;


import com.google.common.collect.Lists;

/**
 * 代理反点相关枚举
 */
public class ProxyRebateConstantWrapper {
    public  enum OrderStatusEnum {
        ONE_WAIT(0, "待一审"),
        ONE_REJECT(1, "一审拒绝"),
        TWO_WAIT(2, "待二审"),
        TWO_REJECT(3, "二审拒绝"),
        TWO_PASS(4, "二审通过");

        public Integer code;
        public String desc;

        OrderStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static OrderStatusEnum getType(Integer code) {
            OrderStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                OrderStatusEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
    }

    public  enum PayoutStatusEnum {

        UNSETTLED(0, "未结算"),
        UNAUDITED(1, "待发放"),
        UNRECEIVED(2, "未领取"),
        RECEIVED(3, "已发放"),
        RECEIVE_TIMEOUT(4, "超时未领取"),
        NO_REBATE(5, "无返点"),
        CANCELLED(6, "已取消");



        public Integer code;
        public String desc;

        PayoutStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static ProxyRebateConstantWrapper.PayoutStatusEnum getType(Integer code) {
            ProxyRebateConstantWrapper.PayoutStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyRebateConstantWrapper.PayoutStatusEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
        public static ProxyRebateConstantWrapper.PayoutStatusEnum getTypeShow(Integer code) {
            if(Lists.newArrayList(0,1,2).contains(code)){
                return PayoutStatusEnum.UNAUDITED;
            }
            ProxyRebateConstantWrapper.PayoutStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyRebateConstantWrapper.PayoutStatusEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }

    }

    /**
     * 锁单状态
     */
    public  enum LockStatusEnum {
        OPEN(0, "未锁单"),
        LOCKED(1, "锁单中");

        public Integer code;
        public String desc;

        LockStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }
        public static LockStatusEnum getType(Integer code) {
            LockStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                LockStatusEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
    }

    /**
     * 审核结果状态
     */
    public  enum AuditResultEnum {
        PASS(1, "通过"),
        REJECT(2, "拒绝");

        public Integer code;
        public String desc;

        AuditResultEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }
        public static AuditResultEnum getType(Integer code) {
            AuditResultEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                AuditResultEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
    }

}
