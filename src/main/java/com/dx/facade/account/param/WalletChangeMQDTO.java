package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.dx.facade.account.resp.WalletDetailRespDTO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WalletChangeMQDTO {

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("0 : 会员，1 : 代理")
    private Integer userType;

    @ApiModelProperty("中心钱包余额")
    private BigDecimal cash;

    @ApiModelProperty("账变时间")
    private LocalDateTime eventTime;

    @ApiModelProperty("本次金额")
    private BigDecimal currentAmount;

    @ApiModelProperty("0：非存取，1：存，2：取")
    private Integer flag;

    @ApiModelProperty("账变明细")
    private WalletDetailRespDTO walletDetail;
}
