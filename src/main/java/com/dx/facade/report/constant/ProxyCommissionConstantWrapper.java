package com.dx.facade.report.constant;


/**
 * 代理佣金相关枚举
 */
public class ProxyCommissionConstantWrapper {
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


    /**
     * 总代客户端状态
     */
    public  enum TopClientPayoutStatusEnum {
        已取消(0, "已取消"),
        已发放(1, "已发放"),
        无佣金(2, "无佣金");


        public final Integer code;
        public final String desc;

        public Integer getCode(){
            return code;
        }

        TopClientPayoutStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static ProxyCommissionConstantWrapper.TopClientPayoutStatusEnum getType(Integer code) {
            ProxyCommissionConstantWrapper.TopClientPayoutStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyCommissionConstantWrapper.TopClientPayoutStatusEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
    }

    /**
     * 非总代客户端状态
     */
    public  enum ChildClientPayoutStatusEnum {
        已取消(0, "已取消"),
        未结清(1, "未结清"),
        已结清(2, "已结清"),
        无佣金(3, "无佣金");

        public final Integer code;
        public final String desc;

        public Integer getCode(){
            return code;
        }

        ChildClientPayoutStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static ProxyCommissionConstantWrapper.ChildClientPayoutStatusEnum getType(Integer code) {
            ProxyCommissionConstantWrapper.ChildClientPayoutStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyCommissionConstantWrapper.ChildClientPayoutStatusEnum type = var1[var3];
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
    }


    public  enum PayoutStatusEnum {

        CANCEL(0, "已取消"),
        ALL_NO(1, "收付款未结清"),
        RECEIVE_NO_PAY_YES(2, "收款未结清，付款已结清"),
        RECEIVE_YES_PAY_NO(3, "收已结清，付款未结清"),
        ALL_YES(4, "收付款都已结清"),
        NO_COMMISSION(5, "无佣金");


        public final Integer code;
        public final String desc;

        PayoutStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static ProxyCommissionConstantWrapper.PayoutStatusEnum getType(Integer code) {
            ProxyCommissionConstantWrapper.PayoutStatusEnum[] var1 = values();
            int var2 = var1.length;
            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyCommissionConstantWrapper.PayoutStatusEnum type = var1[var3];
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

        public final Integer code;
        public final String desc;

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

        public final Integer code;
        public final String desc;

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
