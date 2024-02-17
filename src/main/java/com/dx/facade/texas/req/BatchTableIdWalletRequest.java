package com.dx.facade.texas.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Collection;

@ApiModel("获取德州钱包明细请求实体")
@Data
public class BatchTableIdWalletRequest implements Serializable, BaseParmDTO {
    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty("钱包类型 1-德州")
    private Integer walletType;
    @ApiModelProperty("牌桌id列表")
    private Collection<Long> tableIds;

    @Override
    public void check() {
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(walletType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("walletType"));
    }
}
