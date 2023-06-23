package com.dx.facade.account.param;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

/**
 * 查询批量查询中心钱包
 */
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QueryCashWalletParam implements BaseParmDTO {

    @Getter
    @Setter
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @Getter
    @Setter
    @ApiModelProperty(value = "会员id")
    private Long userId;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
    }
}
