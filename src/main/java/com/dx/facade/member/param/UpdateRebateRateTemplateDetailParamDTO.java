package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;

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
public class UpdateRebateRateTemplateDetailParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("返点比率模板明细列表")
    private List<RebateRateTemplateDetailDTO> list;

    @ApiModelProperty("最后操作人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
