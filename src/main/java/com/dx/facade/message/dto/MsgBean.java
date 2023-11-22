package com.dx.facade.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class MsgBean {

    /**
     * 消息唯一id
     */
    private String messageId;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 消息具体内容
     */
    private String contentMsg;

    /**
     * 操作时间
     */
    private String operateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * title
     */
    private String title;

}
