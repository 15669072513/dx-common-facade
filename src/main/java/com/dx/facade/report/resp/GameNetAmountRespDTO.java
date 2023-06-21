package com.dx.facade.report.resp;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("游戏盈亏列表返回对象")
public class GameNetAmountRespDTO {

    @ApiModelProperty("主键Id")
    private Long id;

    @ApiModelProperty(value = "商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty("游戏ID")
    private String gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameTypeName;

    @ApiModelProperty("场馆编号")
    private String gameCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("投注人数")
    private Long memberCount;

    @ApiModelProperty("注单量")
    private Long betCount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注金额")
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
