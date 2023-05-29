package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author dereck
 */
@Data
public class ActivityConfigDepositUpdateStatusParam {

    @ApiModelProperty(value = "主键id")
    @NotNull(message = "主键id不能为空")
    private Long id;

    @ApiModelProperty(value = "是否启用 默认停用(0=停用, 1=开启)")
    @NotNull(message = "状态不能为空")
    private Integer status;
    
    @ApiModelProperty(value = "最近操作人", hidden = true)
    private String operator;
}
