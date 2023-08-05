package com.dx.facade.account.change;

import com.dx.exception.BizException;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public enum MemberAppType implements IAppType {
    deposit(1, "存款"),
    withdraw(2, "取款"),
    transfer(3, "转账"),
    rebate(4, "返水"),
    activity(5, "活动优惠"),
    reward(6, "会员福利"),
    other(7, "其他"),
    deposit_discount(8, "存款优惠"),

    //新增
    proxy_up_score(9, "代理上分"),
    proxy_down_score(10, "代理下分"),
    bring_to_table(11, "带入牌桌"),
    bring_out_table(12, "带出牌桌"),
    to_center(13, "佣金转回"),

    //---------------V2新增-------------
    v2_cash_up_score(14, "充值上分"),
    v2_cash_down_score(15, "提现上分"),
    v2_transfer(3, "转账"),
    v2_rebate(4, "返水"),
    v2_loan(16, "信用借款"),
    v2_repay(17, "信用还款"),
    v2_credit_up_score(18, "授信上分"),
    v2_credit_down_score(19, "授信下分"),
    v2_bring_to_table(11, "带入牌桌"),
    v2_bring_out_table(12, "带出牌桌"),
    v2_withdraw_frozen(20, "提现冻结"),
    v2_withdraw_refused(21, "提现拒绝"),

    ;

    private Integer code;
    private String desc;

    MemberAppType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static MemberAppType getType(Integer code) throws BizException {
        for (MemberAppType appMemberChangeType : values()) {
            if (appMemberChangeType.code.equals(code)) {
                return appMemberChangeType;
            }
        }
        throw new BizException("没有这个MemberAppType");
    }

    /**
     * 根据钱包类型和客户端账变类型获取后端账变类型
     * @param walletType
     * @param appChangeType
     * @return
     */
    public static List<Integer> getChangeTypeByAppChangeType(@NotNull Integer walletType, @NotNull Integer appChangeType) {
        if (walletType == WalletType.cash.code()) {
            if (appChangeType == v2_cash_up_score.code) return Arrays.asList(MemberChangeType.v2_cash_up_score.code());
            if (appChangeType == v2_cash_down_score.code())
                return Arrays.asList(MemberChangeType.v2_cash_down_score.code());
            if (appChangeType == v2_transfer.code)
                return Arrays.asList(MemberChangeType.v2_cash_center_to_B.code(), MemberChangeType.v2_cash_B_to_center.code());
            if (appChangeType == v2_rebate.code())
                return Arrays.asList(MemberChangeType.v2_rebate.code(), MemberChangeType.v2_rebate_add.code(), MemberChangeType.v2_rebate_sub.code());
            if (appChangeType == v2_loan.code()) return Arrays.asList(MemberChangeType.v2_cash_loan.code());
            if (appChangeType == v2_repay.code()) return Arrays.asList(MemberChangeType.v2_cash_repay.code());
            if (appChangeType == v2_withdraw_frozen.code())
                return Arrays.asList(MemberChangeType.v2_cash_withdraw_frozen.code());
            if (appChangeType == v2_withdraw_refused.code())
                return Arrays.asList(MemberChangeType.v2_cash_withdraw_refused.code());
            if (appChangeType == v2_bring_out_table.code())
                return Arrays.asList(MemberChangeType.bring_out_table.code());
            if (appChangeType == v2_bring_to_table.code()) return Arrays.asList(MemberChangeType.bring_to_table.code());
        }
        if (walletType == WalletType.credit_available.code()) {
            if (appChangeType == v2_credit_up_score.code())
                return Arrays.asList(MemberChangeType.v2_credit_up_score.code());
            if (appChangeType == v2_credit_down_score.code())
                return Arrays.asList(MemberChangeType.v2_credit_down_score.code());
            if (appChangeType == v2_loan.code()) return Arrays.asList(MemberChangeType.v2_credit_loan.code());
            if (appChangeType == v2_repay.code()) return Arrays.asList(MemberChangeType.v2_credit_repay.code());
        }
        if (walletType != WalletType.cash.code() && walletType != WalletType.credit_available.code()
                && walletType != WalletType.cash_lock.code() && walletType != WalletType.credit_total.code()) {
            if (appChangeType == v2_transfer.code)
                return Arrays.asList(MemberChangeType.v2_B_to_center.code(), MemberChangeType.v2_center_to_B.code());
        }
        return Arrays.asList();
    }
}