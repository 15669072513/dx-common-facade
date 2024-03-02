package com.dx.facade.member.enums;

import java.util.Objects;

/**
 * 会员账号变更记录 枚举
 *
 */
public enum ChangLogMemberEnum {
    REAL_NAME(1, "姓名"),
    nickName(2, "昵称"),
    gender(3, "性别"),
    birthday(4, "出生日期"),
    mobile(5, "手机号"),
    topImagesUrl(6, "头像"),
    password(7, "登录密码"),
    PAYPASSWORD(8, "支付密码"),
    PAYMENT_LOCK(9, "支付锁定"),
    LOGIN_LOCK(10, "登录锁定"),
    ENTRY_AUTHORITY_OPEN(11, "开启代理权限"),

    ;
    public Integer code;
    public String desc;

    private ChangLogMemberEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(Integer code) {
        ChangLogMemberEnum changLogEnum = getByCode(code);
        return Objects.nonNull(changLogEnum) ? changLogEnum.desc : "";
    }

    public static ChangLogMemberEnum getByCode(Integer code) {
        for (ChangLogMemberEnum item : values()) {
            if (Objects.equals(item.code, code)) {
                return item;
            }
        }
        return null;
    }

}
