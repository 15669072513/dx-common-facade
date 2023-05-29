package com.dx.facade.auth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * kv配置表
 * </p>
 *
 * @author sign
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Kvconfig对象", description="kv配置表")
public class Kvconfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "字典code")
    private String k;

    @ApiModelProperty(value = "值")
    private String v;

    @ApiModelProperty(value = "标签")
    private String tag;

    @ApiModelProperty(value = "控制类型")
    private String valueType;

    @ApiModelProperty(value = "模块")
    private String module;

    @ApiModelProperty(value = "注释")
    private String description;

    @ApiModelProperty(value = "商户唯一标识")
    private Long appId;
}
