package com.dx.facade.account.enums;

import java.util.Objects;

/**
 * 资金操作记录，操作栏目枚举
 */
public enum PageEnum {

    BILL_SETTING(1,"账单相关设置", SectionEnum.BILL_MANAGER),
    PROXY_ARTIFICIAL_ADD(2,"代理人工增加加额", SectionEnum.ACCOUNT_ADJUST),
    PROXY_ARTIFICIAL_SUB(3,"代理人工扣除额度", SectionEnum.ACCOUNT_ADJUST),
    MEMBER_ARTIFICIAL_ADD(4,"会员人工增加额度", SectionEnum.ACCOUNT_ADJUST),
    MEMBER_ARTIFICIAL_SUB(5,"会员人工扣除额度", SectionEnum.ACCOUNT_ADJUST),
    MEMBER_WITHDRAW_AUDIT(6,"会员取款审核待出款", SectionEnum.ACCOUNT_AUDIT),
    PROXY_WITHDRAW_AUDIT(7,"代理取款审核待出款", SectionEnum.ACCOUNT_AUDIT),
    PAY_MERCHANT_MANAGER(8,"支付厂商管理", SectionEnum.IN_OUT_CONFIG),
    THIRD_IN_MANAGER(9,"三方入款管理", SectionEnum.IN_OUT_CONFIG),
    THIRD_OUT_MANAGER(10,"三方出款管理", SectionEnum.IN_OUT_CONFIG),
    EXCHANGE_RATE_CONFIG(11,"汇率串配置", SectionEnum.EXCHANGE_RATE_CONFIG),
    MEMBER_WITHDRAW_CONFIG(12,"会员提现配置", SectionEnum.DEPOSIT_WITHDRAW_CONFIG),
    MEMBER_DEPOSIT_CHANNEL_CONFIG(13,"会员充值通道配置", SectionEnum.DEPOSIT_WITHDRAW_CONFIG),
    MEMBER_WITHDRAW_CHANNEL_CONFIG(14,"会员提款通道配置", SectionEnum.DEPOSIT_WITHDRAW_CONFIG),
    PROXY_WITHDRAW_CONFIG(15,"代理提现配置", SectionEnum.DEPOSIT_WITHDRAW_CONFIG),
    PROXY_DEPOSIT_CHANNEL_CONFIG(16,"代理充值通道配置", SectionEnum.DEPOSIT_WITHDRAW_CONFIG),
    PROXY_WITHDRAW_CHANNEL_CONFIG(17,"代理提款通道配置", SectionEnum.DEPOSIT_WITHDRAW_CONFIG);


    private Integer code;
    private String desc;
    private SectionEnum section;
    PageEnum(Integer code, String desc, SectionEnum section) {
        this.code = code;
        this.desc = desc;
        this.section = section;
    }

    public Integer code() {
        return this.code;
    }
    public String desc() {
        return this.desc;
    }
    public SectionEnum section() {
        return this.section;
    }

    public static PageEnum get(Integer code) {
        PageEnum[] values = PageEnum.values();
        for (PageEnum e : values) {
            if(Objects.equals(code, e.code())) {
                return e;
            }
        }
        return null;
    }
}
