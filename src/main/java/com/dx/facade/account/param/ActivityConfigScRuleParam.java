package com.dx.facade.account.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 首存活动规则表 入参
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="ActivityConfigScRuleParam对象", description="首存活动规则")
public class ActivityConfigScRuleParam implements Serializable {

    private static final long serialVersionUID = 4338844980621758774L;

    @ApiModelProperty(value = "活动金额")
    @Min(value = 0, message = "活动金额最小值是0")
    @NotNull(message = "活动金额不能为空(首存活动规则)")
    private BigDecimal activityAmount;

    @ApiModelProperty(value = "赠送比例")
    @Min(value = 0, message = "赠送比例最小值是0")
    private BigDecimal validPresent;

    @ApiModelProperty(value = "赠送金额")
    @Min(value = 0, message = "赠送金额最小值是0")
    private BigDecimal validAmount;

    @ApiModelProperty(value = "赠送上限")
    @Min(value = 0, message = "赠送上限最小值是0")
    private BigDecimal validTopLimit;

    @ApiModelProperty(value = "流水要求（倍）")
    @Min(value = 0, message = "流水要求最小值是0")
    @NotNull(message = "流水要求不能为空(首存活动规则)")
    private Integer validMultiple;

}
