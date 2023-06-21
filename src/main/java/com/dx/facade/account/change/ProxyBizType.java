package com.dx.facade.account.change;

import com.dx.exception.BizException;

import java.util.Arrays;
import java.util.List;

public enum ProxyBizType implements IBizType {

    //代理钱包
    deposit(1, "代理存款", "6,7"),
    deposit_for_member(2, "代会员存款", "6,7"),
    activity(3, "代理活动", "7"),
//    quota(4, "代理额度", "7"),
    transfer(5, "代理转账", "6,7"),
    other(6, "其他调整", "6,7"),
    withdraw(7, "代理取款", "6"),
    to_center(8, "佣金转中心钱包", "6"),
    commission(9, "代理佣金", "6"),
    rebate(10, "代理返点", "6"),

    up_score(11, "上分", "7"),
    down_score(12, "下分", "7"),
    commission_to_quota(13, "佣金转额度钱包", "6"),

//    transfer_with_banker(11, "代理划拨", "6,7"),

    //私庄钱包
//    banker_deposit(12, "存入坐庄保证金", "9"),
//    banker_gambling(13, "坐庄对赌", "9,10"),
//    banker_settlement(14, "坐庄结算", "9"),
//    banker_adjust(15, "其他调整", "9"),
//    banker_withdrawal(16, "取出坐庄保证金", "9"),
//    banker_grant_credits(17, "私庄贷款", "9"),
//    banker_undertake_rebate(18, "会员返水", "9"),
//    banker_undertake_venue(19, "场馆费", "9,10"),
//    banker_undertake_member_depost_withdrawal(20, "会员充提手续费", "9"),
//    banker_undertake_agent_depost_withdrawal(21, "代理充提手续费", "9"),
//    banker_undertake_reward(22, "会员福利", "9"),
//    banker_undertake_activity(23, "会员活动", "9"),
//    banker_undertake_deposit_discount(24, "会员存款优惠", "9"),
//    pre_settlement(25, "预结算", "9, 10"),
    ;

    private Integer code;
    private String desc;
    private String accountCodes;

    ProxyBizType(Integer code, String desc, String accountCodes) {
        this.code = code;
        this.desc = desc;
        this.accountCodes = accountCodes;
    }

    public Integer code(){
        return code;
    }

    public String desc(){
        return desc;
    }

    public String getDesc(){
        return desc;
    }

    public String accountCodes(){
        return accountCodes;
    }

    public static ProxyBizType getType(Integer code) throws BizException {
        for (ProxyBizType proxyBizType : values()) {
            if (proxyBizType.code.equals(code)) {
                return proxyBizType;
            }
        }
        throw new BizException("没有这个ProxyBizType");
    }

    /**
     * 代理账变记录-业务类型 下拉列表
     * @return
     */
    public static List<ProxyBizType> getProxyChangeRecordTypeList(){
        return Arrays.asList(ProxyBizType.up_score, ProxyBizType.down_score, ProxyBizType.to_center,
                ProxyBizType.commission_to_quota, ProxyBizType.rebate
               );
    }

}
