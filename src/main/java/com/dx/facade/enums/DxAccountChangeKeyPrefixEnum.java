package com.dx.facade.enums;

import java.util.Optional;

/**
 * 账户变更需要的key前缀
 */
public enum DxAccountChangeKeyPrefixEnum {

    DOWN_SCORE(1, "D", "解散下分"),
    MIDDLE_DOWN_SCORE(2, "MD", "中途下分"),
    REVERT_DOWN_SCORE(3, "RD", "筹码退还"),
    REVERT_JOB_UP_SCORE(4, "RU", "筹码退还job"),
    DOWN_SCORE_WITH_FEE(5, "DF", "解散下分包含手续费");

    private Integer code;
    private String prefix;
    private String desc;

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }


    private DxAccountChangeKeyPrefixEnum(Integer code, String prefix, String desc) {
        this.code = code;
        this.desc = desc;
        this.prefix = prefix;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getPrefix() {
        return prefix;
    }

    public static Optional<DxAccountChangeKeyPrefixEnum> of(Integer code) {
        for (DxAccountChangeKeyPrefixEnum freezeTypeEnum : values()) {
            if (freezeTypeEnum.getCode().equals(code)) {
                return Optional.of(freezeTypeEnum);
            }
        }
        return Optional.empty();
    }

}
