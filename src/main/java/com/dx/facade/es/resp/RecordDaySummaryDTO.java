package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
public class RecordDaySummaryDTO {

    @ApiModelProperty("注单日期yyyy-MM-dd")
    private String betDate;

    @ApiModelProperty("有效投注金额汇总")
    private BigDecimal validBetAmountSum;

    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmountSum;

    @ApiModelProperty("当天注单总数")
    private long totalCount;

    @ApiModelProperty("注单列表")
    List<GameRecordDto> list;
}
