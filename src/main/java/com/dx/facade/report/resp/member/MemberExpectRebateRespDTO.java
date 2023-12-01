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

    @ApiModelProperty(value = "代理id")
    private String proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "总代账号")
    private String topProxyAccount;

    @ApiModelProperty(value = "所属商户名称")
    private String merchantName;

    @ApiModelProperty(value = "会员Id", dataType = "java.lang.String")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long memberId;

    @ApiModelProperty("结算日期")
    private Integer staticsDate;

    @ApiModelProperty("个人返水金额")
    private BigDecimal rebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("德州俱乐部返水金额")
    private BigDecimal rebateAmountDxClub = BigDecimal.ZERO;

    @ApiModelProperty("zr返水金额")
    private BigDecimal rebateAmountZr = BigDecimal.ZERO;

    @ApiModelProperty("ty返水金额")
    private BigDecimal rebateAmountTy = BigDecimal.ZERO;

    @ApiModelProperty("dj返水金额")
    private BigDecimal rebateAmountDj = BigDecimal.ZERO;

    @ApiModelProperty("ty返水金额")
    private BigDecimal rebateAmountQp = BigDecimal.ZERO;

    @ApiModelProperty("cp返水金额")
    private BigDecimal rebateAmountCp = BigDecimal.ZERO;

}