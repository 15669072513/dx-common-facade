package com.dx.facade.account.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dealer
 * @description: 德州账变科目
 * @date 2024/1/20
 * @copyright
 */
public enum Subject {

    ADD("add","充值上分"),
    SUB("sub","提现下分"),
    CREDIT_ADD("credit_add","授信上分"),
    CREDIT_SUB("credit_sub","授信下分"),
    EXCHANGE("exchange","兑换筹码"),
    REVERT("revert","归还筹码"),
    TABLE_FEE("table_fee","局抽服务费"),
    DETAIL("detail","资金明细"),
    AGENT("agent","代理"),
    MEMBER("member","会员");

    private final String code;
    private final String desc;

    Subject(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private static Map<String, Subject> code2Enum = new HashMap<>();
    static {
        for (Subject value : Subject.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static Subject getByCode(Subject code){
        return code2Enum.get(code);
    }
}
