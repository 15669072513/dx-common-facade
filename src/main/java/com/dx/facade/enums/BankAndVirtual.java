package com.dx.facade.enums;

import java.util.Objects;

public class BankAndVirtual {
	
	public enum Status {
		DISABLE(0, "禁用"),
		ENABLE(1, "可用");
        
        private Integer code;
        private String desc;

        Status(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }
	}
	
	public enum BlacklistStatus{
		DISABLE(0, "禁用中"),
		ENABLE(1, "启用中");
        
        private Integer code;
        private String desc;

        BlacklistStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }
	}
	
	public enum BindStatus{
		UNBIND(0, "未绑定"),
		BIND(1, "已绑定");
        
        private Integer code;
        private String desc;

        BindStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }
	}
	
	public enum OperateType{
		UNBIND(0, "解绑"),
		BIND(1, "绑定"),
		UNDERCARRIAGE(2,"下架"),
		ENABLE(3, "启用"),
		DISABLE(4, "禁用");
        
        private Integer code;
        private String desc;

        OperateType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }
	}

    public enum BankCardEnum{
        ABC("ABC", "中国农业银行"),
        BCM("BCM", "交通银行"),
        BOC("BOC", "中国银行"),
        CCB("CCB", "中国建设银行"),
        CEB("CEB", "中国光大银行"),
        CGB("CGB", "广发银行"),
        CIB("CIB", "兴业银行"),
        CMB("CMB", "招商银行"),
        CMBC("CMBC", "中国民生银行"),
        CNCB("CNCB", "中信银行"),
        HXB("HXB", "华夏银行"),
        ICBC("ICBC", "中国工商银行"),
        PAB("PAB", "平安银行"),
        PSBC("PSBC", "中国邮政储蓄银行"),
        SPDB("SPDB", "上海浦东发展银行");

        private String code;
        private String desc;

        BankCardEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static String getDesc(String code) {
            BankAndVirtual.BankCardEnum applyType = getType(code);
            return Objects.nonNull(applyType) ? applyType.desc : "";
        }

        public static BankAndVirtual.BankCardEnum getType(String code) {
            BankAndVirtual.BankCardEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                BankAndVirtual.BankCardEnum terminalType = var1[var3];
                if (terminalType.code.equals(code)) {
                    return terminalType;
                }
            }
            return null;
        }
    }

    public enum EnumBlackStatusType {
        禁用中(0, "禁用中"),
        启用中(1, "启用中");

        public Integer code;
        public String desc;

        private EnumBlackStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            BankAndVirtual.EnumBlackStatusType blackStatusType = getType(code);
            return Objects.nonNull(blackStatusType) ? blackStatusType.desc : "";
        }

        public static BankAndVirtual.EnumBlackStatusType getType(Integer code) {
            BankAndVirtual.EnumBlackStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                BankAndVirtual.EnumBlackStatusType blackStatusType = var1[var3];
                if (blackStatusType.code.equals(code)) {
                    return blackStatusType;
                }
            }

            return null;
        }
    }

    public enum EnumBindType {
        解绑(0, "解绑"),
        绑定(1, "绑定"),
        下架(2, "下架"),
        启用(3, "启用"),
        禁用(4, "禁用");

        public Integer code;
        public String desc;

        EnumBindType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            BankAndVirtual.EnumBindType bindType = getType(code);
            return Objects.nonNull(bindType) ? bindType.desc : "";
        }

        public static BankAndVirtual.EnumBindType getType(Integer code) {
            BankAndVirtual.EnumBindType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                BankAndVirtual.EnumBindType bindType = var1[var3];
                if (bindType.code.equals(code)) {
                    return bindType;
                }
            }

            return null;
        }
    }
}
