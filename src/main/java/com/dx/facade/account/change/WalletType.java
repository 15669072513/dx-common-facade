package com.dx.facade.account.change;

/**
 * 钱包类型
 */
public enum WalletType implements IWalletType {
    cash(1, "中心钱包"),
    彩金钱包(2, "彩金钱包"),
    虚拟货币(3, "虚拟货币"),
    会员积分(4, "会员积分"),
    member_lock(5, "会员提款锁定钱包"),
    commission(6, "佣金钱包"),
    quota(7, "额度钱包"),
    agent_lock(8, "代理提款锁定钱包"),
    ;

    private Integer code;
    private String desc;

    WalletType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public String getDesc() {
        return desc;
    }


    public static WalletType getType(Integer code) {
        for (WalletType accountType : values()) {
            if (accountType.code.equals(code)) {
                return accountType;
            }
        }
        return null;
    }
}