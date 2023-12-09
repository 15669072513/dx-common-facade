package com.dx.facade.texas.dto;

public enum DownMsgType {
    GAME_OVER(1), //解散消息
    GAME_UP_REVERT(2), //游戏调用筹码退还
    ACCOUNT_REVERT(3), //dx-account筹码退还
    MIDDLE_DOWN(4), //中途带出
    ;
    DownMsgType(Integer type) {
        this.type = type;
    }
    Integer type;
    public Integer getType() {
        return type;
    }
}
