package com.dx.facade.game.resp;

import lombok.Data;

@Data
public class GameBaseResp {

    private Integer code;
    /**
     * 表示各自的原始状态吗
     */
    private String originCode;
    /**
     * 消息说明
     */
    private String message;

    /**
     * 服务器返回的消息详细信息
     */
    private String detail;

    public GameBaseResp(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public GameBaseResp(int code, String message, String originCode) {
        this.code = code;
        this.message = message;
        this.originCode = originCode;
    }

    public GameBaseResp() {

    }
}
