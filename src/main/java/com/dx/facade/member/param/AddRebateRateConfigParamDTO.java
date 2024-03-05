package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 新增返点比例DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "新增RebateRateDTO对象", description = "新增返点比例DTO")
public class AddRebateRateConfigParamDTO implements Serializable {

	private static final long serialVersionUID = -893480405666367025L;
	
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("商户名称")
    private String merchantName;
    
    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;
    
    private List<BaseRebateRateConfigParamDTO> rebateRateConfigList;

	@ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;
    
    @ApiModelProperty("创建时间")
    private String remark;

}
