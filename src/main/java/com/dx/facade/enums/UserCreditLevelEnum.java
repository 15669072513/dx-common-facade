package com.dx.facade.enums;

/**
 * 会员信用等级枚举
 */
public enum UserCreditLevelEnum {
    零(0),
    一(1),
    二(2),
    三(3),
    四(4),
    五(5),
    六(6),
    七(7),
    八(8),
    九(9),
    ;

    public Integer code;

    UserCreditLevelEnum(Integer code){
        this.code = code;
    }

    public static UserCreditLevelEnum getType(Integer code) {
        UserCreditLevelEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            UserCreditLevelEnum anEnum = var1[var3];
            if (anEnum.code.equals(code)) {
                return anEnum;
            }
        }
        return null;
    }
}
