package com.dx.facade.account.change;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 会员账变类型
 */
public enum MemberChangeType implements IChangeType {

    deposit(1, "会员存款", "1"),
    deposit_back(2, "会员存款后台", "1"),
    agent_deposit_for_member(4, "上级转入", "3"),
    center_to_B(5, "转到B端钱包", "4"),
    B_to_center(6, "转回现金钱包", "4"),
    withdraw(7, "会员取款", "5"),
    withdraw_back(8, "会员取款后台", "5"),
    withdraw_fail(9, "取款失败", "5"),
    rebate(10, "游戏返水", "6"),
    rebate_add(11, "返水增加调整", "6"),
    rebate_sub(12, "返水扣除调整", "6"),
    activity(14, "活动优惠", "8"),
    activity_add(15, "活动优惠增加调整", "8"),
    activity_sub(16, "活动优惠扣除调整", "8"),
    other_add(17, "其他增加调整", "9"),
    other_sub(18, "其他扣除调整", "9"),
    reward(13, "会员福利", "7"),
    reward_add(19, "会员福利增加调整", "7"),
    reward_sub(20, "会员福利扣除调整", "7"),
    to_center(21, "佣金转回", "10"),
    deposit_discount(22, "存款优惠", "11"),
    deposit_discount_add(23, "存款优惠增加调整", "11"),
    deposit_discount_sub(24, "存款优惠扣除调整", "11"),

    proxy_up_score(25, "代理上分", "12"),
    proxy_down_score(26, "代理下分", "13"),
    bring_to_table(27, "带入牌桌", "14"),
    bring_out_table(28, "带出牌桌", "14"),

    //v2需求新增
    v2_cash_up_score(29, "充值上分", MemberBizType.up_score.code().toString()),
    v2_cash_down_score(30, "提现下分", MemberBizType.down_score.code().toString()),
    v2_cash_center_to_B(31, "现金钱包转入", MemberBizType.B_mutual_center.code().toString()),
    v2_cash_B_to_center(32, "转出至现金钱包", MemberBizType.B_mutual_center.code().toString()),
    v2_rebate(33, "会员返水", "6"),
    v2_rebate_add(34, "其他返水增加调整", MemberBizType.rebate.code().toString()),
    v2_rebate_sub(35, "其他返水扣除调整", MemberBizType.rebate.code().toString()),
    v2_cash_loan(36, "信用借款", MemberBizType.v2_loan.code().toString()),
    v2_cash_repay(37, "信用还款", MemberBizType.v2_repay.code().toString()),
    v2_center_to_B(38, "现金钱包转入", MemberBizType.B_mutual_center.code().toString()),
    v2_B_to_center(39, "转出至现金钱包", MemberBizType.B_mutual_center.code().toString()),
    v2_credit_up_score(40, "授信上分", MemberBizType.v2_credit_up_score.code().toString()),
    v2_credit_down_score(41, "授信下分", MemberBizType.v2_credit_down_score.code().toString()),
    v2_credit_loan(42, "信用借款", MemberBizType.v2_loan.code().toString()),
    v2_credit_repay(43, "信用还款", MemberBizType.v2_repay.code().toString()),
    v2_cash_withdraw_frozen(44, "会员提现", MemberBizType.down_score.code().toString()),
    v2_cash_withdraw_refused(45, "提现拒绝", MemberBizType.down_score.code().toString()),

    v2_1_deposit(46, "会员存款", MemberBizType.v2_1_deposit.code().toString()),
    //TODO 2.1不上，暂时去掉
    //v2_1_deposit_discount(47, "会员存款优惠", MemberBizType.v2_1_deposit.code().toString()),
    v2_1_deposit_back(48, "会员存款（后台）", MemberBizType.v2_1_deposit.code().toString()),
    //TODO 2.1不上，暂时去掉
    //v2_1_deposit_discount_back(49, "会员优惠（后台）", MemberBizType.v2_1_deposit.code().toString()),
    v2_1_withdraw(50, "会员取款", MemberBizType.v2_1_withdraw.code().toString()),
    //v2_1_withdraw_frozen(51, "会员取款", MemberBizType.v2_1_withdraw.code().toString()),
    v2_1_withdraw_fail(52, "取款失败", MemberBizType.v2_1_withdraw.code().toString()),
    v2_1_withdraw_back(53, "会员取款（后台）", MemberBizType.v2_1_withdraw.code().toString()),

    v2_1_club_rebate_add(105, "俱乐部返水增加调整", MemberBizType.rebate.code().toString()),
    v2_1_insure_rebate_add(106, "保险返水增加调整", MemberBizType.rebate.code().toString()),
    v2_1_club_rebate_sub(108, "俱乐部返水扣除调整", MemberBizType.rebate.code().toString()),
    v2_1_insure_rebate_sub(109, "保险返水扣除调整", MemberBizType.rebate.code().toString()),

    //v3_cash_deposit_by_official(110, "官方给会员充值上分", MemberBizType.up_score.code().toString()),
    //v3_cash_withdraw_by_official(111, "官方给会员提现下分", MemberBizType.down_score.code().toString()),
    v3_proxy_help_credit_repay(112, "代理帮信用还款", MemberBizType.v2_repay.code().toString()),

    illegal_type(-1, "未知的类型", "-1")
    ;
    private Integer code;
    private String desc;
    private String bizCodes;

    MemberChangeType(Integer code, String desc, String bizCodes) {
        this.code = code;
        this.desc = desc;
        this.bizCodes = bizCodes;
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

    public String bizCodes() {
        return bizCodes;
    }

    static Map<Integer, MemberChangeType> code2Enum = new HashMap<>();

    static {
        for (MemberChangeType value : MemberChangeType.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static MemberChangeType getType(Integer code) {
        return code2Enum.containsKey(code) ? code2Enum.get(code) : illegal_type;
    }

    public static List<MemberChangeType> getArtificialMemberChangeTypeList() {
        return Arrays.asList(MemberChangeType.deposit_back, MemberChangeType.withdraw_back, MemberChangeType.rebate_add,
                MemberChangeType.rebate_sub, MemberChangeType.activity_add, MemberChangeType.activity_sub,
                MemberChangeType.other_add, MemberChangeType.other_sub, MemberChangeType.reward_add,
                MemberChangeType.reward_sub, MemberChangeType.deposit_discount_add, MemberChangeType.deposit_discount_sub);
    }
}