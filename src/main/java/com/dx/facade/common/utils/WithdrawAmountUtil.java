package com.dx.facade.common.utils;

import com.dx.facade.enums.BwCurrencyEnum;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Objects;

/**
 * @author orbit
 * @datetime 2023-10-05 19:16
 * @desc 根据提现额度，转换不同币种对应值
 */
public class WithdrawAmountUtil {
    public static BigDecimal getUsdtAmount(BigDecimal amount,BigDecimal usdtRate, String currency) {
        if(Objects.isNull(amount) || Objects.isNull(usdtRate) || StringUtils.isBlank(currency)) {
            throw new IllegalArgumentException("参数错误");
        }
        if(Objects.equals(currency, BwCurrencyEnum.USDT.getCode())) {
            return amount;
        }
        if(Objects.equals(currency, BwCurrencyEnum.CNY.getCode())) {
            return amount.divide(usdtRate, 4, RoundingMode.DOWN);
        }
        throw new IllegalArgumentException("非法币种类型:" + currency);
     }

    public static BigDecimal getCnyAmount(BigDecimal amount, BigDecimal usdtRate, String currency) {
        if(Objects.isNull(amount) || Objects.isNull(usdtRate) || StringUtils.isBlank(currency)) {
            throw new IllegalArgumentException("参数错误");
        }
        if(Objects.equals(currency, BwCurrencyEnum.CNY.getCode())) {
            return amount;
        }
        if(Objects.equals(currency, BwCurrencyEnum.USDT.getCode())) {
            return amount.multiply(usdtRate).setScale(4, RoundingMode.DOWN);
        }
        throw new IllegalArgumentException("非法币种类型:" + currency);
    }
}
