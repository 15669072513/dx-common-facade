package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameOrderRecordUserHandReq extends BaseRequest {
    @ApiModelProperty("手牌id")
    private Long handId;
}
