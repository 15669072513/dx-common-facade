package com.dx.facade.member.resp;

import com.dx.facade.account.change.IWalletChange;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class WalletChangeParmDTO implements Serializable {

    @ApiModelProperty(value="账变订单号，幂等性。传递订单号，确保一笔交易不会重复执行")
    private String eventId;

    @ApiModelProperty(value="账变事件发生时间")
    private LocalDateTime eventTime;

    @ApiModelProperty(value="账变总金额")
    private BigDecimal amount;

    @ApiModelProperty(value="账变备注")
    private String remark;

    @ApiModelProperty(value="账变业务")
    private IWalletChange walletChange;

    @ApiModelProperty(value="代理对象")
    private ProxyInfoRespDTO proxyPo;

    @ApiModelProperty(value="会员对象")
    private MemberInfoRespDTO memberBO;

    @ApiModelProperty(value="用户类型：0-会员 1-代理")
    private Integer userType;

    @ApiModelProperty(value="操作用户姓名")
    private String operatorUser;
    
}
