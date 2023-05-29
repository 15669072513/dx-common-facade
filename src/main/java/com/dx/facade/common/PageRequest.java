package com.dx.facade.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Nichols
 */
@Data
public class PageRequest {
    
    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @Min(value = 1, message = "当前页最小值不能小于1")
    @Max(value = 2147483647, message = "当前页最大值不能大于2147483647")
    @NotNull(message = "当前页不能为空")
    private Long pageNum = 1L;
    
    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @Min(value = 1, message = "每页条数最小值不能小于1")
    @Max(value = 10000, message = "当前页最大值不能大于10000")
    @NotNull(message = "每页条数不能为空")
    private Long pageSize = 20L;
    
}
