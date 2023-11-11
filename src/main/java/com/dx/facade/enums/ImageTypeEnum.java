package com.dx.facade.enums;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 图片类型枚举：1.人工加额，2-人工减额，3-取款审核
 */
public enum ImageTypeEnum {
    人工加额(1, "人工加额"),
    人工减额(2,"人工减额"),
    取款审核(3,"取款审核"),
    ;
    private Integer code;
    private String desc;

    ImageTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }



    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
