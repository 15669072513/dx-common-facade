package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProxyRebateAuditDetailHeaderAndFootResp {
    /**
     * 代理账号信息
     */
    @ApiModelProperty(value = "代理账号信息")
    private ProxyAccountsRebateAuditDetailResp accountsResp;


}
