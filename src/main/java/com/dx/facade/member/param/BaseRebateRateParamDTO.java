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
 * 返佣比例DTO父类
 * </p>
 *
 * @author bicycle
 * @since 2023-9-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CommissionRateDTO父类", description = "返佣比例DTO父类")
public class BaseRebateRateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;
    
    @ApiModelProperty("上级代理Id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    
    @ApiModelProperty("德州俱乐部返点比例")
    @DecimalMin(value = "0.00", message = "德州俱乐部返佣比例不能小于0.00")
    @NotNull(message = "德州返点比例不能为空")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("德州保险返点比例")
    @DecimalMin(value = "0.00", message = "德州保险返佣比例不能小于0.00")
    @NotNull(message = "德州返点比例不能为空")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("其他返佣比例")
    @DecimalMin(value = "0.00", message = "其他返佣比例不能小于0.00")
    @NotNull(message = "德州返佣比例不能为空")
    private BigDecimal otherRebate;
    
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效 3-平台调整")
    private Integer status;

}
