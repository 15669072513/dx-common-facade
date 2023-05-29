package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WalletParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "币种")
    private String currency;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(currency, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("currency"));
    }
}
