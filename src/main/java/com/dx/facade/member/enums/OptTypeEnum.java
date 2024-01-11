package com.dx.facade.member.enums;

import java.util.Objects;

public enum OptTypeEnum {
    ADD(1,"新增"),
    EDIT(2, "编辑"),
    HIDE(3,"隐藏"),
    SHOW(4,"显示"),
    ENABLE(5,"启用"),
    DISABLE(6, "停用"),;
    private Integer code;
    private String desc;

    OptTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static OptTypeEnum get(Integer code) {
        OptTypeEnum[] values = OptTypeEnum.values();
        for (OptTypeEnum e : values) {
            if(Objects.equals(code, e.code)) {
                return e;
            }
        }
        return null;
    }

    public Integer code() {
        return this.code;
    }
    public String desc() {
        return this.desc;
    }
}
