package com.dx.facade.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务模式：0-信用+现金，1-现金业务，2-信用业务
 *
 * @author orbit
 */
public enum BizModelEnum {
    MIX(0, "信用+现金业务"),
    CASH(1, "现金业务"),
    CREDIT(2, "信用业务");

    private Integer code;
    private String desc;

    BizModelEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    private static Map<Integer, BizModelEnum> code2Enum = new HashMap<>();

    static {
        for (BizModelEnum modelEnum : BizModelEnum.values()) {
            code2Enum.put(modelEnum.code, modelEnum);
        }
    }

    public static BizModelEnum getByCode(Integer code) {
        return code2Enum.get(code);
    }

    /**
     * @author Dealer
     * @description: 是否允许混合模式
     * @date 2024/1/18
     * @copyright
     */
    public static boolean isMixAllowed(Integer mode) {
        return mode != null && mode.intValue() == BizModelEnum.MIX.code();
    }

    /**
     * @author Dealer
     * @description: 是否允许现金模式
     * @date 2024/1/18
     * @copyright
     */
    public static boolean isCashAllowed(Integer mode) {
        return (mode != null && mode.intValue() == BizModelEnum.CASH.code()) || isMixAllowed(mode);
    }

    /**
     * @author Dealer
     * @description: 是否允许信用模式
     * @date 2024/1/18
     * @copyright
     */
    public static boolean isCreditAllowed(Integer mode) {
        return (mode != null && mode.intValue() == BizModelEnum.CREDIT.code()) || isMixAllowed(mode);
    }
}