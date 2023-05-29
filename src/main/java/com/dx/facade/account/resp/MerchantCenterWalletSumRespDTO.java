package com.dx.facade.account.resp;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MerchantCenterWalletSumRespDTO {

    private Long merchantId;

    private BigDecimal centerWalletSumAmount;
}
