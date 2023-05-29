package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 代理佣金审核详情
 */
@Builder
@Data
public class ProxyCommissionRecordDetailRespDTO {

    /**
     * 代理账号信息
     */
    @ApiModelProperty(value = "代理账号信息")
    private ProxyAccountsRespDTO accountsVo;

    /**
     * 佣金账目信息
     */
    @ApiModelProperty(value = "佣金账目信息")
    private CommissionRecordRespDTO commissionRecordVo;

    /**
     * 审核信息
     */
    @ApiModelProperty(value = "审核信息")
    private List<ProxyCommissionDetailRespDTO> proxyCommissionDetaiVoList;
}
