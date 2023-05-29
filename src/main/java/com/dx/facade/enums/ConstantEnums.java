package com.dx.facade.enums;

import java.util.Objects;

public class ConstantEnums {
    public ConstantEnums() {
    }

    public static enum EnumWindLevelType {
        风险会员(1, "风险会员"),
        风险代理(2, "风险代理"),
        风险银行卡(3, "风险银行卡"),
        风险虚拟账号(4, "风险虚拟账号"),
        风险IP(5, "风险IP"),
        风险终端号(6, "风险终端号");

        public Integer code;
        public String desc;

        private EnumWindLevelType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            EnumWindLevelType windLevelType = getType(code);
            return Objects.nonNull(windLevelType) ? windLevelType.desc : "";
        }

        public static EnumWindLevelType getType(Integer code) {
            EnumWindLevelType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                EnumWindLevelType windLevelType = var1[var3];
                if (windLevelType.code.equals(code)) {
                    return windLevelType;
                }
            }

            return null;
        }
    }

    public static enum EnumBindStatusType {
        待绑定(0, "待绑定"),
        绑定中(1, "绑定中");

        public Integer code;
        public String desc;

        private EnumBindStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            EnumBindStatusType bindStatusType = getType(code);
            return Objects.nonNull(bindStatusType) ? bindStatusType.desc : "";
        }

        public static EnumBindStatusType getType(Integer code) {
            EnumBindStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                EnumBindStatusType bindStatusType = var1[var3];
                if (bindStatusType.code.equals(code)) {
                    return bindStatusType;
                }
            }

            return null;
        }
    }

    public static enum EnumBetStatusType {
        未结算(0, "未结算"),
        已结算(1, "已结算"),
        不结算(2, "已取消");

        public Integer code;
        public String desc;

        private EnumBetStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            EnumBetStatusType betStatusType = getType(code);
            return Objects.nonNull(betStatusType) ? betStatusType.desc : "";
        }

        public static EnumBetStatusType getType(Integer code) {
            EnumBetStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                EnumBetStatusType betStatusType = var1[var3];
                if (betStatusType.code.equals(code)) {
                    return betStatusType;
                }
            }

            return null;
        }
    }

    public static enum EnumAccountStatusType {
        正常(1, "正常"),
        登录锁定(2, "登录锁定"),
        游戏锁定(3, "游戏锁定"),
        充提锁定(4, "充提锁定");

        public Integer code;
        public String desc;

        private EnumAccountStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ConstantEnums.EnumAccountStatusType accountStatusType = getType(code);
            return Objects.nonNull(accountStatusType) ? accountStatusType.desc : "";
        }

        public static ConstantEnums.EnumAccountStatusType getType(Integer code) {
            ConstantEnums.EnumAccountStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ConstantEnums.EnumAccountStatusType accountStatusType = var1[var3];
                if (accountStatusType.code.equals(code)) {
                    return accountStatusType;
                }
            }

            return null;
        }
    }

    public static enum EnumEntrAuthorityType {
        关闭(0, "关闭"),
        开启(1, "开启");

        public Integer code;
        public String desc;

        private EnumEntrAuthorityType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            EnumEntrAuthorityType enumEntrAuthorityType = getType(code);
            return Objects.nonNull(enumEntrAuthorityType) ? enumEntrAuthorityType.desc : "";
        }

        public static EnumEntrAuthorityType getType(Integer code) {
            EnumEntrAuthorityType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                EnumEntrAuthorityType enumEntrAuthorityType = var1[var3];
                if (enumEntrAuthorityType.code.equals(code)) {
                    return enumEntrAuthorityType;
                }
            }

            return null;
        }
    }

    public static enum UserType {
        member(0, "会员"),
        agent(1, "代理");

        private Integer code;
        private String desc;

        UserType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }
    }

    public static enum EnumGenderType {
        女(0, "女"),
        男(1, "男");

        public Integer code;
        public String desc;

        private EnumGenderType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ConstantEnums.EnumGenderType genderType = getType(code);
            return Objects.nonNull(genderType) ? genderType.desc : "";
        }

        public static ConstantEnums.EnumGenderType getType(Integer code) {
            ConstantEnums.EnumGenderType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ConstantEnums.EnumGenderType genderType = var1[var3];
                if (genderType.code.equals(code)) {
                    return genderType;
                }
            }

            return null;
        }
    }

    public static enum EnumClientDeviceType {
        PC(1, "PC"),
        IOS_APP(2, "IOS_APP"),
        IOS_H5(3, "IOS_H5"),
        Android_H5(4, "Android_H5"),
        Android_APP(5, "Android_APP");

        public Integer code;
        public String desc;

        private EnumClientDeviceType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ConstantEnums.EnumClientDeviceType clientDeviceType = getType(code);
            return Objects.nonNull(clientDeviceType) ? clientDeviceType.desc : "";
        }

        public static ConstantEnums.EnumClientDeviceType getType(Integer code) {
            ConstantEnums.EnumClientDeviceType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ConstantEnums.EnumClientDeviceType clientDeviceType = var1[var3];
                if (clientDeviceType.code.equals(code)) {
                    return clientDeviceType;
                }
            }

            return null;
        }

        public static Boolean ifClient(Integer code) {
            ConstantEnums.EnumClientDeviceType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ConstantEnums.EnumClientDeviceType clientDeviceType = var1[var3];
                if (clientDeviceType.code.equals(code)) {
                    return true;
                }
            }

            return false;
        }

        public static Integer getBigType(Integer code) {
            if (!code.equals(IOS_APP.code) && !code.equals(Android_APP.code)) {
                return !code.equals(IOS_H5.code) && !code.equals(Android_H5.code) ? 2 : 1;
            } else {
                return 0;
            }
        }
    }


    public static enum EnumDeviceType {
        PC(1, "PC"),
        IOS_APP(2, "IOS_APP"),
        IOS_H5(3, "IOS_H5"),
        Android_H5(4, "Android_H5"),
        Android_APP(5, "Android_APP"),
        后台(6, "后台"),
//        UNKNOWN(9, "未知")
        ;

        public Integer code;
        public String desc;

        EnumDeviceType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ConstantEnums.EnumDeviceType deviceType = getType(code);
            return Objects.nonNull(deviceType) ? deviceType.desc : "";
        }

        public static ConstantEnums.EnumDeviceType getType(Integer code) {
            ConstantEnums.EnumDeviceType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ConstantEnums.EnumDeviceType deviceType = var1[var3];
                if (deviceType.code.equals(code)) {
                    return deviceType;
                }
            }

            return null;
        }
    }

    public static enum EnumAuditStepType {
        结单查看(0, "结单查看"),
        审核(1, "审核");

        public Integer code;
        public String desc;

        private EnumAuditStepType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            ConstantEnums.EnumAuditStepType auditStepType = getType(code);
            return Objects.nonNull(auditStepType) ? auditStepType.desc : "";
        }

        public static ConstantEnums.EnumAuditStepType getType(Integer code) {
            ConstantEnums.EnumAuditStepType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ConstantEnums.EnumAuditStepType auditStepType = var1[var3];
                if (auditStepType.code.equals(code)) {
                    return auditStepType;
                }
            }

            return null;
        }
    }


}
