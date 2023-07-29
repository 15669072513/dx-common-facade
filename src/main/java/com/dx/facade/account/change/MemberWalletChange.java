package com.dx.facade.account.change;

import java.util.Arrays;
import java.util.List;

import com.dx.facade.account.change.param.Constant;

/**
 * 会员账变业务 定义
 */
public enum MemberWalletChange implements IWalletChange {
    deposit(WalletType.cash, MemberBizType.deposit, MemberChangeType.deposit, MemberAppType.deposit, TransType.income, Constant.MEMBER),
    deposit_add(WalletType.cash, MemberBizType.deposit, MemberChangeType.deposit_back, MemberAppType.deposit, TransType.income, Constant.MEMBER),
    agent_deposit_for_member(WalletType.cash, MemberBizType.agent_deposit_for_member, MemberChangeType.agent_deposit_for_member, MemberAppType.deposit, TransType.income, Constant.MEMBER),
    commission_to_center(WalletType.cash, MemberBizType.to_center, MemberChangeType.to_center, MemberAppType.deposit, TransType.income, Constant.MEMBER),

    withdraw(WalletType.cash, MemberBizType.withdraw, MemberChangeType.withdraw, MemberAppType.withdraw, TransType.outlay, Constant.MEMBER),
    lock_withdraw(WalletType.member_lock, MemberBizType.withdraw, MemberChangeType.withdraw, MemberAppType.withdraw, TransType.income, Constant.MEMBER),
    withdraw_fail(WalletType.cash, MemberBizType.withdraw, MemberChangeType.withdraw_fail, MemberAppType.withdraw, TransType.income, Constant.MEMBER),
    lock_withdraw_fail(WalletType.member_lock, MemberBizType.withdraw, MemberChangeType.withdraw_fail, MemberAppType.withdraw, TransType.outlay, Constant.MEMBER),
    withdraw_success(WalletType.member_lock, MemberBizType.withdraw, MemberChangeType.withdraw, MemberAppType.withdraw, TransType.outlay, Constant.MEMBER),
    withdraw_sub(WalletType.cash, MemberBizType.withdraw, MemberChangeType.withdraw_back, MemberAppType.withdraw, TransType.outlay, Constant.MEMBER),

    center_to_B(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.center_to_B, MemberAppType.transfer, TransType.outlay, Constant.MEMBER),
    center_to_B_bill(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.center_to_B, MemberAppType.transfer, TransType.outlay, Constant.MEMBER),
    B_to_center(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.B_to_center, MemberAppType.transfer, TransType.income, Constant.MEMBER),

    rebate(WalletType.cash, MemberBizType.rebate, MemberChangeType.rebate, MemberAppType.rebate, TransType.income, Constant.MEMBER),
    rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.rebate_add, MemberAppType.rebate, TransType.income, Constant.MEMBER),
    rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.rebate_sub, MemberAppType.rebate, TransType.outlay, Constant.MEMBER),

    activity(WalletType.cash, MemberBizType.activity, MemberChangeType.activity, MemberAppType.activity, TransType.income, Constant.MEMBER),
    activity_add(WalletType.cash, MemberBizType.activity, MemberChangeType.activity_add, MemberAppType.activity, TransType.income, Constant.MEMBER),
    activity_sub(WalletType.cash, MemberBizType.activity, MemberChangeType.activity_sub, MemberAppType.activity, TransType.outlay, Constant.MEMBER),

    reward(WalletType.cash, MemberBizType.reward, MemberChangeType.reward, MemberAppType.reward, TransType.income, Constant.MEMBER),
    reward_add(WalletType.cash, MemberBizType.reward, MemberChangeType.reward_add, MemberAppType.reward, TransType.income, Constant.MEMBER),
    reward_sub(WalletType.cash, MemberBizType.reward, MemberChangeType.reward_sub, MemberAppType.reward, TransType.outlay, Constant.MEMBER),

    other_add(WalletType.cash, MemberBizType.other, MemberChangeType.other_add, MemberAppType.other, TransType.income, Constant.MEMBER),
    other_sub(WalletType.cash, MemberBizType.other, MemberChangeType.other_sub, MemberAppType.other, TransType.outlay, Constant.MEMBER),

    deposit_reward(WalletType.cash, MemberBizType.deposit_discount, MemberChangeType.deposit_discount, MemberAppType.deposit_discount, TransType.income, Constant.MEMBER),
    deposit_reward_add(WalletType.cash, MemberBizType.deposit_discount, MemberChangeType.deposit_discount_add, MemberAppType.deposit_discount, TransType.income, Constant.MEMBER),
    deposit_reward_sub(WalletType.cash, MemberBizType.deposit_discount, MemberChangeType.deposit_discount_sub, MemberAppType.deposit_discount, TransType.outlay, Constant.MEMBER),

    proxy_up_score(WalletType.cash, MemberBizType.up_score, MemberChangeType.proxy_up_score, MemberAppType.proxy_up_score, TransType.income, Constant.MEMBER),

    proxy_down_score(WalletType.cash, MemberBizType.down_score, MemberChangeType.proxy_down_score, MemberAppType.proxy_down_score, TransType.outlay, Constant.MEMBER),

    bring_to_table(WalletType.cash, MemberBizType.game, MemberChangeType.bring_to_table, MemberAppType.bring_to_table, TransType.outlay, Constant.MEMBER),
    bring_out_table(WalletType.cash, MemberBizType.game, MemberChangeType.bring_out_table, MemberAppType.bring_out_table, TransType.income, Constant.MEMBER),


    //*******************V2需求会员账变明细****************
    //中心钱包 9个
    v2_cash_up_score(WalletType.cash, MemberBizType.up_score, MemberChangeType.v2_cash_up_score, MemberAppType.v2_cash_up_score, TransType.income, Constant.MEMBER),
    //提现下分
    v2_cash_down_score(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.outlay, Constant.MEMBER),
    //提现下分被拒绝后，中心钱包需加回额度
    v2_cash_down_score_return(WalletType.cash, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.income, Constant.MEMBER),
    //提现冻结
    v2_withdraw_lock_down_score(WalletType.member_lock, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.income, Constant.MEMBER),
    //提现拒绝后，将冻结退回
    V2_withdraw_lock_down_score_return(WalletType.member_lock, MemberBizType.down_score, MemberChangeType.v2_cash_down_score, MemberAppType.v2_cash_down_score, TransType.outlay, Constant.MEMBER),
    v2_cash_center_to_B(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.v2_cash_center_to_B, MemberAppType.v2_transfer, TransType.outlay, Constant.MEMBER),
    v2_B_to_center(WalletType.cash, MemberBizType.B_mutual_center, MemberChangeType.v2_cash_B_to_center, MemberAppType.transfer, TransType.income, Constant.MEMBER),
    v2_rebate(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate, MemberAppType.v2_rebate, TransType.income, Constant.MEMBER),
    v2_rebate_add(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_add, MemberAppType.v2_rebate, TransType.income, Constant.MEMBER),
    v2_rebate_sub(WalletType.cash, MemberBizType.rebate, MemberChangeType.v2_rebate_sub, MemberAppType.v2_rebate, TransType.outlay, Constant.MEMBER),
    v2_cash_loan(WalletType.cash, MemberBizType.v2_loan, MemberChangeType.v2_cash_loan, MemberAppType.v2_loan, TransType.income, Constant.MEMBER),
    v2_cash_repay(WalletType.cash, MemberBizType.v2_repay, MemberChangeType.v2_cash_repay, MemberAppType.v2_repay, TransType.outlay, Constant.MEMBER),

    //德州 2个
    v2_bring_to_table_texas(WalletType.texas, MemberBizType.game, MemberChangeType.bring_to_table, MemberAppType.v2_bring_to_table, TransType.outlay, Constant.MEMBER),
    v2_bring_out_table_texas(WalletType.texas, MemberBizType.game, MemberChangeType.bring_out_table, MemberAppType.v2_bring_out_table, TransType.income, Constant.MEMBER),
    //其它5场馆 * 2种转账 = 10个
    v2_center_to_video(WalletType.video, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.income, Constant.MEMBER),
    v2_video_to_center(WalletType.video, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.outlay, Constant.MEMBER),
    v2_center_to_sports(WalletType.sports, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.income, Constant.MEMBER),
    v2_sports_to_center(WalletType.sports, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.outlay, Constant.MEMBER),
    v2_center_to_lottery(WalletType.lottery, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.income, Constant.MEMBER),
    v2_lottery_to_center(WalletType.lottery, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.outlay, Constant.MEMBER),
    v2_center_to_poker(WalletType.poker, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.income, Constant.MEMBER),
    v2_poker_to_center(WalletType.poker, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.outlay, Constant.MEMBER),
    v2_center_to_e_sports(WalletType.e_sports, MemberBizType.B_mutual_center, MemberChangeType.v2_center_to_B, MemberAppType.v2_transfer, TransType.income, Constant.MEMBER),
    v2_e_sports_to_center(WalletType.e_sports, MemberBizType.B_mutual_center, MemberChangeType.v2_B_to_center, MemberAppType.v2_transfer, TransType.outlay, Constant.MEMBER),
    //信用钱包 4个
    //信用上下分，涉及信用余额和信用总额
    v2_credit_up_score(WalletType.credit_available, MemberBizType.v2_credit_up_score, MemberChangeType.v2_credit_up_score, MemberAppType.v2_credit_up_score, TransType.income, Constant.MEMBER),
    v2_credit_total_up_score(WalletType.credit_total, MemberBizType.v2_credit_up_score, MemberChangeType.v2_credit_up_score, MemberAppType.v2_credit_up_score, TransType.income, Constant.MEMBER),
    v2_credit_down_score(WalletType.credit_available, MemberBizType.v2_credit_down_score, MemberChangeType.v2_credit_down_score, MemberAppType.v2_credit_down_score, TransType.outlay, Constant.MEMBER),
    v2_credit_total_down_score(WalletType.credit_total, MemberBizType.v2_credit_down_score, MemberChangeType.v2_credit_down_score, MemberAppType.v2_credit_down_score, TransType.outlay, Constant.MEMBER),
    //信用借款，只涉及信用余额
    v2_credit_loan(WalletType.credit_available, MemberBizType.v2_loan, MemberChangeType.v2_credit_loan, MemberAppType.v2_loan, TransType.outlay, Constant.MEMBER),
    v2_credit_repay(WalletType.credit_available, MemberBizType.v2_repay, MemberChangeType.v2_credit_repay, MemberAppType.v2_repay, TransType.income, Constant.MEMBER),


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


    public static List<MemberWalletChange> getDepositMemberWalletChangeList(){// TODO 需要更具业务逻辑更新
        return Arrays.asList(MemberWalletChange.deposit, MemberWalletChange.deposit_add, MemberWalletChange.agent_deposit_for_member);
    }

    public static List<MemberWalletChange> getWithdrawMemberWalletChangeList(){ // TODO 需要更具业务逻辑更新
        return Arrays.asList(MemberWalletChange.withdraw_success, MemberWalletChange.withdraw_sub);
    }
}