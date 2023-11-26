package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameRecordBetNumberResp {

    @ApiModelProperty(value = "抽水投注人数")
    private Long pumpBetNumber = 0L;

    @ApiModelProperty(value = "保险投注人数")
    private Long insuranceBetNumber = 0L;

    @ApiModelProperty(value = "合计投注人数")
    private Long allBetNumber = 0L;
}
