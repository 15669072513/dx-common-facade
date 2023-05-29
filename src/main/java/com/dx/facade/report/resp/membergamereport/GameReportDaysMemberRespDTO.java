package com.dx.facade.report.resp.membergamereport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 会员游戏日报表
 * @author foucs
 * @date 2022/02/08 22:05
 */
@ApiModel(value = "会员游戏日报表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameReportDaysMemberRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;
    
    @ApiModelProperty(value = "会员ID")
    private Long playerId;
    
    @ApiModelProperty(value = "场馆id")
    private Long gameId;
    
    @ApiModelProperty(value = "输赢金额")
    private BigDecimal netAmount;
}