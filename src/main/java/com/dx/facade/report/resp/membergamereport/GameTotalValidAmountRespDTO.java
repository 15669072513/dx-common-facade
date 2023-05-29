package com.dx.facade.report.resp.membergamereport;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * @author fitz
 * @date 2022/02/08 16:05
 */
@ApiModel(value = "会员总游戏金额返回")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameTotalValidAmountRespDTO implements Serializable {
    
    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    @ApiModelProperty(value = "会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long playerId;
    
    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetsCurr;
    
    private static final long serialVersionUID = 1L;
}