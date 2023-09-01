package com.dx.facade.enums;


import com.dx.facade.account.change.MemberBizType;

import java.util.HashMap;
import java.util.Map;

public enum LoanRepayEnum {

    借款(1, "借款"),
    还款(2, "还款");


    private final Integer code;

    private final String msg;

    LoanRepayEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }


    static Map<Integer, LoanRepayEnum> code2Enum = new HashMap<>();
    static {
        for (LoanRepayEnum value : LoanRepayEnum.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static LoanRepayEnum getType(Integer code) {
        return code2Enum.get(code);
    }
}
