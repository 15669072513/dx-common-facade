package com.dx.facade.member.param;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 更新返点分配模式DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新返点分配模式DTO", description = "更新返点分配模式DTO")
public class UpdateRebateAllotModeParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("用户Id")
    private Long userId;
    
    @ApiModelProperty("用户类型 0：会员  1：代理")
    private Integer userType;
    
    @ApiModelProperty("总代Id")
    private Long topProxyId;
    
    @ApiModelProperty("返点分配模式 1：自由模式 2:模板模式")
    private Integer rebateAllotMode;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

}
