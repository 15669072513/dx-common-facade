package com.dx.facade.member.param;

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
 * 更新返点比例模板DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新RebateRateTemplateDTO对象", description = "更新返点比例模板DTO")
public class UpdateRebateRateTemplateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("商户Id")
    @TableField(value = "merchant_id")
    private Long merchantId;
    
    @ApiModelProperty("商户名称")
    @TableField("merchant_name")
    private String merchantName;
    
    @ApiModelProperty("类型:1-返点模板")
    @TableField(value = "template_type")
    private Integer templateType;
    
    @ApiModelProperty("模板名称")
    @TableField("template_name")
    private String templateName;
	
    @ApiModelProperty("描述")
    @TableField("description")
    private String description;
    
    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;

}
