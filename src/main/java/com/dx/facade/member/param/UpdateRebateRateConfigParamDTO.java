package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
/**
 * 更新返点比例配置请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "更新返点比例配置请求Param", description = "更新返点比例配置请求Param")
public class UpdateRebateRateConfigParamDTO extends BaseRebateRateConfigParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @ApiModelProperty("Id")
    private Long id;
    
    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;
    
    @ApiModelProperty("创建时间")
    private String remark;
    
}
