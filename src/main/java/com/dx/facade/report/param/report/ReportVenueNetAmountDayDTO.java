package com.dx.facade.report.param.report;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 代理日盈亏查询请求参数
 *
 * @author flash
 * @since 2024月6日 下午18:00:05
 */
@Data
@ApiModel(value = "ReportVenueNetAmountDayDTO", description = "数据对比-有效投注额/场馆输赢返回")
public class ReportVenueNetAmountDayDTO extends PageRequest {

    @ApiModelProperty("场馆名")
    private String venueName;


    @ApiModelProperty("投注额")
    private Double betAmount;


    @ApiModelProperty("有效投注")
    private Double validBetAmount;


    @ApiModelProperty("投注人数")
    private Long betMemberNum;


    @ApiModelProperty("注单量")
    private Long betCount;


    @ApiModelProperty("场馆输赢")
    private BigDecimal venueNetAmount;


    @ApiModelProperty("盈利率(使用时直接加%即可)")
    private BigDecimal netRate;

    @ApiModelProperty("有效投注额百分比(使用时直接加%即可)")
    private BigDecimal validBetRate;

}
