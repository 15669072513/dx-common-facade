package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yinter
 */

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMerchantQueryParamDTO extends PageRequest {

    @ApiModelProperty("支付厂商")
    private String paymentMerchantName;

    @ApiModelProperty("厂商类型，1：入款，2：出款")
    private Integer paymentMerchantType;

    @ApiModelProperty("厂商名称code，按枚举定义的code保存")
    private Integer paymentMerchantNameCode;

    @ApiModelProperty("厂商编码")
    private String paymentMerchantCode;
}
