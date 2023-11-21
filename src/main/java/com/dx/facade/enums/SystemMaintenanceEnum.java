package com.dx.facade.enums;

import java.util.Arrays;


/**
 * 系统维护终端枚举*
 */
public enum SystemMaintenanceEnum {

    PC_CLIENT(1, "pc客户端"),
    PROXY_MANAGE(2, "代理后台");

    private final Integer id;
    private final String name;

    SystemMaintenanceEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static SystemMaintenanceEnum getById(Integer id) {
        return Arrays.stream(values()).filter(item -> item.id.equals(id)).findAny().orElse(null);
    }

}
