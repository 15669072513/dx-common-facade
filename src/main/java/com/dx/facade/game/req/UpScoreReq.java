package com.dx.facade.game.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author admin
 */
@Data
public class UpScoreReq{
    @ApiModelProperty("tableId")
    private Long tableId;
    @ApiModelProperty("tableName")
    private String tableName;
    @ApiModelProperty("玩家id")
    private Long userId;
    @ApiModelProperty("金额")
    private BigDecimal amount;
}
