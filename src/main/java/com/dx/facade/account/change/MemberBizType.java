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
    //***************彩票单一钱包账变类************start*********
    cp_touzhu(101, "彩票投注", "1"),
    cp_chedan(102, "彩票撤单", "1"),
    cp_paijiang(103, "彩票派奖", "1"),
    cp_chehuipaijiang(104, "彩票撤回派奖", "1"),
    cp_ercipaijiang(105, "彩票二次派奖", "1"),
    //***************彩票单一钱包账变类************end*********

    //***************真人单一钱包账变类************start*********
    zr_touzhu(106, "真人投注", "1"),
    zr_chedan(107, "真人撤单", "1"),
    zr_paicai_add(108, "真人派彩增加", "1"),
    zr_paicai_sub(109, "真人派彩减少", "1"),
    zr_activity_add(110, "真人活动增加", "1"),
    zr_activity_sub(111, "真人活动减少", "1"),
    zr_fee_rollback(112, "真人费用回滚", "1"),
    //***************真人单一钱包账变类************end*********

    //***************体育单一钱包账变类************start*********
    ty_touzhu(113, "体育投注", "1"),
    ty_paijiang(114, "体育结算派彩", "1"),
    ty_chedan(115, "体育注单取消", "1"),
    ty_chedan_cancel(116, "体育注单取消回滚", "1"),
    ty_paijiang_cancel(117, "体育结算回滚", "1"),
    ty_judan(118, "体育拒单", "1"),
    ty_paijiang_advance_part(119, "体育提前部分结算", "1"),
    ty_paijiang_advance_all(120, "体育提前全额结算", "1"),
    ty_paijiang_advance_quxiao(121, "体育提前结算取消", "1"),
    ty_paijiang_advance_quxiao_cancel(122, "体育提前结算取消回滚", "1"),
    ty_artificial_add(123, "体育人工加款", "1"),
    ty_artificial_sub(124, "体育人工扣款", "1"),
    ty_appointment_touzhu(125, "体育用户预约下注", "1"),
    ty_appointment_touzhu_cancel(126, "体育用户预约投注取消", "1"),
    //***************体育单一钱包账变类************end*********

    texas_club_serve_fee(127, "德州俱乐部服务费", "1"),

    //***************电竞单一钱包账变类************start*********
    dj_touzhu(128, "电竞投注", "1"),
    dj_paijiang(129, "电竞派彩", "1"),
    dj_chehuipaijiang(130, "电竞撤回派彩", "1"),
    dj_other_add(131, "电竞其他加款", "1"),
    dj_other_sub(132, "电竞其他扣款", "1"),
    //***************电竞单一钱包账变类************end*********
    //***************棋牌单一钱包账变类************start*********
    qp_touzhu(133, "棋牌投注", "1"),
    qp_settlement(134, "棋牌结算", "1"),
    //***************棋牌单一钱包账变类************end*********

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