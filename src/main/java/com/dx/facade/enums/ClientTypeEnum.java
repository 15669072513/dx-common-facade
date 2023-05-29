package com.dx.facade.enums;

public enum ClientTypeEnum {

    PC(1, "PC"),
    IOS_APP(2, "IOS_APP"),
    IOS_H5(3, "IOS_H5"),
    Android_H5(4, "Android_H5"),
    Android_APP(5, "Android_APP"),
    UNKNOWN(9, "UNKNOWN");

    private Integer clientType;

    private String desc;

    public Integer clientType() {
        return this.clientType;
    }

    public String desc() {
        return this.desc;
    }

    private ClientTypeEnum(Integer clientType, String desc) {
        this.clientType = clientType;
        this.desc = desc;
    }

    public static String getClientType(Integer clientType) {
        ClientTypeEnum[] var1 = values();
        int var2 = var1.length;
        for(int var3 = 0; var3 < var2; ++var3) {
            ClientTypeEnum depositStatus = var1[var3];
            if (depositStatus.clientType.equals(clientType)) {
                return depositStatus.desc;
            }
        }
        return null;
    }

}
