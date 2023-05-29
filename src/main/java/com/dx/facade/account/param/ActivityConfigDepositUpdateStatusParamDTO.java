package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author agan
 */
@Data
public class ActivityConfigDepositUpdateStatusParamDTO {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "主键")
    private Long id;
    
    @ApiModelProperty(value = "状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty(value = "最近操作人", hidden = true)
    private String operator;

}
