package com.dx.facade.report.enums;

import java.util.HashMap;
import java.util.Map;


public enum ProfitAndLossTypeEnum {

    net_amount(1, "场馆盈亏"),
    rebate_amount(2, "返水盈利"),
    member_valid_bet_amount(3, "有效投注");

    private Integer code;

    private String desc;

    ProfitAndLossTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    static Map<Integer, ProfitAndLossTypeEnum> code2Enum = new HashMap<>();
    static {
        for (ProfitAndLossTypeEnum value : ProfitAndLossTypeEnum.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static ProfitAndLossTypeEnum getByCode(Integer code){
        return code2Enum.get(code);
    }

}
