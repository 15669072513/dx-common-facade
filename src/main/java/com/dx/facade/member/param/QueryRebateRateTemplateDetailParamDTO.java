package com.dx.facade.member.param;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 返点比例模板明细请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返点比例模板明细请求Param", description = "返点比例模板明细请求Param")
public class QueryRebateRateTemplateDetailParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 1：根据userId查询模板明细 只需要传userId和userType 
     * 2：查询模板明细列表只需要传templateId 
     * 3：查询代理或者会员可选择的模板明细列表 传parentProxyId和userType 用于新增页面
     * 4: 根据userId和userType查询可选择的比率明细列表 用于修改页面
     */
    @ApiModelProperty("查询类型 1：根据userId查询模板明细 只需要传userId和userType  2：查询模板明细列表只需要传templateId 3： 查询代理或者会员可选择的模板明细列表 传parentProxyId和userType")
    private Integer queryType;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;
    
    @ApiModelProperty("用户Id")
    private Long userId;
    
    @ApiModelProperty("类型 0：会员 1：代理")
    private Integer userType;
    
    @ApiModelProperty("上级代理Id")
    private Long parentProxyId;
    
    @ApiModelProperty("用户Id")
    private Long topProxyId;
    

    
	@Override
	public void check() {
	}

}
