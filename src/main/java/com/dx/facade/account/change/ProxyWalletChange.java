package com.dx.facade.account.change;

import java.util.Arrays;
import java.util.List;

import com.dx.facade.account.change.param.Constant;

//代理账变业务
public enum ProxyWalletChange implements IWalletChange {
    //额度钱包(没有取款业务，人工扣除也没有)
    quota_deposit(WalletType.quota, ProxyBizType.deposit, ProxyChangeType.deposit, ProxyAppType.deposit, TransType.income),
    quota_deposit_add(WalletType.quota, ProxyBizType.deposit, ProxyChangeType.deposit_back, ProxyAppType.deposit, TransType.income),

    quota_deposit_for_member(WalletType.quota, ProxyBizType.deposit_for_member, ProxyChangeType.deposit_for_member, ProxyAppType.deposit_for_member, TransType.outlay),

    quota_activity(WalletType.quota, ProxyBizType.activity, ProxyChangeType.activity, ProxyAppType.activity, TransType.income),
    quota_activity_add(WalletType.quota, ProxyBizType.activity, ProxyChangeType.activity_add, ProxyAppType.activity, TransType.income),
    quota_activity_sub(WalletType.quota, ProxyBizType.activity, ProxyChangeType.activity_sub, ProxyAppType.activity, TransType.outlay),

//    quota_add(WalletType.quota, ProxyBizType.quota, ProxyChangeType.quota_add, ProxyAppType.quota, TransType.income),
//    quota_sub(WalletType.quota, ProxyBizType.quota, ProxyChangeType.quota_sub, ProxyAppType.quota, TransType.outlay),

    quota_transfer_out(WalletType.quota, ProxyBizType.transfer, ProxyChangeType.transfer_out, ProxyAppType.transfer, TransType.outlay),
    quota_transfer_in(WalletType.quota, ProxyBizType.transfer, ProxyChangeType.transfer_in, ProxyAppType.transfer, TransType.income),

    quota_other_add(WalletType.quota, ProxyBizType.other, ProxyChangeType.other_add, ProxyAppType.other, TransType.income),
    quota_other_sub(WalletType.quota, ProxyBizType.other, ProxyChangeType.other_sub, ProxyAppType.other, TransType.outlay),

    //quota_transfer_to_banker(WalletType.quota, ProxyBizType.transfer_with_banker, ProxyChangeType.quota_transfer_to_banker, ProxyAppType.transfer_with_banker, TransType.outlay),

    //佣金钱包
    commission_deposit(WalletType.commission, ProxyBizType.deposit, ProxyChangeType.deposit, ProxyAppType.deposit, TransType.income),
    commission_deposit_add(WalletType.commission, ProxyBizType.deposit, ProxyChangeType.deposit_back, ProxyAppType.deposit, TransType.income),

    commission_withdraw(WalletType.commission, ProxyBizType.withdraw, ProxyChangeType.withdraw, ProxyAppType.withdraw, TransType.outlay),
    commission_lock_withdraw(WalletType.agent_lock, ProxyBizType.withdraw, ProxyChangeType.withdraw, ProxyAppType.withdraw, TransType.income),
    commission_withdraw_fail(WalletType.commission, ProxyBizType.withdraw, ProxyChangeType.withdraw_fail, ProxyAppType.withdraw, TransType.income),
    commission_lock_withdraw_fail(WalletType.agent_lock, ProxyBizType.withdraw, ProxyChangeType.withdraw_fail, ProxyAppType.withdraw, TransType.outlay),
    commission_withdraw_success(WalletType.agent_lock, ProxyBizType.withdraw, ProxyChangeType.withdraw, ProxyAppType.withdraw, TransType.outlay),
    commission_withdraw_sub(WalletType.commission, ProxyBizType.withdraw, ProxyChangeType.withdraw_back, ProxyAppType.withdraw, TransType.outlay),

    commission_to_center(WalletType.commission, ProxyBizType.to_center, ProxyChangeType.to_center, ProxyAppType.to_center, TransType.outlay),

    commission_platform_transfer_in(WalletType.commission, ProxyBizType.commission, ProxyChangeType.platform_transfer_in, ProxyAppType.commission, TransType.income),
    commission_transfer_in_by_cycle(WalletType.commission, ProxyBizType.commission, ProxyChangeType.transfer_in_by_cycle, ProxyAppType.commission, TransType.income),
    commission_transfer_out_by_cycle(WalletType.commission, ProxyBizType.commission, ProxyChangeType.transfer_out_by_cycle, ProxyAppType.commission, TransType.outlay),
    commission_add(WalletType.commission, ProxyBizType.commission, ProxyChangeType.commission_add, ProxyAppType.commission, TransType.income),
    commission_sub(WalletType.commission, ProxyBizType.commission, ProxyChangeType.commission_sub, ProxyAppType.commission, TransType.outlay),

    commission_rebate(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate, ProxyAppType.rebate, TransType.income),
    commission_rebate_add(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate_add, ProxyAppType.rebate, TransType.income),
    commission_rebate_sub(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate_sub, ProxyAppType.rebate, TransType.outlay),

    commission_deposit_for_member(WalletType.commission, ProxyBizType.deposit_for_member, ProxyChangeType.deposit_for_member, ProxyAppType.deposit_for_member, TransType.outlay),

    commission_transfer_out(WalletType.commission, ProxyBizType.transfer, ProxyChangeType.transfer_out, ProxyAppType.transfer, TransType.outlay),
    commission_transfer_in(WalletType.commission, ProxyBizType.transfer, ProxyChangeType.transfer_in, ProxyAppType.transfer, TransType.income),

    commission_other_add(WalletType.commission, ProxyBizType.other, ProxyChangeType.other_add, ProxyAppType.other, TransType.income),
    commission_other_sub(WalletType.commission, ProxyBizType.other, ProxyChangeType.other_sub, ProxyAppType.other, TransType.outlay),


    officer_proxy_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.officer_proxy_up_score, ProxyAppType.officer_proxy_up_score, TransType.income),
    proxy_be_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.proxy_be_up_score, ProxyAppType.proxy_be_up_score, TransType.income),
    proxy_to_child_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.proxy_to_child_up_score, ProxyAppType.proxy_to_child_up_score, TransType.outlay),
    proxy_to_mem_up_score(WalletType.quota, ProxyBizType.up_score, ProxyChangeType.proxy_to_mem_up_score, ProxyAppType.proxy_to_mem_up_score, TransType.outlay),

    officer_proxy_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.officer_proxy_down_score, ProxyAppType.officer_proxy_down_score, TransType.outlay),
    proxy_be_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.proxy_be_down_score, ProxyAppType.proxy_be_down_score, TransType.outlay),
    proxy_to_child_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.proxy_to_child_down_score, ProxyAppType.proxy_to_child_down_score, TransType.income),
    proxy_to_mem_down_score(WalletType.quota, ProxyBizType.down_score, ProxyChangeType.proxy_to_mem_down_score, ProxyAppType.proxy_to_mem_down_score, TransType.income),

    commission_to_quota(WalletType.commission, ProxyBizType.commission_to_quota, ProxyChangeType.commission_to_quota, ProxyAppType.commission_to_quota, TransType.outlay),

    commission_rebate_adjustment_add(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate_add, ProxyAppType.commission_rebate_add, TransType.income),
    commission_rebate_adjustment_sub(WalletType.commission, ProxyBizType.rebate, ProxyChangeType.rebate_sub, ProxyAppType.commission_rebate_sub, TransType.outlay),

//    commission_transfer_to_banker(WalletType.commission, ProxyBizType.transfer_with_banker, ProxyChangeType.commission_transfer_to_banker, ProxyAppType.transfer_with_banker, TransType.outlay),
//    commission_receive_from_banker(WalletType.commission, ProxyBizType.transfer_with_banker, ProxyChangeType.commission_receive_from_banker, ProxyAppType.transfer_with_banker, TransType.income),
    ;

    private IWalletType walletType;
    private IBizType bizType;
    private IChangeType changeType;
    private IAppType appType;
    private TransType transType;
    private String name;

    ProxyWalletChange(WalletType walletType, ProxyBizType bizType, ProxyChangeType changeType, ProxyAppType appType, TransType transType){
        this.walletType = walletType;
        this.bizType = bizType;
        this.changeType = changeType;
        this.appType = appType;
        this.transType = transType;
        this.name = Constant.PROXY;
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

    public static List<ProxyWalletChange> getDepositProxyWalletChangeList(){
        return Arrays.asList(ProxyWalletChange.quota_deposit, ProxyWalletChange.commission_deposit, ProxyWalletChange.quota_deposit_add,ProxyWalletChange.commission_deposit_add);
    }

    public static List<ProxyWalletChange> getWithdrawProxyWalletChangeList(){
        return Arrays.asList(ProxyWalletChange.commission_withdraw_success, ProxyWalletChange.commission_withdraw_sub);
    }
}