package com.dx.facade.account.change;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 钱包类型
 */
public enum WalletType implements IWalletType {
    cash(1, "会员中心钱包"),
    cash_lock(5, "会员中心钱包冻结余额"),
    commission(6, "佣金钱包"),
    quota(7, "额度钱包"),
    agent_lock(8, "代理中心钱包冻结余额"),
    credit_available(9, "会员信用钱包"),
    credit_total(10, "会员信用额度"),
    texas(11, "德州场馆钱包"),
    video(12, "真人场馆钱包"),
    sports(13, "体育场馆钱包"),
    lottery(14, "彩票场馆钱包"),
    poker(15, "棋牌场馆钱包"),
    e_sports(16, "电竞场馆钱包"),
    agent_cash(17, "代理中心钱包"),
    agent_credit_available(18, "代理信用钱包"),
    agent_credit_total(19, "代理信用额度")
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

    static Map<Integer, WalletType> code2Enum = new HashMap<>();
    static {
        for (WalletType value : WalletType.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static WalletType getType(Integer code) {
        return code2Enum.get(code);
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