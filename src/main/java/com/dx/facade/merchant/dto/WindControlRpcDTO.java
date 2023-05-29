package com.dx.facade.merchant.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 风控层级参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "com-bw-merchant-dto-WindControlDTO", description = "风控层级参数封装")
public class WindControlRpcDTO {
    
    @ApiModelProperty(value="风控层级id")
    private Long windControlId;
    
    @ApiModelProperty(value="风控层级名称")
    private String windControlName;
}
