package com.dx.facade.auth.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 个性化kv配置表
 * </p>
 *
 * @author Yinter
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PersonConfig对象", description="个性化kv配置表")
public class PersonConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "code")
    private String k;

    @ApiModelProperty(value = "值")
    private String v;
}
