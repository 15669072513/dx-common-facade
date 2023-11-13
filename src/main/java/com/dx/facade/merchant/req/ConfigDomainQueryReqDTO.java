package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.dx.facade.common.PageRequest;

import java.io.Serializable;

/**
 @title 域名配置查询数据传输对象
 @desc 查询域名配置入参
 @path 系统->域名配置：查询
 @author gollum
 @version 1.0.0
 @since 2022-09-19 10:11:32
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="域名配置查询数据传输对象", description="查询域名配置入参")
public class ConfigDomainQueryReqDTO extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "域名状态：0-停用，1-启用", position = 0)
    private Integer status;

    @ApiModelProperty(value = "域名地址", position = 1)
    private String domain;

    @Min(value = 1, message = "域名类型不能小于1")
    @ApiModelProperty(value = "域名类型：[1-activity，2-member，3-launch，4-其他]", position = 2)
    private Integer domainType;

    @ApiModelProperty(value = "操作人", position = 3)
    private String updatedBy;

    @ApiModelProperty(value = "排序列:[1：最近操作时间]", position = 4)
    private Integer orderKey;

    @ApiModelProperty(value="排序类型[升序：asc,降序：desc]", position = 5)
    private String orderType;
}
