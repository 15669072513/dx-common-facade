package com.dx.facade.member.param;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 返点比例模板关联请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返点比例模板关联请求Param", description = "返点比例模板关联请求Param")
public class QueryRebateRateTemplateMappingParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("模板明细Id")
    private Long templateDetailId;
    
    @ApiModelProperty("比率等级")
    private Integer level;
    
    @ApiModelProperty("用户Id")
    private Long userId;
    
    @ApiModelProperty("用户类型 0：会员  1：代理")
    private Integer userType;
    
    @ApiModelProperty("总代Id")
    private Long topProxyId;
    
	@Override
	public void check() {
	}

}
