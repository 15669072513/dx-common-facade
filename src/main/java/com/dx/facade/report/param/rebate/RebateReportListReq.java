package com.dx.facade.report.param.rebate;

import com.dx.facade.report.param.base.MultiplyMerchantLocalDateReq;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 返水报表的请求对象
 */
@Data
public class RebateReportListReq extends MultiplyMerchantLocalDateReq {

    @ApiModelProperty(value = "场馆类型", required = true, example = "体育")
    private String venueTypeCode;
}
