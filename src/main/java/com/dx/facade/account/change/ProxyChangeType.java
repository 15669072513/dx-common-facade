package com.dx.facade.account.change;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 代理账变类型
 */
public enum ProxyChangeType implements IChangeType {

    //代理钱包
    deposit(1, "代理存款", "1"),
    deposit_back(2, "代理存款(后台)", "1"),
    deposit_for_member(3, "转给下级", "2"),
    activity(4, "活动优惠彩金", "3"),
    activity_add(5, "活动增加调整", "3"),
    activity_sub(6, "活动扣除调整", "3"),
    transfer_out(9, "转给下级", "5"),
    transfer_in(10, "上级转入", "5"),
    other_add(11, "其他增加调整", "6"),
    other_sub(12, "其他扣除调整", "6"),
    withdraw(13, "代理取款", "7"),
    withdraw_fail(14, "取款失败", "7"),
    withdraw_back(15, "代理取款(后台)", "7"),
    platform_transfer_in(17, "平台转入佣金", "9"),
    transfer_in_by_cycle(18, "上级转入佣金", "9"),
    transfer_out_by_cycle(19, "转给下级佣金", "9"),
    commission_add(20, "佣金增加调整", "9"),
    commission_sub(21, "佣金扣除调整", "9"),
    to_center(16, "佣金转回", "8"),
    rebate(22, "流水返点", "10"),
    rebate_add(23, "返点增加调整", "10"),
    rebate_sub(24, "返点扣除调整", "10"),
    officer_proxy_up_score(25, "官方给代理上分", "12"),
    proxy_be_up_score(26, "代理被上级上分", "12"),
    proxy_to_child_up_score(27, "代理给下级上分", "12"),
    proxy_to_mem_up_score(28, "代理给会员上分", "12"),
    officer_proxy_down_score(29, "官方给代理下分", "13"),
    proxy_be_down_score(30, "代理被上级下分", "13"),
    proxy_to_child_down_score(31, "代理给下级下分", "13"),
    proxy_to_mem_down_score(32, "代理给会员下分", "13"),
    commission_to_quota(33, "佣金转额度钱包", "38"),
    commission_be_transfer_to_quota(34, "佣金转额度钱包", "41"),

    //-------------v2---------------
    //现金钱包 13种账变类型
    v2_cash_deposit_by_official(76, "官方给代理充值上分", ProxyBizType.v2_deposit.code().toString()),
    v2_cash_deposit_by_parent_proxy(77, "代理被上级充值上分", ProxyBizType.v2_deposit.code().toString()),
    v2_cash_deposit_to_sub_proxy(78, "代理给下级充值上分", ProxyBizType.v2_deposit.code().toString()),
    v2_cash_deposit_to_member(79, "代理给会员充值上分", ProxyBizType.v2_deposit.code().toString()),
    v2_cash_withdraw_by_official(80, "官方给代理提现下分", ProxyBizType.v2_withdraw.code().toString()),
    v2_cash_withdraw_by_parent_proxy(81, "代理被上级提现下分", ProxyBizType.v2_withdraw.code().toString()),
    v2_cash_withdraw_to_sub_proxy(82, "代理给下级提现下分", ProxyBizType.v2_withdraw.code().toString()),
    v2_cash_withdraw_to_member(83, "代理给会员提现下分", ProxyBizType.v2_withdraw.code().toString()),
    v2_cash_rebate(84, "流水返点", ProxyBizType.v2_rebate.code().toString()),
    v2_cash_rebate_add(85, "其他返点增加调整", ProxyBizType.v2_rebate.code().toString()),
    v2_cash_rebate_sub(86, "其他返点扣除调整", ProxyBizType.v2_rebate.code().toString()),
    v2_cash_loan(87, "信用借款", ProxyBizType.v2_loan.code().toString()),
    v2_cash_repay(88, "信用还款", ProxyBizType.v2_repay.code().toString()),

    //信用钱包 10种账变类型
    v2_credit_up_score_by_official(89, "官方给代理授信上分", ProxyBizType.v2_credit_up_score.code().toString()),
    v2_credit_up_score_by_parent_proxy(90, "代理被上级授信上分", ProxyBizType.v2_credit_up_score.code().toString()),
    v2_credit_up_score_to_sub_proxy(91, "代理给下级授信上分", ProxyBizType.v2_credit_up_score.code().toString()),
    v2_credit_up_score_to_member(92, "代理给会员授信上分", ProxyBizType.v2_credit_up_score.code().toString()),
    v2_credit_down_score_by_official(93, "官方给代理授信下分", ProxyBizType.v2_credit_down_score.code().toString()),
    v2_credit_down_score_by_parent_proxy(94, "代理被上级授信下分", ProxyBizType.v2_credit_down_score.code().toString()),
    v2_credit_down_score_to_sub_proxy(95, "代理给下级授信下分", ProxyBizType.v2_credit_down_score.code().toString()),
    v2_credit_down_score_to_member(96, "代理给会员授信下分", ProxyBizType.v2_credit_down_score.code().toString()),
    v2_credit_repay(97, "信用还款", ProxyBizType.v2_repay.code().toString()),
    v2_credit_loan(98, "信用借款", ProxyBizType.v2_loan.code().toString()),

    v2_1_deposit(99, "代理存款", ProxyBizType.v2_1_deposit.code().toString()),
    v2_1_deposit_back(100, "代理存款（后台）", ProxyBizType.v2_1_deposit.code().toString()),
    v2_1_withdraw(101, "代理取款", ProxyBizType.v2_1_withdraw.code().toString()),
    //v2_1_withdraw_frozen(102, "代理取款", ProxyBizType.v2_1_withdraw.code().toString()),
    v2_1_withdraw_fail(103, "取款失败", ProxyBizType.v2_1_withdraw.code().toString()),
    v2_1_withdraw_back(104, "代理取款（后台）", ProxyBizType.v2_1_withdraw.code().toString()),

    v2_1_club_rebate_add(105, "俱乐部返点增加调整", ProxyBizType.v2_rebate.code().toString()),
    v2_1_insure_rebate_add(106, "保险返点增加调整", ProxyBizType.v2_rebate.code().toString()),
    v2_1_club_rebate_sub(108, "俱乐部返点扣除调整", ProxyBizType.v2_rebate.code().toString()),
    v2_1_insure_rebate_sub(109, "保险返点扣除调整", ProxyBizType.v2_rebate.code().toString()),
    v2_1_negate_benefit_commission_income(111, "负盈利返佣收入", ProxyBizType.v2_1_proxy_commission.code().toString()),
    v2_1_negate_benefit_commission_dispatch(112, "负盈利返佣发放", ProxyBizType.v2_1_proxy_commission.code().toString()),
    v2_1_proxy_commission_add(113, "代理返佣增加调整", ProxyBizType.v2_1_proxy_commission.code().toString()),
    v2_1_proxy_commission_sub(114, "代理返佣扣除调整", ProxyBizType.v2_1_proxy_commission.code().toString()),


    //v3信用钱包
    v3_official_help_proxy_credit_repay(115, "官方帮代理信用还款", ProxyBizType.v2_repay.code().toString()),
    v3_parent_proxy_help_proxy_credit_repay(116, "上级帮代理信用还款", ProxyBizType.v2_repay.code().toString()),
    v3_proxy_help_sub_proxy_credit_repay(117, "代理帮下级信用还款", ProxyBizType.v2_repay.code().toString()),
    v3_proxy_help_sub_member_credit_repay(118, "代理帮会员信用还款", ProxyBizType.v2_repay.code().toString()),
    //V1.50代理占成亏损分摊
    v1_50_proxy_loss_sharing_sub(119, "代理占成亏损分摊", ProxyBizType.v1_50_proxy_divination.code().toString()),
    //v1.52需求账变
    v1_52_violation_fine(120, "违规扣款", ProxyBizType.v2_withdraw.code().toString()),
    v1_52_finance_adjust(121, "财务调整", ProxyBizType.v2_withdraw.code().toString()),
    v1_52_operate_adjust(122, "运营调整", ProxyBizType.v2_withdraw.code().toString()),
    v1_52_third_order_lost_compensate(123, "三方掉单补分", ProxyBizType.v2_deposit.code().toString()),
    v1_52_offline_settle_up_score(124, "线下结算上分", ProxyBizType.v2_deposit.code().toString()),
    v1_52_other_adjust(125, "其他调整", ProxyBizType.v2_deposit.code().toString()),

    illegal_type(-1, "未知的类型", ProxyBizType.illegal_type.code().toString());

    private Integer code;
    private String desc;
    private String bizCodes;

    ProxyChangeType(Integer code, String desc, String bizCodes) {
        this.code = code;
        this.desc = desc;
        this.bizCodes = bizCodes;
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

    public String bizCodes() {
        return bizCodes;
    }

    @Deprecated
    public static ProxyChangeType getType(Integer code) {
        for (ProxyChangeType proxyChangeType : values()) {
            if (proxyChangeType.code.equals(code)) {
                return proxyChangeType;
            }
        }
        return null;
    }

    static final Map<Integer, ProxyChangeType> code2Enum = new ConcurrentHashMap<>();

    static {
        Arrays.stream(ProxyChangeType.values()).forEach(e -> {
            code2Enum.put(e.code, e);
        });
    }

    public static ProxyChangeType getByCode(Integer code) {
        return code2Enum.containsKey(code) ? code2Enum.get(code) : illegal_type;
    }


    /**
     * 代理账变记录-账变类型下拉列表
     *
     * @return
     */
    public static ProxyChangeType[] getProxyChangeTypeList() {
        return new ProxyChangeType[]{
                v2_cash_deposit_by_official,
                v2_cash_deposit_by_parent_proxy,
                v2_cash_deposit_to_sub_proxy,
                v2_cash_deposit_to_member,
                v2_cash_withdraw_by_official,
                v2_cash_withdraw_by_parent_proxy,
                v2_cash_withdraw_to_sub_proxy,
                v2_cash_withdraw_to_member,
                v2_cash_rebate,
                v2_cash_rebate_add,
                v2_cash_rebate_sub,
                v2_cash_loan,
                v2_cash_repay,
                v2_credit_up_score_by_official,
                v2_credit_up_score_by_parent_proxy,
                v2_credit_up_score_to_sub_proxy,
                v2_credit_up_score_to_member,
                v2_credit_down_score_by_official,
                v2_credit_down_score_by_parent_proxy,
                v2_credit_down_score_to_sub_proxy,
                v2_credit_down_score_to_member,
                v2_credit_repay,
                v2_credit_loan,
                v2_1_deposit,
                v2_1_deposit_back,
                v2_1_withdraw,
                //v2_1_withdraw_frozen,
                v2_1_withdraw_fail,
                v2_1_withdraw_back,
                v2_1_club_rebate_add,
                v2_1_insure_rebate_add,
                v2_1_club_rebate_sub,
                v2_1_insure_rebate_sub,
                v2_1_negate_benefit_commission_income,
                v2_1_negate_benefit_commission_dispatch,
                v2_1_proxy_commission_add,
                v2_1_proxy_commission_sub,
                //v3-帮信用还款
                v3_proxy_help_sub_member_credit_repay,
                v3_proxy_help_sub_proxy_credit_repay,
                v3_parent_proxy_help_proxy_credit_repay,
                v3_official_help_proxy_credit_repay,
                v1_52_violation_fine,
                v1_52_finance_adjust,
                v1_52_operate_adjust,
                v1_52_third_order_lost_compensate,
                v1_52_offline_settle_up_score,
                v1_52_other_adjust,

                /*
                officer_proxy_up_score,
                proxy_be_up_score,
                proxy_to_child_up_score,
                proxy_to_mem_up_score,
                officer_proxy_down_score,
                proxy_be_down_score,
                proxy_to_child_down_score,
                proxy_to_mem_down_score,
                commission_to_quota*/
        };
    }
}
