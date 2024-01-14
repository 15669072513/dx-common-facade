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
 * 更新返点比例模板明细DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新RebateRateTemplateDetailDTO对象", description = "更新返点比例模板明细DTO")
public class UpdateRebateRateTemplateMappingParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;
    
    @ApiModelProperty("用户Id")
    private Long userId;
    
    @ApiModelProperty("用户类型 0：会员  1：代理")
    private Integer userType;
    
    @ApiModelProperty("总代Id")
    private Long topProxyId;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;


}
