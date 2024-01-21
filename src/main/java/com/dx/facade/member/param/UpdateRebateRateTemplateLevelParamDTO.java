package com.dx.facade.member.param;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 更新返点比率模板等级DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新返点模板等级DTO", description = "更新返点比率模板等级DTO")
public class UpdateRebateRateTemplateLevelParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("用户Id")
    private Long userId;
    
    @ApiModelProperty("用户类型 0：会员  1：代理")
    private Integer userType;
    
    @ApiModelProperty("总代Id")
    private Long topProxyId;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

}
