package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 新增返点比例DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "新增RebateRateDTO对象", description = "新增返点比例DTO")
public class AddRebateRateParamDTO extends BaseRebateRateParamDTO implements Serializable {

	private static final long serialVersionUID = -893480405666367025L;

	@ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

}
