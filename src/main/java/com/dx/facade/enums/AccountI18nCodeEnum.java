package com.dx.facade.enums;


import com.dx.enums.I18nEnum;

/**
 * @author agan
 * account-server 国际化错误码枚举
 */
public enum AccountI18nCodeEnum implements I18nEnum {

    // SERVER_ERROR(10001,"系统错误"),
    SERVER_ERROR(1101),
    // BANK_CARD_IS_BOUND(10001,"当前银行卡已存在, 无法添加当前银行卡"),
    BANK_CARD_IS_BOUND(11001),
    // USER_BANK_BLACK(10001,"该银行卡已被禁用，请更换其他银行卡"),
    USER_BANK_BLACK(11002),
    // NUMBER_OF_BANK_CARDS_EXCEEDS(10001,"最多绑定3张银行卡!"),
    NUMBER_OF_BANK_CARDS_EXCEEDS(11003),
    // NO_PAY_CHANNEL(10001,"暂无可用支付通道"),
    /**
     * 暂无可用支付通道
     */
    NO_PAY_CHANNEL(11004),

    /**
     * 下级代理不存在
     */
    LOWER_PROXY_NOT_EXIST(11005),
    /**
     * 参加活动失败 余额不足
     */
    ACTIVITY_BALANCE_NOT_ENOUGH(11006),
    /**
     * 解锁或锁单人不能为空
     */
    LOCKER_NOT_NULL(11007),
    /**
     * 已锁单或解锁
     */
    LOCK_ALREADY(11008),
    /**
     * 只有锁单人才能解锁
     */
    LOCKER_CAN_UNLOCK(11009),
    /**
     * 你有锁定的订单未处理，锁单失败
     */
    LOCK_ORDER_UNFINISHED(11010),
    /**
     * 你已审核过该订单
     */
    AUDIT_ORDER_ALREADY(11011),
    /**
     * 锁单状态异常
     */
    LOCK_STATUS_EXCEPTION(11012),
    /**
     * 锁单人与审核人不一致
     */
    LOCKER_AND_AUDITOR_DIFF(11013),
    /**
     * 审核状态异常
     */
    AUDIT_STATUS_EXCEPTION(11014),
    /**
     * 数据不能为空
     */
    DATA_NOT_NULL(11015),
    /**
     * 红利金额中存在负数
     */
    AMOUNT_NEGATIVE(11016),
    /**
     * 红利发放提交失败
     */
    BONUS_GRANT_FAIL(11017),
    /**
     * 订单已被锁定
     */
    ORDER_LOCKED(11018),
    /**
     * 订单已经解锁
     */
    ORDER_UNLOCKED(11019),

    /**
     * 会员账号%s不存在
     */
    USER_ACCOUNT_NOT_EXIST(11020),

    /**
     * 数据异常, 无法获取流水, 请联系客服人工处理
     */
    CAN_NOT_GET_FLOW(11021),
    /**
     * 添加首存活动记录异常
     */
    ADD_FIRST_DEPOSIT_ACTIVITY_EXCEPTION(11022),
    /**
     * 该活动不在进行中
     */
    ACTIVITY_END(11023),
    /**
     * 该订单已经完成,不能再进行锁单操作
     */
    ORDER_COMPLETED(11024),
    /**
     * 该订单已审核成功
     */
    ORDER_REVIEWED_SUCCESSFULLY(11025),
    /**
     * ORDER_NOT_LOCK("审核未锁定"),
     */
    ORDER_NOT_LOCK(11026),
    /**
     * LOCKERS_REVIEWERS_DIFFERENT("锁单人和审核人不是同一个人"),
     */
    LOCKERS_REVIEWERS_DIFFERENT(11027),
    /**
     * FIRST_SECOND_REVIEWERS_CANNOT_SAME("一审和二审审核人不能是同一个人"),
     */
    FIRST_SECOND_REVIEWERS_CANNOT_SAME(11028),
    /**
     * ACTIVITYCONFIGTAB_NOT_MERCHANT("商户号暂时没有公共规则配置"),
     */
    ACTIVITYCONFIGTAB_NOT_MERCHANT(11029),
    /**
     * 活动进行中，无法删除
     */
    ACTIVITY_PROCESSING(11030),
    /**
     * 未达到Vip等级要求
     */
    NOT_GET_VIP_LEVEL(11031),

    /**
     * 无匹配首存活动规则
     */
    NOT_PATTERN_RULE(11032),
    /**
     * 未达到活动金额要求
     */
    NOT_GET_ACTIVITY_AMOUNT(11033),
    /**
     * 活动配置异常
     */
    ACTIVITY_CONFIG_EXCEPTION(11034),
    /**
     * 首存规则未配置
     */
    FIRST_DEPOSIT_RULE_NOT_CONFIG(11035),
    /**
     * 首存活动规则为空
     */
    FIRST_DEPOSIT_ACTIVITY_RULE_NULL(11036),

    /**
     * 活动金额不能为空
     */
    ACTIVITY_AMOUNT_NOT_NULL(11037),
    /**
     * 活动金额最小值是0
     */
    ACTIVITY_AMOUNT_MIN_0(11038),
    /**
     * 流水要求不能为空
     */
    FLOW_NOT_NULL(11039),

    /**
     * 流水要求最小值是0
     */
    FLOW_MIN_0(11040),
    /**
     * 赠送比例最小值是0
     */
    HANDSEL_RATE_MIN_0(11041),
    /**
     *赠送金额最小值是0
     */
    HANDSEL_AMOUNT_MIN_0(11042),
    /**
     * 赠送上限最小值是0
     */
    HANDSEL_LIMIT_MIN_0(11043),
    /**
     * 查询活动任务异常
     */
    QUERY_ACTIVITY_TASK_EXCEPTION(11044),
    /**
     * 钱包不存在
     */
    WALLET_NOT_EXIST(11045),
    /**
     * 扣除金额需小于等于当前余额
     */
    SUB_AMOUNT_LESS_CURRENT_AMOUNT(11046),
    /**
     * 代理佣金钱包无%S减额类型
     */
    PROXY_COMMISSION_WALLET_NO_SUB_TYPE(11047),
    /**
     * 代理额度钱包无%S减额类型
     */
    PROXY_ACCOUNT_WALLET_NO_SUB_TYPE(11048),
    /**
     * 会员银行卡或者虚拟币不存在
     */
    USER_BANK_NOT_EXISTS(11049),
    /**
     * 会员数据异常, 无法更新流水, 请联系客服人工处理
     */
    USER_DATA_EXCEPTION(11050),
    /**
     * 修改状态异常
     */
    CHANGE_STATUS_EXCEPTION(11051),
    /**
     * 绑定虚拟币异常
     */
    BIND_VIRTUAL_EXCEPTION(11052),
    /**
     * 添加银行卡异常
     */
    ADD_BANK_CARD_EXCEPTION(11053),
    /**
     * 添加银行卡异常
     */
    ADD_VIRTUAL_ACCOUNT_EXCEPTION(11054),
    /**
     * 验证签名失败
     */
    VERIFY_SIGN_ERROR(11055),

    触发账变异常(11056),

    /**
     * 活动任务不存在
     */
    活动任务不存在(11057),

    /**
     * 代理佣金钱包无%S加额类型
     */
    PROXY_COMMISSION_WALLET_NO_ADD_TYPE(11058),
    /**
     * 代理额度钱包无%S加额类型
     */
    PROXY_ACCOUNT_WALLET_NO_ADD_TYPE(11059),
    /**
     * %s账户已被禁用，请更换其他虚拟币账户
     */
    USER_VIRTUAL_ACCOUNT_BLACK(300075),

    ORDER_LOCK_TIME_NOT_EMPTY(300076),//锁单时间为空是异常注单
    ORDER_NOT_EXISTS(300077),//订单不存在
//    该订单已审核成功(300078),//该订单已审核成功
    加额审核未锁定(300079),//加额审核未锁定
    ONLY_LOCK_ONE_ORDER(300080),//你有锁定的订单未处理，锁单失败
    加额审核已经锁定(300081),//加额审核已经锁定
    FRIEND_INVITATION_DATA_ABNORMAL(300082),//好友邀请主配置数据异常！
    ACQUIRE_MEMBER_BILL_LOCK_FAILED(30083),//获取会员分布式锁失败
    WITHDRAW_LIMIT_INFO_QUERY_FAILED(30084),//取款信息查询失败
    MEMBER_BILL_DETAIL_RECORD_NOT_EXIST(30085),//会员流水记录不存在
    CASH_WALLET_NOT_EXIST(30086),//中心钱包不存在
//
//    /**
//     * 账户已被禁用，请更换其他虚拟币账户
//     */
//    USER_VIRTUAL_ACCOUNT_BLACK(11060);
//
//
//






    ;

    private int code;

    AccountI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

    public static AccountI18nCodeEnum getInstance(int code){
        for(AccountI18nCodeEnum i18n:values()){
            if(i18n.code == code){
                return i18n;
            }
        }
        return null;
    }
}
