package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import com.dx.facade.constant.Constants;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返点比例DTO父类
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRateDTO父类", description = "返点比例DTO父类")
public class RebateRateDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("德州俱乐部返点比例")
    @DecimalMin(value = "0.000", message = "德州俱乐部返点比例不能小于0.000")
    @NotNull(message = "德州俱乐部返点比例不能为空")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("德州保险返点比例")
    @DecimalMin(value = "0.000", message = "德州保险返点比例不能小于0.000")
    @NotNull(message = "德州保险返点比例不能为空")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("真人返点比例")
    @NotNull(message = "真人返点比例不能为空")
    @DecimalMin(value = "0.000", message = "真人返点比例不能小于0.000")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    @NotNull(message = "体育返点比例不能为空")
    @DecimalMin(value = "0.000", message = "体育返点比例不能小于0.000")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    @NotNull(message = "彩票返点比例不能为空")
    @DecimalMin(value = "0.000", message = "彩票返点比例不能小于0.000")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点比例")
    @NotNull(message = "棋牌返点比例不能为空")
    @DecimalMin(value = "0.000", message = "棋牌返点比例不能小于0.000")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    @NotNull(message = "电竞返点比例不能为空")
    @DecimalMin(value = "0.000", message = "电竞返点比例不能小于0.000")
    private BigDecimal esportsRebate;
    
    @ApiModelProperty("平台标识： 0-非平台 1-平台")
    private Integer platformFlag;

}