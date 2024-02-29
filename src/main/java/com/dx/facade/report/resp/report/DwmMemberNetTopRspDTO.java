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
@ApiModel(value = "DwmMemberNetTopRspDTO", description = "会员盈亏top详情")
public class DwmMemberNetTopRspDTO {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("报表日期")
    protected Integer reportDate = 0;
    @ApiModelProperty("排名(序号)")
    private String memberRank;
    @ApiModelProperty("盈亏类型(1.今日盈利最高2.今日亏损最高)")
    protected Integer netType = 0;
    @ApiModelProperty("会员ID")
    protected Long memberId = 0L;
    @ApiModelProperty("会员账号")
    protected String memberName = "";
    @ApiModelProperty("总代理ID")
    private Long topProxyId = 0L;
    @ApiModelProperty("总代理账号")
    private String topProxyName = "";
    @ApiModelProperty("授信额度")
    protected BigDecimal creditQuota = BigDecimal.ZERO;
    @ApiModelProperty("借款金额")
    protected BigDecimal loanAmount = BigDecimal.ZERO;
    @ApiModelProperty("游戏场馆")
    protected String venueName = "";
    @ApiModelProperty("有效投注")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("单笔最大投注")
    protected BigDecimal maxBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("历史返水")
    protected BigDecimal hisRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏")
    protected BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("历史输赢")
    protected BigDecimal hisNetAmount = BigDecimal.ZERO;
}
