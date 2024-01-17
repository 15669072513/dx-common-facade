package com.dx.facade.member.param;

import java.io.Serializable;
import java.util.List;

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
@ApiModel(value = "新增RebateRateTemplateDetailDTO对象", description = "新增返点比例模板明细DTO")
public class AddRebateRateTemplateDetailParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("返点比率模板明细列表")
    private List<RebateRateTemplateDetailDTO> list;
    
	@ApiModelProperty("创建人")
    private String createdBy;
}
