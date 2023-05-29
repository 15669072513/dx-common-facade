package com.dx.facade.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author sign
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="KvconfigPageReq对象", description="kv配置表分页入参")
public class KvconfigPageReq extends BasePage {

    @ApiModelProperty(value = "标签")
    private String tag;

    @ApiModelProperty(value = "字典code")
    private String k;

    @ApiModelProperty(value = "商户唯一标识")
    private Long appId;

    @ApiModelProperty("模块名称")
    private String module;
}
