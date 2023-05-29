package com.dx.facade.common.chart;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * @author
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@ApiModel(description = "option，具体可参考erhart")
public class Option {
    @ApiModelProperty(value = "text")
    private String text;
    @ApiModelProperty(value = "x轴")
    @JsonProperty("xAxis")
    private XAxis xAxis;
    @JsonProperty("yAxis")
    @ApiModelProperty(value = "y轴")
    private YAxis yAxis;
    @ApiModelProperty(value = "数据")
    private List<Series> series;
}
