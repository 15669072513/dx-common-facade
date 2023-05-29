package com.dx.facade.payment.enums;

/**
 * 货币枚举
 * @author Nicolas
 * @version 1.0.0
 * @date 2020/10/15 10:43
 */
public enum CurrencyEnum {

    /**
     * id : 真人的货币代码  作为标准
     * tyCode : 体育的货币代码,对接体育的使用 tyCode
     */
    CNY(1,1,"CNY", "人民币"),
    KRW(2,10,"KRW", "韩元"),
    MYR(3,11,"MYR", "马来西亚币"),
    USD(4,2,"USD", "美元"),
    JPY(5,9,"JPY", "日元"),
    THB(6,12,"THB", "泰铢"),
    BTC(7,8,"BTC", "比特币"),
    VND(8,4,"VND", "越南盾"),
    EUR(9,7,"EUR", "欧元"),
    HKD(10,3,"HKD", "港币"),
    AUD(11,13,"AUD", "澳元"),
    TWD(12,14,"TWD", "台币"),
    SGD(13,5,"SGD", "新加坡币"),
    GBP(14,6,"GBP", "英镑");

    /**
     * 真人code
     */
    private final Integer id;

    /**
     * 体育code
     */
    private final Integer tyCode;

    /**
     * 名称
     */
    private final String name;

    /**
     * 描述
     */
    private final String desc;

    CurrencyEnum(Integer id, Integer tyCode, String name, String desc) {
        this.id = id;
        this.tyCode = tyCode;
        this.name = name;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTyCode() {
        return tyCode;
    }

    public String getName() {
        return name;
    }




    public static Integer getTyCodeByDesc(String desc) {
        for(CurrencyEnum currencyEnum : CurrencyEnum.values()){
            if (currencyEnum.desc.equals(desc)){
                return currencyEnum.getTyCode();
            }
        }
        return CurrencyEnum.CNY.getId();
    }

    /**
     * 通过体育币种code查找体育币种枚举
     * @param tyCode 体育币种code
     * @return
     */
    public static CurrencyEnum getTyCurrency(final Integer tyCode){
        for(CurrencyEnum currencyEnum : CurrencyEnum.values()){
            if(String.valueOf(currencyEnum.tyCode).equals(String.valueOf(tyCode))){
                return currencyEnum;
            }
        }
        return CurrencyEnum.CNY;
    }

    /**
     * 通过真人币种code查找真人币种枚举
     * @param zrCode 真人币种code
     * @return
     */
    public static CurrencyEnum getCurrency(final Integer zrCode){
        for(CurrencyEnum currencyEnum : CurrencyEnum.values()){
            if(String.valueOf(currencyEnum.id).equals(String.valueOf(zrCode))){
                return currencyEnum;
            }
        }
        return CurrencyEnum.CNY;
    }
}
