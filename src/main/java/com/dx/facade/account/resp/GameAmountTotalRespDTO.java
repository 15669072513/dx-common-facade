package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.TableField;
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
    private BigDecimal totalInAmount;

    @ApiModelProperty("玩家总带出")
    private BigDecimal totalOutAmount;

}
