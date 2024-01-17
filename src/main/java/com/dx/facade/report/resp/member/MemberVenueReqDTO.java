package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author rebuy
 */
@Setter
@Getter
@ApiModel("会员场馆明细")
public class MemberVenueReqDTO {
    @ApiModelProperty("日期")
    private String dateTime;
    @ApiModelProperty("场馆/项目 -id")
    private Long venueId;
    @ApiModelProperty("场馆/项目 名称")
    private Long venueName;
    @ApiModelProperty("注单量")
    private BigDecimal betCount;
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注金额")
    private BigDecimal effectiveBetAmount;
    @ApiModelProperty("抽水贡献")
    private BigDecimal  pumPing;
    @ApiModelProperty("投注盈亏")
    private BigDecimal  betProfitLoss;
}
