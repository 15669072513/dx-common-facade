package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

public enum AccountI18n implements I18nEnum {

    SERVER_ERROR(1001)
    ;

    private int code;

    AccountI18n(Integer code){
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
