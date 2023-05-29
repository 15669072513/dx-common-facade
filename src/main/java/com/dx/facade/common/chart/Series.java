package com.dx.facade.common.chart;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * @author november
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@ApiModel(description = "数据，具体可参考erhart")
public class Series {
    @ApiModelProperty(value = "name")
    private String name;
    @ApiModelProperty(value = "type")
    private String type;
    @ApiModelProperty(value = "stack")
    private String stack;
    @ApiModelProperty(value = "data")
    private List<Object> data;
}
