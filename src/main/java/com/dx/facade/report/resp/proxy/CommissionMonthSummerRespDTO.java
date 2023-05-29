package com.dx.facade.report.resp.proxy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "业务报表>佣金报表小计/总计返回", description = "业务报表>佣金报表小计/总计返回")
public class CommissionMonthSummerRespDTO implements Serializable {

    @ApiModelProperty("小计/总计-发放佣金-人民币")
    private BigDecimal commissionCNY;

    @ApiModelProperty("小计/总计-发放佣金-越南盾")
    private BigDecimal commissionVND;

    @ApiModelProperty("小计/总计-发放佣金-泰铢")
    private BigDecimal commissionTHB;

    @ApiModelProperty("总注单量")
    private Integer betCount;

    @ApiModelProperty("总投注人数")
    private Integer betPersonCount;

    @ApiModelProperty("小计/总计-总投注金额-人民币")
    private BigDecimal betAmountCNY;

    @ApiModelProperty("小计/总计-总投注金额-越南盾")
    private BigDecimal betAmountVND;

    @ApiModelProperty("小计/总计-总投注金额-泰铢")
    private BigDecimal betAmountTHB;

    @ApiModelProperty("小计/总计-总有效投注-人民币")
    private BigDecimal validBetAmountCNY;

    @ApiModelProperty("小计/总计-总有效投注-越南盾")
    private BigDecimal validBetAmountVND;

    @ApiModelProperty("小计/总计-总有效投注-泰铢")
    private BigDecimal validBetAmountTHB;

    @ApiModelProperty("小计/总计-总投注盈亏-人民币")
    private BigDecimal netAmountCNY;

    @ApiModelProperty("小计/总计-总投注盈亏-越南盾")
    private BigDecimal netAmountVND;

    @ApiModelProperty("小计/总计-总投注盈亏-泰铢")
    private BigDecimal netAmountTHB;
}
