package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.dx.facade.account.change.IWalletType;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QueryWalletParam implements BaseParmDTO {

    @Getter
    @Setter
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @Getter
    @Setter
    @ApiModelProperty(value = "会员id")
    private Long userId;

    @Getter
    @ApiModelProperty(value = "账户类型")
    private List<IWalletType> walletTypeList;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        CollectionUtils.isEmpty(walletTypeList);
        ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("walletTypeList");
    }

    public void setWalletTypeList(IWalletType... walletTypes){
        this.walletTypeList = Arrays.asList(walletTypes);
    }
    public void setWalletTypeList(List<IWalletType> walletTypeList){
        this.walletTypeList = walletTypeList;
    }
}
