package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局开关类配置修改req
 */
@Data
public class DxGlobalConfigValUpdateReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("配置主键")
    private Long id;
    @ApiModelProperty("配置的key")
    private String keyword;
    @ApiModelProperty("配置的val的名字")
    private String field;
    @ApiModelProperty("配置的val的值")
    private Object value;
    @ApiModelProperty("配置类型")
    private Integer type;
    @ApiModelProperty("配置类型")
    private Integer state;
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
