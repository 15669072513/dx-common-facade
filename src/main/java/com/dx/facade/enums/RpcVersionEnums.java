package com.dx.facade.enums;

/**
 * RPC 接口版本相关
 */
public enum RpcVersionEnums {
    V1(1, "V1"), V2(2, "V2");

    private Integer code;
    //是否需要改变主表账户余额，有些冻结只需要记录流水
    private String name;

    private RpcVersionEnums(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public static RpcVersionEnums of(Integer code) {
        for (RpcVersionEnums versionEnums : values()) {
            if (versionEnums.getCode().equals(code)) {
                return versionEnums;
            }
        }
        return RpcVersionEnums.V1;
    }


}