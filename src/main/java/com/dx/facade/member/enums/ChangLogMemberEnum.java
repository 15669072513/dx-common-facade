package com.dx.facade.member.enums;

import java.util.Objects;

/**
 * 会员账号变更记录 枚举
 *
 */
public enum ChangLogMemberEnum {

    REAL_NAME(1, "姓名"),
    NICKNAME(2, "昵称"),
    GENDER(3, "性别"),
    BIRTHDAY(4, "出生日期"),
    MOBILE(5, "手机号"),
    TOP_IMAGES_URL(6, "头像"),
    PASSWORD(7, "登录密码"),
    PAY_PASSWORD(8, "支付密码"),
    PAYMENT_LOCK(9, "支付锁定"),//记录用户连续5次输入错误支付密码后锁定的节点；（为备注信息）
    LOGIN_LOCK(10, "登录锁定"),//记录用户连续5次输入错误登陆密码后锁定的节点；（为备注信息）
    ENTRY_AUTHORITY_OPEN(11, "开启代理权限"),//上级代理通过会员列表给直属会员开启代理权限；（代理操作）

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
