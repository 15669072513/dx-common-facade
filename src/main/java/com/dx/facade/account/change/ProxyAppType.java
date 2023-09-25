package com.dx.facade.account.change;

import com.dx.exception.BizException;

/**
 * 代理客户端账变类型
 */
public enum ProxyAppType implements IAppType {

    //v2.1新增
    withdraw_frozen(60, "取款冻结"),
    withdraw_fail(61, "取款失败"),

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

//    //私庄钱包
//    banker_deposit(12, "入金"),
//    banker_gambling(13, "对赌"),
//    banker_settlement(14, "结算"),
//    banker_adjust(15, "调整"),
//    banker_withdrawal(16, "出金"),
//    banker_grant_credits(17, "授信"),
//    banker_undertake_rebate(18, "会员返水"),
//    banker_undertake_venue(19, "场馆费"),
//    banker_undertake_member_depost_withdrawal(20, "会员充提手续费"),
//    banker_undertake_agent_depost_withdrawal(21, "代理充提手续费"),
//    banker_undertake_reward(22, "会员福利"),
//    banker_undertake_activity(23, "会员活动"),
//    banker_undertake_deposit_discount(24, "会员存款优惠"),
//    banker_undertake_adjust(25, "会员调整"),
//    platform_apportion(26, "平台分摊"),
//    pre_settlement(27, "预结算"),


    officer_proxy_up_score(28, "官方给代理上分"),
    proxy_be_up_score(29, "代理被上级上分"),
    proxy_to_child_up_score(30, "代理给下级上分"),
    proxy_to_mem_up_score(31, "代理给会员上分"),

    officer_proxy_down_score(32, "官方给代理下分"),
    proxy_be_down_score(33, "代理被上级下分"),
    proxy_to_child_down_score(34, "代理给下级下分"),
    proxy_to_mem_down_score(35, "代理给会员下分"),
    undertake_rebate(36, "流水返点"),
    commission_to_quota(37, "佣金转额度钱包-支出"),
    commission_be_transfer_to_quota(38, "佣金转额度钱包-收入"),
    commission_rebate_add(39, "返点增加调整"),
    commission_rebate_sub(40, "返点扣除调整"),
    //---------------------v2需求客户端账变类型----------------
    v2_cash_deposit_by_official(41, "官方给代理上分"),
    v2_cash_deposit_by_parent_proxy(42, "代理被上级充值上分"),
    v2_cash_deposit_to_sub_proxy(43, "代理给下级充值上分"),
    v2_cash_deposit_to_member(44, "代理给会员充值上分"),
    v2_cash_withdraw_by_official(45, "官方给代理提现下分"),
    v2_cash_withdraw_by_parent_proxy(46, "代理被上级提现下分"),
    v2_cash_withdraw_to_sub_proxy(47, "代理给下级提现下分"),
    v2_cash_withdraw_to_member(48, "代理给会员提现下分"),
    v2_cash_rebate(49, "流水返点"),
    v2_loan(50, "信用借款"),
    v2_repay(51, "信用还款"),
    v2_credit_up_score_by_official(52, "官方给代理授信上分"),
    v2_credit_up_score_by_parent_proxy(53, "代理被上级授信上分"),
    v2_credit_up_score_to_sub_proxy(54, "代理给下级授信上分"),
    v2_credit_up_score_to_member(55, "代理给会员授信上分"),
    v2_credit_down_score_by_official(56, "官方给代理授信下分"),
    v2_credit_down_score_by_parent_proxy(57, "代理被上级授信下分"),
    v2_credit_down_score_to_sub_proxy(58, "代理给下级授信下分"),
    v2_credit_down_score_to_member(59, "代理给会员授信下分"),

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