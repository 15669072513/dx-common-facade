package com.dx.facade.enums;

import java.util.Objects;

/**
 * 风控黑名单 相关枚举
 *
 * @author fitz
 * @version 1.0.0
 * @since 2022年02月19日
 */
public class WindControlBlackListEnums {

    public WindControlBlackListEnums() {
    }
	
	/**
	 * 风控类型，1，登录IP，2：注册IP，3：登录设备，4：注册设备
	 */
	public static enum TypeId {
        LOGIN_IP(1, "登录IP"),
        REGISTER_IP(2, "注册IP"),
        LOGIN_DEVICE_NO(3, "登录设备"),
        REGISTER_DEVICE_NO(4, "注册设备");

        public Integer code;
        public String desc;

        private TypeId(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getDesc(Integer code) {
            TypeId contractTemplateType = this.getType(code);
            return Objects.nonNull(contractTemplateType) ? contractTemplateType.desc : "";
        }

        public TypeId getType(Integer code) {
            TypeId[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                TypeId contractTemplateType = var1[var3];
                if (contractTemplateType.code.equals(code)) {
                    return contractTemplateType;
                }
            }

            return null;
        }
    }
}
