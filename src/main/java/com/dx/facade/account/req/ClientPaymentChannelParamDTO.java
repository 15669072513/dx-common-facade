package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientPaymentChannelParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "0-会员，1-代理", required = true)
    private Integer userType;

    @ApiModelProperty(value = "会员信息")
    private MemberInfoRespDTO memberBO;

    @ApiModelProperty(value = "代理信息")
    private ProxyInfoRespDTO proxyBO;

    @Override
    public void check() {
        Assert.notNull(this.merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(this.userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        if(userType == 0){
            Assert.notNull(this.memberBO, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("memberBO"));
        } else {
            Assert.notNull(this.proxyBO, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyBO"));
        }
    }
}
