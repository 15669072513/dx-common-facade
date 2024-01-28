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
public class ProxyMemberNetVenueRespDTO {

    @ApiModelProperty(value = "会员Id", dataType = "java.lang.String")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long memberId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("场馆")
    private String venueName;

    private String venueType;
    private Integer betType;

    @ApiModelProperty("总投")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("会员优惠")
    private BigDecimal discountAmount;

    @ApiModelProperty("返水调整")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("实际盈亏")
    private BigDecimal totalNetAmount;

    //parent_proxy_name
    @ApiModelProperty("代理账号")
    private String parentProxyName;

    @ApiModelProperty("平台返水金额")
    private BigDecimal platformRebateAmount;

    @ApiModelProperty("代理返水金额")
    private BigDecimal proxyRebateAmount;

    @ApiModelProperty(value = "服务费-手牌", example = "1500.00")
    private BigDecimal serviceChargeHand = BigDecimal.ZERO;

    @ApiModelProperty(value = "服务费-局抽", example = "1500.00")
    private BigDecimal serviceChargeRound = BigDecimal.ZERO;

    @ApiModelProperty(value = "服务费贡献", example = "1500.00")
    private BigDecimal serviceAmount = BigDecimal.ZERO;

    @ApiModelProperty("不包含德州的有效投注")
    private BigDecimal validBetAmountNoDx = BigDecimal.ZERO;

    @ApiModelProperty("包含所有的游戏盈亏")
    private BigDecimal netAmountAll = BigDecimal.ZERO;

    @ApiModelProperty("包含所有计算的盈亏")
    private BigDecimal netWinAmountAll = BigDecimal.ZERO;
}
