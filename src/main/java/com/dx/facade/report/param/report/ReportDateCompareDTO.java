package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 代理日盈亏查询返回
 *
 * @author flash
 * @since 2024年1月6日 下午18:00:05
 */
@Data
@ApiModel(value = "ReportDateCompareDTO", description = "中控后台-数据日报列表返回")
public class ReportDateCompareDTO  {

    @ApiModelProperty(value = "开始日期")
    private Integer reportDate;

    @ApiModelProperty(value = "新增有效会员")
    private Long effecactiveMemberNum;

    @ApiModelProperty(value = "活跃会员")
    private Long activeMemberNum;

    @ApiModelProperty(value = "有效投注(万)")
    private Double validBetAmount;

    @ApiModelProperty(value = "平台输赢(万)")
    private Double platformNetAmount;

    @ApiModelProperty(value = "平台收入(万)")
    private Double platformIncomeAmount;


}
