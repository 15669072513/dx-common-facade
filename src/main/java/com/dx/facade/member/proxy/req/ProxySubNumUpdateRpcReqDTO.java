package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 会员溢出申请参数封装
 *
 * @author agan
 * @version 1.0.0
 * @date 2021/05/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxySubNumUpdateRpcReqDTO {

    @ApiModelProperty("商户id")
    private Long merchantId;

    @ApiModelProperty("代理id")
    private Long userId;
    
    @ApiModelProperty("当前上级id")
    private Long currentProxyId;
    
    @ApiModelProperty("当前上级")
    private String currentProxyName;
    
    @ApiModelProperty("转入上级代理id")
    private Long transferProxyId;
    
    @ApiModelProperty("转入上级代理账号")
    private String transferProxyName;
    
}
