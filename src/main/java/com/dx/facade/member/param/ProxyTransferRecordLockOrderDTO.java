package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 功能描述: 会员转代锁单/解单入参封装类
 *
 * @author Nichols
 * @version 1.0.0
 * @date 2021/5/11 17:31:02
 */
@Data
public class ProxyTransferRecordLockOrderDTO {

    @ApiModelProperty(value = "id", required = true, example = "607900258140225536")
    private Long id;

    @ApiModelProperty(value = "商户号")
    private Long merchantId;

    @ApiModelProperty(value ="锁单人id", hidden = true)
    private Long lockAccountId;

    @ApiModelProperty(value = "锁单状态（0-锁定 1-解锁）", required = true, example = "0")
    private Integer lockOrderStatus;

    @ApiModelProperty(value = "锁单人",hidden = true)
    private String auditName;
}
