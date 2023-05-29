package com.dx.facade.report.resp;

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
public class MemberReportDTO {

    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="商户ID")
    private Long merchantId;

    @ApiModelProperty(value="会员ID")
    private Long playerId;

    @ApiModelProperty(value="会员名称")
    private String playerName;

    @ApiModelProperty(value="日期")
    private Integer reportDate;

    @ApiModelProperty(value="报表生成时间")
    private LocalDateTime geneTime;

    @ApiModelProperty(value="创建时间")
    private LocalDateTime createDt;

    @ApiModelProperty(value="单量")
    private Long betCount;

    @ApiModelProperty(value="投注额")
    private BigDecimal betAmount;

    @ApiModelProperty(value="有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value="输赢金额")
    private BigDecimal netAmount;

    @ApiModelProperty(value="存款金额")
    private BigDecimal depositAmount;

    @ApiModelProperty(value="取款金额")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value="优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty(value="反水金额")
    private BigDecimal returnWaterAmount;

    @ApiModelProperty(value="派彩金额")
    private BigDecimal payAmount;


}
