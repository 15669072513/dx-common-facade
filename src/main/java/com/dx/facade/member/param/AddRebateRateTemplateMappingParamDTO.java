package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 新增返点比例模板明细DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "新增RebateRateTemplateMappingDTO对象", description = "新增返点比例模板关联DTO")
public class AddRebateRateTemplateMappingParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;
    
    @ApiModelProperty("用户Id")
    private Long userId;
    
    @ApiModelProperty("用户类型 0：会员  1：代理")
    private Long userType;
    
    @ApiModelProperty("总代Id")
    private Long topProxyId;
    
    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;


}
