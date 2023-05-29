package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RebateReportRespDTO extends RebateReportBaseRespDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "场馆id", required = true, example = "2355343463")
    private Long venueId;

    @ApiModelProperty(value = "场馆名称", required = true, example = "OB体育")
    private String venueName;

    @ApiModelProperty(value = "场馆类型名称", required = true, example = "体育")
    private String venueTypeName;

    @ApiModelProperty(value = "场馆类型代码", required = true, example = "tiyucode")
    private String venueTypeCode;

}
