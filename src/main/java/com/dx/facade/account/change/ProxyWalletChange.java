package com.dx.facade.account.change;

import com.dx.facade.account.change.param.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 代理账变业务 定义
 *
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

    //quota_add(WalletType.quota, ProxyBizType.quota, ProxyChangeType.quota_add, ProxyAppType.quota, TransType.income),
    //quota_sub(WalletType.quota, ProxyBizType.quota, ProxyChangeType.quota_sub, ProxyAppType.quota, TransType.outlay),

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

    //代理返点 代理现金钱包WalletType.agent_cash
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

    //commission_transfer_to_banker(WalletType.commission, ProxyBizType.transfer_with_banker, ProxyChangeType.commission_transfer_to_banker, ProxyAppType.transfer_with_banker, TransType.outlay),
    //commission_receive_from_banker(WalletType.commission, ProxyBizType.transfer_with_banker, ProxyChangeType.commission_receive_from_banker, ProxyAppType.transfer_with_banker, TransType.income),
    //--------------------v2需求代理全部账变类型------------
    //现金钱包 13种
    //场景1：官方通过中控后台给代理人工加额，代理的现金余额增加
    v2_cash_deposit_by_official(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_by_official, ProxyAppType.v2_cash_deposit_by_official, TransType.in),
    //场景2：代理通过代理后台充值上分操作，代理的现金余额增加，上级代理的现金余额扣减
    v2_cash_deposit_by_parent_proxy(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_by_parent_proxy, ProxyAppType.v2_cash_deposit_by_parent_proxy, TransType.in),
    //场景3：代理自己通过代理后台对下级代理充值上分，代理自己的现金余额扣减，下级代理的现金钱包额度增加，与场景2对应
    v2_cash_deposit_to_sub_proxy(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_to_sub_proxy, ProxyAppType.v2_cash_deposit_to_sub_proxy, TransType.out),
    //场景4：代理通过代理后台，给自己的下级会员充值上分，代理自己的现金余额扣减，会员的现金余额增加
    v2_cash_deposit_to_member(WalletType.agent_cash, ProxyBizType.v2_deposit, ProxyChangeType.v2_cash_deposit_to_member, ProxyAppType.v2_cash_deposit_to_member, TransType.out),
    //官方通过中控后台给代理人工扣减，代理的现金钱包额度扣除
    v2_cash_withdraw_by_official(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_by_official, ProxyAppType.v2_cash_withdraw_by_official, TransType.out),
    //代理被上级代理在代理后台提现，代理的现金余额扣减，上级代理的现金余额增加
    v2_cash_withdraw_by_parent_proxy(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_by_parent_proxy, ProxyAppType.v2_cash_withdraw_by_parent_proxy, TransType.out),
    //代理通过代理后台给下级代理提现，代理的现金余额增加，下级代理的现金余额扣除
    v2_cash_withdraw_to_sub_proxy(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_to_sub_proxy, ProxyAppType.v2_cash_withdraw_to_sub_proxy, TransType.in),
    //代理通过代理后台给会员提现，或者会员主动提现订单被代理审核通过，代理的现金余额增加，会员的现金余额扣减或现金钱包冻结额度扣减
    v2_cash_withdraw_to_member(WalletType.agent_cash, ProxyBizType.v2_withdraw, ProxyChangeType.v2_cash_withdraw_to_member, ProxyAppType.v2_cash_withdraw_to_member, TransType.in),
    //下级会员有效投注后，给上级代理的返点，代理的现金余额增加
    v2_cash_rebate(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方通过人工增加额度，给代理的返点进行增加调整，代理的现金余额增加
    v2_cash_rebate_add(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate_add, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方通过人工扣除额度，给代理的返点进行扣除调整，代理的现金余额扣减
    v2_cash_rebate_sub(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate_sub, ProxyAppType.v2_cash_rebate, TransType.out),
    //代理从可用额度借款到现金余额
    v2_cash_loan(WalletType.agent_cash, ProxyBizType.v2_loan, ProxyChangeType.v2_cash_loan, ProxyAppType.v2_loan, TransType.in),
    //代理从现金余额还款到可用额度
    v2_cash_repay(WalletType.agent_cash, ProxyBizType.v2_repay, ProxyChangeType.v2_cash_repay, ProxyAppType.v2_repay, TransType.out),

    //可用额度钱包记录信用上下分 10种
    //官方通过中控后台给代理信用钱包人工加额，代理的信用钱包余额和额度同时增加
    v2_credit_up_score_by_official(WalletType.agent_credit_available, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_official, ProxyAppType.v2_credit_up_score_by_official, TransType.in),
    v2_credit_total_up_score_by_official(WalletType.agent_credit_total, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_official, ProxyAppType.v2_credit_up_score_by_official, TransType.in),
    //上级代理通过代理后对自己信用钱包授信上分，代理的可用额度和信用额度同时增加
    v2_credit_up_score_by_parent_proxy(WalletType.agent_credit_available, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_parent_proxy, ProxyAppType.v2_credit_up_score_by_parent_proxy, TransType.in),
    v2_credit_total_up_score_by_parent_proxy(WalletType.agent_credit_total, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_by_parent_proxy, ProxyAppType.v2_credit_up_score_by_parent_proxy, TransType.in),
    //代理通过代理后台对下级代理充值上分，代理自己的信用钱包余额和信用额度同时扣减
    v2_credit_up_score_to_sub_proxy(WalletType.agent_credit_available, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_sub_proxy, ProxyAppType.v2_credit_up_score_to_sub_proxy, TransType.out),
    v2_credit_total_up_score_to_sub_proxy(WalletType.agent_credit_total, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_sub_proxy, ProxyAppType.v2_credit_up_score_to_sub_proxy, TransType.out),
    //代理通过代理后台对下级会员充值上分，代理自己的信用钱包余额和信用额度同时扣减
    v2_credit_up_score_to_member(WalletType.agent_credit_available, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_member, ProxyAppType.v2_credit_up_score_to_member, TransType.out),
    v2_credit_total_up_score_to_member(WalletType.agent_credit_total, ProxyBizType.v2_credit_up_score, ProxyChangeType.v2_credit_up_score_to_member, ProxyAppType.v2_credit_up_score_to_member, TransType.out),
    //官方通过中控后台给代理信用钱包人工扣减，代理的信用钱包余额和信用额度同时扣除
    v2_credit_down_score_by_official(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_official, ProxyAppType.v2_credit_down_score_by_official, TransType.out),
    v2_total_credit_down_score_by_official(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_official, ProxyAppType.v2_credit_down_score_by_official, TransType.out),
    //代理被上级代理在代理后台通过信用钱包授信下分，代理自己的可用额度和信用额度同时扣减
    v2_credit_down_score_by_parent_proxy(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_parent_proxy, ProxyAppType.v2_credit_down_score_by_parent_proxy, TransType.out),
    v2_credit_total_down_score_by_parent_proxy(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_by_parent_proxy, ProxyAppType.v2_credit_down_score_by_parent_proxy, TransType.out),
    //代理通过代理后台给下级代理通过信用钱包授信下分，代理的信用钱包余额和额度增加
    v2_credit_down_score_to_sub_proxy(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_sub_proxy, ProxyAppType.v2_credit_down_score_to_sub_proxy, TransType.in),
    v2_credit_total_down_score_to_sub_proxy(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_sub_proxy, ProxyAppType.v2_credit_down_score_to_sub_proxy, TransType.in),
    //代理通过代理后台给会员授信下分，代理的信用钱包余额和额度增加
    v2_credit_down_score_to_member(WalletType.agent_credit_available, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_member, ProxyAppType.v2_credit_down_score_to_member, TransType.in),
    v2_credit_total_down_score_to_member(WalletType.agent_credit_total, ProxyBizType.v2_credit_down_score, ProxyChangeType.v2_credit_down_score_to_member, ProxyAppType.v2_credit_down_score_to_member, TransType.in),
    //代理从现金余额还款到可用额度
    v2_credit_repay(WalletType.agent_credit_available, ProxyBizType.v2_repay, ProxyChangeType.v2_credit_repay, ProxyAppType.v2_repay, TransType.in),
    //代理从可用额度借款到现金余额
    v2_credit_loan(WalletType.agent_credit_available, ProxyBizType.v2_loan, ProxyChangeType.v2_credit_loan, ProxyAppType.v2_loan, TransType.out),

    //代理主动申请取款，现金钱包的金额会先减少被冻结
    v2_1_withdraw_frozen(WalletType.agent_cash, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw, ProxyAppType.v2_1_withdraw_frozen, TransType.out),
    //代理申请取款被拒绝后，冻结的钱会返还回到现金钱包
    v2_1_withdraw_fail(WalletType.agent_cash, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw_fail, ProxyAppType.v2_1_withdraw_refused, TransType.in),
    //代理主动申请取款，现金钱包的金额会先减少被冻结
    v2_1_withdraw_frozen_lock(WalletType.agent_lock, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw, ProxyAppType.v2_1_withdraw_frozen, TransType.in),
    //代理申请取款被拒绝后，冻结的钱会返还回到现金钱包
    v2_1_withdraw_fail_lock(WalletType.agent_lock, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw_fail, ProxyAppType.v2_1_withdraw_refused, TransType.out),
    //代理通过平台提供的存款渠道进行自主存款
    v2_1_deposit(WalletType.agent_cash, ProxyBizType.v2_1_deposit, ProxyChangeType.v2_1_deposit, ProxyAppType.v2_1_deposit, TransType.in),
    //代理通过平台提供的取款渠道进行自主取款
    v2_1_withdraw(WalletType.agent_cash, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw, ProxyAppType.v2_1_withdraw, TransType.out),
    //运营在中控后台帮助代理人工加额上分
    v2_1_deposit_back(WalletType.agent_cash, ProxyBizType.v2_1_deposit, ProxyChangeType.v2_1_deposit_back, ProxyAppType.v2_1_deposit, TransType.in),
    //运营在中控后台帮助代理人工减额下分
    v2_1_withdraw_back(WalletType.agent_cash, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw_back, ProxyAppType.v2_1_withdraw, TransType.out),
    //代理提现成功
    v2_1_withdraw_success(WalletType.agent_lock, ProxyBizType.v2_1_withdraw, ProxyChangeType.v2_1_withdraw, ProxyAppType.v2_1_withdraw, TransType.out),
    //官方可以在给代理的返点上增加金额
    v2_1_club_rebate_add(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_1_club_rebate_add, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方可以在给代理的返点上增加金额
    v2_1_insure_rebate_add(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_1_insure_rebate_add, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方可以在给代理的返点上增加金额
    v2_1_other_rebate_add(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate_add, ProxyAppType.v2_cash_rebate, TransType.in),
    //官方可以在给代理的返点上扣减金额
    v2_1_club_rebate_sub(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_1_club_rebate_sub, ProxyAppType.v2_cash_rebate, TransType.out),
    //官方可以在给代理的返点上扣减金额
    v2_1_insure_rebate_sub(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_1_insure_rebate_sub, ProxyAppType.v2_cash_rebate, TransType.out),
    //官方可以在给代理的返点上扣减金额
    v2_1_other_rebate_sub(WalletType.agent_cash, ProxyBizType.v2_rebate, ProxyChangeType.v2_cash_rebate_sub, ProxyAppType.v2_cash_rebate, TransType.out),
    //根据定期返佣账单，给相关代理结算返佣点金额
    v2_1_negate_benefit_commission_income(WalletType.agent_cash, ProxyBizType.v2_1_proxy_commission, ProxyChangeType.v2_1_negate_benefit_commission_income, ProxyAppType.v2_1_negative_benefit_commission, TransType.in),
    //根据定期返佣账单，给相关代理结算返佣点金额
    v2_1_negate_benefit_commission_dispatch(WalletType.agent_cash, ProxyBizType.v2_1_proxy_commission, ProxyChangeType.v2_1_negate_benefit_commission_dispatch, ProxyAppType.v2_1_negative_benefit_commission, TransType.out),
    //官方可以在给代理的返佣上增加金额
    v2_1_proxy_commission_add(WalletType.agent_cash, ProxyBizType.v2_1_proxy_commission, ProxyChangeType.v2_1_proxy_commission_add, ProxyAppType.v2_1_negative_benefit_commission, TransType.in),
    //官方可以在给代理的返佣上扣减金额
    v2_1_proxy_commission_sub(WalletType.agent_cash, ProxyBizType.v2_1_proxy_commission, ProxyChangeType.v2_1_proxy_commission_sub, ProxyAppType.v2_1_negative_benefit_commission, TransType.out),

    //V3 帮信用还款
    //每一级代理可以给自己直属代理信用还款，总代可以对任意代理信用还款
    v3_proxy_help_sub_proxy_credit_repay(WalletType.agent_cash, ProxyBizType.v2_repay, ProxyChangeType.v3_proxy_help_sub_proxy_credit_repay, ProxyAppType.v3_proxy_help_sub_proxy_credit_repay, TransType.out),
    //每一级代理可以对自己直属会员信用还款
    v3_proxy_help_sub_member_credit_repay(WalletType.agent_cash, ProxyBizType.v2_repay, ProxyChangeType.v3_proxy_help_sub_member_credit_repay, ProxyAppType.v3_proxy_help_sub_member_credit_repay, TransType.out),

    //官方在中控后台给代理信用还款（目前暂定总代）
    v3_official_help_proxy_credit_repay(WalletType.agent_credit_available, ProxyBizType.v2_repay, ProxyChangeType.v3_official_help_proxy_credit_repay, ProxyAppType.v3_official_help_proxy_credit_repay, TransType.in),
    //每一级代理可以给自己直属代理信用还款，总代可以对任意代理信用还款
    v3_parent_proxy_help_proxy_credit_repay(WalletType.agent_credit_available, ProxyBizType.v2_repay, ProxyChangeType.v3_parent_proxy_help_proxy_credit_repay, ProxyAppType.v3_parent_proxy_help_proxy_credit_repay, TransType.in),
    //每一级代理可以给自己直属代理信用还款，总代可以对任意代理信用还款
    v3_credit_proxy_help_sub_proxy_credit_repay(WalletType.agent_credit_available, ProxyBizType.v2_repay, ProxyChangeType.v3_proxy_help_sub_proxy_credit_repay, ProxyAppType.v3_proxy_help_sub_proxy_credit_repay, TransType.out),
    //每一级代理可以对自己直属会员信用还款
    v3_credit_proxy_help_sub_member_credit_repay(WalletType.agent_credit_available, ProxyBizType.v2_repay, ProxyChangeType.v3_proxy_help_sub_member_credit_repay, ProxyAppType.v3_proxy_help_sub_member_credit_repay, TransType.out),
    //代理占成亏损分摊
    v1_50_proxy_to_loss_sharing_sub(WalletType.agent_cash, ProxyBizType.v1_50_proxy_divination, ProxyChangeType.v1_50_proxy_loss_sharing_sub, ProxyAppType.v1_50_proxy_loss_sharing, TransType.out),
    //v1.52需求账变
    v1_52_violation_fine(WalletType.agent_cash,ProxyBizType.v2_withdraw, ProxyChangeType.v1_52_violation_fine, ProxyAppType.v1_52_other_adjust, TransType.out),
    v1_52_finance_adjust(WalletType.agent_cash,ProxyBizType.v2_withdraw, ProxyChangeType.v1_52_finance_adjust, ProxyAppType.v1_52_other_adjust, TransType.out),
    v1_52_operate_adjust(WalletType.agent_cash,ProxyBizType.v2_withdraw, ProxyChangeType.v1_52_operate_adjust, ProxyAppType.v1_52_other_adjust, TransType.out),
    v1_52_third_order_lost_compensate(WalletType.agent_cash,ProxyBizType.v2_deposit, ProxyChangeType.v1_52_third_order_lost_compensate, ProxyAppType.v1_52_other_adjust, TransType.in),
    v1_52_offline_settle_up_score(WalletType.agent_cash,ProxyBizType.v2_deposit, ProxyChangeType.v1_52_offline_settle_up_score, ProxyAppType.v1_52_other_adjust, TransType.in),
    v1_52_other_adjust(WalletType.agent_cash,ProxyBizType.v2_deposit, ProxyChangeType.v1_52_other_adjust, ProxyAppType.v1_52_other_adjust, TransType.in),
    ;

    private IWalletType walletType;
    private IBizType bizType;
    private IChangeType changeType;
    private IAppType appType;
    private TransType transType;
    private String name;

    /**
     * @param walletType 钱包类型
     * @param bizType    代理业务类型
     * @param changeType 代理账变类型
     * @param appType    代理客户端账变类型
     * @param transType  收支类型
     */
    ProxyWalletChange(WalletType walletType, ProxyBizType bizType, ProxyChangeType changeType, ProxyAppType appType, TransType transType) {
        this.walletType = walletType;
        this.bizType = bizType;
        this.changeType = changeType;
        this.appType = appType;
        this.transType = transType;
        this.name = Constant.PROXY;
    }

    @Override
    public IWalletType walletType() {
        return walletType;
    }

    @Override
    public IBizType bizType() {
        return bizType;
    }

    @Override
    public IChangeType changeType() {
        return changeType;
    }

    @Override
    public IAppType appType() {
        return appType;
    }

    @Override
    public TransType transType() {
        return transType;
    }

    @Override
    public String getName() {
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

    public static List<ProxyWalletChange> getDepositProxyWalletChangeList() {
        return Arrays.asList(
                //代理存款
                ProxyWalletChange.v2_1_deposit,
                //代理存款-后台
                ProxyWalletChange.v2_1_deposit_back
        );
    }

    public static List<ProxyWalletChange> getWithdrawProxyWalletChangeList() {
        return Arrays.asList(
                //代理群款
                ProxyWalletChange.v2_1_withdraw_success,
                //代理取款-后台
                ProxyWalletChange.v2_1_withdraw_back
        );
    }

    public static List<ProxyWalletChange> v2List() {
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

        list.add(ProxyWalletChange.v2_1_withdraw_frozen);
        list.add(ProxyWalletChange.v2_1_withdraw_fail);
        list.add(ProxyWalletChange.v2_1_withdraw_frozen_lock);
        list.add(ProxyWalletChange.v2_1_withdraw_fail_lock);
        list.add(ProxyWalletChange.v2_1_deposit);
        list.add(ProxyWalletChange.v2_1_withdraw);
        list.add(ProxyWalletChange.v2_1_deposit_back);
        list.add(ProxyWalletChange.v2_1_withdraw_back);
        list.add(ProxyWalletChange.v2_1_withdraw_success);
        list.add(ProxyWalletChange.v2_1_club_rebate_add);
        list.add(ProxyWalletChange.v2_1_insure_rebate_add);
        list.add(ProxyWalletChange.v2_1_other_rebate_add);
        list.add(ProxyWalletChange.v2_1_club_rebate_sub);
        list.add(ProxyWalletChange.v2_1_insure_rebate_sub);
        list.add(ProxyWalletChange.v2_1_other_rebate_sub);
        list.add(ProxyWalletChange.v2_1_negate_benefit_commission_income);
        list.add(ProxyWalletChange.v2_1_negate_benefit_commission_dispatch);
        list.add(ProxyWalletChange.v2_1_proxy_commission_add);
        list.add(ProxyWalletChange.v2_1_proxy_commission_sub);
        //帮信用还款，现金钱包
        list.add(v3_proxy_help_sub_member_credit_repay);
        list.add(v3_proxy_help_sub_proxy_credit_repay);
        //帮信用还款，信用钱包
        list.add(v3_credit_proxy_help_sub_member_credit_repay);
        list.add(v3_credit_proxy_help_sub_proxy_credit_repay);
        list.add(v3_parent_proxy_help_proxy_credit_repay);
        list.add(v3_official_help_proxy_credit_repay);
        //代理占成亏损分摊
        list.add(v1_50_proxy_to_loss_sharing_sub);
        list.add(v1_52_violation_fine);
        list.add(v1_52_finance_adjust);
        list.add(v1_52_operate_adjust);
        list.add(v1_52_third_order_lost_compensate);
        list.add(v1_52_offline_settle_up_score);
        list.add(v1_52_other_adjust);

        return list;
    }

    public static ProxyWalletChange getBy(Integer walletType, Integer bizType, Integer changeType) {
        return ProxyWalletChange.v2List().stream().filter(w ->
                w.walletType().code().equals(walletType)
                        && w.bizType.code().equals(bizType)
                        && w.changeType.code().equals(changeType)).findFirst().orElse(null);
    }

}