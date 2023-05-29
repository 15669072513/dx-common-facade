package com.dx.facade.report.resp.membergamereport;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 场馆会员TOP3 返回对象封装
 *
 * @author foucs
 * @version 1.0.0
 * @date 2022/02/08
 */
@Data
@ApiModel(value = "GameMemberTopResp", description = "场馆会员TOP前3平台统计对象")
@NoArgsConstructor
@AllArgsConstructor
public class GameMemberTopRespDTO {

    @ApiModelProperty(value = "平台ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonProperty("gameId")
    private Long venueId;
    
    @ApiModelProperty(value = "平台名称")
    private String gameName;
    
    @ApiModelProperty(value = "下注金额")
    
    private BigDecimal betAmount;
    
    @ApiModelProperty(value = "有效金额")
    
    private BigDecimal validBetAmount;
    
    @ApiModelProperty(value = "游戏输赢")
    
    private BigDecimal netAmount;


    @ApiModelProperty(value = "币种信息")
    private String currency;
    
}
