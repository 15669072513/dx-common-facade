package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author agan
 * 会员详情,
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentLockStatusDTO {

    @ApiModelProperty("会员id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("会员/代理类型")
    private Integer userType;
}
