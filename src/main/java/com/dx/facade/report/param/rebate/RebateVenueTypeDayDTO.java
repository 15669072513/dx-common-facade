package com.dx.facade.report.param.rebate;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RebateVenueTypeDayDTO {

    @ApiModelProperty(value = "项目名称")
    private String venueName;

    @ApiModelProperty(value = "返点金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "返点比例")
    private BigDecimal rebateRate;

    @ApiModelProperty(value = "投注金额")
    private BigDecimal validBetAmount;



}
