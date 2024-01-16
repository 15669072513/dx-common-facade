package com.dx.facade.member.resp;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返点比例模板关联响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRateTemplateMappingRespDTO对象", description = "返点比例模板关联响应DTO")
public class RebateRateTemplateMappingRespDTO implements Serializable {

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
    
    @ApiModelProperty("创建人")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;
}
