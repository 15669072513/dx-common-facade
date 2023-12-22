package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局开关类配置修改req
 */
@Data
public class DxGlobalConfigToggleUpdateReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("配置主键")
    private Long id;
    @ApiModelProperty("开关值")
    private Integer toggleVal;
    @ApiModelProperty("操作人id")
    private String opId;
    @ApiModelProperty(
            value = "创建人",
            hidden = true
    )
    private String createdBy;


    @ApiModelProperty(
            value = "修改人",
            hidden = true
    )
    private String updatedBy;

}
