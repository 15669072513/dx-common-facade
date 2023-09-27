package com.dx.facade.enums;

/**
 * 审核结果枚举
 */
public enum AuditResult {
    通过(1, "审核通过"),
    拒绝(2, "审核拒绝"),
    ;

    private Integer code;
    private String desc;

    AuditResult(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }
}
