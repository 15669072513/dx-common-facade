package com.dx.facade.member.enums;

import java.util.Objects;

/**
 * 代理账号变更记录 枚举
 *
 */
public enum ChangLogProxyEnum {
    /**
     * 代理
     */
    PASSWORD(21, "登陆密码"),//代理自身为自己修改；
    PAY_PASSWORD(22, "支付密码"),//代理自身为自己修改；
    PAYMENT_LOCK(23, "支付锁定"),//记录用户连续5次输入错误支付密码后锁定的节点；
    LOGIN_LOCK(24, "登录锁定"),//记录用户连续5次输入错误登陆密码后锁定的节点；
    CLUB_EDIT(25, "俱乐部编辑"),//仅总代账号具备编辑功能；
    LOGIN_LOCK_PARENT(26, "登陆权限"),//代理给直属和全部下级代理设置；
    OPEN_LOCK_PARENT(27, "开局权限"),//代理给直属和全部下级代理设置；
    PASSWORD_PARENT(28, "修改密码"),//代理给直属和全部下级代理设置；
    PAY_PASSWORD_PARENT(29, "支付密码重置"),//代理给直属和全部下级代理设置；




    ;
    public Integer code;
    public String desc;

    private ChangLogProxyEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(Integer code) {
        ChangLogProxyEnum changLogEnum = getByCode(code);
        return Objects.nonNull(changLogEnum) ? changLogEnum.desc : "";
    }

    public static ChangLogProxyEnum getByCode(Integer code) {
        for (ChangLogProxyEnum item : values()) {
            if (Objects.equals(item.code, code)) {
                return item;
            }
        }
        return null;
    }

}
