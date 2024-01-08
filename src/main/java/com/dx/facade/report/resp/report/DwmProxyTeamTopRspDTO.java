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
    private Integer reportDate;
    @ApiModelProperty("排名(序号)")
    private Integer topProxyRank;
    @ApiModelProperty("类型(1.团队应还账款2.团队可提现额)")
    private Integer teamType;
    @ApiModelProperty("总代理ID")
    private Long topProxyId;
    @ApiModelProperty("总代理账号")
    private String topProxyName;
    @ApiModelProperty("商户ID")
    private Long merchantId;
    @ApiModelProperty("商户名称")
    private String merchantName;
    @ApiModelProperty("团队可提现额")
    private BigDecimal teamWithdrawable;
    @ApiModelProperty("团队应还账款")
    private BigDecimal teamReturnLoan;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;
    @ApiModelProperty("直属会员有效投注")
    private BigDecimal directlyMemberValidBetAmount;
    @ApiModelProperty("团队返点")
    private BigDecimal teamRebateAmount;
    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;
    @ApiModelProperty("总授信额度")
    private BigDecimal creditQuota;
    @ApiModelProperty("可用额度")
    private BigDecimal creditBalance;
    @ApiModelProperty("数据加工时间")
    private LocalDateTime createdAt;
    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;
}
