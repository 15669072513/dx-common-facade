package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局配置--加注配置req
 */
@Data
public class DxGlobalConfigRaiseUpdateReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("加注配置信息")
    private String config;
    @ApiModelProperty("加注类型")
    private Integer type;
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
