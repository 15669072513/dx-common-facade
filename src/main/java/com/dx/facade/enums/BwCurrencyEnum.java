package com.dx.facade.enums;

import lombok.Data;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 包网货币枚举
 */
public enum BwCurrencyEnum {
    //CNY("CNY", "人民币", "¥"),
    CNY(1, "CNY", "美元", "$"),
    VND(8,"VND", "越南盾", "₫"),
    THB(6,"THB", "泰铢", "฿"),
    USDT(4,"USDT", "美元", "$"),
    ;
    private Integer codeNumber;
    private String code;
    private String desc;
    private String symbol;

    BwCurrencyEnum(String code, String desc, String symbol) {
        this.code = code;
        this.desc = desc;
        this.symbol = symbol;
    }

    BwCurrencyEnum(Integer codeNumber, String code, String desc, String symbol) {
        this.codeNumber = codeNumber;
        this.code = code;
        this.desc = desc;
        this.symbol = symbol;
    }

    public Integer getCodeNumber() {
        return codeNumber;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getSymbol() {
        return symbol;
    }

    public static String getDesc(String str) {
        BwCurrencyEnum anEnum = getType(str);
        return Objects.nonNull(anEnum) ? anEnum.desc : "";
    }

    public static String getSymbol(String str) {
        BwCurrencyEnum anEnum = getType(str);
        return Objects.nonNull(anEnum) ? anEnum.symbol : "";
    }

    public static String getCode(String str) {
        BwCurrencyEnum anEnum = getType(str);
        return Objects.nonNull(anEnum) ? anEnum.code : "";
    }
    public static BwCurrencyEnum getType(String str) {
        BwCurrencyEnum[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            BwCurrencyEnum anEnum = var1[var3];
            if (anEnum.code.equals(str) || anEnum.symbol.equals(str) || anEnum.desc.equals(str)) {
                return anEnum;
            }
        }

        return null;
    }

    public static BwCurrencyEnum fromCodeNumber(Integer str) {
        BwCurrencyEnum[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            BwCurrencyEnum anEnum = var1[var3];
            if (anEnum.codeNumber.equals(str)) {
                return anEnum;
            }
        }

        return null;
    }
    public static String getSymbolAmount(String str, BigDecimal decimal) {

        BwCurrencyEnum anEnum = getType(str);
        String symbol = Objects.nonNull(anEnum) ? anEnum.symbol : "";
        String res;
        switch (symbol) {
            case "¥":
                res = format("¥ ###,###.##", decimal);
                break;
            case "₫":
                res = format("₫ ###,###.##K", decimal.divide(BigDecimal.valueOf(1000)));
                break;
            case "฿":
                res = format("฿ ###,###.##", decimal);
                break;
            case "$":
                res = format("$ ###,###.##", decimal);
                break;
            default:
                res = "";
                break;
        }
        return res;
    }


    private static String format(String pattern, BigDecimal decimal) {

        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(decimal);

    }

    public static void main(String[] args) {

        String symbol = getSymbolAmount("CNY", BigDecimal.valueOf(21241121120.541));
        String symbol2 = getSymbolAmount("VND", BigDecimal.valueOf(21241121120L));
        String symbol3 = getSymbolAmount("THB", BigDecimal.valueOf(21241121120.541));

        System.out.println(symbol);
        System.out.println(symbol2);
        System.out.println(symbol3);
    }

}
