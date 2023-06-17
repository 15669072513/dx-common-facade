package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 注单详情请求对象
 */
@ApiModel("注单详情请求对象")
@Data
public class GameOrderRecordDetailVenueReq {
    /**
     * 注单
     */
    @ApiModelProperty("注单id")
    private Long id;
}
