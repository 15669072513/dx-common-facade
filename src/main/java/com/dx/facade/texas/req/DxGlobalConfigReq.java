package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 新增全局配置
 */
@Data
public class DxGlobalConfigReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("配置主键")
    private Long id;

    @ApiModelProperty("配置的key")
    private String keyword;

    @ApiModelProperty("配置的val")
    private String val;

    @ApiModelProperty("操作人id")
    private String opId;

    @ApiModelProperty("配置类型")
    private Integer type;

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
