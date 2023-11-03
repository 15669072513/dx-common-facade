package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 牌局消息信息表
 */
@Data
public class GameRecordMsgResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "牌桌主键")
    private Long tableId;

    @ApiModelProperty(value = "牌桌编码")
    private String tableCode;

    @ApiModelProperty(value = "手牌编码")
    private String handCode;

    @ApiModelProperty(value = "局次")
    private Integer handNum;

    @ApiModelProperty(value = "状态：0待消费 1已消费")
    private Integer status;

    @ApiModelProperty(value = "业务编码")
    private String businessCode;

    @ApiModelProperty(value = "链路Id")
    private String linkId;

    @ApiModelProperty(value = "消息Id")
    private String msgId;

    @ApiModelProperty(value = "消息内容")
    private String message;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;
}
