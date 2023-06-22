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
public class GameOrderRecordDetailReq {
    /**
     * 注单
     */
    @ApiModelProperty("注单id")
    private String id;
    @ApiModelProperty("场馆类型code(如zr,ty,qkl)")
    private String venueTypeCode;
    @ApiModelProperty("会员id")
    private String userId;
}
