package com.dx.facade.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 中控后台会员提现订单状态枚举
 * 客户端订单状态:1审核通过，2一审拒绝，3二审拒绝，4代理通过，5代理拒绝
 */
public enum MerchantMemberWithdrawOrderStatusEnum {
    //1处理中，2审核通过，3审核拒绝
    审核通过(1, "审核通过"),//对应WithdrawOrderStatus 二审审核和待三审
    一审拒绝(2, "一审拒绝"),
    二审拒绝(3, "二审拒绝"),
    代理通过(4, "代理通过"),
    代理拒绝(5, "代理拒绝"),
    ;
    private Integer code;
    private String desc;

    MerchantMemberWithdrawOrderStatusEnum(Integer code, String des) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static MerchantMemberWithdrawOrderStatusEnum getType(Integer code) {
        for (MerchantMemberWithdrawOrderStatusEnum withdrawStatus : values()) {
            if (withdrawStatus.code.equals(code)) {
                return withdrawStatus;
            }
        }
        return null;
    }


    /**
     * 根据服务端提现订单状态，转换为中控后台提现订单记录列表订单状态
     * @param merchantOrderStatus   中控后台提现订单审核记录中订单状态
     * @return
     */
    public static List<Integer> getDbOrderStatusByClientStatus(Integer merchantOrderStatus) {
        //客户端订单状态:1审核通过，2一审拒绝，3二审拒绝，4代理通过，5代理拒绝
        if(merchantOrderStatus == null) {//未选择，则返回全部
            return Arrays.asList(
                    WithdrawOrderStatus.一审拒绝.code(),
                    WithdrawOrderStatus.二审拒绝.code(),
                    WithdrawOrderStatus.三审拒绝.code(),
                    WithdrawOrderStatus.二审审核.code(),
                    WithdrawOrderStatus.待三审.code(),
                    WithdrawOrderStatus.三审审核.code(),
                    WithdrawOrderStatus.已出款.code(),
                    WithdrawOrderStatus.出款失败.code()
            );
        }
        if(merchantOrderStatus.equals(审核通过.code)) {//审核通过
            return Arrays.asList(
                    WithdrawOrderStatus.二审审核.code(),
                    WithdrawOrderStatus.待三审.code()
            );
        }
        if(merchantOrderStatus.equals(一审拒绝.code)) {
            return Arrays.asList(WithdrawOrderStatus.一审拒绝.code());
        }
        if(merchantOrderStatus.equals(二审拒绝.code)) {
            return Arrays.asList(WithdrawOrderStatus.二审拒绝.code());
        }
        if(merchantOrderStatus.equals(代理通过.code)) {
            return Arrays.asList(WithdrawOrderStatus.三审审核.code(), WithdrawOrderStatus.已出款.code(), WithdrawOrderStatus.出款失败.code());
        }
        if(merchantOrderStatus.equals(代理拒绝.code)) {
            return Arrays.asList(WithdrawOrderStatus.三审拒绝.code());
        }
        throw new IllegalArgumentException("clientOrderStatus参数非法:" + merchantOrderStatus);
    }

    /**
     * 根据订单数据库订单状态转换成中控后台提现审核记录列表订单状态
     * @param dbOrderStatus     服务端/数据库提现订单状态
     * @return
     */
    public static Integer getMerchantStatusByDbOrderStatus(Integer dbOrderStatus) {
        if(dbOrderStatus == null) {
            throw new IllegalArgumentException("会员提现审核记录查询，db中存在dbOrderStatus为null");
        }
        if(dbOrderStatus.equals(WithdrawOrderStatus.二审审核.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.待三审.code())) {
            return 审核通过.code;
        }
        if(dbOrderStatus.equals(WithdrawOrderStatus.一审拒绝.code())) {
            return 一审拒绝.code;
        }
        if(dbOrderStatus.equals(WithdrawOrderStatus.二审拒绝.code())) {
            return 二审拒绝.code;
        }
        if(dbOrderStatus.equals(WithdrawOrderStatus.三审审核.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.已出款.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.出款失败.code())) {
            return 代理通过.code;
        }
        if(dbOrderStatus.equals(WithdrawOrderStatus.三审拒绝.code())) {
            return 代理拒绝.code;
        }
        throw new IllegalArgumentException("会员提现审核记录查询，db中存在非法dbOrderStatus:" + dbOrderStatus);
    }
}
