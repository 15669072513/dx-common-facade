package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author dereck
 */
@Data
public class ActivityConfigSortParamDTO {
    
    @ApiModelProperty(value = "主键")
    @NotNull(message = "主键id不能为空")
    private Long id;
    
    @ApiModelProperty(value = "排序")
    @NotNull(message = "排序值不能为空")
    private Integer sort;
    
    @ApiModelProperty(value = "操作人", hidden = true)
    private String operator;
    

}
