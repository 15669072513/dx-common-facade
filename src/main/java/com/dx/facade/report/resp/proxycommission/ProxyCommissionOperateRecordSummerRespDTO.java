package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionOperateRecordSummerRespDTO {
    @ApiModelProperty(value = "小计/总计-佣金-人民币")
    private BigDecimal receiveCommissionCNY;
    @ApiModelProperty(value = "小计/总计-佣金-越南盾")
    private BigDecimal receiveCommissionVND;
    @ApiModelProperty(value = "小计/总计-佣金-泰铢")
    private BigDecimal receiveCommissionTHB;
}
