package com.dx.facade.message.dto;

import lombok.Data;


@Data
public class SendMsgReq {

    /**
     * 发送系统code(德州游戏：1000;场馆：2000；资金：3000)
     */
    private String systemCode;

    /**
     * 发送群组id
     */
    private String groupId;

    /**
     * 发送消息内容
     */
    private MsgBean msgBean;

}
