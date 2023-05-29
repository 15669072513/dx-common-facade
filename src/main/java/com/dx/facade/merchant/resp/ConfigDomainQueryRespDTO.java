package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 @title 域名配置查询数据响应传输对象
 @desc 查询域名配置列表出参
 @path 系统->域名配置：查询
 @author gollum
 @version 1.0.0
 @since 2022-09-19 10:11:15
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="域名配置查询数据响应传输对象", description="查询域名配置列表出参")
public class ConfigDomainQueryRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "唯一主键", position = 0)
    private Long id;

    @ApiModelProperty(value = "域名地址", position = 1)
    private String domain;

    @ApiModelProperty(value = "域名类型：1-jcgw-Jav业务相关，2-jmember-会员相关，3-jlaunch-其他", position = 2)
    private Integer domainType;

    @ApiModelProperty(value = "域名状态：0-停用，1-启用", position = 2)
    private Integer status;

    @ApiModelProperty(value = "描述说明", position = 3)
    private String domainDesc;

    @ApiModelProperty(value = "创建人", position = 4)
    private String createdBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @ApiModelProperty(value = "创建时间", position = 5)
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "操作人", position = 6)
    private String updatedBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @ApiModelProperty(value = "最近操作时间", position = 7)
    private LocalDateTime updatedAt;
}
