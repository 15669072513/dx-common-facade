package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author agan
 */
@Data
public class CheckSubmitActivityTemplateDTO implements Serializable {

    @ApiModelProperty(value = "计划解析数")
    private Integer plan;

    @ApiModelProperty(value = "成功解析数")
    List<ActivityTemplateEasyExcel> successList;

    @ApiModelProperty(value = "解析失败集合")
    List<ActivityTemplateEasyExcel> failList;

}
