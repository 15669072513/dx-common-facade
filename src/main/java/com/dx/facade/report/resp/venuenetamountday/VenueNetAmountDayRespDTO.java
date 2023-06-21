package com.dx.facade.report.resp.venuenetamountday;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueNetAmountDayRespDTO {

    @ApiModelProperty(value = "商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("场馆编号")
    private String gameCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆类型")
    private String venueType;

    @ApiModelProperty("场馆类型名称")
    private String venueTypeName;

    @ApiModelProperty("投注人数")
    private Long memberCount;

    @ApiModelProperty("注单量")
    private Long betCount;


    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("投注金额CNY")
    private BigDecimal betAmountCNY;
    @ApiModelProperty("投注金额VND")
    private BigDecimal betAmountVND;
    @ApiModelProperty("投注金额THB")
    private BigDecimal betAmountTHB;

    @ApiModelProperty("有效投注CNY")
    private BigDecimal validBetAmountCNY;
    @ApiModelProperty("有效投注VND")
    private BigDecimal validBetAmountVND;
    @ApiModelProperty("有效投注THB")
    private BigDecimal validBetAmountTHB;

    @ApiModelProperty("投注盈亏CNY")
    private BigDecimal netAmountCNY;
    @ApiModelProperty("投注盈亏VND")
    private BigDecimal netAmountVND;
    @ApiModelProperty("投注盈亏THB")
    private BigDecimal netAmountTHB;
}
