package com.dx.facade.auth.domain.enums;

/**
 *
 * 表示权限的类型
 *
 * @author author
 * @date 2020/9/10 02:03
 * @version 0.1
 */
public enum PermissionTypeEnum {

    /**
     * 表示不同类型的权限
     */
    MENU_PERMISSION("0","菜单权限"),

    BUTTON_PERMISSION("1","按钮权限"),

    PASS_PERMISSION("3","放行权限"),

    DATA_PERMISSION("4", "数据权限")

    ;

    /**
     * 表示对应的code
     */
    private final String code;

    /**
     * 注释
     */
    private final String comment;

    PermissionTypeEnum(String code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public String getCode() {
        return code;
    }

    public String getComment() {
        return comment;
    }
}
