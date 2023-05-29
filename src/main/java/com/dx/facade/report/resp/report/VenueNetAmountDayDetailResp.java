package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueNetAmountDayDetailResp {

    @ApiModelProperty(value = "日期", example = "2021-05-15")
    private String staticsDate;

    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount;

    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    @ApiModelProperty(value = "投注额", example = "1500.00")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "有效投注额", example = "1500.00")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "输赢金额", example = "1500.00")
    private BigDecimal netAmount;
}
