package com.dx.facade.enums;

import java.util.Objects;

/**
 * 新增商户审核状态枚举
 */
public enum BwAuditStatusEnum {
	
	TO_BE_PROCESSED(0, "待处理"),
	PROCESSING(1, "处理中"),
	PASSED(2, "审核通过"),
	REJECT(3, "审核拒绝"),
	;


    private Integer code;
    private String desc;

    BwAuditStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
	
	public static String getDesc(Integer code) {
		BwAuditStatusEnum anEnum = getType(code);
		return Objects.nonNull(anEnum) ? anEnum.desc : "";
	}
	
	public static BwAuditStatusEnum getType(Integer code) {
		BwAuditStatusEnum[] var1 = values();
		int var2 = var1.length;
		
		for(int var3 = 0; var3 < var2; ++var3) {
			BwAuditStatusEnum anEnum = var1[var3];
			if (anEnum.code.equals(code)) {
				return anEnum;
			}
		}
		
		return null;
	}

}
