package com.dx.facade.enums;

/**
 * @author: broadway
 * @description 牌桌状态
 * @date 2023-06-20
 */
public enum DissolveTypeEnum {

    /***
     * 强制解散
     */
    FORCE_DISSOLVE(0, "强制解散"),

    /***
     * 房间内解散
     */
    HOUSE_DISSOLVE(1, "房间内解散"),


    /***
     * 超时自动解散
     */
    OVERTIME_DISSOLVE(2, "超时自动解散"),

    /***
     * 正常结束
     */
    NORMAL_ENDED(3, "正常结束");


    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }



    private int code;

    private String desc;

    DissolveTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
