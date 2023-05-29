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
@ApiModel(description = "x轴，具体可参考erhart")
public class XAxis {

    @ApiModelProperty(value = "type")
    private String type;
    @ApiModelProperty(value = "boundaryGap")
    private Boolean boundaryGap;
    @ApiModelProperty(value = "data")
    private List<Object> data;
}
