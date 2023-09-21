package com.dx.facade.account.param;

import com.dx.facade.account.change.IWalletType;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WalletAmountParam implements BaseParmDTO, Serializable {

    @Getter
    @Setter
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @Getter
    @Setter
    @ApiModelProperty(value = "会员id")
    private Long userId;

    @Getter
    @Setter
    @ApiModelProperty(value = "会员id列表")
    private List<Long> userIdList;

    @Getter
    @Setter
    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty("用户类型：0会员，1代理")
    @Getter
    @Setter
    private Integer userType;

    @ApiModelProperty("用户类型：是否需要中心钱包")
    @Getter
    @Setter
    private Boolean needCash;

    @ApiModelProperty("用户类型：是否需要冻结金额")
    @Getter
    @Setter
    private Boolean needFrozen;

    @ApiModelProperty("用户类型：是否需要信用金额")
    @Getter
    @Setter
    private Boolean needCreditAvailable;

    @ApiModelProperty("用户类型：是否需要信用额度")
    @Getter
    @Setter
    private Boolean needCreditTotal;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
    }
}
