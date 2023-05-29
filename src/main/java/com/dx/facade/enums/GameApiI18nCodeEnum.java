package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

/**
 * game-api 国际化错误码枚举
 */
public enum GameApiI18nCodeEnum implements I18nEnum {
    /** game-api **/
    TEMPORARY_TRY_GAME(44015), // TEMPORARY_TRY_GAME(44015, "暂时不支持试玩"),
    QUERY_PLATFORM_STATUS_ERROR(20009), // QUERY_PLATFORM_STATUS_ERROR(20009, "获取平台状态异常"),
    PLATFORM_IN_MAINTENANCE(20007), // PLATFORM_IN_MAINTENANCE(20007, "当前场馆正在维护"), BWCS-2423  该场馆正在维护中，请选择其他场馆

    PLATFORM_IN_MAINTENANCE2(20012), // PLATFORM_IN_MAINTENANCE(20007, "当前场馆正在维护"), BWCS-2423  该场馆正在维护中，请选择其他场馆
    PLATFORM_IN_DISABLE(20008), // PLATFORM_IN_DISABLE(20008, "当前场馆已禁用"),
    MEMBER_NOT_EXISTS(10001), // MEMBER_NOT_EXISTS(10001, "统一会员不存在"),
    MERCHANT_CODE_NOT_NULL(41200), // MERCHANT_CODE_NOT_NULL(41200, "商户代码不能为空"),
    GAME_CODE_NOT_NULL(31120), // GAME_CODE_NOT_NULL(31120, "游戏代码不能为空"),
    MERCHANT_NOT_EXISTS(20091), // MERCHANT_NOT_EXISTS(20091, "找不到对应的商户"),
    GAME_REGISTER_NB_FAIL(35010), // GAME_REGISTER_NB_FAIL(35010, "游戏注册维护映射失败"),
    电游_获取游戏配置失败(44005), // 电游_获取游戏配置失败(44005, "电游_获取游戏配置失败"),
    体育_进入游戏失败(44004), // 体育_进入游戏失败(44004, "体育_进入游戏失败"),
    真人_获取热门桌台接口异常(44009), // 真人_获取热门桌台接口异常(44009, "真人_获取热门桌台接口异常"),
    GAME_IN_MAINTENANCE(20010), // GAME_IN_MAINTENANCE(20010, "当前游戏正在维护"),
    GAME_IN_DISABLE(20011), // GAME_IN_DISABLE(20011, "当前游戏已禁用"),
    真人_桌台ID或主播ID(44014), // 真人_桌台ID或主播ID(44014, "真人_桌台ID或主播ID必填一个且大于0"),
    GAME_MEMBER_NOT_EXISTS(10002), // GAME_MEMBER_NOT_EXISTS(10002, "游戏会员不存在"),
    真人_游戏会员名称为空(44013), // 真人_游戏会员名称为空(44013, "真人_游戏会员名称不能为空"),
    真人_点击桌台_真人主播直接进入桌台接口异常(44011), // 真人_点击桌台_真人主播直接进入桌台接口异常(44011, "真人_点击桌台_真人主播直接进入桌台接口异常"),
    真人_获取所有桌台接口异常(44008), // 真人_获取所有桌台接口异常(44008, "真人_获取所有桌台接口异常"),

    /** sdk **/
    HTTP_SEND_ERROR(9001), // HTTP_SEND_ERROR(9001, "发送网络请求失败")
    OBJECT_NOT_NULL(9103), // OBJECT_NOT_NULL(9103,"入参对象不能为空"),
    HOST_NOT_NULL(9104), // HOST_NOT_NULL(9104,"接口域名不能为空"),
    MD5_NOT_NULL(9105), // MD5_NOT_NULL(9105, "MD5秘钥不能为空"),
    TIMESTAMP_FORMAT_ERROR(1505), // TIMESTAMP_FORMAT_ERROR(1505, "时间戳应是13位数整形"),
    DEVICE_TYPE_NOT_NULL(9113), // DEVICE_TYPE_NOT_NULL(9113, "设备类型不能为空"),
    NICK_NAME_NOT_NULL(9117), // NICK_NAME_NOT_NULL(9117, "玩家昵称不能为空"),
    AGENT_CODE_NOT_NULL(3107), //AGENT_CODE_NOT_NULL(3107, "商户编号不能为空"),
    ACCOUNT_NOT_NULL(1212), // ACCOUNT_NOT_NULL(1212, "游戏账号不能为空"),
    ACCOUNT_PASSWORD_NULL(1213), // ACCOUNT_PASSWORD_NULL(1213, "登陆密码不能为空"),
    MEMBER_IP_NOT_NULL(9116), // MEMBER_IP_NOT_NULL(9116, "玩家IP不能为空"),
    GAME_TYPE_NOT_NULL(9112), // GAME_TYPE_NOT_NULL(9112, "游戏类型不能为空"),
    SUCCESS(200), // SUCCESS(200, "SUCCESS")
    AES_NOT_NULL(9106), // AES_NOT_NULL(9106, "AES秘钥不能为空"),
    GAME_ID_NOT_NULL(9118), // GAME_ID_NOT_NULL(9118, "游戏ID不能为空"),
    BACK_URL_NOT_NULL(9109), // BACK_URL_NOT_NULL(9109, "返回商户地址不能为空"),


    //bw 新增
    GAME_REGISTER_FAIL(35005),//"游戏注册请求失败"
    ACCOUNT_EXIST(1202), //"游戏账号已存在"

    LOGIN_ERROR(60011),// "登录失败"
    CREATE_ERROR(60021),// "创建游戏账号失败"
    DEPOSIT_ERROR(60031),//"上分失败"
    WITHDRAW_ERROR(60041), //"下分失败"
    WITHDRAW_ACTIVITY_UN_FINISH_ERROR(60042),//"当前场馆有未完成的活动，不可进行下分"
    WITHDRAW_ORDER_UN_SETTLED_ERROR(60043),//"当前场馆有未结算注单，不可进行下分"
    WITHDRAW_SETTLED_ORDER_TIME_ERROR(60044),//"最后投注时间小于半小时，不可进行下分"
    WITHDRAW_QUERY_ORDER_FAILED_ERROR(60045), //"查询用户未结算注单失败"
    QUERY_BALANCE_ERROR(60051),//"余额查询失败"
    QUERY_TRANSFER_ERROR(60061),//"查询转账失败"
    DUPLICATE_VENUE_NAME(55792),// "不能有相同的场馆名"
    DUPLICATE_GAME_NAME(55791),// 同一场馆下不能有相同的游戏名

    ;
    private int code;

    GameApiI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
