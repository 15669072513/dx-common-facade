package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class GameRecordMeta {
    @ApiModelProperty("总笔数")
    private Long countTotal = 0L;

    @ApiModelProperty("总投注额")

    private BigDecimal betAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("总输赢金额")

    private BigDecimal netAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("场馆投注信息")
    private List<MetaInfo> metas = new ArrayList<>();

}
