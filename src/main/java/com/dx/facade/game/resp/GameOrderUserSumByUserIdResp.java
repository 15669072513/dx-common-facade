package com.dx.facade.game.resp;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@ApiModel("会员统计返回对象")
@Data
public class GameOrderUserSumByUserIdResp extends BaseRequest {
    @ApiModelProperty("会员id")
    private Long userId;
    @ApiModelProperty("参与手牌数")
    private Long handCount;
    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount;
    @ApiModelProperty("抽水金额")
    private BigDecimal pumpAmount;
    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;
}
