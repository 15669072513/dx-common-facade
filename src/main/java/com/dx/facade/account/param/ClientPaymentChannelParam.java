package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientPaymentChannelParam implements BaseParmDTO {

    @ApiModelProperty(value = "钱包类型： 6代理佣金充值，7代理额度钱包充值")
    private Integer depositWalletType;

    @Override
    public void check() {

    }
}
