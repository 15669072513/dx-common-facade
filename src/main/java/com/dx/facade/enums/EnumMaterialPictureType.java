package com.dx.facade.enums;

import java.util.Objects;

public enum EnumMaterialPictureType {
    综合推广图(1, "综合推广图"),
    体育推广图(2, "体育推广图"),
    真人推广图(3, "真人推广图"),
    电竞推广图(4, "电竞推广图"),
    彩票推广图(5, "彩票推广图"),
    棋牌推广图(6, "棋牌推广图"),
    活动推广图(7, "活动推广图");

    public Integer code;
    public String desc;

    private EnumMaterialPictureType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(Integer code) {
        EnumMaterialPictureType materialPictureType = getType(code);
        return Objects.nonNull(materialPictureType) ? materialPictureType.desc : "";
    }

    public static EnumMaterialPictureType getType(Integer code) {
        EnumMaterialPictureType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            EnumMaterialPictureType materialPictureType = var1[var3];
            if (materialPictureType.code.equals(code)) {
                return materialPictureType;
            }
        }

        return null;
    }
}
