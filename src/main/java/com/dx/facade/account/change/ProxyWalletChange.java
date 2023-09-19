package com.dx.facade.account.change;

import com.dx.facade.account.change.param.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 代理账变业务 定义
 * @author Administrator
 */
public enum ProxyWalletChange implements IWalletChange {

    //额度钱包(没有取款业务，人工扣除也没有)
    quota_deposit(WalletType.quota, ProxyBizType.deposit, ProxyChangeType.deposit, ProxyAppType.deposit, TransType.in),
    quota_deposit_add(WalletType.quota, ProxyBizType.deposit, ProxyChangeType.deposit_back, ProxyAppType.deposit, TransType.in),

    quota_deposit_for_member(WalletType.quota, ProxyBizType.deposit_for_member, ProxyChangeType.deposit_for_member, ProxyAppType.deposit_for_member, TransType.out),

    quota_activity(WalletType.quota, ProxyBizType.activity, ProxyChangeType.activity, ProxyAppType.activity, TransType.in),
    quota_activity_add(WalletType.quota, ProxyBizType.activity, ProxyChangeType.activity_add, ProxyAppType.activity, TransType.in),
    quota_activity_sub(WalletType.quota, ProxyBizType.activity, ProxyChangeType.activity_sub, ProxyAppType.activity, TransType.out),

//    quota_add(WalletType.quota, ProxyBizType.quota, ProxyChangeType.quota_add, ProxyAppType.quota, TransType.income),
//    quota_sub(WalletType.quota, ProxyBizType.quota, ProxyChangeType.quota_sub, ProxyAppType.quota, TransType.outlay),

    quota_transfer_out(WalletType.quota, ProxyBizType.transfer, ProxyChangeType.transfer_out, ProxyAppType.transfer, TransType.out),
    quota_transfer_in(WalletType.quota, ProxyBizType.transfer, ProxyChangeType.transfer_in, ProxyAppType.transfer, TransType.in),

    quota_other_add(WalletType.quota, ProxyBizType.other, ProxyChangeType.other_add, ProxyAppType.other, TransType.in),
    quota_other_sub(WalletType.quota, ProxyBizType.other, ProxyChangeType.other_sub, ProxyAppType.other, TransType.out),

    //quota_transfer_to_banker(WalletType.quota, ProxyBizType.transfer_with_banker, ProxyChangeType.quota_transfer_to_banker, ProxyAppType.transfer_with_banker, TransType.outlay),

    //佣金钱包
    commission_deposit(WalletType.commission, ProxyBizType.deposit, ProxyChangeType.deposit, ProxyAppType.deposit, TransType.in),
    commission_deposit_add(WalletType.commission, ProxyBizType.deposit, ProxyChangeType.deposit_back, ProxyAppType.deposit, TransType.in),

    commission_withdraw(WalletType.commission, ProxyBizType.withdraw, ProxyChangeType.withdraw, ProxyAppType.withdraw, TransType.out),
    commission_lock_withdraw(WalletType.agent_lock, ProxyBizType.withdraw, ProxyChangeType.withdraw, ProxyAppType.withdraw, TransType.in),
    commission_withdraw_fail(WalletType.commission, ProxyBizType.withdraw, ProxyChangeType.withdraw_fail, ProxyAppType.withdraw, TransType.in),
    commission_lock_withdraw_fail(WalletType.agent_lock, ProxyBizType.withdraw, ProxyChangeType.withdraw_fail, ProxyAppType.withdraw, TransType.out),
    commission_withdraw_success(WalletType.agent_lock, ProxyBizType.withdraw, ProxyChangeType.withdraw, ProxyAppType.withdraw, TransType.out),
    commission_withdraw_sub(WalletType.commission, ProxyBizType.withdraw, ProxyChangeType.withdraw_back, ProxyAppType.withdraw, TransType.out),

    commission_to_center(WalletType.commission, ProxyBizType.to_center, ProxyChangeType.to_center, ProxyAppType.to_center, TransType.out),

    commission_platform_transfer_in(WalletType.commission, ProxyBizType.commission, ProxyChangeType.platform_transfer_in, ProxyAppType.commission, TransType.in),
    commission_transfer_in_by_cycle(WalletType.commission, ProxyBizType.commission, ProxyChangeType.transfer_in_by_cycle, ProxyAppType.commission, TransType.in),
    commission_transfer_out_by_cycle(WalletType.commission, ProxyBizType.commission, ProxyChangeType.transfer_out_by_cycle, ProxyAppType.commission, TransType.out),
    commission_add(WalletType.commission, ProxyBizType.commission, ProxyChangeType.commission_add, ProxyAppType.commission, TransType.in),
    commission_sub(WalletType.commission, ProxyBizType.commission, ProxyChangeType.commission_sub, ProxyAppType.commission, TransType.out),

    //代理返点 代理中心钱包WalletType.agent_cash
    commission_rebate(WalletType.agent_cash, ProxyBizType.rebate, ProxyChangeType.rebate, ProxyAppType.rebate, TransType.in),
    commission_rebate_add(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate_add, ProxyAppType.rebate, TransType.in),
    commission_rebate_sub(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate_sub, ProxyAppType.rebate, TransType.out),

    commission_deposit_for_member(WalletType.commission, ProxyBizType.deposit_for_member, ProxyChangeType.deposit_for_member, ProxyAppType.deposit_for_member, TransType.out),

    commission_transfer_out(WalletType.commission, ProxyBizType.transfer, ProxyChangeType.transfer_out, ProxyAppType.transfer, TransType.out),
    commission_transfer_in(WalletType.commission, ProxyBizType.transfer, ProxyChangeType.transfer_in, ProxyAppType.transfer, TransType.in),

    commission_other_add(WalletType.commission, ProxyBizType.other, ProxyChangeType.other_add, ProxyAppType.other, TransType.in),
    commission_other_sub(WalletType.commission, ProxyBizType.other, ProxyChangeType.other_sub, ProxyAppType.other, TransType.out),


    officer_proxy_up_score(WalletType.agent_cash, ProxyBizType.up_score, ProxyChangeType.officer_proxy_up_score, ProxyAppType.officer_proxy_up_score, TransType.in),
    officer_proxy_down_score(WalletType.agent_cash, ProxyBizType.down_score, ProxyChangeType.officer_proxy_down_score, ProxyAppType.officer_proxy_down_score, TransType.out),

    proxy_be_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.proxy_be_up_score, ProxyAppType.proxy_be_up_score, TransType.in),
    proxy_to_child_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.proxy_to_child_up_score, ProxyAppType.proxy_to_child_up_score, TransType.out),
    proxy_to_mem_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.proxy_to_mem_up_score, ProxyAppType.proxy_to_mem_up_score, TransType.out),

    proxy_be_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.proxy_be_down_score, ProxyAppType.proxy_be_down_score, TransType.out),
    proxy_to_child_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.proxy_to_child_down_score, ProxyAppType.proxy_to_child_down_score, TransType.in),
    proxy_to_mem_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.proxy_to_mem_down_score, ProxyAppType.proxy_to_mem_down_score, TransType.in),

    commission_to_quota(WalletType.commission, ProxyBizType.commission_to_quota, ProxyChangeType.commission_to_quota, ProxyAppType.commission_to_quota, TransType.out),
    commission_be_transfer_to_quota(WalletType.quota, ProxyBizType.commission_to_quota, ProxyChangeType.commission_be_transfer_to_quota, ProxyAppType.commission_be_transfer_to_quota, TransType.in),

    commission_rebate_adjustment_add(WalletType.agent_cash, ProxyBizType.rebate, ProxyChangeType.rebate_add, ProxyAppType.commission_rebate_add, TransType.in),
    commission_rebate_adjustment_sub(WalletType.agent_cash, ProxyBizType.rebate, ProxyChangeType.rebate_sub, ProxyAppType.commission_rebate_sub, TransType.out),

//    commission_transfer_to_banker(WalletType.commission, ProxyBizType.transfer_with_banker, ProxyChangeType.commission_transfer_to_banker, ProxyAppType.transfer_with_banker, TransType.outlay),
//    commission_receive_from_banker(WalletType.commission, ProxyBizType.transfer_with_banker, ProxyChangeType.commission_receive_from_banker, ProxyAppType.transfer_with_banker, TransType.income),
     //--------------------v2需求代理全部账变类型------------
    //中心钱包 13种
    //场景1：官方通过中控后台给代理人工加额，代理的中心钱包余额增加
    v2_cash_deposit_by_official(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_by_official, ProxyAppType.v2_cash_deposit_by_official, TransType.in),
    //场景2：代理通过代理后台充值上分操作，代理的中心钱包余额增加，上级代理的中心钱包余额扣减
    v2_cash_deposit_by_parent_proxy(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_by_parent_proxy, ProxyAppType.v2_cash_deposit_by_parent_proxy, TransType.in),
    //场景3：代理自己通过代理后台对下级代理充值上分，代理自己的中心钱包余额扣减，下级代理的中心钱包额度增加，与场景2对应
    v2_cash_deposit_to_sub_proxy(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_to_sub_proxy, ProxyAppType.v2_cash_deposit_to_sub_proxy, TransType.out),
    //场景4：代理通过代理后台，给自己的下级会员充值上分，代理自己的中心钱包余额扣减，会员的中心钱包余额增加
    v2_cash_deposit_to_member(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_to_member,ProxyAppType.v2_cash_deposit_to_member, TransType.out),
    //官方通过中控后台给代理人工扣减，代理的中心钱包额度扣除
    v2_cash_withdraw_by_official(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_by_official, ProxyAppType.v2_cash_withdraw_by_official, TransType.out),
    //代理被上级代理在代理后台提现，代理的中心钱包余额扣减，上级代理的中心钱包余额增加
    v2_cash_withdraw_by_parent_proxy(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_by_parent_proxy, ProxyAppType.v2_cash_withdraw_by_parent_proxy, TransType.out),
    //代理通过代理后台给下级代理提现，代理的中心钱包余额增加，下级代理的中心钱包余额扣除
    v2_cash_withdraw_to_sub_proxy(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_to_sub_proxy, ProxyAppType.v2_cash_withdraw_to_sub_proxy,TransType.in),
    //代理通过代理后台给会员提现，或者会员主动提现订单被代理审核通过，代理的中心钱包余额增加，会员的中心钱包余额扣减或中心钱包冻结额度扣减
    v2_cash_withdraw_to_member(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_to_member, ProxyAppType.v2_cash_withdraw_to_member, TransType.in),
    //下级会员有效投注后，给上级代理的返点，代理的中心钱包余额增加
    v2_cash_rebate(WalletType.agent_cash,  ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方通过人工增加额度，给代理的返点进行增加调整，代理的中心钱包余额增加
    v2_cash_rebate_add(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate_add, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方通过人工扣除额度，给代理的返点进行扣除调整，代理的中心钱包余额扣减
    v2_cash_rebate_sub(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate_sub, ProxyAppType.v2_cash_rebate, TransType.out),
    //代理从信用余额借款到中心钱包余额
    v2_cash_loan(WalletType.agent_cash, ProxyBizType.v2_loan, ProxyChangeType.v2_cash_loan, ProxyAppType.v2_loan, TransType.in),
    //代理从中心钱包余额还款到信用余额
    v2_cash_repay(WalletType.agent_cash, ProxyBizType.v2_repay, ProxyChangeType.v2_cash_repay, ProxyAppType.v2_repay, TransType.out),

    //信用余额钱包记录信用上下分 10种
    //官方通过中控后台给代理信用钱包人工加额，代理的信用钱包余额和额度同时增加
    v2_credit_up_score_by_official(WalletType.agent_credit_available, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_official, ProxyAppType.v2_credit_up_score_by_official, TransType.in),
    v2_credit_total_up_score_by_official(WalletType.agent_credit_total, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_official, ProxyAppType.v2_credit_up_score_by_official, TransType.in),
    //上级代理通过代理后对自己信用钱包授信上分，代理的信用余额和信用额度同时增加
    v2_credit_up_score_by_parent_proxy(WalletType.agent_credit_available,  ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_parent_proxy, ProxyAppType.v2_credit_up_score_by_parent_proxy, TransType.in),
    v2_credit_total_up_score_by_parent_proxy(WalletType.agent_credit_total,  ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_parent_proxy, ProxyAppType.v2_credit_up_score_by_parent_proxy, TransType.in),
    //代理通过代理后台对下级代理充值上分，代理自己的信用钱包余额和信用额度同时扣减
    v2_credit_up_score_to_sub_proxy(WalletType.agent_credit_available,  ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_sub_proxy, ProxyAppType.v2_credit_up_score_to_sub_proxy, TransType.out),
    v2_credit_total_up_score_to_sub_proxy(WalletType.agent_credit_total,  ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_sub_proxy, ProxyAppType.v2_credit_up_score_to_sub_proxy, TransType.out),
    //代理通过代理后台对下级会员充值上分，代理自己的信用钱包余额和信用额度同时扣减
    v2_credit_up_score_to_member(WalletType.agent_credit_available, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_member, ProxyAppType.v2_credit_up_score_to_member, TransType.out),
    v2_credit_total_up_score_to_member(WalletType.agent_credit_total, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_member, ProxyAppType.v2_credit_up_score_to_member, TransType.out),
    //官方通过中控后台给代理信用钱包人工扣减，代理的信用钱包余额和信用额度同时扣除
    v2_credit_down_score_by_official(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_official, ProxyAppType.v2_credit_down_score_by_official, TransType.out),
    v2_total_credit_down_score_by_official(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_official, ProxyAppType.v2_credit_down_score_by_official, TransType.out),
    //代理被上级代理在代理后台通过信用钱包授信下分，代理自己的信用余额和信用额度同时扣减
    v2_credit_down_score_by_parent_proxy(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_parent_proxy, ProxyAppType.v2_credit_down_score_by_parent_proxy, TransType.out),
    v2_credit_total_down_score_by_parent_proxy(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_parent_proxy, ProxyAppType.v2_credit_down_score_by_parent_proxy, TransType.out),
    //代理通过代理后台给下级代理通过信用钱包授信下分，代理的信用钱包余额和额度增加
    v2_credit_down_score_to_sub_proxy(WalletType.agent_credit_available,  ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_sub_proxy, ProxyAppType.v2_credit_down_score_to_sub_proxy, TransType.in),
    v2_credit_total_down_score_to_sub_proxy(WalletType.agent_credit_total,  ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_sub_proxy, ProxyAppType.v2_credit_down_score_to_sub_proxy, TransType.in),
    //代理通过代理后台给会员授信下分，代理的信用钱包余额和额度增加
    v2_credit_down_score_to_member(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_member, ProxyAppType.v2_credit_down_score_to_member, TransType.in),
    v2_credit_total_down_score_to_member(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_member, ProxyAppType.v2_credit_down_score_to_member, TransType.in),
    //代理从中心钱包余额还款到信用余额
    v2_credit_repay(WalletType.agent_credit_available, ProxyBizType.v2_repay, ProxyChangeType.v2_credit_repay, ProxyAppType.v2_repay, TransType.in),
    //代理从信用余额借款到中心钱包余额
    v2_credit_loan(WalletType.agent_credit_available, ProxyBizType.v2_loan, ProxyChangeType.v2_credit_loan, ProxyAppType.v2_loan, TransType.out);

    private IWalletType walletType;
    private IBizType bizType;
    private IChangeType changeType;
    private IAppType appType;
    private TransType transType;
    private String name;

    /**
     *
     * @param walletType 钱包类型
     * @param bizType 代理业务类型
     * @param changeType 代理账变类型
     * @param appType 代理客户端账变类型
     * @param transType 收支类型
     */
    ProxyWalletChange(WalletType walletType, ProxyBizType bizType, ProxyChangeType changeType, ProxyAppType appType, TransType transType){
        this.walletType = walletType;
        this.bizType = bizType;
        this.changeType = changeType;
        this.appType = appType;
        this.transType = transType;
        this.name = Constant.PROXY;
    }

    @Override
    public IWalletType walletType(){
        return walletType;
    }

    @Override
    public IBizType bizType(){
        return bizType;
    }

    @Override
    public IChangeType changeType(){
        return changeType;
    }

    @Override
    public IAppType appType(){
        return appType;
    }

    @Override
    public TransType transType(){
        return transType;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "walletType=" + walletType +
                ", bizType=" + bizType +
                ", changeType=" + changeType +
                ", appType=" + appType +
                ", transType=" + transType +
                ", name='" + name + '\'' +
                '}';
    }

    // TODO  这里需要更新吗？
    public static List<ProxyWalletChange> getDepositProxyWalletChangeList(){
        return Arrays.asList(
                ProxyWalletChange.quota_deposit,
                ProxyWalletChange.commission_deposit,
                ProxyWalletChange.quota_deposit_add,
                ProxyWalletChange.commission_deposit_add);
    }

    // TODO 这里需要更新吗
    public static List<ProxyWalletChange> getWithdrawProxyWalletChangeList(){
        return Arrays.asList(
                ProxyWalletChange.commission_withdraw_success,
                ProxyWalletChange.commission_withdraw_sub
        );
    }

    public static List<ProxyWalletChange> v2List(){
        List<ProxyWalletChange> list = new ArrayList<>();
        list.add(ProxyWalletChange.v2_cash_deposit_by_official);
        list.add(ProxyWalletChange.v2_cash_deposit_by_parent_proxy);
        list.add(ProxyWalletChange.v2_cash_deposit_to_sub_proxy);
        list.add(ProxyWalletChange.v2_cash_deposit_to_member);
        list.add(ProxyWalletChange.v2_cash_withdraw_by_official);
        list.add(ProxyWalletChange.v2_cash_withdraw_by_parent_proxy);
        list.add(ProxyWalletChange.v2_cash_withdraw_to_sub_proxy);
        list.add(ProxyWalletChange.v2_cash_withdraw_to_member);
        list.add(ProxyWalletChange.v2_cash_rebate);
        list.add(ProxyWalletChange.v2_cash_rebate_add);
        list.add(ProxyWalletChange.v2_cash_rebate_sub);
        list.add(ProxyWalletChange.v2_cash_loan);
        list.add(ProxyWalletChange.v2_cash_repay);
        list.add(ProxyWalletChange.v2_credit_up_score_by_official);
        list.add(ProxyWalletChange.v2_credit_total_up_score_by_official);
        list.add(ProxyWalletChange.v2_credit_up_score_by_parent_proxy);
        list.add(ProxyWalletChange.v2_credit_total_up_score_by_parent_proxy);
        list.add(ProxyWalletChange.v2_credit_up_score_to_sub_proxy);
        list.add(ProxyWalletChange.v2_credit_total_up_score_to_sub_proxy);
        list.add(ProxyWalletChange.v2_credit_up_score_to_member);
        list.add(ProxyWalletChange.v2_credit_total_up_score_to_member);
        list.add(ProxyWalletChange.v2_credit_down_score_by_official);
        list.add(ProxyWalletChange.v2_total_credit_down_score_by_official);
        list.add(ProxyWalletChange.v2_credit_down_score_by_parent_proxy);
        list.add(ProxyWalletChange.v2_credit_total_down_score_by_parent_proxy);
        list.add(ProxyWalletChange.v2_credit_down_score_to_sub_proxy);
        list.add(ProxyWalletChange.v2_credit_total_down_score_to_sub_proxy);
        list.add(ProxyWalletChange.v2_credit_down_score_to_member);
        list.add(ProxyWalletChange.v2_credit_total_down_score_to_member);
        list.add(ProxyWalletChange.v2_credit_repay);
        list.add(ProxyWalletChange.v2_credit_loan);
        return list;
    }
}