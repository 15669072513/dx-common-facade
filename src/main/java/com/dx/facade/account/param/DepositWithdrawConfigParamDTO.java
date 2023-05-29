package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Yinter
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositWithdrawConfigParamDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户id")
    private Long merchantId;

    @ApiModelProperty("入款支付厂商id，多个用逗号隔开")
    private String depositPaymentMerchantId;

    @ApiModelProperty("出款支付厂商id，多个用逗号隔开")
    private String withdrawPaymentMerchantId;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

}
