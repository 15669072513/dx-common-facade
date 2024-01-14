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
 * 新增返点比例模板DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "新增RebateRateTemplateDTO对象", description = "新增返点比例模板DTO")
public class AddRebateRateTemplateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
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

    @ApiModelProperty("创建人")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

	@Override
	public String toString() {
		return "AddRebateRateTemplateParamDTO [merchantId=" + merchantId + ", merchantName=" + merchantName
				+ ", templateType=" + templateType + ", templateName=" + templateName + ", description=" + description
				+ ", createdBy=" + createdBy + ", createdAt=" + createdAt + "]";
	}

}
