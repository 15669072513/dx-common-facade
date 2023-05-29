package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author dereck
 */
@Data
public class ActivityConfigTagGroupDTO {
    
    @ApiModelProperty(value = "活动页签ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long tagId;
    
    @ApiModelProperty(value = "活动页签名称")
    private String tagName;

    @ApiModelProperty("活动页签名称-中文")
    private String cnTagName;

    @ApiModelProperty("活动页签名称-英文")
    private String enTagName;

    @ApiModelProperty("活动页签名称-越南")
    private String viTagName;

    @ApiModelProperty("活动页签名称-泰语")
    private String thTagName;

    @ApiModelProperty(value = "活动页签排序")
    private Integer sort;
    
    @ApiModelProperty(value = "当前页签下的数据")
    private List<ActivityConfigSortDTO> data;

}
