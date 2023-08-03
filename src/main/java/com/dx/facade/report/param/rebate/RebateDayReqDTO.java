package com.dx.facade.report.param.rebate;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class RebateDayReqDTO {

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;


}
