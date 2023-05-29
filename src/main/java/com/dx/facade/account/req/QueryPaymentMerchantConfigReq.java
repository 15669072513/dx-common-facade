package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.account.service.BaseParmDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryPaymentMerchantConfigReq implements BaseParmDTO {

    @ApiModelProperty("支付厂商id")
    private Long paymentMerchantId;

    @ApiModelProperty("商户id")
    private Long merchantId;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("支付类型")
    private Integer payType;

    @ApiModelProperty("使用状态/开关，0=否/停用，1=是/启用")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("支付商类型，1：充值商户，2：提款商户")
    private Integer paymentMerchantType;

    @Override
    public void check() {}
}
