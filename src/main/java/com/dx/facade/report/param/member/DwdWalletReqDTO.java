package com.dx.facade.report.param.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author
 */
@Data
public class DwdWalletReqDTO {

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

}
