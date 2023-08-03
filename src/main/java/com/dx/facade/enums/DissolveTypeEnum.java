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
     * 服务端超时自动解散
     */
    OVERTIME_DISSOLVE(2, "服务端超时自动解散"),

    /***
     * 正常结束
     */
    NORMAL_ENDED(3, "正常结束"),

    /**
     * 游戏端超时自动解散
     */
    GAME_OVERTIME_DISSOLVE(4, "游戏端超时自动解散");

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
