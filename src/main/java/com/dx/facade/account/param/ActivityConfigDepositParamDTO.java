package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;


/**
 * @author agan
 */
@Data
@Builder
public class ActivityConfigDepositParamDTO {
    
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "支付方式ID")
    private Integer payType;

    @ApiModelProperty(value = "状态/开关，0=否/停用，1=是/启用")
    private Integer status;

}
