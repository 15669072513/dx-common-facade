package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


@ApiModel("牌局消息信息表请求类")
@Data
public class GameRecordMsgReq extends BaseRequest {

    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty(value = "牌桌编码")
    private String tableCode;

    @ApiModelProperty(value = "业务编码")
    private String businessCode;

    @ApiModelProperty("手牌Code")
    private String handCode;

    @ApiModelProperty(value = "局次")
    private Integer handNum;

    @ApiModelProperty(value = "结束时间(时间戳)")
    private Long recordCreateTime;
}
