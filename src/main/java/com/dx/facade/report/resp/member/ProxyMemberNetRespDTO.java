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
public class ProxyMemberNetRespDTO {

    @ApiModelProperty(value = "会员Id", dataType = "java.lang.String")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long memberId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("统计日期")
    private String staticsDate;

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

    @ApiModelProperty("账户调整")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("总盈亏")
    private BigDecimal totalNetAmount;

    //parent_proxy_name
    @ApiModelProperty("代理账号")
    private String parentProxyName;
}
