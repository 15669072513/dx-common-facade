package com.dx.facade.enums;

import java.util.Objects;

/**
 * 第三方支付类型
 */
public enum ThirdPaymentType {

    支付宝支付(0, "支付宝"),
    微信支付(1, "微信"),
    银行卡支付(2, "银行卡"),
    虚拟币支付(3, "虚拟币"),
    其他(4, "其他"),
    ;

    public Integer code;
    public String desc;

    ThirdPaymentType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(Integer code) {
        ThirdPaymentType domainStatusType = getType(code);
        return Objects.nonNull(domainStatusType) ? domainStatusType.desc : "";
    }

    public static ThirdPaymentType getType(Integer code) {
        ThirdPaymentType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ThirdPaymentType domainStatusType = var1[var3];
            if (domainStatusType.code.equals(code)) {
                return domainStatusType;
            }
        }

        return null;
    }
}
