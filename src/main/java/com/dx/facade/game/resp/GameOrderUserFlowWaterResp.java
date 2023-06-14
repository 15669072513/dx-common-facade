package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class GameOrderUserFlowWaterResp {
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("总投注")
    private String netChip;
    @ApiModelProperty("总盈利")
    private LocalDateTime beginDate;
    @ApiModelProperty("结抽水比例")
    private LocalDateTime endDate;
    @ApiModelProperty("有效投注")
    private BigDecimal netChipSum;
}
