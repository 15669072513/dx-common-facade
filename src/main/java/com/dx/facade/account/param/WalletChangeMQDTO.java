package com.dx.facade.account.param;

import com.dx.facade.account.resp.WalletDetailRespDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WalletChangeMQDTO {

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("0 : 会员，1 : 代理")
    private Integer userType;

    @ApiModelProperty("现金余额")
    private BigDecimal cash;

    @ApiModelProperty("信用钱包余额")
    private BigDecimal creditAvailable;

    @ApiModelProperty("信用钱包额度")
    private BigDecimal creditTotal;

    @ApiModelProperty("账变时间")
    private LocalDateTime eventTime;

    @ApiModelProperty("本次金额")
    private BigDecimal currentAmount;

    @ApiModelProperty("0：非存取，1：存，2：取")
    private Integer flag;

    @ApiModelProperty("0：否，1：是")
    private Integer firstDeposit;

    @ApiModelProperty("0：否，1：是")
    private Integer big;

    @ApiModelProperty("账变明细")
    private WalletDetailRespDTO walletDetail;

}
