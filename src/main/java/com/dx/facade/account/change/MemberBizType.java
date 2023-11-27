package com.dx.facade.account.change;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员业务账变类型
 * @author Administrator
 */
public enum MemberBizType implements IBizType {

    deposit(1, "会员存款", "1"),
    agent_deposit_for_member(3, "上级转下级", "1"),
    B_mutual_center(4, "自身钱包互转", "1"),
    withdraw(5, "会员提款", "1"),
    rebate(6, "会员返水", "1"),
    reward(7, "会员福利", "1"),
    activity(8, "会员活动", "1"),
    other(9, "其他调整", "1"),
    to_center(10, "佣金转现金钱包", "1"),
    deposit_discount(11, "存款优惠", "1"),
    up_score(12, "充值上分", "1"),
    down_score(13, "提现下分", "1"),
    game(14, "游戏", "1"),

    v2_credit_up_score(15,"授信上分", "9,10"),
    v2_credit_down_score(16,"授信下分", "9,10"),
    v2_loan(17,"借款", "1,9"),
    v2_repay(18, "还款", "1,9"),
    v2_1_deposit(19, "会员存款", "1"),
    v2_1_withdraw(20, "会员取款", "1,5"),

    illegal_type(-1, "未知的类型", "-1"),
    //***************单一钱包账变类***************start*********
    cp_single_wallet(21, "彩票单一钱包", "1"),
    zr_single_wallet(22, "真人单一钱包", "1"),
    ty_single_wallet(23, "体育单一钱包", "1"),
    //***************单一钱包账变类***************end*********
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

    static Map<Integer, MemberBizType> code2Enum = new HashMap<>();
    static {
        for (MemberBizType value : MemberBizType.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static MemberBizType getType(Integer code) {
        return code2Enum.containsKey(code) ? code2Enum.get(code) : illegal_type;
    }
}