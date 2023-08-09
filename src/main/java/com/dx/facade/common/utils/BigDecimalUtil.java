package com.dx.facade.common.utils;

import java.math.BigDecimal;

public class BigDecimalUtil {

    /**
     * 安全相加，避免空指针
     *
     * @param originObj
     * @param plusObj
     * @return
     */
    public static final BigDecimal safeAdd(BigDecimal originObj, BigDecimal plusObj) {
        if (originObj == null) {
            return plusObj;
        }

        if (plusObj == null) {
            return originObj;
        }

        return originObj.add(plusObj);
    }

    /**
     * 拼接符号+金额
     * @param symbol
     * @param plusObj
     * @return
     */
    public static final String safeAddSymbol(String symbol, BigDecimal plusObj) {
        if (symbol == null || plusObj == null) {
            return symbol + 0;
        }
        return symbol + plusObj;
    }
}
