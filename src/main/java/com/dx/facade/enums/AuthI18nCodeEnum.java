package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

public enum AuthI18nCodeEnum implements I18nEnum {


    DISABLE(0),    // DISABLE(0, "0")
    SUCCESS(200), // SUCCESS(200,"SUCCESS")
    FAIL(10022),  // FAIL(10022, "系统处理失败")
    ID_CANT_EMPTY(100100), // ID_CANT_EMPTY(900100, "id不能为空")
    DATA_NOT_EXIST(100101), // DATA_NOT_EXIST(900101, "数据不存在或已删除")
    USER_ERROR(10002),  // USER_ERROR(10002, "账号或密码不正确"),
    GOOGLE_AUTH_ERROR(10023),  // GOOGLE_AUTH_ERROR(10023, "验证码错误")
    LOGIN_NUM_LOCK_ERROR(10019),    // LOGIN_NUM_LOCK_ERROR(10019, "该账号已被禁止登录1小时，请[minute]分钟后再登录")
    IS_DISABLE(10012),    // IS_DISABLE(10012, "账号已停用，请联系管理员确认")
    LOGIN_NUM_THREE_ERROR(10017),  // LOGIN_NUM_THREE_ERROR(10017, "连续3次密码错误，10分钟内5次密码错误该账号将强制禁止登录1小时")
    LOGIN_NUM_FIVE_ERROR(10018),   // LOGIN_NUM_FIVE_ERROR(10018, "连续5次密码错误，当前账号1小时内禁止登录")
    ADD_PERMISSION_ERROR(20001),  // ADD_PERMISSION_ERROR(20001,"添加权限失败。")
    NO_AUTH(10010),  // NO_AUTH(10010, "无权限")
    PERMISSION_ERROR(10004),    // PERMISSION_ERROR(10004, "无效权限")
    USER_EXIST(10005),    // USER_EXIST(10005, "该账号已存在")
    NICK_NAME_EXIST(10014),   // NICK_NAME_EXIST(10014, "该姓名已存在")
    USER_NOT_EXISTS(10024),    // USER_NOT_EXISTS(10024, "用户不存在")
    ACCOUNT_DOES_NOT_EXIST(310058),    // ACCOUNT_DOES_NOT_EXIST(310058, "账号不存在")
    OPERATE_ERROR(10007),   // OPERATE_ERROR(10007, "非法操作")
    ROLE_EXIST(10006), // ROLE_EXIST(10006, "角色已存在")
    PARA_INVALID(10021),    // PARA_INVALID(10021, "参数无效")
    DELETE_ROLE_ERROR(10016),  // DELETE_ROLE_ERROR(10016, "该角色已关联账号，无法删除")
    数据不存在或已删除(8011),    // 数据不存在或已删除(8011,"数据不存在或已删除")
    LOGIN_PWD_ERROR(10023),   // LOGIN_PWD_ERROR(10023, "请输入正确的登录密码") 1
    DELETE_FAIL(10009),   // DELETE_FAIL(10009, "删除角色失败")
    ORIGINAL_PASSWORD_INVALID(3045),  // ORIGINAL_PASSWORD_INVALID(3045, "原密码不正确")
    USER_NOT_DELETE(10027), // USER_NOT_DELETE(10027, "账号状态开启中，不能删除"),
    USER_OUT_NOT(50001),//用户已停职，不可启用用户
    MERCHANT_CODE_ERROR(10028),//商户编码不正确
	IP_ERROR(10013), // 您的ip访问受限制，请联系管理员
	CHECK_DUPLICATE_FAILED(-10005),// {0}已存在，请勿重复操作！
	IP_WHITE_LIST_OFF(2981681),// 请在 系统配置 中查看是否需要开启该功能
    KAPTCHA_ERROR(10008),//验证码错误
    ;

    private int code;

    AuthI18nCodeEnum(Integer code){
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

}
