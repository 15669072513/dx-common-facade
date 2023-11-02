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
    v2_cash_down_score(15, "提现下分"),
    v2_transfer(3, "转账"),
    v2_rebate(4, "返水"),
    v2_loan(16, "信用借款"),
    v2_repay(17, "信用还款"),
    v2_credit_up_score(18, "授信上分"),
    v2_credit_down_score(19, "授信下分"),
    v2_bring_to_table(11, "带入牌桌"),
    v2_bring_out_table(12, "带出牌桌"),
    v2_withdraw_frozen(20, "取款"),
    v2_withdraw_refused(21, "取款失败"),

    v2_1_withdraw(22, "取款"),
    v2_1_deposit(23, "存款"),
    v2_1_deposit_discount(24, "存款优惠")
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

    public static MemberAppType getType(Integer code) {
        for (MemberAppType appMemberChangeType : values()) {
            if (appMemberChangeType.code.equals(code)) {
                return appMemberChangeType;
            }
        }
        throw new IllegalArgumentException("没有这个MemberAppType,code:" + code);
    }

    /**
     * 根据钱包类型和客户端账变类型获取后端账变类型列表
     * @param walletType            钱包类型
     * @param appChangeType         客户端账变类型
     * @return                      后端账变类型列表
     */
    public static List<Integer> getChangeTypeByAppChangeType(@NotNull Integer walletType, Integer appChangeType) {
        if (walletType.intValue() == WalletType.cash.code()) {
            //若appChangeType为空，则返回现金钱包下所有服务端账变类型
            if(appChangeType == null) {
                return Arrays.asList(
                        MemberChangeType.v2_cash_up_score.code(),
                        MemberChangeType.v2_cash_down_score.code(),
                        MemberChangeType.v2_cash_B_to_center.code(),
                        MemberChangeType.v2_cash_center_to_B.code(),
                        MemberChangeType.v2_rebate.code(),
                        MemberChangeType.v2_rebate_add.code(),
                        MemberChangeType.v2_rebate_sub.code(),
                        MemberChangeType.v2_cash_loan.code(),
                        MemberChangeType.v2_cash_repay.code(),
                        MemberChangeType.v2_cash_withdraw_frozen.code(),
                        MemberChangeType.v2_cash_withdraw_refused.code(),
                        MemberChangeType.bring_to_table.code(),
                        MemberChangeType.bring_out_table.code()
                );
            }
            if (appChangeType.intValue() == v2_cash_up_score.code) {
                return Arrays.asList(MemberChangeType.v2_cash_up_score.code());
            }
            if (appChangeType.intValue() == v2_cash_down_score.code()) {
                return Arrays.asList(MemberChangeType.v2_cash_down_score.code());
            }
            if (appChangeType.intValue() == v2_transfer.code) {
                return Arrays.asList(MemberChangeType.v2_cash_center_to_B.code(), MemberChangeType.v2_cash_B_to_center.code());
            }
            if (appChangeType.intValue() == v2_rebate.code()) {
                return Arrays.asList(
                        MemberChangeType.v2_rebate.code(),
                        MemberChangeType.v2_rebate_add.code(),
                        MemberChangeType.v2_rebate_sub.code(),
                        MemberChangeType.v2_1_club_rebate_sub.code(),
                        MemberChangeType.v2_1_club_rebate_add.code(),
                        MemberChangeType.v2_1_insure_rebate_sub.code(),
                        MemberChangeType.v2_1_insure_rebate_add.code()
                );
            }
            if (appChangeType.intValue() == v2_loan.code()) {
                return Arrays.asList(MemberChangeType.v2_cash_loan.code());
            }
            if (appChangeType.intValue() == v2_repay.code()) {
                return Arrays.asList(MemberChangeType.v2_cash_repay.code());
            }
            if (appChangeType.intValue() == v2_withdraw_frozen.code()) {
                return Arrays.asList(MemberChangeType.v2_cash_withdraw_frozen.code(),MemberChangeType.v2_1_withdraw_frozen.code());
            }
            if (appChangeType.intValue() == v2_withdraw_refused.code()) {
                return Arrays.asList(MemberChangeType.v2_cash_withdraw_refused.code(), MemberChangeType.v2_1_withdraw_fail.code());
            }
            if (appChangeType.intValue() == v2_bring_out_table.code()) {
                return Arrays.asList(MemberChangeType.bring_out_table.code());
            }
            if (appChangeType.intValue() == v2_bring_to_table.code()) {
                return Arrays.asList(MemberChangeType.bring_to_table.code());
            }
            if(appChangeType.intValue() == v2_1_withdraw.code) {
                return Arrays.asList(MemberChangeType.v2_1_withdraw.code(),MemberChangeType.v2_1_withdraw_back.code());
            }
            if(appChangeType.intValue() == v2_1_deposit.code()) {
                return Arrays.asList(MemberChangeType.v2_1_deposit.code(), MemberChangeType.v2_1_deposit_back.code());
            }
            /*if(appChangeType.intValue() == v2_1_deposit_discount.code) {
                return Arrays.asList(
                        MemberChangeType.v2_1_deposit_discount.code(),
                        MemberChangeType.v2_1_deposit_discount_back.code()
                );
            }*/


        }
        if (walletType.intValue() == WalletType.credit_available.code()) {
            //若appChangeType为空，则返回所有信用钱包账变类型
            if(appChangeType == null) {
                return Arrays.asList(
                        MemberChangeType.v2_credit_up_score.code(),
                        MemberChangeType.v2_credit_down_score.code(),
                        MemberChangeType.v2_credit_loan.code(),
                        MemberChangeType.v2_credit_repay.code()
                );
            }
            if (appChangeType.intValue() == v2_credit_up_score.code())
                return Arrays.asList(MemberChangeType.v2_credit_up_score.code());
            if (appChangeType.intValue() == v2_credit_down_score.code())
                return Arrays.asList(MemberChangeType.v2_credit_down_score.code());
            if (appChangeType.intValue() == v2_loan.code()) return Arrays.asList(MemberChangeType.v2_credit_loan.code());
            if (appChangeType.intValue() == v2_repay.code()) return Arrays.asList(MemberChangeType.v2_credit_repay.code());
        }
        //若是场馆钱包,则返回场馆钱包下的转入转出
        if (Arrays.asList(WalletType.video.code(), WalletType.sports.code(), WalletType.poker.code(), WalletType.lottery.code(), WalletType.e_sports.code()).contains(walletType)) {
            if (appChangeType.intValue() == v2_transfer.code)
                return Arrays.asList(MemberChangeType.v2_B_to_center.code(), MemberChangeType.v2_center_to_B.code());
        }
        return Arrays.asList();
    }

    /**
     * 根据钱包类型和后端账变类型，返回客户端账变
     * @param walletType            钱包类型，参见WalletType
     * @param serverChangeType      后端账变类型，参见MemberWalletType
     * @return  返回客户端张变类型，参见MemberAppType
     */
    public static Integer getAppChangeTypeByServerChangeType (Integer walletType, Integer serverChangeType) {
        if(walletType.intValue() == WalletType.cash.code()) {
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_up_score.code()) {
                return v2_cash_up_score.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_down_score.code()) {
                return v2_cash_down_score.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_center_to_B.code()) {
                return transfer.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_B_to_center.code()) {
                return transfer.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_rebate.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_rebate_add.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_rebate_sub.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_club_rebate_sub.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_club_rebate_add.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_insure_rebate_sub.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_insure_rebate_add.code()) {
                return v2_rebate.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_loan.code()) {
                return v2_loan.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_repay.code()) {
                return v2_repay.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_withdraw_frozen.code()) {
                return v2_withdraw_frozen.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_cash_withdraw_refused.code()) {
                return v2_withdraw_refused.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.bring_to_table.code()) {
                return v2_bring_to_table.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.bring_out_table.code()) {
                return v2_bring_out_table.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_withdraw.code()) {
                return v2_1_withdraw.code;
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_withdraw_back.code()) {
                return v2_1_withdraw.code;
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_withdraw_frozen.code()) {
                return v2_withdraw_frozen.code;
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_withdraw_fail.code()) {
                return v2_withdraw_refused.code;
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_deposit.code()) {
                return v2_1_deposit.code;
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_deposit_back.code()) {
                return v2_1_deposit.code;
            }
            /*if(serverChangeType.intValue() == MemberChangeType.v2_1_deposit_discount.code()) {
                return v2_1_deposit_discount.code;
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_1_deposit_discount_back.code()) {
                return v2_1_deposit_discount.code;
            }*/

        }
        if(walletType.intValue() == WalletType.credit_available.code()) {
            if(serverChangeType.intValue() == MemberChangeType.v2_credit_up_score.code()) {
                return v2_credit_up_score.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_credit_down_score.code()) {
                return v2_credit_down_score.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_credit_loan.code()) {
                return v2_loan.code();
            }
            if(serverChangeType.intValue() == MemberChangeType.v2_credit_repay.code()) {
                return v2_repay.code();
            }
        }
        List<Integer> gameWalletTypes = Arrays.asList(
                WalletType.texas.code(),
                WalletType.video.code(),
                WalletType.sports.code(),
                WalletType.poker.code(),
                WalletType.lottery.code(),
                WalletType.e_sports.code()
        );
        if(gameWalletTypes.contains(walletType)) {
            return v2_transfer.code();
        }
        return null;
    }
}