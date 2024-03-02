package com.dx.facade.account.change;

import com.dx.exception.BizException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 代理业务类型 6佣金钱包 7额度钱包
 * V2需求，代理只有现金钱包和信用钱包
 * @author Administrator
 */
public enum ProxyBizType implements IBizType {

    //v2版本
    v2_deposit(1, "充值上分", "17"),
    v2_withdraw(7, "提现下分", "17"),
    v2_rebate(10, "代理返点", "17"),
    v2_loan(36, "借款", "17,18"),
    v2_repay(37, "还款", "17,18"),
    v2_credit_up_score(38, "授信上分", "18,19"),
    v2_credit_down_score(39, "授信下分", "18,19"),

    //v2.1版本
    v2_1_deposit(60, "代理存款", "17"),
    v2_1_withdraw(61, "代理取款", "17,8"),
    v2_1_proxy_commission(63, "代理返佣", "17"),

    //老旧版本
    deposit(101, "代理存款", "6,7"),
    deposit_for_member(2, "代会员存款", "6,7"),
    activity(3, "代理活动", "7"),
    quota(4, "代理额度", "7"),
    transfer(5, "代理转账", "6,7"),
    other(6, "其他调整", "6,7"),
    withdraw(70, "代理取款", "6"),
    to_center(8, "佣金转现金钱包", "6"),
    commission(9, "代理佣金", "6"),
    rebate(10, "代理返点", "6"),
    commission_to_quota(11, "佣金转额度钱包", "6"),
    up_score(12, "上分", "7"),
    down_score(13, "下分", "7"),
    undertake_rebate(36, "流水返点", "6"),
    commission_to_quota_out(38, "佣金转额度钱包", "6"),
    commission_rebate_add(39, "返点增加调整", "6"),
    commission_rebate_sub(40, "返点扣除调整", "6"),
    commission_to_quota_in(41, "佣金转额度钱包", "7"),
    officer_proxy_up_score(28, "官方给代理上分", "7"),
    proxy_be_up_score(29, "代理被上级上分", "7"),
    proxy_to_child_up_score(30, "代理给下级上分", "7"),
    proxy_to_mem_up_score(31, "代理给会员上分", "7"),
    officer_proxy_down_score(32, "官方给代理下分", "7"),
    proxy_be_down_score(33, "代理给下级下分", "7"),
    proxy_to_child_down_score(34, "代理给下级下分", "7"),
    proxy_to_mem_down_score(35, "代理给会员下分", "7"),

    v1_50_proxy_divination(64, "代理占成", "17"),
    //代理个人欠款
    v1_61_proxy_personal_debt(65, "个人欠款", "20"),
    v1_61_proxy_profit(66, "代理收入", "17"),


    illegal_type(-1, "未知的类型", "-1")
    ;


    private Integer code;
    private String desc;
    private String accountCodes;

    ProxyBizType(Integer code, String desc, String accountCodes) {
        this.code = code;
        this.desc = desc;
        this.accountCodes = accountCodes;
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

    public String accountCodes() {
        return accountCodes;
    }

    static Map<Integer, ProxyBizType> code2EnumOri = new HashMap<>();
    static {
        for (ProxyBizType value : ProxyBizType.values()) {
            code2EnumOri.put(value.code, value);
        }
    }
    public static ProxyBizType getType(Integer code) {
        return code2EnumOri.containsKey(code) ? code2EnumOri.get(code) : illegal_type;
    }

    static Map<Integer, ProxyBizType> code2Enum = new HashMap<>();
    static {
        code2Enum.put(v2_deposit.code, v2_deposit);
        code2Enum.put(v2_withdraw.code, v2_withdraw);
        code2Enum.put(v2_rebate.code, v2_rebate);
        code2Enum.put(v2_loan.code, v2_loan);
        code2Enum.put(v2_repay.code, v2_repay);
        code2Enum.put(v2_credit_up_score.code, v2_credit_up_score);
        code2Enum.put(v2_credit_down_score.code, v2_credit_down_score);
        code2Enum.put(v2_1_deposit.code, v2_1_deposit);
        code2Enum.put(v2_1_withdraw.code, v2_1_withdraw);
        code2Enum.put(v2_1_proxy_commission.code, v2_1_proxy_commission);
        code2Enum.put(v1_50_proxy_divination.code, v1_50_proxy_divination);
    }
    public static ProxyBizType getByCode(Integer code) {
        return code2Enum.containsKey(code) ? code2Enum.get(code) : illegal_type;
    }


    /**
     * 代理账变记录-业务类型 下拉列表
     *
     * @return
     */
    public static List<ProxyBizType> getProxyChangeRecordTypeList() {
        return Arrays.asList(ProxyBizType.v2_deposit, ProxyBizType.v2_withdraw, ProxyBizType.v2_rebate,
                ProxyBizType.v2_loan, ProxyBizType.v2_repay, ProxyBizType.v2_credit_up_score, ProxyBizType.v2_credit_down_score
        );
    }

}
