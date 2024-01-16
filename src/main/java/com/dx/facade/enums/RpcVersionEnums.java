package com.dx.facade.enums;

import com.dx.exception.BizException;

import java.util.Arrays;

/**
 * RPC 接口版本相关
 */
public enum RpcVersionEnums {
    V1(1, "V1");

    private Integer code;
    //是否需要改变主表账户余额，有些冻结只需要记录流水
    private String desc;

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }


    private RpcVersionEnums(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}