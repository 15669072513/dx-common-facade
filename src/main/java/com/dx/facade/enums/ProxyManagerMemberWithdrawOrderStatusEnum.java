package com.dx.facade.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 代理后台/代理中心会员提现订单状态枚举
 * 订单状态:1待平台审核，2平台审核拒绝，3待代理审核，4代理审核拒绝，5代理审核通过
 * @author Orbit
 */
public enum ProxyManagerMemberWithdrawOrderStatusEnum {
    待平台审核(1, "待平台审核"),
    平台审核拒绝(2, "平台审核拒绝"),
    待代理审核(3, "待代理审核"),
    代理审核拒绝(4, "代理审核拒绝"),
    代理审核通过(5, "代理审核通过"),
    ;
    private Integer code;
    private String desc;

    ProxyManagerMemberWithdrawOrderStatusEnum(Integer code, String des) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static ProxyManagerMemberWithdrawOrderStatusEnum getType(Integer code) {
        for (ProxyManagerMemberWithdrawOrderStatusEnum withdrawStatus : values()) {
            if (withdrawStatus.code.equals(code)) {
                return withdrawStatus;
            }
        }
        return null;
    }


    /**
     * 根据服务端会员提现订单状态，转换为代理后台/代理中心会员客户端提现订单状态
     * @param clientOrderStatus   客户端（代理后台、代理中心）提现订单审核记录中订单状态
     * @return
     */
    public static List<Integer> getDbOrderStatusByClientStatus(Integer clientOrderStatus) {
        //客户端订单状态:1待平台审核，2平台审核拒绝，3待代理审核，4代理审核拒绝，5代理审核通过
        if (clientOrderStatus == null || clientOrderStatus == 0) {
            return Arrays.asList(//所有
                    WithdrawOrderStatus.待一审.code(),
                    WithdrawOrderStatus.一审审核.code(),
                    WithdrawOrderStatus.待二审.code(),
                    WithdrawOrderStatus.二审审核.code(),
                    WithdrawOrderStatus.待三审.code(),
                    WithdrawOrderStatus.三审审核.code(),
                    WithdrawOrderStatus.一审拒绝.code(),
                    WithdrawOrderStatus.二审拒绝.code(),
                    WithdrawOrderStatus.三审拒绝.code(),
                    WithdrawOrderStatus.已出款.code(),
                    WithdrawOrderStatus.出款拒绝.code()
            );
        }
        if (Objects.equals(clientOrderStatus, 待平台审核.code)) {//待平台审核
            return Arrays.asList(
                    WithdrawOrderStatus.待一审.code(),
                    WithdrawOrderStatus.一审审核.code(),
                    WithdrawOrderStatus.待二审.code()
            );
        }
        if (Objects.equals(clientOrderStatus, 平台审核拒绝.code)) {//平台拒绝
            return Arrays.asList(
                    WithdrawOrderStatus.一审拒绝.code(),
                    WithdrawOrderStatus.二审拒绝.code()
            );
        }
        if (Objects.equals(clientOrderStatus, 待代理审核.code)) {//待代理审核
            return Arrays.asList(
                    WithdrawOrderStatus.二审审核.code(),
                    WithdrawOrderStatus.待三审.code()
            );
        }
        if (Objects.equals(clientOrderStatus, 代理审核拒绝.code)) {//代理审核拒绝
            return Arrays.asList(
                    WithdrawOrderStatus.三审拒绝.code(),
                    WithdrawOrderStatus.出款拒绝.code()
            );
        }
        if (Objects.equals(clientOrderStatus, 代理审核通过.code)) {//代理审核通过
            return Arrays.asList(
                    WithdrawOrderStatus.三审审核.code(),
                    WithdrawOrderStatus.已出款.code()
            );
        }
        throw new IllegalArgumentException("clientOrderStatus参数异常：" + clientOrderStatus);
    }

    /**
     * 根据会员提现订单数据库订单状态转换成代理后台（代理中心）会员提现单客户端状态
     * @param dbOrderStatus     服务端/数据库提现订单状态
     * @return
     */
    public static Integer getClientStatusByDbOrderStatus(Integer dbOrderStatus) {
        if (dbOrderStatus.equals(WithdrawOrderStatus.待一审.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.一审审核.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.待二审.code())) {
            return 待平台审核.code;
        }
        if (dbOrderStatus.equals(WithdrawOrderStatus.一审拒绝.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.二审拒绝.code())) {
            return 平台审核拒绝.code;
        }
        if (dbOrderStatus.equals(WithdrawOrderStatus.二审审核.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.待三审.code())) {
            return 待代理审核.code;
        }
        if (dbOrderStatus.equals(WithdrawOrderStatus.三审拒绝.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.出款拒绝.code())) {
            return 代理审核拒绝.code;
        }
        if (dbOrderStatus.equals(WithdrawOrderStatus.三审审核.code())
                || dbOrderStatus.equals(WithdrawOrderStatus.已出款.code())) {
            return 代理审核通过.code;
        }
        throw new IllegalArgumentException("clientOrderStatus参数异常：" + dbOrderStatus);
    }
}
