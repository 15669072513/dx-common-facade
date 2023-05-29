package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.util.List;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryPaymentChannelConfigReq implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private List<Long> merchantIdList;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("支付类型")
    private Integer payType;

    @ApiModelProperty("用户类型")
    private Integer userType;

    @ApiModelProperty("支付商类型，1：充值商户，2：提款商户")
    private Integer paymentMerchantType;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty("通道使用状态/开关，0=隐藏/停用，1=展示/启用")
    private Integer channelStatus;

    @Override
    public void check() {
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        Assert.notNull(paymentMerchantType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("paymentMerchantType"));
    }
}
