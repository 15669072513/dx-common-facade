package com.dx.facade.message.websocket;

import lombok.Data;

/**
 * 公共父类,不要直接使用
 */
@Data
public abstract class WebsocketMessage {
    private int type; //消息类型: 1通知,2活动,3公告,4红利
    private String title; //消息标题

    private String titleEn;

    private String titleVi;

    private String titleTh;

    private String titleId;

    private String message; //消息内容

    private String messageEn;

    private String messageVi;

    private String messageTh;

    private String messageId;

}
