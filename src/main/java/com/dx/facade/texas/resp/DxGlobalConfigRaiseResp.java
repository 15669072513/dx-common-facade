package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局配置返回信息 --- 加注
 */
@Data
public class DxGlobalConfigRaiseResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("配置key")
    private String keyword;

    @ApiModelProperty("配置value")
    private String val;

    @ApiModelProperty("配置状态")
    private String state;

    @ApiModelProperty("配置创建时间")
    private String createAt;

    @ApiModelProperty("配置修改时间")
    private String updateAt;

    @ApiModelProperty(
            value = "创建人"
    )
    private String createdBy;


    @ApiModelProperty(
            value = "修改人"
    )
    private String updatedBy;
}
