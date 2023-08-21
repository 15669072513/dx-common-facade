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
public class MemberNetAmountRebateRespDTO {

    @ApiModelProperty(value = "会员Id", dataType = "java.lang.String")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long memberId;

    @ApiModelProperty("结算日期")
    private Integer staticsDate;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount=BigDecimal.ZERO;

    @ApiModelProperty("注单量")
    private Long betCount=0l;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("团队信息详情")
    private List<ProxyRebateTeamResp> rebateList;



}