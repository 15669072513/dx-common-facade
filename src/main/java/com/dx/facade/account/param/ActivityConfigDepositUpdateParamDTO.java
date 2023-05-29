package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author agan
 */
@Data
public class ActivityConfigDepositUpdateParamDTO {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "主键")
    @NotNull(message = "主键id不能为空")
    private Long id;
    
    @ApiModelProperty(value = "优惠比例百分比")
    private BigDecimal discountScale;
    
    @ApiModelProperty(value = "每日最高优惠(元)")
    private BigDecimal maxQuota;

    @ApiModelProperty(value = "操作人")
    private String operator;
}
