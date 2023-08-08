package com.dx.facade.account.param;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 *
 * @author: cowboy
 * @description 场馆上下分账变资金明细记录
 * @date 2023-08-08
 */
public class TransferGameParam {

    @ApiModelProperty("转账单号")
    private String eventId;

    @ApiModelProperty("场馆code,zr:真人,ty:体育,cp:彩票,qp:棋牌,dj:电竞")
    private String venueCode;

    @ApiModelProperty("账变前余额")
    private BigDecimal changeBefore;

    @ApiModelProperty("账变后余额")
    private BigDecimal changeAfter;

    @ApiModelProperty("账变额")
    private BigDecimal amount;
}
