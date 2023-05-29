package com.dx.facade.enums;

public enum ProvideBonusStatusEnum {
    wait(0, "待发放"),
    already(1, "已发放"),
    timeout(2, "领取过期");

    private Integer code;
    private String message;

    private ProvideBonusStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ProvideBonusStatusEnum getEleByCode(Integer code) {
        ProvideBonusStatusEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ProvideBonusStatusEnum e = var1[var3];
            if (e.getCode().equals(code)) {
                return e;
            }
        }

        return null;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
