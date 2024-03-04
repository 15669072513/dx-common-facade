package com.dx.facade.account.change;

import com.dx.facade.account.change.param.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 会员账变业务 定义
 *
 * @author Administrator
 */
public enum MemberWalletChange implements IWalletChange {
    deposit(WalletType.cash, MemberBizType.deposit, MemberChangeType.deposit, MemberAppType.deposit, TransType.in, Constant.MEMBER),
    deposit_add(WalletType.cash, MemberBizType.deposit, MemberChangeType.deposit_back, MemberAppType.deposit, TransType.in, Constant.MEMBER),
    agent_deposit_for_member(WalletType.cash, MemberBizType.agent_deposit_for_member, MemberChangeType.agent_deposit_for_member, MemberAppType.deposit, TransType.in, Constant.MEMBER),
    commission_to_center(WalletType.cash, MemberBizType.to_center, MemberChangeType.to_center, MemberAppType.deposit, TransType.in, Constant.MEMBER),

    withdraw(WalletType.cash, MemberBizType.withdraw, MemberChangeType.withdraw, MemberAppType.withdraw, TransType.out, Constant.MEMBER),
    lock_withdraw(WalletType.cash_lock, MemberBizType.withdraw, MemberChangeType.withdraw, MemberAppType.withdraw, TransType.in, Constant.MEMBER),
    withdraw_fail(WalletType.cash, MemberBizType.withdraw, MemberChangeType.withdraw_fail, MemberAppType.withdraw, TransType.in, Constant.MEMBER),
    lock_withdraw_fail(WalletType.cash_lock, MemberBizType.withdraw, MemberChangeType.withdraw_fail, MemberAppType.withdraw, TransType.out, Constant.MEMBER),
    withdraw_success(WalletType.cash_lock, MemberBizType.withdraw, MemberChangeType.withdraw, MemberAppType.withdraw, TransType.out, Constant.MEMBER),
    withdraw_sub(WalletType.cash, MemberBizType.withdraw, MemberChangeType.withdraw_back, MemberAppType.withdraw, TransType.out, Constant.MEMBER),

    center_to_B(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.center_to_B, MemberAppType.transfer, TransType.out, Constant.MEMBER),
    center_to_B_bill(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.center_to_B, MemberAppType.transfer, TransType.out, Constant.MEMBER),
    B_to_center(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.B_to_center, MemberAppType.transfer, TransType.in, Constant.MEMBER),

    rebate(WalletType.cash, MemberBizType.rebate, MemberChangeType.rebate, MemberAppType.rebate, TransType.in, Constant.MEMBER),
    rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.rebate_add, MemberAppType.rebate, TransType.in, Constant.MEMBER),
    rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.rebate_sub, MemberAppType.rebate, TransType.out, Constant.MEMBER),

    activity(WalletType.cash, MemberBizType.activity, MemberChangeType.activity, MemberAppType.activity, TransType.in, Constant.MEMBER),
    activity_add(WalletType.cash, MemberBizType.activity, MemberChangeType.activity_add, MemberAppType.activity, TransType.in, Constant.MEMBER),
    activity_sub(WalletType.cash, MemberBizType.activity, MemberChangeType.activity_sub, MemberAppType.activity, TransType.out, Constant.MEMBER),

    reward(WalletType.cash, MemberBizType.reward, MemberChangeType.reward, MemberAppType.reward, TransType.in, Constant.MEMBER),
    reward_add(WalletType.cash, MemberBizType.reward, MemberChangeType.reward_add, MemberAppType.reward, TransType.in, Constant.MEMBER),
    reward_sub(WalletType.cash, MemberBizType.reward, MemberChangeType.reward_sub, MemberAppType.reward, TransType.out, Constant.MEMBER),

    other_add(WalletType.cash, MemberBizType.other, MemberChangeType.other_add, MemberAppType.other, TransType.in, Constant.MEMBER),
    other_sub(WalletType.cash, MemberBizType.other, MemberChangeType.other_sub, MemberAppType.other, TransType.out, Constant.MEMBER),

    deposit_reward(WalletType.cash, MemberBizType.deposit_discount, MemberChangeType.deposit_discount, MemberAppType.deposit_discount, TransType.in, Constant.MEMBER),
    deposit_reward_add(WalletType.cash, MemberBizType.deposit_discount, MemberChangeType.deposit_discount_add, MemberAppType.deposit_discount, TransType.in, Constant.MEMBER),
    deposit_reward_sub(WalletType.cash, MemberBizType.deposit_discount, MemberChangeType.deposit_discount_sub, MemberAppType.deposit_discount, TransType.out, Constant.MEMBER),

    proxy_up_score(WalletType.cash, MemberBizType.up_score, MemberChangeType.proxy_up_score, MemberAppType.proxy_up_score, TransType.in, Constant.MEMBER),

    proxy_down_score(WalletType.cash, MemberBizType.down_score, MemberChangeType.proxy_down_score, MemberAppType.proxy_down_score, TransType.out, Constant.MEMBER),

    bring_to_table(WalletType.cash, MemberBizType.game, MemberChangeType.bring_to_table, MemberAppType.bring_to_table, TransType.out, Constant.MEMBER),
    bring_out_table(WalletType.cash, MemberBizType.game, MemberChangeType.bring_out_table, MemberAppType.bring_out_table, TransType.in, Constant.MEMBER),
    bring_out_table_fee(WalletType.cash, MemberBizType.game, MemberChangeType.bring_out_table, MemberAppType.bring_out_table, TransType.in, Constant.MEMBER),


    //*******************V2需求会员账变明细****************
    //现金钱包 余额9个 + 冻结余额4个，共13个
    //场景1.代理给会员上分，会员现金余额加额度，对应代理的现金余额减额度；
    v2_cash_up_score(WalletType.cash, MemberBizType.up_score, MemberChangeType.v2_cash_up_score, MemberAppType.v2_cash_up_score, TransType.in, Constant.MEMBER),
    //场景2.代理在代理后台直接给会员提现下分，会员现金钱包支出，对应的代理现金余额加额
    v2_cash_down_score(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.out, Constant.MEMBER),
    //场景3.会员通过app发起提现，最终代理审核通过，当代理审核通过时，会员的冻结额度扣减，对应的代理现金余额进行加额
    v2_cash_down_score_audit_passed_to_proxy(WalletType.cash_lock, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.out, Constant.MEMBER),
    //场景4.会员通过app发起的提现订单，被平台或代理审核拒绝，需要将会员现金钱包冻结余额返还到现金余额
    v2_cash_down_score_withdraw_refused(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_refused, MemberAppType.v2_withdraw_refused, TransType.in, Constant.MEMBER),
    //场景5.会员通过app发起提现订单，会员现金余额减额，对应的会员现金钱包冻结余额加额
    v2_cash_down_score_withdraw_frozen(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_frozen, MemberAppType.v2_withdraw_frozen, TransType.out, Constant.MEMBER),
    //见场景5，提现冻结时，冻结额度加额
    v2_cash_lock_down_score_frozen(WalletType.cash_lock, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_frozen, MemberAppType.v2_withdraw_frozen, TransType.in, Constant.MEMBER),
    //见场景4，会员提现被拒绝，会员现金钱包冻结额度扣除，返回到现金钱包的余额。
    V2_cash_lock_down_score_refused(WalletType.cash_lock, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_refused, MemberAppType.v2_withdraw_refused, TransType.out, Constant.MEMBER),
    //场景6.会员向B端场馆上分，会员现金余额扣除额度，转入到对应场馆钱包
    v2_cash_center_to_B(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.v2_cash_center_to_B, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    //场景7.会员从B端场馆下分，场馆钱包额度扣除，加给会员的现金余额
    v2_B_to_center(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.v2_cash_B_to_center, MemberAppType.transfer, TransType.in, Constant.MEMBER),
    //场景8.会员玩游戏产生有效投注，给平台给会员定时返水
    v2_rebate(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //场景9.官方调整增加会员返水，参见中控后台人工加额调整功能
    v2_rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_add, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //场景10.官方调整扣除会员返水，参见中控后台人工扣除调整功能
    v2_rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_sub, MemberAppType.v2_rebate, TransType.out, Constant.MEMBER),
    //场景11.会员从信用钱包借钱，信用钱包余额减额，对应现金钱包的余额响应加额
    v2_cash_loan(WalletType.cash, MemberBizType.v2_loan, MemberChangeType.v2_cash_loan, MemberAppType.v2_loan, TransType.in, Constant.MEMBER),
    //场景12.与场景11相反，会员借钱后进行还钱操作，从现金余额扣除额度，对应的可用额度进行加额操作
    v2_cash_repay(WalletType.cash, MemberBizType.v2_repay, MemberChangeType.v2_cash_repay, MemberAppType.v2_repay, TransType.out, Constant.MEMBER),

    //德州 2个
    //场景13.会员向场馆上分和下分，场馆钱包响应加额和减额，对应场景6和场景7
    v2_bring_to_table_texas(WalletType.texas, MemberBizType.game, MemberChangeType.bring_to_table, MemberAppType.v2_bring_to_table, TransType.out, Constant.MEMBER),
    v2_bring_out_table_texas(WalletType.texas, MemberBizType.game, MemberChangeType.bring_out_table, MemberAppType.v2_bring_out_table, TransType.in, Constant.MEMBER),
    //其它5场馆 * 2种转账 = 10个
    v2_center_to_video(WalletType.video, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.in, Constant.MEMBER),
    v2_video_to_center(WalletType.video, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    v2_center_to_sports(WalletType.sports, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.in, Constant.MEMBER),
    v2_sports_to_center(WalletType.sports, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    v2_center_to_lottery(WalletType.lottery, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.in, Constant.MEMBER),
    v2_lottery_to_center(WalletType.lottery, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    v2_center_to_poker(WalletType.poker, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.in, Constant.MEMBER),
    v2_poker_to_center(WalletType.poker, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    v2_center_to_e_sports(WalletType.e_sports, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.in, Constant.MEMBER),
    v2_e_sports_to_center(WalletType.e_sports, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    //信用钱包 4个
    //信用上下分，涉及可用额度和信用总额
    //场景:代理给会员进行信用上(下)分，代理信用钱包减(加)额，对应的会员可用额度和信用额度加(减)额
    v2_credit_up_score(WalletType.credit_available, MemberBizType.v2_credit_up_score, MemberChangeType.v2_credit_up_score, MemberAppType.v2_credit_up_score, TransType.in, Constant.MEMBER),
    v2_credit_total_up_score(WalletType.credit_total, MemberBizType.v2_credit_up_score, MemberChangeType.v2_credit_up_score, MemberAppType.v2_credit_up_score, TransType.in, Constant.MEMBER),
    v2_credit_down_score(WalletType.credit_available, MemberBizType.v2_credit_down_score, MemberChangeType.v2_credit_down_score, MemberAppType.v2_credit_down_score, TransType.out, Constant.MEMBER),
    v2_credit_total_down_score(WalletType.credit_total, MemberBizType.v2_credit_down_score, MemberChangeType.v2_credit_down_score, MemberAppType.v2_credit_down_score, TransType.out, Constant.MEMBER),
    //场景:会员信用借(还)款,可用额度减(加)额，现金余额加(减)额
    v2_credit_loan(WalletType.credit_available, MemberBizType.v2_loan, MemberChangeType.v2_credit_loan, MemberAppType.v2_loan, TransType.out, Constant.MEMBER),
    v2_credit_repay(WalletType.credit_available, MemberBizType.v2_repay, MemberChangeType.v2_credit_repay, MemberAppType.v2_repay, TransType.in, Constant.MEMBER),

    //v2.1新增账变明细
    //会员通过平台提供的存款渠道进行存款
    v2_1_deposit(WalletType.cash, MemberBizType.v2_1_deposit, MemberChangeType.v2_1_deposit, MemberAppType.v2_1_deposit, TransType.in, Constant.MEMBER),
    //会员通过平台提供的存款渠道进行存款，依据优惠规则额外的存款优惠
    //TODO 2.1不上，暂时去掉
    //v2_1_deposit_discount(WalletType.cash, MemberBizType.v2_1_deposit, MemberChangeType.v2_1_deposit_discount, MemberAppType.v2_1_deposit_discount, TransType.in, Constant.MEMBER),
    //运营在中控后台帮助用户人工加额上分
    v2_1_deposit_back(WalletType.cash, MemberBizType.v2_1_deposit, MemberChangeType.v2_1_deposit_back, MemberAppType.v2_1_deposit, TransType.in, Constant.MEMBER),
    //运营在中控后台帮助用户人工加额上分
    //TODO 2.1不上，暂时去掉
    //v2_1_deposit_discount_back(WalletType.cash, MemberBizType.v2_1_deposit, MemberChangeType.v2_1_deposit_discount_back, MemberAppType.v2_1_deposit_discount, TransType.in, Constant.MEMBER),
    //会员通过平台提供的取款渠道进行取款
    v2_1_withdraw(WalletType.cash, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw, MemberAppType.v2_1_withdraw, TransType.out, Constant.MEMBER),
    //会员主动申请取款，现金钱包的金额会先减少被冻结
    v2_1_withdraw_frozen(WalletType.cash, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw, MemberAppType.v2_withdraw_frozen, TransType.out, Constant.MEMBER),
    //会员申请取款被拒绝后，冻结的钱会返还回到现金钱包
    v2_1_withdraw_fail(WalletType.cash, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw_fail, MemberAppType.v2_withdraw_refused, TransType.in, Constant.MEMBER),
    //运营在中控后台帮助用户人工减额下分
    v2_1_withdraw_back(WalletType.cash, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw_back, MemberAppType.v2_1_withdraw, TransType.out, Constant.MEMBER),
    //会员通过平台提供的存款渠道进行存款
    v2_1_withdraw_frozen_cash_lock(WalletType.cash_lock, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw, MemberAppType.v2_withdraw_frozen, TransType.in, Constant.MEMBER),
    //会员通过平台提供的存款渠道进行存款，依据优惠规则额外的存款优惠
    v2_1_withdraw_fail_cash_lock(WalletType.cash_lock, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw_fail, MemberAppType.v2_withdraw_refused, TransType.out, Constant.MEMBER),
    //会员取款成功
    v2_1_withdraw_success(WalletType.cash_lock, MemberBizType.v2_1_withdraw, MemberChangeType.v2_1_withdraw, MemberAppType.v2_1_withdraw, TransType.out, Constant.MEMBER),
    //中控后台可以在返水上给会员增加金额
    v2_1_club_rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_1_club_rebate_add, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //中控后台可以在返水上给会员增加金额
    v2_1_insure_rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_1_insure_rebate_add, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //中控后台可以在返水上给会员增加金额
    v2_1_rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_add, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //中控后台可以在返水上给会员扣减金额
    v2_1_club_rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_1_club_rebate_sub, MemberAppType.v2_rebate, TransType.out, Constant.MEMBER),
    //中控后台可以在返水上给会员扣减金额
    v2_1_insure_rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_1_insure_rebate_sub, MemberAppType.v2_rebate, TransType.out, Constant.MEMBER),
    //中控后台可以在返水上给会员扣减金额
    v2_1_rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_sub, MemberAppType.v2_rebate, TransType.out, Constant.MEMBER),

    //v3_cash_deposit_by_official(WalletType.cash, MemberBizType.up_score, MemberChangeType.v3_cash_deposit_by_official, MemberAppType.v2_cash_up_score, TransType.in, Constant.MEMBER),
    //v3_cash_withdraw_by_official(WalletType.cash, MemberBizType.down_score, MemberChangeType.v3_cash_withdraw_by_official, MemberAppType.v2_cash_down_score, TransType.out, Constant.MEMBER),

    //代理通过代理后台/APP帮会员信用还款
    v3_proxy_help_credit_repay(WalletType.credit_available, MemberBizType.v2_repay, MemberChangeType.v3_proxy_help_credit_repay, MemberAppType.v2_repay, TransType.in, Constant.MEMBER),
    //***************单一钱包账变类***************start*****************************************************

    //***************彩票单一钱包账变类************start*********
    cp_touzhu(WalletType.cash, MemberBizType.cp_touzhu, MemberChangeType.cp_touzhu, MemberAppType.bet_single_wallet, TransType.out, Constant.MEMBER),
    cp_chedan(WalletType.cash, MemberBizType.cp_chedan, MemberChangeType.cp_chedan, MemberAppType.cancel_single_wallet, TransType.in, Constant.MEMBER),
    cp_paijiang(WalletType.cash, MemberBizType.cp_paijiang, MemberChangeType.cp_paijiang, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    cp_chehuipaijiang(WalletType.cash, MemberBizType.cp_chehuipaijiang, MemberChangeType.cp_chehuipaijiang, MemberAppType.cancel_single_wallet, TransType.out, Constant.MEMBER),
    cp_ercipaijiang(WalletType.cash, MemberBizType.cp_ercipaijiang, MemberChangeType.cp_ercipaijiang, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    //***************彩票单一钱包账变类************end*********

    //***************真人单一钱包账变类************start*********
    zr_touzhu(WalletType.cash, MemberBizType.zr_touzhu, MemberChangeType.zr_touzhu, MemberAppType.bet_single_wallet, TransType.out, Constant.MEMBER),
    zr_chedan(WalletType.cash, MemberBizType.zr_chedan, MemberChangeType.zr_chedan, MemberAppType.cancel_single_wallet, TransType.in, Constant.MEMBER),
    zr_paicai_add(WalletType.cash, MemberBizType.zr_paicai_add, MemberChangeType.zr_paicai_add, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    zr_paicai_sub(WalletType.cash, MemberBizType.zr_paicai_sub, MemberChangeType.zr_paicai_sub, MemberAppType.end_single_wallet, TransType.out, Constant.MEMBER),
    zr_activity_add(WalletType.cash, MemberBizType.zr_activity_add, MemberChangeType.zr_activity_add, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    zr_activity_sub(WalletType.cash, MemberBizType.zr_activity_sub, MemberChangeType.zr_activity_sub, MemberAppType.end_single_wallet, TransType.out, Constant.MEMBER),
    zr_fee_rollback(WalletType.cash, MemberBizType.zr_fee_rollback, MemberChangeType.zr_fee_rollback, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    //***************真人单一钱包账变类************end*********

    //***************体育单一钱包账变类************start*********
    ty_touzhu(WalletType.cash, MemberBizType.ty_touzhu, MemberChangeType.ty_touzhu, MemberAppType.bet_single_wallet, TransType.out, Constant.MEMBER),
    ty_paijiang(WalletType.cash, MemberBizType.ty_paijiang, MemberChangeType.ty_paijiang, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    ty_chedan(WalletType.cash, MemberBizType.ty_chedan, MemberChangeType.ty_chedan, MemberAppType.cancel_single_wallet, TransType.in, Constant.MEMBER),
    ty_chedan_cancel(WalletType.cash, MemberBizType.ty_chedan_cancel, MemberChangeType.ty_chedan_cancel, MemberAppType.cancel_single_wallet, TransType.out, Constant.MEMBER),
    ty_paijiang_cancel(WalletType.cash, MemberBizType.ty_paijiang_cancel, MemberChangeType.ty_paijiang_cancel, MemberAppType.cancel_single_wallet, TransType.out, Constant.MEMBER),
    ty_judan(WalletType.cash, MemberBizType.ty_judan, MemberChangeType.ty_judan, MemberAppType.cancel_single_wallet, TransType.in, Constant.MEMBER),
    ty_paijiang_advance_part(WalletType.cash, MemberBizType.ty_paijiang_advance_part, MemberChangeType.ty_paijiang_advance_part, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    ty_paijiang_advance_all(WalletType.cash, MemberBizType.ty_paijiang_advance_all, MemberChangeType.ty_paijiang_advance_all, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    ty_paijiang_advance_quxiao(WalletType.cash, MemberBizType.ty_paijiang_advance_quxiao, MemberChangeType.ty_paijiang_advance_quxiao, MemberAppType.end_single_wallet, TransType.out, Constant.MEMBER),
    ty_paijiang_advance_quxiao_cancel(WalletType.cash, MemberBizType.ty_paijiang_advance_quxiao_cancel, MemberChangeType.ty_paijiang_advance_quxiao_cancel, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    ty_artificial_add(WalletType.cash, MemberBizType.ty_artificial_add, MemberChangeType.ty_artificial_add, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    ty_artificial_sub(WalletType.cash, MemberBizType.ty_artificial_sub, MemberChangeType.ty_artificial_sub, MemberAppType.end_single_wallet, TransType.out, Constant.MEMBER),
    ty_appointment_touzhu(WalletType.cash, MemberBizType.ty_appointment_touzhu, MemberChangeType.ty_appointment_touzhu, MemberAppType.bet_single_wallet, TransType.out, Constant.MEMBER),
    ty_appointment_touzhu_cancel(WalletType.cash, MemberBizType.ty_appointment_touzhu_cancel, MemberChangeType.ty_appointment_touzhu_cancel, MemberAppType.cancel_single_wallet, TransType.in, Constant.MEMBER),
    //***************体育单一钱包账变类************end*********

    //***************电竞棋牌单一钱包账变类************start*********
    dj_touzhu(WalletType.cash, MemberBizType.dj_touzhu, MemberChangeType.dj_touzhu, MemberAppType.bet_single_wallet, TransType.out, Constant.MEMBER),
    dj_paijiang(WalletType.cash, MemberBizType.dj_paijiang, MemberChangeType.dj_paijiang, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    dj_chehuipaijiang(WalletType.cash, MemberBizType.dj_chehuipaijiang, MemberChangeType.dj_chehuipaijiang, MemberAppType.end_single_wallet, TransType.out, Constant.MEMBER),
    dj_other_add(WalletType.cash, MemberBizType.dj_other_add, MemberChangeType.dj_other_add, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),
    dj_other_sub(WalletType.cash, MemberBizType.dj_other_sub, MemberChangeType.dj_other_sub, MemberAppType.end_single_wallet, TransType.out, Constant.MEMBER),

    qp_touzhu(WalletType.cash, MemberBizType.qp_touzhu, MemberChangeType.qp_touzhu, MemberAppType.bet_single_wallet, TransType.out, Constant.MEMBER),
    qp_settlement(WalletType.cash, MemberBizType.qp_settlement, MemberChangeType.qp_settlement, MemberAppType.end_single_wallet, TransType.in, Constant.MEMBER),

    //***************电竞棋牌单一钱包账变类************end*********

    //***************单一钱包账变类***************end**************************************************************
    //v1.52需求账变
    v1_52_violation_fine(WalletType.cash,MemberBizType.down_score, MemberChangeType.v1_52_violation_fine, MemberAppType.v1_52_other_adjust, TransType.out, Constant.MEMBER),
    v1_52_finance_adjust(WalletType.cash,MemberBizType.down_score, MemberChangeType.v1_52_finance_adjust, MemberAppType.v1_52_other_adjust, TransType.out, Constant.MEMBER),
    v1_52_operate_adjust(WalletType.cash,MemberBizType.down_score, MemberChangeType.v1_52_operate_adjust, MemberAppType.v1_52_other_adjust, TransType.out, Constant.MEMBER),
    v1_52_third_order_lost_compensate(WalletType.cash,MemberBizType.up_score, MemberChangeType.v1_52_third_order_lost_compensate, MemberAppType.v1_52_other_adjust, TransType.in, Constant.MEMBER),
    v1_52_offline_settle_up_score(WalletType.cash,MemberBizType.up_score, MemberChangeType.v1_52_offline_settle_up_score, MemberAppType.v1_52_other_adjust, TransType.in, Constant.MEMBER),
    v1_52_other_adjust(WalletType.cash,MemberBizType.up_score, MemberChangeType.v1_52_other_adjust, MemberAppType.v1_52_other_adjust, TransType.in, Constant.MEMBER),
    table_serve_fee(WalletType.cash, MemberBizType.texas_club_serve_fee, MemberChangeType.table_serve_fee, MemberAppType.texas_club_serve_fee, TransType.out, Constant.MEMBER)

    ;

    private IWalletType walletType;
    private IBizType bizType;
    private IChangeType changeType;
    private IAppType appType;
    private TransType transType;
    private String name;

    /**
     * @param walletType 钱包类型
     * @param bizType    会员业务类型
     * @param changeType 会员账变类型
     * @param appType    会员客户端账变类型
     * @param transType  收支类型
     * @param name       会员name
     */
    MemberWalletChange(WalletType walletType, MemberBizType bizType, MemberChangeType changeType, MemberAppType appType, TransType transType, String name) {
        this.walletType = walletType;
        this.bizType = bizType;
        this.changeType = changeType;
        this.appType = appType;
        this.transType = transType;
        this.name = name;
    }

    public IWalletType walletType() {
        return walletType;
    }

    public IBizType bizType() {
        return bizType;
    }

    public IChangeType changeType() {
        return changeType;
    }

    public IAppType appType() {
        return appType;
    }

    public TransType transType() {
        return transType;
    }

    public String getName() {
        return name;
    }

    public static List<MemberWalletChange> getDepositMemberWalletChangeList() {
        return Arrays.asList(
                //会员存款
                MemberWalletChange.v2_1_deposit,
                //会员存款-后台
                MemberWalletChange.v2_1_deposit_back
        );
    }

    public static List<MemberWalletChange> getWithdrawMemberWalletChangeList() {
        return Arrays.asList(
                //会员取款
                MemberWalletChange.v2_1_withdraw_success,
                //会员取款-后台
                MemberWalletChange.v2_1_withdraw_back
        );
    }

    public static List<MemberWalletChange> v2List() {
        List<MemberWalletChange> list = new ArrayList<>();
        //list.add(rebate);
        //list.add(rebate_add);
        //list.add(rebate_sub);
        list.add(MemberWalletChange.v2_cash_up_score);
        list.add(MemberWalletChange.v2_cash_down_score);
        list.add(MemberWalletChange.v2_cash_down_score_withdraw_frozen);
        list.add(MemberWalletChange.v2_cash_down_score_withdraw_refused);
        list.add(v2_cash_center_to_B);
        list.add(v2_B_to_center);
        list.add(MemberWalletChange.v2_rebate);
        list.add(MemberWalletChange.v2_rebate_add);
        list.add(MemberWalletChange.v2_rebate_sub);
        list.add(MemberWalletChange.v2_cash_loan);
        list.add(MemberWalletChange.v2_cash_repay);
        list.add(MemberWalletChange.bring_to_table);
        list.add(MemberWalletChange.bring_out_table);
        list.add(MemberWalletChange.v2_cash_down_score_audit_passed_to_proxy);
        list.add(MemberWalletChange.v2_cash_lock_down_score_frozen);
        list.add(MemberWalletChange.V2_cash_lock_down_score_refused);
        list.add(MemberWalletChange.v2_bring_to_table_texas);
        list.add(MemberWalletChange.v2_bring_out_table_texas);
        list.add(MemberWalletChange.v2_center_to_video);
        list.add(MemberWalletChange.v2_video_to_center);
        list.add(MemberWalletChange.v2_center_to_sports);
        list.add(MemberWalletChange.v2_sports_to_center);
        list.add(MemberWalletChange.v2_center_to_lottery);
        list.add(MemberWalletChange.v2_lottery_to_center);
        list.add(MemberWalletChange.v2_center_to_poker);
        list.add(MemberWalletChange.v2_poker_to_center);
        list.add(MemberWalletChange.v2_center_to_e_sports);
        list.add(MemberWalletChange.v2_e_sports_to_center);
        list.add(MemberWalletChange.v2_credit_up_score);
        list.add(MemberWalletChange.v2_credit_total_up_score);
        list.add(MemberWalletChange.v2_credit_down_score);
        list.add(MemberWalletChange.v2_credit_total_down_score);
        list.add(MemberWalletChange.v2_credit_repay);
        list.add(MemberWalletChange.v2_credit_loan);
        list.add(v2_1_deposit);
        list.add(v2_1_deposit_back);
        list.add(v2_1_withdraw);
        list.add(v2_1_withdraw_frozen);
        list.add(v2_1_withdraw_fail);
        list.add(v2_1_withdraw_back);
        list.add(v2_1_withdraw_frozen_cash_lock);
        list.add(v2_1_withdraw_fail_cash_lock);
        list.add(v2_1_withdraw_success);
        list.add(v2_1_club_rebate_add);
        list.add(v2_1_insure_rebate_add);
        list.add(v2_1_rebate_add);
        list.add(v2_1_club_rebate_sub);
        list.add(v2_1_insure_rebate_sub);
        list.add(v2_1_rebate_sub);
        list.add(v3_proxy_help_credit_repay);
        //单一钱包
        list.add(cp_touzhu);
        list.add(cp_chedan);
        list.add(cp_paijiang);
        list.add(cp_chehuipaijiang);
        list.add(cp_ercipaijiang);
        list.add(zr_touzhu);
        list.add(zr_chedan);
        list.add(zr_paicai_add);
        list.add(zr_paicai_sub);
        list.add(zr_activity_add);
        list.add(zr_activity_sub);
        list.add(zr_fee_rollback);
        list.add(ty_touzhu);
        list.add(ty_paijiang);
        list.add(ty_chedan);
        list.add(ty_chedan_cancel);
        list.add(ty_paijiang_cancel);
        list.add(ty_judan);
        list.add(ty_paijiang_advance_part);
        list.add(ty_paijiang_advance_all);
        list.add(ty_paijiang_advance_quxiao);
        list.add(ty_paijiang_advance_quxiao_cancel);
        list.add(ty_artificial_add);
        list.add(ty_artificial_sub);
        list.add(ty_appointment_touzhu);
        list.add(ty_appointment_touzhu_cancel);
        list.add(v1_52_violation_fine);
        list.add(v1_52_finance_adjust);
        list.add(v1_52_operate_adjust);
        list.add(v1_52_third_order_lost_compensate);
        list.add(v1_52_offline_settle_up_score);
        list.add(v1_52_other_adjust);
        list.add(table_serve_fee);

        list.add(dj_touzhu);
        list.add(dj_paijiang);
        list.add(dj_chehuipaijiang);
        list.add(dj_other_add);
        list.add(dj_other_sub);
        list.add(qp_touzhu);
        list.add(qp_settlement);

        return list;
    }

    public static MemberWalletChange getBy(Integer walletType, Integer bizType, Integer changeType) {
        return MemberWalletChange.v2List().stream().filter(w ->
                w.walletType().code().equals(walletType)
                        && w.bizType.code().equals(bizType)
                        && w.changeType.code().equals(changeType)).findFirst().orElse(null);
    }

}