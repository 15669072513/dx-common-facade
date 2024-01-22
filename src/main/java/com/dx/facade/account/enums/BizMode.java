package com.dx.facade.account.enums;

/**
 * @author Dealer
 * @description:
 * @date 2024/01/17
 * @copyright
 */
public enum BizMode {

    全模式(0, "全模式"),
    现金模式(1, "现金模式"),
    信用模式(2, "信用模式");

    private Integer code;

    private String desc;

    BizMode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
