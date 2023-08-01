package com.dx.facade.account.change;


import java.util.Arrays;
import java.util.List;

/**
 * 会员账变类型
 */
public enum MemberChangeType implements IChangeType {
    deposit(1, "会员存款", "1"),
    deposit_back(2, "会员存款后台", "1"),
    //    staff_deposit_for_member(3, "代客充值", "2"),
    agent_deposit_for_member(4, "上级转入", "3"),
    center_to_B(5, "转到B端钱包", "4"),
    B_to_center(6, "转回中心钱包", "4"),
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

    //新增
    proxy_up_score(25, "代理上分", "12"),
    proxy_down_score(26, "代理下分", "13"),
    //德州钱包
    bring_to_table(27, "带入牌桌", "14"),
    bring_out_table(28, "带出牌桌", "14"),

    //------------------v2需求新增-------------
    //中心钱包 9个
    v2_cash_up_score(29, "充值上分", MemberBizType.up_score.code().toString()),
    v2_cash_down_score(30, "提现下分", MemberBizType.down_score.code().toString()),
    v2_cash_center_to_B(31, "中心钱包转入", MemberBizType.B_mutual_center.code().toString()),
    v2_cash_B_to_center(32, "转出至中心钱包", MemberBizType.B_mutual_center.code().toString()),
    v2_rebate(33, "会员返水", "6"),
    v2_rebate_add(34, "会员返水增加调整", MemberBizType.rebate.code().toString()),
    v2_rebate_sub(35, "会员返水扣除调整", MemberBizType.rebate.code().toString()),
    v2_cash_loan(36,"信用借款", MemberBizType.v2_loan.code().toString()),
    v2_cash_repay(37, "信用还款", MemberBizType.v2_repay.code().toString()),
    //场馆钱包 2个
    v2_center_to_B(38, "中心钱包转入",MemberBizType.B_mutual_center.code().toString()),//中心钱包转入
    v2_B_to_center(39,"转出至中心钱包",MemberBizType.B_mutual_center.code().toString()),//转出至中心钱包
    //信用钱包 4个
    v2_credit_up_score(40, "授信上分", MemberBizType.v2_credit_up_score.code().toString()),
    v2_credit_down_score(41, "授信下分", MemberBizType.v2_credit_down_score.code().toString()),
    v2_credit_loan(42, "信用借款",MemberBizType.v2_loan.code().toString()),
    v2_credit_repay(43, "信用还款",MemberBizType.v2_repay.code().toString()),

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

    public static MemberChangeType getType(Integer code) {
        for (MemberChangeType memberChangeType : values()) {
            if (memberChangeType.code.equals(code)) {
                return memberChangeType;
            }
        }
        return null;
    }

    public static List<MemberChangeType> getArtificialMemberChangeTypeList() {
        return Arrays.asList(MemberChangeType.deposit_back, MemberChangeType.withdraw_back, MemberChangeType.rebate_add,
                MemberChangeType.rebate_sub, MemberChangeType.activity_add, MemberChangeType.activity_sub,
                MemberChangeType.other_add, MemberChangeType.other_sub, MemberChangeType.reward_add,
                MemberChangeType.reward_sub, MemberChangeType.deposit_discount_add, MemberChangeType.deposit_discount_sub);
    }
}