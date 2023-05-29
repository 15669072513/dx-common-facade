package com.dx.facade.enums;

public enum ProvideBonusTypeEnum {
    upgrade(1, "升级礼金"),
    birthday(2, "生日礼金"),
    up_month(3, "上半月红包"),
    down_month(4, "下半月红包"),
    member_rebate(5, "会员返水"),
    invite(6, "好友邀请_邀请任务"),
    bet(7, "好友邀请_投注任务"),
    deposit(8, "好友邀请_存款任务");;

    private Integer code;
    private String message;

    private ProvideBonusTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ProvideBonusTypeEnum getEleByCode(Integer code) {
        ProvideBonusTypeEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ProvideBonusTypeEnum e = var1[var3];
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
