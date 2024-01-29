package com.dx.facade.member.param;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 更新返点比率模板TO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新返点比率模板DTO", description = "更新返点比率模板DTO")
public class UpdateRebateTemplateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("用户Id")
    @NotNull(message = "用户ID 不能为空")
    private Long userId;
    
    @ApiModelProperty("用户类型 0：会员  1：代理")
    @NotNull(message = "用户类型 不能为空")
    private Integer userType;
    
    @ApiModelProperty("总代Id")
    @NotNull(message = "总代ID 不能为空")
    private Long topProxyId;
    
    @ApiModelProperty("新模板Id")
    @NotNull(message = "新模板ID 不能为空")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

}
