package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetPayParamDTO {

    @ApiModelProperty("支付厂商id")
    private Long paymentMerchantId;

    @ApiModelProperty("出入款类型，1:入款，2：出款")
    private Integer paymentMerchantType;
}
