package com.dx.facade.account.change;

import java.util.Arrays;
import java.util.List;

/**
 *
 * 钱包类型
 */
public enum WalletType implements IWalletType {
    cash(1, "会员中心钱包余额"),
    //彩金钱包(2, "彩金钱包"),
    //虚拟货币(3, "虚拟货币"),
    //会员积分(4, "会员积分"),
    cash_lock(5, "会员中心钱包冻结余额"),
    commission(6, "佣金钱包"),
    quota(7, "额度钱包"),
    agent_lock(8, "代理中心钱包冻结余额"),
    credit_available(9, "会员信用余额"),
    credit_total(10, "会员信用额度"),
    //场馆钱包 虚拟钱包
    texas(11, "德州场馆钱包"),
    video(12, "真人场馆钱包"),
    sports(13, "体育场馆钱包"),
    lottery(14, "彩票场馆钱包"),
    poker(15, "棋牌场馆钱包"),
    e_sports(16, "电竞场馆钱包"),

    agent_cash(17, "代理中心钱包余额"),
    agent_credit_available(18, "代理信用余额"),
    agent_credit_total(19, "代理信用额度"),
    ;

    private Integer code;
    private String desc;

    WalletType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    @Override
    public Integer code() {
        return code;
    }

    @Override
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

    /**
     * 玩家注册后需要再db初始化的钱包类型
     * orbit›
     */
    public static List<WalletType> initWalletList() {
        return Arrays.asList(
          cash,
          cash_lock,
          agent_lock,
          credit_available,
          credit_total,
          agent_cash,
          agent_credit_available,
          agent_credit_total
        );
    }
}