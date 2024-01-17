package com.dx.facade.common.utils;

import com.dx.facade.enums.BwCurrencyEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;

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


    /**
     * 截断4位，BigDecimal.ZERO
     * @param pureAssetAmount
     * @return
     */
    public static BigDecimal validScale(BigDecimal pureAssetAmount) {
        return pureAssetAmount == null ? BigDecimal.ZERO.setScale(4)
                : pureAssetAmount.setScale(4, RoundingMode.DOWN);
    }

    public static String validScaleStr(BigDecimal pureAssetAmount, int digits) {
        return validScale(pureAssetAmount, digits).toPlainString();
    }

    public static String validScaleAndFormat(String currency, BigDecimal pureAssetAmount, int digits) {
        return BwCurrencyEnum.getSymbolAmount(currency, validScale(pureAssetAmount, digits));
    }

    public static BigDecimal validScale(BigDecimal pureAssetAmount, int digits) {
        return pureAssetAmount == null ? BigDecimal.ZERO.setScale(digits).stripTrailingZeros()
                : pureAssetAmount.setScale(digits, RoundingMode.DOWN).stripTrailingZeros();
    }

    /**
     * null转为BigDecimal.ZERO
     * @param balanceAmt
     * @return
     */
    public static BigDecimal validBigDecimal(BigDecimal balanceAmt) {
        return balanceAmt == null ? BigDecimal.ZERO : balanceAmt;
    }
}
