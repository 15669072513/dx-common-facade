package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class GameRecordDetail {
    @ApiModelProperty("总笔数")
    private Long countTotal = 0L;

    @ApiModelProperty("总投注金额")
    private BigDecimal betAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("总有效投注金额")
    private BigDecimal validBetAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("总输赢金额")
    private BigDecimal netAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("投注信息")
    private List<DateAndGameRecordList> metas = new ArrayList<>();
}
