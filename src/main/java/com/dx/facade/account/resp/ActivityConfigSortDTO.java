package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author dereck
 */
@Data
public class ActivityConfigSortDTO {
    
    @ApiModelProperty(value = "主键")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty(value = "活动名称")
    private String name;
    
    @ApiModelProperty(value = "排序")
    private Integer sort;

}
