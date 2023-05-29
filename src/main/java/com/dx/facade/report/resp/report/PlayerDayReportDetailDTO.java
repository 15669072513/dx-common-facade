package com.dx.facade.report.resp.report;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-PlayerDayReportDetailDTO", description = "会员报表详情对象")
public class PlayerDayReportDetailDTO implements Serializable {

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "日期，比如2021-07-27")
    private String staticsDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;
    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;
    @ApiModelProperty("总存款")
    private BigDecimal depositAmount = BigDecimal.ZERO;
    @ApiModelProperty("存款次数")
    private Long depositTimes = 0L;
    @ApiModelProperty("总取款")
    private BigDecimal withdrawAmount = BigDecimal.ZERO;
    @ApiModelProperty(value = "取款次数")
    private Long withdrawTimes = 0L;
    @ApiModelProperty("注单量")
    private Long betCount = 0L;
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount = BigDecimal.ZERO;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("返水金额")
    private BigDecimal returnWaterAmount = BigDecimal.ZERO;
    @ApiModelProperty("优惠总额")
    private BigDecimal discountAmount = BigDecimal.ZERO;
    @ApiModelProperty("其他调整")
    private BigDecimal otherAdjustAmount = BigDecimal.ZERO;
    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit = BigDecimal.ZERO;


//    /**
//     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额
//     *
//     * @return
//     */
//    public BigDecimal getNetProfitCNY() {
//        return netAmount.add(returnWaterAmount).add(discountAmount).add(otherAdjustAmount);
//    }


}
