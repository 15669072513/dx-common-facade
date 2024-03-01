package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返点比例配置DTO父类
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRateConfigDTO父类", description = "返点比例配置DTO父类")
public class BaseRebateRateConfigParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("商户名称")
    private String merchantName;
    
    @ApiModelProperty("类型 0-直属会员返水比率 1-直属代理团队返点比例 2-直属代理团队占成比例")
    private Integer type;
    
    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;
    
    @ApiModelProperty("德州俱乐部返点/占成比例")
    @DecimalMin(value = "0.000", message = "德州俱乐部返点比例不能小于0.000")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("德州保险返点/占成比例")
    @DecimalMin(value = "0.000", message = "德州保险返点比例不能小于0.000")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("真人返点/占成比例")
    @NotNull(message = "真人返点比例不能为空")
    @DecimalMin(value = "0.000", message = "真人返点比例不能小于0.000")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点/占成比例")
    @NotNull(message = "体育返点比例不能为空")
    @DecimalMin(value = "0.000", message = "体育返点比例不能小于0.000")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点/占成比例")
    @NotNull(message = "彩票返点比例不能为空")
    @DecimalMin(value = "0.000", message = "彩票返点比例不能小于0.000")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点/占成比例")
    @NotNull(message = "棋牌返点比例不能为空")
    @DecimalMin(value = "0.000", message = "棋牌返点比例不能小于0.000")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点/占成比例")
    @NotNull(message = "电竞返点比例不能为空")
    @DecimalMin(value = "0.000", message = "电竞返点比例不能小于0.000")
    private BigDecimal esportsRebate;

}