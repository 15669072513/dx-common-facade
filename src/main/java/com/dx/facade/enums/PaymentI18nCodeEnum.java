package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

/**
 * @author agan
 */

public enum PaymentI18nCodeEnum implements I18nEnum {

    SERVICE_BUSY(10003),//服务器繁忙,请稍后再试
    MEMBERSHIP_FLOW_NOT_COMPLETED(10044),//会员流水未完成，暂时不能提款
    USER_NOT_EXIST(10001),//会员不存在
    FUNCTION_DISABLED(10047),//该功能已停用，请联系客服
    LOGIN_LOCK(10048),//当前账户状态为登录锁定
    NO_BANK_CARD(10061),//无此银行卡
    BANK_CARD_BLACK(10049),//该银行卡已黑名单
    BANK_CARD_UNLOCKED(10050),//当前银行卡已被解绑
    VIRTUAL_BLACK(10052),//该虚拟币地址已黑名单
    VIRTUAL_UNLOCKED(10053),//当前虚拟币已被解绑
    CONFIGKEY_ERROR(10060),//字典类型不匹配
    ORDER_TRANSFER_MAX_ERROR(10057),//本次转账额度高于单次最大额度
    ORDER_TRANSFER_MIN_ERROR(10056),//本次转账额度低于单次最低额度
    ORDER_TRANSFER_TOTAL_ERROR(10058),//转账额度已高于当日最高限度
    ORDER_WITHDRAW_MAX_ERROR(10034),//本次提款额度高于单次最大额度
    ORDER_WITHDRAW_MIN_ERROR(10033),//本次提款额度低于单次最低额度
    WITHDRAW_TYPE_ERROR(10059),//取款类型错误
    ORDER_WITHDRAW_TOTAL_ERROR(10035),//提款额度已高于当日最高限度
    ORDER_WITHDRAW_NUM_TOTAL_ERROR(10036),//您今日取款总次数已达%s次上限
    NOT_ORDER(500), // 订单不存在

    BANK_CARD_BLACK_1(10063),//该银行卡已失效，请联系客服
    VIRTUAL_BLACK_1(10064),//该地址已失效，请联系客服
    WITHDRAW_NOT_PAY(10066),//取款暂无渠道,请联系客服
    WITHDRAW_NUMBER_USE_UP(10067),//您的今日可用提款次数已用完

    VIRTUAL_PROTOCAL_NOT_SUPPORT(10068), // 该协议暂不支持取款，请选择其他取款方式
    DEPOSIT_NOT_BANKCODE(10065),//"充值渠道暂未配置银行卡"
    ;

    private int code;

    PaymentI18nCodeEnum(Integer code){
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
