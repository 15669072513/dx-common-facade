package com.dx.facade.account.change.param;

import com.dx.facade.account.change.MemberWalletChange;
import com.dx.facade.account.change.ProxyWalletChange;
import com.dx.facade.account.change.WalletType;
import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="代理账变对象", description="代理账变对象")
public class ProxyWalletChangeParmDTO extends WalletChangeParm implements IBWWalletChangeParm {

    @ApiModelProperty(value="代理对象")
    private ProxyInfoRespDTO proxyPo;

    @ApiModelProperty(value="类名")
    @Builder.Default
    private String name = Constant.PROXY;

    @ApiModelProperty(value="关联单号，锁定、解锁业务使用")
    private String referenceId;

    @ApiModelProperty(value="锁定金额时间（非业务时间，锁定、解锁业务使用，协助锁定及解锁找到同一张分表时间）")
    private LocalDateTime lockEventTime ;

    @Override
    public void check(){
        super.check();
        Assert.notNull(proxyPo, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyPo"));
    }

    @JsonIgnore
    @Override
    public Long getId() {
        return proxyPo.getId();
    }

}
