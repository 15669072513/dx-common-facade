package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 代理日盈亏查询返回
 *
 * @author flash
 * @since 2024年1月6日 下午18:00:05
 */
@Data
@ApiModel(value = "ReportDateCompareDTO", description = "中控后台-数据日报列表返回")
public class ReportDateCompareDTO  {

    @ApiModelProperty(value = "统计日期", example = "20231213")
    private Integer reportDate;

    @ApiModelProperty(value = "统计日期", example = "2023-12-13")
    private String staticsDate;
    @ApiModelProperty(value = "新增有效会员")

    private Long effecactiveMemberNum;

    @ApiModelProperty(value = "活跃会员")
    private Long activeMemberNum;

    @ApiModelProperty(value = "有效投注(万)")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "平台输赢(万)")
    private BigDecimal platformNetAmount;

    @ApiModelProperty(value = "平台收入(万)")
    private BigDecimal platformIncomeAmount;

    public ReportDateCompareDTO(Long effecactiveMemberNum, Long activeMemberNum, BigDecimal validBetAmount, BigDecimal platformNetAmount, BigDecimal platformIncomeAmount) {
        this.effecactiveMemberNum = effecactiveMemberNum;
        this.activeMemberNum = activeMemberNum;
        this.validBetAmount = validBetAmount;
        this.platformNetAmount = platformNetAmount;
        this.platformIncomeAmount = platformIncomeAmount;
    }

    public ReportDateCompareDTO() {
    }
}
