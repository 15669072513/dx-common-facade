package com.dx.facade.message.websocket;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WebsocketMessageBonus {
    private int type; //消息类型: 1通知,2活动,3公告,4红利
    private Long messageId;
    private String businessId;
    private BigDecimal bonusAmount;
    private BigDecimal billAmount;
    private String remark;
    private Long inviteUserId;
    private String inviteUserName;
    
}
