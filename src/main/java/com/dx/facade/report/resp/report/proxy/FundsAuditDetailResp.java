package com.dx.facade.report.resp.report.proxy;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "FundsAuditDetailResp", description = "收益审核详情")
public class FundsAuditDetailResp {
    @ApiModelProperty(value = "项目")
    private String venueName;
    private String venueType;
    @ApiModelProperty(value = "德州俱乐部服务费贡献")
    private BigDecimal clubAmount = BigDecimal.ZERO;
    @ApiModelProperty("团队返点比例")
    private BigDecimal rebateRate = BigDecimal.ZERO;
    @ApiModelProperty("团队返点")
    private BigDecimal rebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("下级代理返点")
    private BigDecimal underProxyAmount = BigDecimal.ZERO;
    @ApiModelProperty("会员代理返水")
    private BigDecimal memberRebateAmountByProxy = BigDecimal.ZERO;
    @ApiModelProperty("应发返点")
    private BigDecimal incomeAmount = BigDecimal.ZERO;

    @ApiModelProperty("德州保险会员输赢")
    private BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("占成比例")
    private BigDecimal zhanchengRate = BigDecimal.ZERO;
    @ApiModelProperty("团队盈亏分成")
    private BigDecimal commissionNetAmount = BigDecimal.ZERO;
    @ApiModelProperty("下级代理盈亏分成")
    private BigDecimal underProxyNetAmount = BigDecimal.ZERO;
    @ApiModelProperty("应发盈亏分成")
    private BigDecimal incomeNetAmount = BigDecimal.ZERO;

}
