package com.dx.facade.account.change;

import com.dx.facade.account.change.param.Constant;

import java.util.Arrays;
import java.util.List;

/**
 * 会员账变业务 定义
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


    //*******************V2需求会员账变明细****************
    //中心钱包 余额9个 + 冻结余额4个，共13个
    //场景1.代理给会员上分，会员中心钱包余额加额度，对应代理的中心钱包余额减额度；
    v2_cash_up_score(WalletType.cash, MemberBizType.up_score, MemberChangeType.v2_cash_up_score, MemberAppType.v2_cash_up_score, TransType.in, Constant.MEMBER),
    //场景2.代理在代理后台直接给会员提现下分，会员中心钱包支出，对应的代理中心钱包余额加额
    v2_cash_down_score(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.out, Constant.MEMBER),
    //场景3.会员通过app发起提现，最终代理审核通过，当代理审核通过时，会员的冻结额度扣减，对应的代理中心钱包余额进行加额
    v2_cash_down_score_audit_passed_to_proxy(WalletType.cash_lock, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.out, Constant.MEMBER),
    //场景4.会员通过app发起的提现订单，被平台或代理审核拒绝，需要将会员中心钱包冻结余额返还到中心钱包余额
    v2_cash_down_score_withdraw_refused(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_refused, MemberAppType.v2_withdraw_refused, TransType.in, Constant.MEMBER),
    //场景5.会员通过app发起提现订单，会员中心钱包余额减额，对应的会员中心钱包冻结余额加额
    v2_cash_down_score_withdraw_frozen(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_frozen, MemberAppType.v2_withdraw_frozen, TransType.out, Constant.MEMBER),
    //见场景5，提现冻结时，冻结额度加额
    v2_cash_lock_down_score_frozen(WalletType.cash_lock, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_frozen, MemberAppType.v2_withdraw_frozen, TransType.in, Constant.MEMBER),
    //见场景4，会员提现被拒绝，会员中心钱包冻结额度扣除，返回到中心钱包的余额。
    V2_cash_lock_down_score_refused(WalletType.cash_lock, MemberBizType.down_score, MemberChangeType.v2_cash_withdraw_refused, MemberAppType.v2_withdraw_refused, TransType.out, Constant.MEMBER),
    //场景6.会员向B端场馆上分，会员中心钱包余额扣除额度，转入到对应场馆钱包
    v2_cash_center_to_B(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.v2_cash_center_to_B, MemberAppType.v2_transfer, TransType.out, Constant.MEMBER),
    //场景7.会员从B端场馆下分，场馆钱包额度扣除，加给会员的中心钱包余额
    v2_B_to_center(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.v2_cash_B_to_center, MemberAppType.transfer, TransType.in, Constant.MEMBER),
    //场景8.会员玩游戏产生有效投注，给平台给会员定时返水
    v2_rebate(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //场景9.官方调整增加会员返水，参见中控后台人工加额调整功能
    v2_rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_add, MemberAppType.v2_rebate, TransType.in, Constant.MEMBER),
    //场景10.官方调整扣除会员返水，参见中控后台人工扣除调整功能
    v2_rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_sub, MemberAppType.v2_rebate, TransType.out, Constant.MEMBER),
    //场景11.会员从信用钱包借钱，信用钱包余额减额，对应中心钱包的余额响应加额
    v2_cash_loan(WalletType.cash, MemberBizType.v2_loan, MemberChangeType.v2_cash_loan, MemberAppType.v2_loan, TransType.in, Constant.MEMBER),
    //场景12.与场景11相反，会员借钱后进行还钱操作，从中心钱包余额扣除额度，对应的信用余额进行加额操作
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
    //信用上下分，涉及信用余额和信用总额
    //场景:代理给会员进行信用上(下)分，代理信用钱包减(加)额，对应的会员信用余额和信用额度加(减)额
    v2_credit_up_score(WalletType.credit_available, MemberBizType.v2_credit_up_score, MemberChangeType.v2_credit_up_score, MemberAppType.v2_credit_up_score, TransType.in, Constant.MEMBER),
    v2_credit_total_up_score(WalletType.credit_total, MemberBizType.v2_credit_up_score, MemberChangeType.v2_credit_up_score, MemberAppType.v2_credit_up_score, TransType.in, Constant.MEMBER),
    v2_credit_down_score(WalletType.credit_available, MemberBizType.v2_credit_down_score, MemberChangeType.v2_credit_down_score, MemberAppType.v2_credit_down_score, TransType.out, Constant.MEMBER),
    v2_credit_total_down_score(WalletType.credit_total, MemberBizType.v2_credit_down_score, MemberChangeType.v2_credit_down_score, MemberAppType.v2_credit_down_score, TransType.out, Constant.MEMBER),
    //场景:会员信用借(还)款,信用余额减(加)额，中心钱包余额加(减)额
    v2_credit_loan(WalletType.credit_available, MemberBizType.v2_loan, MemberChangeType.v2_credit_loan, MemberAppType.v2_loan, TransType.out, Constant.MEMBER),
    v2_credit_repay(WalletType.credit_available, MemberBizType.v2_repay, MemberChangeType.v2_credit_repay, MemberAppType.v2_repay, TransType.in, Constant.MEMBER),


    ;

    private IWalletType walletType;
    private IBizType bizType;
    private IChangeType changeType;
    private IAppType appType;
    private TransType transType;
    private String name;

    /**
     *
     * @param walletType 钱包类型
     * @param bizType 会员业务类型
     * @param changeType 会员账变类型
     * @param appType 会员客户端账变类型
     * @param transType 收支类型
     * @param name 会员name
     */
    MemberWalletChange(WalletType walletType, MemberBizType bizType, MemberChangeType changeType, MemberAppType appType, TransType transType, String name){
        this.walletType = walletType;
        this.bizType = bizType;
        this.changeType = changeType;
        this.appType = appType;
        this.transType = transType;
        this.name = name;
    }

    public IWalletType walletType(){
        return walletType;
    }

    public IBizType bizType(){
        return bizType;
    }

    public IChangeType changeType(){
        return changeType;
    }

    public IAppType appType(){
        return appType;
    }

    public TransType transType(){
        return transType;
    }

    public String getName(){
        return name;
    }

    // TODO 需要更具业务逻辑更新
    public static List<MemberWalletChange> getDepositMemberWalletChangeList(){
        return Arrays.asList(MemberWalletChange.deposit,
                MemberWalletChange.deposit_add,
                MemberWalletChange.agent_deposit_for_member,

                MemberWalletChange.v2_cash_up_score
                //@TODO 信用上分是否计入member表的存入累计？
                //MemberWalletChange.v2_credit_up_score,
                //MemberWalletChange.v2_credit_total_up_score
        );
    }

    // TODO 需要更具业务逻辑更新
    public static List<MemberWalletChange> getWithdrawMemberWalletChangeList(){
        return Arrays.asList(
                MemberWalletChange.withdraw_success,
                MemberWalletChange.withdraw_sub,

                MemberWalletChange.v2_cash_down_score,
                MemberWalletChange.V2_cash_lock_down_score_refused
                //@TODO 信用下分是否计入member表的取出累计？
                //MemberWalletChange.v2_credit_down_score,
                //MemberWalletChange.v2_credit_total_down_score
        );
    }
}