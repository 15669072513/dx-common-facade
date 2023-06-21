package com.dx.facade.account.change;

import com.dx.exception.BizException;

public enum ProxyAppType implements IAppType {

    //代理钱包
    deposit(1, "存款"),
    deposit_for_member(2, "代下级存款"),
    activity(3, "活动优惠"),
    quota(4, "额度"),
    transfer(5, "代理转账"),
    other(6, "其他"),
    withdraw(7, "取款"),
    to_center(8, "佣金转回中心钱包"),
    commission(9, "佣金"),
    rebate(10, "返点"),
    transfer_with_banker(11, "代理划拨"),

    //私庄钱包
    banker_deposit(12, "入金"),
    banker_gambling(13, "对赌"),
    banker_settlement(14, "结算"),
    banker_adjust(15, "调整"),
    banker_withdrawal(16, "出金"),
    banker_grant_credits(17, "授信"),
    banker_undertake_rebate(18, "会员返水"),
    banker_undertake_venue(19, "场馆费"),
    banker_undertake_member_depost_withdrawal(20, "会员充提手续费"),
    banker_undertake_agent_depost_withdrawal(21, "代理充提手续费"),
    banker_undertake_reward(22, "会员福利"),
    banker_undertake_activity(23, "会员活动"),
    banker_undertake_deposit_discount(24, "会员存款优惠"),
    banker_undertake_adjust(25, "会员调整"),
    platform_apportion(26, "平台分摊"),
    pre_settlement(27, "预结算"),


    officer_proxy_up_score(28, "官方给代理上分"),
    proxy_be_up_score(29, "代理被上级上分"),
    proxy_to_child_up_score(30, "代理给下级上分"),
    proxy_to_mem_up_score(31, "代理给会员上分"),

    officer_proxy_down_score(32, "官方给代理下分"),
    proxy_be_down_score(33, "代理被上级下分"),
    proxy_to_child_down_score(34, "代理给下级下分"),
    proxy_to_mem_down_score(35, "代理给会员下分"),
    undertake_rebate(36, "流水返点"),
    commission_to_quota(38, "佣金转额度钱包"),
    commission_rebate_add(39, "返点增加调整"),
    commission_rebate_sub(40, "返点扣除调整"),
    ;

    private Integer code;
    private String desc;

    ProxyAppType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static ProxyAppType getType(Integer code) throws BizException {
        for (ProxyAppType proxyAppChangeType : values()) {
            if (proxyAppChangeType.code.equals(code)) {
                return proxyAppChangeType;
            }
        }
        throw new BizException("没有这个ProxyAppType");
    }
}