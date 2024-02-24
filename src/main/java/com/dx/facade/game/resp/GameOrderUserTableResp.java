package com.dx.facade.game.resp;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 */
@ApiModel("会员统计返回对象")
@Data
public class GameOrderUserTableResp extends BaseRequest {
    @ApiModelProperty("牌桌id")
    private Long tableId;
    @ApiModelProperty("用户id")
    private Long userId;
    @ApiModelProperty("玩家总带出")
    private BigDecimal bringOutChipScore = BigDecimal.ZERO;
    @ApiModelProperty("玩家总带入")
    private BigDecimal bringInChipScore = BigDecimal.ZERO;
    @ApiModelProperty("玩家输赢")
    private BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount = BigDecimal.ZERO;
    @ApiModelProperty("会员带入次数")
    private Integer userBringCount = 0;
}
