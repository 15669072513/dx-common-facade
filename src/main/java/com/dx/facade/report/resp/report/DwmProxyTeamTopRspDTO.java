package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DwmProxyTeamTopRspDTO", description = "代理团队top详情")
public class DwmProxyTeamTopRspDTO {

    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("报表日期")
    private Integer reportDate = 0;
    @ApiModelProperty("排名(序号)")
    private Integer topProxyRank;
    @ApiModelProperty("类型(1.团队应还账款2.团队可提现额)")
    private Integer teamType = 0;
    @ApiModelProperty("总代理ID")
    private Long topProxyId = 0L;
    @ApiModelProperty("总代理账号")
    private String topProxyName = "";
    @ApiModelProperty("商户ID")
    private Long merchantId = 0L;
    @ApiModelProperty("商户名称")
    private String merchantName = "";
    @ApiModelProperty("团队可提现额")
    private BigDecimal teamWithdrawable = BigDecimal.ZERO;
    @ApiModelProperty("团队应还账款")
    private BigDecimal teamReturnLoan= BigDecimal.ZERO;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount= BigDecimal.ZERO;
    @ApiModelProperty("直属会员有效投注")
    private BigDecimal directlyMemberValidBetAmount= BigDecimal.ZERO;
    @ApiModelProperty("团队返点")
    private BigDecimal teamRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("总授信额度")
    private BigDecimal creditQuota = BigDecimal.ZERO;
    @ApiModelProperty("可用额度")
    private BigDecimal creditBalance = BigDecimal.ZERO;
}
