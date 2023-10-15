package com.dx.facade.proxy.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author Rock
 * 代理后台-牌桌管理-手牌列表返回
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DxHandInfoResp implements Serializable {

    @ApiModelProperty("手牌id")
    private String handId;

    @ApiModelProperty("手牌号")
    private String handCode;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("牌局开始时间")
    private Long handBeginDate;

    @ApiModelProperty("牌局结束时间")
    private Long handEndDate;

    @ApiModelProperty("庄家位置(荷官位)")
    private Integer button;

    @ApiModelProperty("小盲位置")
    private Integer sbChairId;

    @ApiModelProperty("大盲位置")
    private Integer bbChairId;

    @ApiModelProperty("抽水金额")
    private BigDecimal pumpAmount;

    @ApiModelProperty("桌牌")
    private String globalPokerCode;

    @ApiModelProperty("有效底池")
    private BigDecimal effectivePool;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("手牌（牌桌第多少手）")
    private Integer roundNo;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;
}
