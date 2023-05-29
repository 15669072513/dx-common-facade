package com.dx.facade.common.chart;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author november
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@ApiModel(description = "y轴，具体可参考erhart")
public class YAxis {
    @ApiModelProperty(value = "type")
    private String type;
    @ApiModelProperty(value = "min")
    private BigDecimal min;
    @ApiModelProperty(value = "max")
    private BigDecimal max;
    @ApiModelProperty(value = "interval")
    private BigDecimal interval;
    @ApiModelProperty(value = "leftMin")
    private Integer leftMin;
    @ApiModelProperty(value = "leftMax")
    private Integer leftMax;
    @ApiModelProperty(value = "leftMin")
    private Integer rightMin;
    @ApiModelProperty(value = "leftMax")
    private Integer rightMax;

}
