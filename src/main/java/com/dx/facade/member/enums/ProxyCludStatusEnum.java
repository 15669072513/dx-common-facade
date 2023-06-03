package com.dx.facade.member.enums;
/**
 * 代理俱乐部状态枚举
 * 
 * @author bicycle
 *
 */
public enum ProxyCludStatusEnum {

	NOT_ENABLED(0, "未启用"),
	ENABLED(1, "已启用"),
	DISSOLVED(-1,"已解散"),
    ;

    private Integer code;
    private String desc;

    ProxyCludStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static ProxyCludStatusEnum getType(Integer code) {
        for (ProxyCludStatusEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
