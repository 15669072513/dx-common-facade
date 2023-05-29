package com.dx.facade.enums;

/** The enum Commission operate type enum. */
public enum CommissionOperateTypeEnum {

    代发佣金(1, "代发佣金"),
    取消佣金(2, "取消佣金"),
    佣金加减(3, "佣金加减");

    private final Integer code;
    private final String msg;

    CommissionOperateTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

}
