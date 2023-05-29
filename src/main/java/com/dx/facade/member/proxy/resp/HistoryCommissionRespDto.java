package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HistoryCommissionRespDto {

    @ApiModelProperty(value = "月份")
    private Long month;

    @ApiModelProperty(value = "佣金额")
    private BigDecimal commissionAmount;

}
