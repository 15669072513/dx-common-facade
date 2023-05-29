package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProxyRiskControlLevelRespDTO {
    /**
     * 风险代理
     */
    @ApiModelProperty(value = "风险代理")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long riskAgent;

    /**
     * 风险银行卡
     */
    @ApiModelProperty(value = "风险银行卡")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long riskyBankCard;


    /**
     * 风险虚拟币
     */
    @ApiModelProperty(value = "风险虚拟币")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long riskyVirtualCurrency;


    /**
     * 风险IP
     */
    @ApiModelProperty(value = "风险IP")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long riskyIP;


    /**
     * 风险终端设备号
     */
    @ApiModelProperty(value = "风险终端设备号")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long riskTerminalDeviceNumber;

}
