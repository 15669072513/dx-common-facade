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
    private Integer reportDate = 0;
    @ApiModelProperty("排名(序号)")
    private Integer memberRank;
    @ApiModelProperty("盈亏类型(1.今日盈利最高2.今日亏损最高)")
    private Integer netType = 0;
    @ApiModelProperty("会员ID")
    private Long memberId = 0L;
    @ApiModelProperty("会员账号")
    private String memberName = "";
    @ApiModelProperty("总代理ID")
    private Long topProxyId = 0L;
    @ApiModelProperty("总代理账号")
    private String topProxyName = "";
    @ApiModelProperty("授信额度")
    private BigDecimal creditQuota = BigDecimal.ZERO;
    @ApiModelProperty("今日借款")
    private BigDecimal loanAmount = BigDecimal.ZERO;
    @ApiModelProperty("游戏场馆")
    private String venueName = "德州";
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("单笔最大投注")
    private BigDecimal maxBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("历史返水")
    private BigDecimal hisRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("当日输赢")
    private BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("历史输赢")
    private BigDecimal hisNetAmount = BigDecimal.ZERO;
}
