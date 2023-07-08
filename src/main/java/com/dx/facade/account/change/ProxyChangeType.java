package com.dx.facade.account.change;

import java.util.Arrays;
import java.util.List;

import com.dx.exception.BizException;

/**
 * 代理账变类型
 */
public enum ProxyChangeType implements IChangeType {

    //代理钱包
    deposit(1, "代理存款", "1"),
    deposit_back(2, "代理存款(后台)", "1"),
    deposit_for_member(3, "转给下级", "2"),
    activity(4, "活动优惠彩金", "3"),
    activity_add(5, "活动增加调整", "3"),
    activity_sub(6, "活动扣除调整", "3"),
    //    quota_add(7, "额度增加调整", "4"),
//    quota_sub(8, "额度扣除调整", "4"),
    transfer_out(9, "转给下级", "5"),
    transfer_in(10, "上级转入", "5"),
    other_add(11, "其他增加调整", "6"),
    other_sub(12, "其他扣除调整", "6"),
    withdraw(13, "代理取款", "7"),
    withdraw_fail(14, "取款失败", "7"),
    withdraw_back(15, "代理取款(后台)", "7"),
    platform_transfer_in(17, "平台转入佣金", "9"),
    transfer_in_by_cycle(18, "上级转入佣金", "9"),
    transfer_out_by_cycle(19, "转给下级佣金", "9"),
    commission_add(20, "佣金增加调整", "9"),
    commission_sub(21, "佣金扣除调整", "9"),

    to_center(16, "佣金转回", "8"),
    rebate(22, "流水返点", "10"),
    rebate_add(23, "返点增加调整", "10"),
    rebate_sub(24, "返点扣除调整", "10"),
    officer_proxy_up_score(25, "官方给代理上分", "12"),
    proxy_be_up_score(26, "代理被上级上分", "12"),
    proxy_to_child_up_score(27, "代理给下级上分", "12"),
    proxy_to_mem_up_score(28, "代理给会员上分", "12"),
    officer_proxy_down_score(29, "官方给代理下分", "13"),
    proxy_be_down_score(30, "代理被上级下分", "13"),
    proxy_to_child_down_score(31, "代理给下级下分", "13"),
    proxy_to_mem_down_score(32, "代理给会员下分", "13"),

    commission_to_quota(33, "佣金转额度钱包", "38"),
    commission_be_transfer_to_quota(34,"佣金转额度钱包","41")


//    quota_transfer_to_banker(25, "额度出金私庄", "11"),
//    commission_transfer_to_banker(26, "佣金出金私庄", "11"),
//    commission_receive_from_banker(27, "佣金收金私庄", "11"),

    //私庄钱包
//    banker_deposit_from_quota(28, "私庄收金额度", "12"),
//    banker_deposit_from_commission(29, "私庄收金佣金", "12"),
//
//    banker_gambling_lock(30, "赔付锁定", "13"),
//    banker_gambling_lock_receive(31, "赔付锁定-锁定收金", ""),
//    banker_gambling_unlock(32, "赔付解锁", "13"),
//    banker_gambling_unlock_send(33, "赔付解锁-锁定出金", ""),
//
//    banker_settlement_lose(34, "输单赔付", "14"),
//    banker_settlement_win(35, "赢单加额", "14"),
//    platform_take_cut(36, "平台抽佣", "14"),
//
//    add_margin(37, "加保证金", "15"),
//    sub_margin(38, "扣保证金", "15"),

//    banker_withdrawal(39, "私庄出金佣金", "16"),
//
//    banker_grant_credits(40, "保证金贷款", "17"),
//    banker_grant_credits_repayment(41, "保证金还款", "17"),
//
//    banker_undertake_rebate(42, "会员返水扣除", "18"),
//
//    banker_undertake_venue_lock(43, "场馆费锁定", "19"),
//    banker_undertake_venue_lock_receive(44, "场馆费锁定-锁定收金", ""),
//    banker_undertake_venue_unlock(45, "场馆费解锁", "19"),
//    banker_undertake_venue_unlock_send(46, "场馆费解锁-锁定出金", ""),
//    banker_undertake_venue(47, "场馆费扣除", "19"),
//
//    banker_undertake_member_deposit(48, "会员充值手续费扣除", "20"),
//    banker_undertake_member_withdrawal(49, "会员提款手续费扣除", "20"),
//    banker_undertake_agent_deposit(50, "代理充值手续费扣除", "21"),
//    banker_undertake_agent_withdrawal(51, "代理提款手续费扣除", "21"),
//
//    banker_undertake_reward(52, "会员福利扣除", "22"),
//    banker_undertake_activity(53, "会员活动扣除", "23"),
//    banker_undertake_deposit_discount(54, "会员存款优惠扣除", "24"),
//
//    banker_undertake_sub_reward(55, "会员福利人工扣除", "22"),
//    banker_undertake_add_reward(56, "会员福利人工加额", "22"),
//    banker_undertake_sub_activity(57, "会员活动人工扣除", "23"),
//    banker_undertake_add_activity(58, "会员活动人工加额", "23"),
//    banker_undertake_sub_deposit_discount(59, "会员存款优惠人工扣除", "24"),
//    banker_undertake_add_deposit_discount(60, "会员存款优惠人工加额", "24"),
//    banker_undertake_sub_other(61, "会员其他调整扣除", "15"),
//    banker_undertake_add_other(62, "会员其他调整加额", "15"),
//
//    platform_apportion_banker_undertake_reward(63, "会员福利分摊", "22"),
//    platform_apportion_banker_undertake_activity(64, "会员活动分摊", "23"),
//    platform_apportion_banker_undertake_deposit_discount(65, "会员存款优惠分摊", "24"),
//    platform_apportion_banker_undertake_other(66, "其他调整分摊", "15"),
//    platform_apportion_banker_undertake_member_deposit(67, "会员充值手续费分摊", "20"),
//    platform_apportion_banker_undertake_member_withdrawal(68, "会员提款手续费分摊", "20"),
//    platform_apportion_banker_undertake_agent_deposit(69, "代理充值手续费分摊", "21"),
//    platform_apportion_banker_undertake_agent_withdrawal(70, "代理提款手续费分摊", "21"),
//
//    pre_settlement_lock(71, "预结算锁定", "25"),
//    pre_settlement_lock_receive(72, "预结算-锁定收金", ""),
//    pre_settlement_unlock(73, "预结算解锁", "25"),
//    pre_settlement_unlock_send(74, "预结算解锁-锁定出金", ""),
//    platform_share(75, "平台分润", "14"),
    ;

    private Integer code;
    private String desc;
    private String bizCodes;

    ProxyChangeType(Integer code, String desc, String bizCodes) {
        this.code = code;
        this.desc = desc;
        this.bizCodes = bizCodes;
    }

    @Override
    public Integer code() {
        return code;
    }

    @Override
    public String desc() {
        return desc;
    }

    public String getDesc() {
        return desc;
    }

    public String bizCodes() {
        return bizCodes;
    }

    public static ProxyChangeType getType(Integer code) throws BizException {
        for (ProxyChangeType proxyChangeType : values()) {
            if (proxyChangeType.code.equals(code)) {
                return proxyChangeType;
            }
        }
        throw new BizException("没有这个ProxyChangeType");
    }

    public static List<ProxyChangeType> getArtificialProxyChangeTypeList() {
        return Arrays.asList(ProxyChangeType.deposit_back, ProxyChangeType.activity_add, ProxyChangeType.activity_sub,
                ProxyChangeType.other_add, ProxyChangeType.other_sub,
                ProxyChangeType.withdraw_back, ProxyChangeType.commission_add, ProxyChangeType.commission_sub,
                ProxyChangeType.rebate_add, ProxyChangeType.rebate_sub);

    }


    /**
     * 代理账变记录-账变类型下拉列表
     *
     * @return
     */
    public static ProxyChangeType[] getProxyChangeTypeList() {
        return new ProxyChangeType[]{to_center,
                rebate,
                rebate_add,
                rebate_sub,
                officer_proxy_up_score,
                proxy_be_up_score,
                proxy_to_child_up_score,
                proxy_to_mem_up_score,
                officer_proxy_down_score,
                proxy_be_down_score,
                proxy_to_child_down_score,
                proxy_to_mem_down_score,
                commission_to_quota};
    }


}
