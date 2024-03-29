package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Cowboy
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "游戏代入带出统计", description = "游戏代入带出统计")
public class GameAmountTotalRespDTO {

    @ApiModelProperty("牌桌ID")
    private Long tableId;

    @ApiModelProperty("玩家总带入")
    private BigDecimal totalInAmount=new BigDecimal(0.0);

    @ApiModelProperty("玩家总带入总次数")
    private Integer inCount=0;

    @ApiModelProperty("玩家总带出")
    private BigDecimal totalOutAmount=new BigDecimal(0.0);

    @ApiModelProperty("玩家总带出总次数")
    private Integer outCount=0;
}
