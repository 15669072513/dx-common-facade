package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 牌局详情请求对象
 */
@ApiModel("牌局详情请求对象")
@Data
public class GameOrderRecordDetailReq extends BaseRequest {
    /**
     * 手牌id
     */
    @ApiModelProperty("手牌id")
    private Long handId;
}
