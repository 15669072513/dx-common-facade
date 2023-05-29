package com.dx.facade.member.resp;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MemberVenueTypeNetSumRespDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "注单数")
    private Long betCount;

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
    private BigDecimal netAmountVND ;

    @ApiModelProperty("投注盈亏THB")
    private BigDecimal netAmountTHB;
}
