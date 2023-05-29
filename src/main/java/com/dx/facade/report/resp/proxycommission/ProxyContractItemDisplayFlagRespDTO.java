package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProxyContractItemDisplayFlagRespDTO{

    @ApiModelProperty(value = "游戏亏损显示标志:1=显示，2=不显示", required = true)
    private Integer netAmountDisplayFlag = 2;

    @ApiModelProperty(value = "游戏流水显示标志:1=显示，2=不显示", required = true)
    private Integer validBetDisplayFlag = 2;

    @ApiModelProperty(value = "本月活跃人数显示标志:1=显示，2=不显示", required = true)
    private Integer activeUsersDisplayFlag = 2;

    @ApiModelProperty(value = "月有效活跃人数显示标志:1=显示，2=不显示", required = true)
    private Integer effectActiveUsersDisplayFlag = 2;

    @ApiModelProperty(value = "本月新增有效活跃人数显示标志:1=显示，2=不显示", required = true)
    private Integer monthAddActiveCountDisplayFlag = 2;

    public  Long getContractId(){
        return null;
    }
}
