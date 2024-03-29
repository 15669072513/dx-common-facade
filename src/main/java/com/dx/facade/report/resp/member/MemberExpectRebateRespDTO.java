package com.dx.facade.report.resp.member;

import com.dx.facade.report.resp.rebate.ProxyRebateTeamResp;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 盈亏报表-会员盈亏 DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberExpectRebateRespDTO {

    @ApiModelProperty(value = "会员Id", dataType = "java.lang.String")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long memberId;
    @ApiModelProperty("会员账号")
    private String memberAccount;
    @ApiModelProperty("结算周期")
    private Integer staticsDate;
    @ApiModelProperty(value = "代理id")
    private Long proxyId;
    @ApiModelProperty(value = "商户")

    private Long merchantId;
    @ApiModelProperty(value = "直属代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "总代账号")
    private String topProxyAccount;

    @ApiModelProperty(value = "所属商户名称")
    private String merchantName;
    @ApiModelProperty("个人返水金额")
    private BigDecimal rebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("德州俱乐部返水金额")
    private BigDecimal rebateAmountDxClub = BigDecimal.ZERO;

    @ApiModelProperty("真人返水金额")
    private BigDecimal rebateAmountZr = BigDecimal.ZERO;

    @ApiModelProperty("体育返水金额")
    private BigDecimal rebateAmountTy = BigDecimal.ZERO;

    @ApiModelProperty("电竞返水金额")
    private BigDecimal rebateAmountDj = BigDecimal.ZERO;

    @ApiModelProperty("棋牌返水金额")
    private BigDecimal rebateAmountQp = BigDecimal.ZERO;

    @ApiModelProperty("彩票返水金额")
    private BigDecimal rebateAmountCp = BigDecimal.ZERO;

}