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
    protected Integer reportDate = 0;
    @ApiModelProperty("排名(序号)")
    private Integer topProxyRank;
    @ApiModelProperty("类型(1.团队应还账款2.团队可提现额)")
    protected Integer teamType = 0;
    @ApiModelProperty("总代理ID")
    protected Long topProxyId = 0L;
    @ApiModelProperty("总代理账号")
    protected String topProxyName = "";
    @ApiModelProperty("商户ID")
    protected Long merchantId = 0L;
    @ApiModelProperty("商户名称")
    protected String merchantName = "";
    @ApiModelProperty("团队可提现额")
    protected BigDecimal teamWithdrawable = BigDecimal.ZERO;
    @ApiModelProperty("团队应还账款")
    protected BigDecimal teamReturnLoan= BigDecimal.ZERO;
    @ApiModelProperty("有效投注")
    protected BigDecimal validBetAmount= BigDecimal.ZERO;
    @ApiModelProperty("直属会员有效投注")
    protected BigDecimal directlyMemberValidBetAmount= BigDecimal.ZERO;
    @ApiModelProperty("团队返点")
    protected BigDecimal teamRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏")
    protected BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("总授信额度")
    protected BigDecimal creditQuota = BigDecimal.ZERO;
    @ApiModelProperty("可用额度")
    protected BigDecimal creditBalance = BigDecimal.ZERO;
}
