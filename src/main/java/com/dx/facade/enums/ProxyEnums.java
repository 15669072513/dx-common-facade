package com.dx.facade.enums;

import java.util.Objects;

/**
 @title
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年10月20日 21:08:56
*/
public class ProxyEnums {

    public ProxyEnums() {
    }

    public static enum ProxyPayoutStatus {
        已取消(0, "已取消"),
        已发放(1, "已发放"),
        无佣金(2, "无佣金");

        public Integer code;
        public String desc;

        private ProxyPayoutStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getDesc(Integer code) {
            ProxyPayoutStatus contractTemplateType = this.getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public ProxyPayoutStatus getType(Integer code) {
            ProxyPayoutStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyPayoutStatus contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }

            return null;
        }

        public Integer getCode() {
            return code;
        }
    }

    /**
     * 非总代佣金记录-客户端状态
     */
    public static enum ProxySettlementStatus {
        未结清(1, "未结清"),
        已结清(2, "已结清"),
        无佣金(3, "无佣金");
        public Integer code;
        public String desc;

        private ProxySettlementStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getDesc(Integer code) {
            ProxySettlementStatus contractTemplateType = this.getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public ProxySettlementStatus getType(Integer code) {
            ProxySettlementStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ProxySettlementStatus contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }

            return null;
        }
    }

    /**
     * 流水返点记录-客户端状态
     */
    public static enum ProxyWaterRebateStatus {
        未结清(0, "未结清"),
        待审核(1, "待发放"),
        待领取(2, "待领取"),
        领取成功(3, "已领取"),
        超时未领取(4, "已过期"),
        无返点(5, "无返点"),
        已取消(6, "已取消");

        public Integer code;
        public String desc;

        private ProxyWaterRebateStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer getCode(){
            return this.code;
        }

        public static String getDesc(Integer code) {
            ProxyWaterRebateStatus contractTemplateType = getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public static ProxyWaterRebateStatus getType(Integer code) {
            ProxyWaterRebateStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyWaterRebateStatus contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }
            return null;
        }
    }

    /**
     * 代理佣金审核记录--订单状态
     */
    public static enum CommissionReviewRecordStatus {
        未结清(1, "一审拒绝"),
        待审核(3, "二审拒绝"),
        待领取(4, "审核通过");

        public Integer code;
        public String desc;

        private CommissionReviewRecordStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getDesc(Integer code) {
            CommissionReviewRecordStatus contractTemplateType = this.getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public CommissionReviewRecordStatus getType(Integer code) {
            CommissionReviewRecordStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                CommissionReviewRecordStatus contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }
            return null;
        }
    }

    /**
     * 代理帐号修改审核-审核申请类型
     */
    public static enum ProxyAccountAuditType {
        支付密码重置(1, "支付密码重置"),
        登录密码重置(2, "登录密码重置"),
        私庄模式升级(3, "私庄模式升级"),
        分润策略调整(4, "分润策略调整");

        public Integer code;
        public String desc;

        private ProxyAccountAuditType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ProxyAccountAuditType contractTemplateType = getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public static ProxyAccountAuditType getType(Integer code) {
            ProxyAccountAuditType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyAccountAuditType contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }
            return null;
        }
    }

    /**
     * 私庄模式
     */
    public static enum ProxyBankerMode{
        吃单模式(1, "吃单模式"),
	    坐庄模式(2, "坐庄模式");

        public Integer code;
        public String desc;

        private ProxyBankerMode(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ProxyBankerMode contractTemplateType = getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public static ProxyBankerMode getType(Integer code) {
            ProxyBankerMode[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ProxyBankerMode contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }
            return null;
        }
    }


    /**
     * 代理注单设置记录-查询条件-设置类型
     */
    public static enum ProxyConfigType {
        自动吃单(1, "自动吃单"),
        自动转单(2, "自动转单");
//        自动飞单(3, "自动飞单");

        public Integer code;
        public String desc;

        private ProxyConfigType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ProxyConfigType contractTemplateType = getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public static ProxyConfigType getType(Integer code) {
            ProxyConfigType[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ProxyConfigType contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }
            return null;
        }
    }
}
