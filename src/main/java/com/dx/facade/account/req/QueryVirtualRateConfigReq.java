package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.enums.Payment;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.enums.BwCurrencyEnum;
import com.dx.facade.member.exception.ErrorCode;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryVirtualRateConfigReq implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("业务类型")
    private Payment.VirtualRateBizType bizType;

    @ApiModelProperty("币种类型")
    private BwCurrencyEnum bwCurrencyEnum;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(bwCurrencyEnum, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("bwCurrencyEnum"));
    }
}
