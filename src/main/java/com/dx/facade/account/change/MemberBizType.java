package com.dx.facade.account.change;

/**
 * 会员业务账变类型
 * @author Administrator
 */
public enum MemberBizType implements IBizType {
    deposit(1, "会员存款", "1"),
//    staff_deposit_for_member(2, "代客充值", "1"),
    agent_deposit_for_member(3, "上级转下级", "1"),
    B_mutual_center(4, "自身钱包互转", "1"),
    withdraw(5, "会员提款", "1"),
    rebate(6, "会员返水", "1"),
    reward(7, "会员福利", "1"),
    activity(8, "会员活动", "1"),
    other(9, "其他调整", "1"),
    to_center(10, "佣金转中心钱包", "1"),
    deposit_discount(11, "存款优惠", "1"),

    up_score(12, "充值上分", "1"),
    down_score(13, "充值下分", "1"),
    game(14, "游戏", "1"),
    //V2需求新增bizTye
    credit_charge_up_score(15,"授信上分", "9,10"),
    credit_withdraw_down_score(16,"授信下分", "9,10"),
    loan(17,"借款", "1,9"),
    repay(18, "还款", "1,9");
    ;

    private Integer code;
    private String desc;
    private String accountCodes;

    MemberBizType(Integer code, String desc, String accountCodes) {
        this.code = code;
        this.desc = desc;
        this.accountCodes = accountCodes;
    }

    @Override
    public Integer code(){
        return code;
    }

    @Override
    public String desc(){
        return desc;
    }

    public String getDesc(){
        return desc;
    }

    public String accountCodes(){
        return accountCodes;
    }

    public static MemberBizType getType(Integer code) {
        for (MemberBizType bizType : values()) {
            if (bizType.code.equals(code)) {
                return bizType;
            }
        }
        return null;
    }
}