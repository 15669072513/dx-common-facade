package com.dx.facade.report.resp.member;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountDetailRespDTO {

    @ApiModelProperty("日期")
    private String staticsDate;
    
    @ApiModelProperty("上级代理Id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long parentProxyId;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("注单量")
    private Long betCount;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty("调整金额")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;


}
