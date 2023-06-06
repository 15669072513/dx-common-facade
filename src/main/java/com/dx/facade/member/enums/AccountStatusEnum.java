package com.dx.facade.member.enums;

import java.util.Objects;

/**
 * 代理、会员账号状态 枚举
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/17 18:29:27
 */
public class AccountStatusEnum {

    public static enum ProxyAccountStatusEnum {
        正常("1", "正常"),
        充提锁定("2", "充提锁定"),
        登录锁定("3", "登录锁定");

        public String code;
        public String desc;

        private ProxyAccountStatusEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ProxyAccountStatusEnum proxyAccountStatusEnum = getType(code);
            return Objects.nonNull(proxyAccountStatusEnum) ? proxyAccountStatusEnum.desc : "";
        }

        public static ProxyAccountStatusEnum getType(Integer code) {
            ProxyAccountStatusEnum[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ProxyAccountStatusEnum proxyAccountStatusEnum = var1[var3];
                if (proxyAccountStatusEnum.code.equals(code)) {
                    return proxyAccountStatusEnum;
                }
            }
            return null;
        }
    }

    public static enum MemberAccountStatusEnum {
        正常("1", "正常"),
        充提锁定("2", "充提锁定"),
        登录锁定("3", "登录锁定"),
        游戏锁定("4", "游戏锁定");

        public String code;
        public String desc;

        private MemberAccountStatusEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(String code) {
            MemberAccountStatusEnum memberAccountStatusEnum = getType(code);
            return Objects.nonNull(memberAccountStatusEnum) ? memberAccountStatusEnum.desc : "";
        }

        public static MemberAccountStatusEnum getType(String code) {
            MemberAccountStatusEnum[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                MemberAccountStatusEnum memberAccountStatusEnum = var1[var3];
                if (memberAccountStatusEnum.code.equals(code)) {
                    return memberAccountStatusEnum;
                }
            }
            return null;
        }
    }

    /**
     * 锁定状态枚举，充提登录游戏公用此枚举，后续若有差异再单独新定义枚举
     */
    public static enum LockStatus {
        UN_LOCK(0, "未锁定"),
        LOCK(1, "已锁定");

        public int code;
        public String desc;

        LockStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }

    public static enum needChgPasswordEnum {
        NO_CHANGE(0, "不需要修改密码"),
        NEED_CHANGE(1, "需要修改密码");

        public int code;
        public String desc;

        needChgPasswordEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
    /**
     * 是否首次登录
     * 
     * @author bicycle
     *
     */
    public static enum IsFirstLoginEnum {
        NOT_FIRST_LOGIN(0, "非首次登录"),
        FIRST_LOGIN(1, "首次登录");

        public int code;
        public String desc;

        IsFirstLoginEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
}
