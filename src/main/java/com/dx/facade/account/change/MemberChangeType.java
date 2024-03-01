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
    v2_rebate(33, "会员返水", MemberBizType.rebate.code().toString()),
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

    //***************单一钱包账变类***************start*****************************************************

    //***************彩票单一钱包账变类************start*********
    cp_touzhu(113, "彩票投注", MemberBizType.cp_touzhu.code().toString()),
    cp_chedan(114, "彩票撤单", MemberBizType.cp_chedan.code().toString()),
    cp_paijiang(115, "彩票派奖", MemberBizType.cp_paijiang.code().toString()),
    cp_chehuipaijiang(116, "彩票撤回派奖", MemberBizType.cp_chehuipaijiang.code().toString()),
    cp_ercipaijiang(117, "彩票二次派奖", MemberBizType.cp_ercipaijiang.code().toString()),
    //***************彩票单一钱包账变类************end*********

    //***************真人单一钱包账变类************start*********
    zr_touzhu(118, "真人投注", MemberBizType.zr_touzhu.code().toString()),
    zr_chedan(119, "真人撤单", MemberBizType.zr_chedan.code().toString()),
    zr_paicai_add(120, "真人派彩增加", MemberBizType.zr_paicai_add.code().toString()),
    zr_paicai_sub(121, "真人派彩减少", MemberBizType.zr_paicai_sub.code().toString()),
    zr_activity_add(122, "真人活动增加", MemberBizType.zr_activity_add.code().toString()),
    zr_activity_sub(123, "真人活动减少", MemberBizType.zr_activity_sub.code().toString()),
    zr_fee_rollback(124, "真人费用回滚", MemberBizType.zr_fee_rollback.code().toString()),
    //***************真人单一钱包账变类************end*********

    //***************体育单一钱包账变类************start*********
    ty_touzhu(125, "体育投注", MemberBizType.ty_touzhu.code().toString()),
    ty_paijiang(126, "体育结算派彩", MemberBizType.ty_paijiang.code().toString()),
    ty_chedan(127, "体育注单取消", MemberBizType.ty_chedan.code().toString()),
    ty_chedan_cancel(128, "体育注单取消回滚", MemberBizType.ty_chedan_cancel.code().toString()),
    ty_paijiang_cancel(129, "体育结算回滚", MemberBizType.ty_paijiang_cancel.code().toString()),
    ty_judan(130, "体育拒单", MemberBizType.ty_judan.code().toString()),
    ty_paijiang_advance_part(131, "体育提前部分结算", MemberBizType.ty_paijiang_advance_part.code().toString()),
    ty_paijiang_advance_all(132, "体育提前全额结算", MemberBizType.ty_paijiang_advance_all.code().toString()),
    ty_paijiang_advance_quxiao(133, "体育提前结算取消", MemberBizType.ty_paijiang_advance_quxiao.code().toString()),
    ty_paijiang_advance_quxiao_cancel(134, "体育提前结算取消回滚", MemberBizType.ty_paijiang_advance_quxiao_cancel.code().toString()),
    ty_artificial_add(135, "体育人工加款", MemberBizType.ty_artificial_add.code().toString()),
    ty_artificial_sub(136, "体育人工扣款", MemberBizType.ty_artificial_sub.code().toString()),
    ty_appointment_touzhu(137, "体育用户预约下注", MemberBizType.ty_appointment_touzhu.code().toString()),
    ty_appointment_touzhu_cancel(138, "体育用户预约投注取消", MemberBizType.ty_appointment_touzhu_cancel.code().toString()),
    //***************体育单一钱包账变类************end*********


    //***************单一钱包账变类***************end**************************************************************
    //v1.52需求账变
    v1_52_violation_fine(139, "违规扣款", MemberBizType.down_score.code().toString()),
    v1_52_finance_adjust(140, "财务调整", MemberBizType.down_score.code().toString()),
    v1_52_operate_adjust(141, "运营调整", MemberBizType.down_score.code().toString()),
    v1_52_third_order_lost_compensate(142, "三方掉单补分", MemberBizType.up_score.code().toString()),
    v1_52_offline_settle_up_score(143, "线下结算上分", MemberBizType.up_score.code().toString()),
    v1_52_other_adjust(144, "其他调整", MemberBizType.up_score.code().toString()),

    table_serve_fee(145, "局服务费", MemberBizType.texas_club_serve_fee.code().toString()),

    //***************电竞单一钱包账变类************end*********
    dj_touzhu(146, "电竞投注", MemberBizType.dj_touzhu.code().toString()),
    dj_paijiang(147, "电竞派奖", MemberBizType.dj_paijiang.code().toString()),
    dj_chehuipaijiang(148, "电竞撤回派奖", MemberBizType.dj_chehuipaijiang.code().toString()),
    dj_other_add(149, "电竞其他加款", MemberBizType.dj_other_add.code().toString()),
    dj_other_sub(150, "电竞其他扣除", MemberBizType.dj_other_sub.code().toString()),

    qp_touzhu(151, "棋牌投注", MemberBizType.qp_touzhu.code().toString()),
    qp_settlement(152, "棋牌结算", MemberBizType.qp_settlement.code().toString()),


    //***************电竞单一钱包账变类************end*********

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