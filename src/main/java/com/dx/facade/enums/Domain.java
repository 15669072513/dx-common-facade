package com.dx.facade.enums;

import java.util.Objects;

public class Domain {

    public Domain() {

    }

    /**
     * 域名管理类型
     */
    public static enum EnumdomainNameType {
        活动分享(1, "活动分享"),
        FRIENDIN_VITATION(2, "好友邀请"),
        ;

        public Integer code;
        public String desc;

        private EnumdomainNameType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            Domain.EnumdomainNameType domainNameType = getType(code);
            return Objects.nonNull(domainNameType) ? domainNameType.desc : "";
        }

        public static Domain.EnumdomainNameType getType(Integer code) {
            Domain.EnumdomainNameType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Domain.EnumdomainNameType domainNameType = var1[var3];
                if (domainNameType.code.equals(code)) {
                    return domainNameType;
                }
            }

            return null;
        }
    }

    /**
     * 域名状态
     */
    public static enum EnumDomainStatusType {
        已停用(0, "已停用"),
        已启用(1, "已启用");

        public Integer code;
        public String desc;

        private EnumDomainStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            Domain.EnumDomainStatusType domainStatusType = getType(code);
            return Objects.nonNull(domainStatusType) ? domainStatusType.desc : "";
        }

        public static Domain.EnumDomainStatusType getType(Integer code) {
            Domain.EnumDomainStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Domain.EnumDomainStatusType domainStatusType = var1[var3];
                if (domainStatusType.code.equals(code)) {
                    return domainStatusType;
                }
            }

            return null;
        }
    }
}
